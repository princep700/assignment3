import java.io.*;

class second_largest_array
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int r,i,n,j;
System.out.print("Enter the  of size Array: ");
n=Integer.parseInt(input.readLine());
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=Integer.parseInt(input.readLine());
}
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
{
if(arr[j]>arr[j+1])
{
r=arr[j];
arr[j]=arr[j+1];
arr[j+1]=r;
}
}
}
System.out.println("2nd largest number in the given array is : "+arr[n-2]);
}
}