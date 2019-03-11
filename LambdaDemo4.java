package java8;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo4 {
	public static void main(String[] args)
	{
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("before java8");
			}
			
			}).start();
		new Thread( ()-> System.out.println("asdfghjkl;qwertyuiop[")).start();
		System.out.println("--------------------**********************_____________");
		
		List features = Arrays.asList("Lambdas","Default Method","Stream API","Date and Time API");
		features.forEach(n -> System.out.println(n) );
		System.out.println("--------------------**********************_____________");
		//features.forEach(System.out::println);
		
		}
	}


