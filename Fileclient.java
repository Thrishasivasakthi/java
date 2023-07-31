import java.io.*;
import java.net.*;
class FileClient
{
public static void main(String args[])
{
try
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Socket clsct=new Socket("localhost",9999);
DataInputStream din=new DataInputStream(clsct.getInputStream());
DataOutputStream dout=new DataOutputStream(clsct.getOutputStream());
System.out.println("enter the file name:");
String str=in.readLine();
dout.writeBytes(str+'\n');
System.out.println("enter the new file name:");
String str2=in.readLine();
FileWriter f=new FileWriter(str2);
char buffer[];
String str1;
while(true)
{
str1=din.readLine();
if(str1.equals("-1"))
break;
buffer=new char[str1.length()];
str1.getChars(0,str1.length(),buffer,0);
f.write(buffer);
}
f.close();
clsct.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
