import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
      int num1=in.nextInt();
      int d1=num1%10;
      int d2=num1/10;
      int sum=d1+d2;
        System.out.println(sum);
	}
}