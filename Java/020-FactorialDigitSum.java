public class HelloWorld
{
  public static void main(String[] args)
  {int a = factorial(15);
   int total = 0;
    String numtostring = String.valueOf(a);
    String[] parts = numtostring.split("(?!^)");
   for (String part : parts){
   		total += Integer.valueOf(part);}
    System.out.println(total);
  }

// this will become its own file too (and these can be in any order)
public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
}
