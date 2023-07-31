import java.io.*;
import java.net.*;
class Echoserver
{
public static void main(String args[])
{
try
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the port number:");
int port=Integer.parseInt(buf.readLine());
ServerSocket sok=new ServerSocket(port);
System.out.println("server is ready to receive message");
System.out.println("waiting..................");
Socket so=sok.accept();
if(so.isConnected()==true)
{
System.out.println("client is connected successfully");
}
InputStream in=so.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(in));
OutputStream ou=so.getOutputStream();
PrintWriter pr=new PrintWriter(ou);
String str;
str=br.readLine();
System.out.println("message received from client:"+str);
System.out.println("this message is forwarded to client");
pr.println(str);
pr.flush();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}