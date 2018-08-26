import java.io.*;

class Complex
{

float area;

void Display(int r,int i)
{
System.out.println(r+"+"+i+"i");
}
}

class Complex_Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int r,i;
System.out.print("Enter the Real part of the complex number : ");
r=Integer.parseInt(input.readLine());
System.out.print("Enter the imaginary part of the complex number : ");
i=Integer.parseInt(input.readLine());
Complex obj=new Complex();
obj.Display(r,i);
}
}