public class HelloWorld {
  public static void main(String[] args)
  {int a;
  int b; 
  int current;
  int largestrun = 0;
  int besta = 0;
  int bestb = 0;
  for (a = -1000; a<=1000; a++){
    for (b = 0; b<=1000; b++){
		  current = Run(a,b);
      if (current> largestrun){
        largestrun = current;
        besta = a;
        bestb = b;
      	}
    	}
  	}
  System.out.println(besta*bestb);
  }
  
  public static boolean Prime(int input)
  {int n;
  if(input < 0) input *= -1;
  if (input%2==0){
    return false;
    }
  for (n = 3; n*n <= input; n+=2){
    if (input%n==0){
      return false;
      }
    }
  return true;
  }
  
  public static int Run(int a, int b)
  {int n = 0;
  while (Prime(n*n + a*n + b)){
		n++;        
   	}
  return n;
  }
}
