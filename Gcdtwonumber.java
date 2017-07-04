# Gcdtwonumber
import java.io.*;
import java.util.*;
public class Gcdtwonumber
{
  public static void main(String args[])throws IOException
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first no:");
    int n1=s.nextInt();
    System.out.println("Enter the second no:");
    int n2=s.nextInt();
    int h=0;
    int m=Math.min(n1,n2);
    for(int i=m;i>=1;i--)
    {
     if(n1%i==0 && n2%i==0)
     {
      h=i;
      break;
      }
      }
    System.out.println("the HCF is"+h);
   }
  } 
