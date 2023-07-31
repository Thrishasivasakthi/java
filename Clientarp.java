import java.io.*;
import java.net.*;
import java.util.*;
class Clientarp
{
public static void main(String args[])
{
try
{
Socket clsct = new Socket("192.168.137.1",1409);
BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
DataInputStream din = new DataInputStream(clsct.getInputStream());
DataOutputStream dout = new DataOutputStream(clsct.getOutputStream());
System.out.println("enter the ip address:");
String str=in.readLine();
dout.writeBytes(str+'\n');
String str1=din.readLine();
System.out.println("the physical address is:"+str1);
clsct.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}