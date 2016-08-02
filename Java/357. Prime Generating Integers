public class HelloWorld
{
  public static void main(String[] args)
  {int i;
   int total=0;
   for (i=0;i<=1000;i++){
     if (Generating(i)){
     total += i;
     }
     }
   System.out.print(total);
   }
   
  public static boolean Prime(int input){ 
  int n;
  if(input < 0) input *= -1;
  if (input == 1) {
   	return false;
   	}
  if (input == 2) {
    return true;
    }
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
  
  public static boolean Generating(int n){
    int i;
    for (i=1; i<=n; i++){
      if (n%i==0){
        if (!(Prime(n+i/i))){
        	return false;	
        }
      }
    }
  return true;
  }
  
  

 
}
