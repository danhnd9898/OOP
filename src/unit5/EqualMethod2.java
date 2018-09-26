package unit5;

class Value {
int i=100;
public boolean equals(Object obj){
if (obj instanceof Value)
return ((Value)obj).i == this.i;
return false;
}
}
public class EqualMethod2 {
public static void main(String[] args) {
Value v1 = new Value();
Value v2 = new Value();
v1.i = v2.i = 100;
System.out.println(v1.equals(v2));
}
}