import java.util.Scanner;

public class Odd
{
    public static void main(String[] args) {
int int1, int2, sum = 0;
Scanner scan = new Scanner(System.in);
System.out.println("Please enter two integers: " );
int1 = scan.nextInt();
int2 = scan.nextInt();
for (sum = int1; sum <= int2; sum++){
if ( sum %2 != 0 ){
System.out.println("" + sum); 
}
}
}

    
}
