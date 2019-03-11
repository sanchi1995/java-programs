package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args)
	{
		List<String> names=new ArrayList<>();
		names.add("Deepanshu");
		names.add("loves");
		names.add("sanchita");
		names.add("rajitha");
		names.add("kanika");
		names.add("nikki");
		
		names.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
		
		//map
		names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase)
		
		.forEach(System.out::println);
		//sorted
		names.parallelStream().sorted().map(String::toUpperCase)
		.forEach(System.out::println);
		
		// terminal operations
		//foreach
		names.forEach(System.out::println);
		//collect
		List<String> namesUpperCase=names.parallelStream().sorted()
				.map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(namesUpperCase);
		
		//count
		long tm= names.parallelStream().filter((s)->s.startsWith("A")).count();
		System.out.println("total names" +tm);
		
		//reduce
		Optional<String> r=names.parallelStream().reduce((s1,s2)->s1 + "#" +s2);
		r.ifPresent(System.out::println);
	}

}
