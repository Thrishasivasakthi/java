import java.io.*;
import java.net.*;
class Echoclient
{
public static void main(String args[])
{
try
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the port number");
int port = Integer.parseInt(buf.readLine());
Socket so=new Socket("localhost",port);
if(so.isConnected()==true)
{
System.out.println("server is connected succesfully");
}
InputStream in= so.getInputStream();
OutputStream ou=so.getOutputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pr=new PrintWriter(ou);
BufferedReader br1=new BufferedReader(new InputStreamReader(in));
String str,str1;
System.out.println("enter the message:");
str=br.readLine();
pr.println(str);
pr.flush();
System.out.println("message received from server:");
str1=br1.readLine();
System.out.println(str1);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}