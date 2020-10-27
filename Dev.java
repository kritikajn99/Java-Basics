import java.util.Scanner;
class Dev
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n");
    int n =sc.nextInt();
    String names[]=new String[n];
     int marks[]=new int[n];
      int GT=0;
	System.out.println("Enter value of name and age");
    for(int i=0;i<n;i++)
     {
       names[i]=sc.nextLine();
       marks[i]=sc.nextInt();
           GT +=marks[i];
     }
    double Avg=GT/(double)n;
    for(int i=0;i<n;i++)
    System.out.println(Math.abs(marks[i]-Avg));
   }
}
