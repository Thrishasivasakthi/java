import java.io.*;
import java.net.*;
class Ping
{
public static void main(String args[])
{
try
{
String ip,str;
BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the ping address:");
ip=buf.readLine();
Runtime H=Runtime.getRuntime();
Process p=H.exec("tracert "+ip);
InputStream in = p.getInputStream();
BufferedReader buf1 = new BufferedReader(new InputStreamReader(in));
while((str=buf1.readLine())!=null)
{
System.out.println(" "+str);
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}

