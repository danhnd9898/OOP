package unit4;

class Value{
	int i;
}
public class Equal {
	public static void main(String [] args)
	{
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i=v2.i=5;
		//System.out.println(v1.equals(v1));
		Integer it1 = new Integer(45);
		Integer it2 = new Integer(45);
		System.out.println(it1.equals(it2));
		
	}
}
