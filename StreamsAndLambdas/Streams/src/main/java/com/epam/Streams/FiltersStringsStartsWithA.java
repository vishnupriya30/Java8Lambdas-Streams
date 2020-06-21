package com.epam.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersStringsStartsWithA {

	public static void main(String[] args) {
		String[] words = {"abc","aab","bac","aabc","bca","bbca","aacd","acd"};
		List<String> wordsList = Arrays.asList(words);
		List<String> filteredList = wordsList.stream().filter(t->t.charAt(0)=='a').filter(t->t.length()==3).collect(Collectors.toList());
		System.out.println("List of strings starts with 'a' and length of 3:" +filteredList);
	}

}
