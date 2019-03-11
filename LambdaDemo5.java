package java8;

import java.util.HashMap;
import java.util.Map;

public class LambdaDemo5 {
	public static void main(String[] args)
	{
		Map <String,String> books=new HashMap<> ();
		books.put("LET US C", "yk");
		books.put("LET US C++", "yk");
		books.put("LET US java", "yk");
		
		books.forEach((key,value)-> System.out.println("book name:" +key + " Author " +value));
		System.out.println();
		books.forEach((key,value)->{
			System.out.println("book name:" +key + " Author " +value);
		});
		System.out.println();
	}

}
