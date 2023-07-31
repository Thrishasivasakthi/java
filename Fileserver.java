import java.io.*;
import java.net.*;
class Fileserver
{
public static void main(String args[])
{
try
{
ServerSocket sok=new ServerSocket(9999);
while(true)
{
Socket clsct=sok.accept();
DataInputStream din=new DataInputStream(clsct.getInputStream());
DataOutputStream dout=new DataOutputStream(clsct.getOutputStream());
String str=din.readLine();
FileReader f= new FileReader(str);
BufferedReader b=new BufferedReader(f);
String s;
while((s=b.readLine())!=null)
{
System.out.println(s);
dout.writeBytes(s+'\n');
}
f.close();
dout.writeBytes("-1");
sok.close();
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
