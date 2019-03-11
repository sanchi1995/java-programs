package java8;

public class LambdaDemo1 {
	public static void main(String[] args) {
	NumericTest isEven =(n) ->(n%2)==0;
	NumericTest isNegative=(n)-> (n<0);
	
	System.out.println(isEven.ComputeTest(5));
	System.out.println(isNegative.ComputeTest(-5));
	
	

}
}