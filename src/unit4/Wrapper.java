package unit4;

public class Wrapper {
 public static void main(String [] args)
 {
/**	 
	 int i = 8, k;
	  int m = Integer.parseInt("56");
	 @SuppressWarnings("deprecation")
	Integer j = new Integer(7);
	 String a =  j.toString();
	 float n = j.floatValue();
	 k = i + m;
	 System.out.println(k);
// 
@SuppressWarnings("deprecation")
long m = (new Integer(Integer.MAX_VALUE).longValue());
System.out.println(m);
String input="abc 1 2 3 ";
int A = 0; 
for (int i=0; i< input.length(); i ++)
{	
	char c = input.charAt(i);
	if (Character.isDigit(c))
		A = (A * 10 + Character.digit(c, 10));
}
System.out.println("answer = " + 1 + 2 + 3);
System.out.println("answer = " + (1 + 2 + 3));
	// testString
	 String s = "Nam";
	 String s1 = new String("Nam");
	 String s2 = String.valueOf("Nam");
	 System.out.println(s==s1);
	 System.out.println(s==s2);
	 System.out.println(s2==s1);
	 String s3 = "Nam";
	 String s4= new String("Nam");
	 String s5 = String.valueOf("Nam");
	 System.out.println(s==s3);
	 System.out.println(s1==s4);
	 System.out.println(s2==s5);
*/
	 StringBuffer buffer = new StringBuffer(15);
	 buffer.append("This is ") ;
	 buffer.append("String") ;
	 buffer.insert(7," a") ;
	 buffer.append('.');
	 System.out.println(buffer.length()); // 17
	 System.out.println(buffer.capacity()); // 32
	 String output = buffer.toString() ;
	 System.out.println(output); // "This is a String."
 }
}

//