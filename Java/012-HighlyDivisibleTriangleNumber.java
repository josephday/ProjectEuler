public class HelloWorld {  
  public static void main(String[] args)
  {int a;
   int current = 0;
   for (a=1;a<100000;a++){
     current += a;
   	 if (divisors(current) > 500){
   	   System.out.println(current);
       break;
       }
     }
    }
  
  public static int divisors(int a){
  int n;
  int divisors = 0;
    for (n=1;n*n<=a;n++){
      if (a%n==0){
        if (n*n==a) divisors++;
        else divisors+=2;
      	 
    }
  
  }
   return divisors;
}
}
