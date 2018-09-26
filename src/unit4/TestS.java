package unit4;

class TestStatic{
public static  int iStatic;
public int iNonStatic;
}
public class TestS {
public static void main(String[] args) {
TestStatic obj1 = new TestStatic();
TestStatic.iStatic = 10; obj1.iNonStatic = 11;
System.out.println (TestStatic.iStatic + " " + obj1.iNonStatic); 
TestStatic obj2 = new TestStatic();
System.out.println(TestStatic.iStatic+" "+obj2.iNonStatic);
TestStatic.iStatic = 12;
System.out.println(TestStatic.iStatic+" "+obj1.iNonStatic);
}
}