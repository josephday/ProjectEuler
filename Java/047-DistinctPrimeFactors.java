public class HelloWorld {  
  
  public static void main(String[] args)
  {int a=644;
   int d=0;
   while (d==0){
     if (factors(a)){
       if (factors(a+1)){
         if (factors(a+2)){
           if (factors(a+3)){
           	System.out.println(a);
            d= a;
           }
         }
       }
     }
     a++;
   }
   
     
   
 	System.out.println(factors(134043));
   System.out.println(factors(134044));
     System.out.println(factors(134045));
     System.out.println(factors(134046));
    
      
  }
  
  public static boolean Prime(int input)
  { int n;
   if(input < 0) input *= -1;
   //if (input == 1) {
   //	return false;}
   //if (input == 2) {
   //return true;}
   // if (input%2==0){
    //  return false;}
    for (n = 3; n*n <= input; n+=2){
      if (input%n==0){
        return false;}}
    return true;
  }
  
  public static boolean factors(int n)
    
  {int i;
   int counter = 0;
   if (n%2==0){
      counter++;}
    for (i = 3; 10*i <= n; i+=2){
      if (n%i==0){
        if (Prime(i)){
          counter++;}}
     if (counter==4){
      return true;}
    }
   	return false;
   
  }
  
  
 
}
