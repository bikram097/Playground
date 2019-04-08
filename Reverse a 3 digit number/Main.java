import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
      int n1=in.nextInt();
      int d1=n1%10;
      int d2=(n1%100)/10;
    int d3=n1/100;
    int rev=d1*100+d2*10+d3;
        System.out.println(rev);
  }
}