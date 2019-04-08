import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt(); 
      int sum=0;
        // Repeatedly remove last digit until it reaches the second digit 
		while(n>0)
		{
		   int temp = n % 10;
          sum=sum+temp;
         n=n/10;
		}
        // Add first and last digit
		System.out.print(sum);
	}
}
