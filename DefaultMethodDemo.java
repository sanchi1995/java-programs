package java8;
interface TestInterface
{
	public void square(int a);
	default void show() {
		System.out.println("default method executed");
	}
	static void show1()
	{
		System.out.println("static method executed");
	}
}
public class DefaultMethodDemo implements TestInterface {

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		{
			System.out.println(a*a);
		}}
		public static void main(String[] args)
		{
			DefaultMethodDemo d=new DefaultMethodDemo();
			d.square(4);
			d.show();
			
		TestInterface.show1();
		}
		
	}
	


