import java.io.*;
import java.net.*;
import java.util.*;
class CRC
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the generator:");
String gen=br.readLine();
System.out.println("enter the data:");
String data=br.readLine();
String code=data;
while(code.length()<(data.length()+gen.length()-1))
{
code=code+"0";
}
code=data+div(code,gen);
System.out.println("transmitted codeword is:"+ code);
System.out.println(" enter the received codeword:");
String rec=br.readLine();
if(Integer.parseInt(div(rec,gen))==0)
{
System.out.println("received data is error free");
}
else
{
System.out.println("received code word contains error");
}
}
static String div(String num1,String num2)
{
int pointer=num2.length();
String result=num1.substring(0,pointer);
String rem="";
for(int i=0;i<num2.length();i++)
{
if(result.charAt(i)==num2.charAt(i))
{
rem+="0";
}
else
{
rem+="1";
}
}
while(pointer<num1.length())
{
if(rem.charAt(0)=='0')
{
rem=rem.substring(1,rem.length());
rem=rem+String.valueOf(num1.charAt(pointer));
pointer++;
}
result=rem;
rem="";
for(int i=0;i<num2.length();i++)
{
if(result.charAt(i)==num2.charAt(i))
{
rem+="0";
}
else
{
rem+="1";
}
}
}
return rem.substring(1,rem.length());
}
}  
