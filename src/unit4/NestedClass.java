package unit4;

public class NestedClass {
	/*static int a = 9;
	static class Inner
	{
		static void printMessage()
		{
			System.out.println("Gia tri = " + a);
		}
	}
	public static void main(String [] args)
	{
		a = 10; 
		//NestedClass.Inner in = new NestedClass.Inner();
		Inner.printMessage();
	}
}
*/
	private final static int SIZE = 15;
	private int[] array = new int[SIZE];
	void array()
	{
		for (int i=0; i< SIZE; i++)
		{
			array[i] = i;
		}
	}
	private class iterator
	{
		public int next = 1;
		private boolean hasNext()
		{
			return (next < (SIZE-1)); 
		}
		public int getNext()
		{
			int retValue = array[next];
			next += 2;
			return (retValue);
		}
	}
	void print()
	{
		iterator it = new iterator();
		while (it.hasNext())
		{
			System.out.println(it.getNext() + "");
		}
	}
	public static void main(String [] args)
	{
		NestedClass nc = new NestedClass();
		nc.array();
		nc.print();
	}
}
	
	
	
	