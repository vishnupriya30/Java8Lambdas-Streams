package com.epam.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Average {

	public static void main(String[] args) {
		Integer[] numbersArray = {1,2,3,4,5,6,7,8};
		List<Integer> numbersList = Arrays.asList(numbersArray);
		numbersList.stream().mapToInt(i->i).average().ifPresent(avg->System.out.println("Average of numbers in List:" +avg));
	}

}
