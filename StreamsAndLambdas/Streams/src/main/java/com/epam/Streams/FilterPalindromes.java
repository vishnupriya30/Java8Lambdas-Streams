package com.epam.Streams;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class FilterPalindromes {
	public static void main(String[] args){
		Integer[] numbersArray = {101,102,202,232,231,421,535,1221};
		List<Integer> numbersList = Arrays.asList(numbersArray);
		List<Integer> palindromes = numbersList.stream().filter(t->isPalindrome(t)).collect(Collectors.toList());
		System.out.println("List of palindromes: "+palindromes);
	}
	public static boolean isPalindrome(int num){
		int num1 = num;
		int rev = 0;
		while(num > 0){
			int rem = num%10;
			rev = (rev*10)+rem;
			num = num / 10;
		}
		return (num1 == rev);
	}
}
