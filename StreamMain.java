package com.trinity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		
		System.out.println("program started...");
		List<Integer> list1=List.of(2,4,50,21,22,67);
		
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);

		List<Integer> list3=Arrays.asList(23,567,12,677,24);
		
		//list1
		//without stream
		

		List<Integer> listEven=new ArrayList<Integer>();
		for(Integer i:list1)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
				
		
		//using stream
		
		Stream<Integer> stream=list1.stream();
		List<Integer> newlist= stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		
//		List<Integer> newlist= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	}

}
