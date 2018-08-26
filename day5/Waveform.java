import java.io.*;
class Waveform
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int n,i,t;
System.out.print("Enter the size of Array : ");
n=Integer.parseInt(input.readLine());
int arr[]=new int[n];
System.out.println("Enter Elements : ");
for(i=0;i<n;i++)
{
arr[i]=Integer.parseInt(input.readLine());
}
System.out.println("Original Array : ");
for(i=0;i<n;i++)
{
System.out.print(arr[i]+"  ");
}
for(i=0;i<n;i=i+2)
{
t=arr[i];
arr[i]=arr[i+1];
arr[i+1]=t;
}
System.out.println("\n Waveform Array :");
for(i=0;i<n;i++)
{
System.out.print(arr[i]+"  ");
}
}
}