public class HelloWorld {  
  public static void main(String[] args)
  {int m;
   int n;
   int largest=0;
   for (m=100;m<1000;m++){
     for (n=100;n<1000;n++){
       if (m*n == reverse(m*n,0)){
         if (m*n >= largest){
         	largest = m*n;
         	}
     	 }
       }
     }     
   
   System.out.println(largest);      
  }
  public static int reverse(int a, int b){
    while (a != 0){
      b = b*10 + a % 10;
      a /= 10;
      }
   	return b;
    }
}
