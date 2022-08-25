import java.util.*;
class Myobject
{int a;
Myobject(int i)
{a=i;
}
}
class Test
{
static void increment(int x)
{
x*=2;
System.out.println("increment:x=" +x);
}
static void increment(Myobject o)
{
o.a*=2;
System.out.println("increment:o.a=" +o.a);
}
}
class Demo
{
public static void main(String[]args)
{
int x=15;
System.out.println("before call:x=" +x);
Test.increment(x);
System.out.println("after call:x=" +x);
Myobject mo=new Myobject(15);
System.out.println("before call:mo.a=" +mo.a);
Test.increment(mo);
System.out.println("aftercall:mo.a="+mo.a);
}
}