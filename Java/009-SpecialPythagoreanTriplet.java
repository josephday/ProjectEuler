public class HelloWorld {  
  public static void main(String[] args)
  {int a;
   int b;
   for (a=1;a<=1000;a++){
     for (b=1;b<=1000;b++){
       int c = 1000-b-a;
       if (a*a+b*b==c*c){
       	 System.out.println(a*b*c);
         }
       }
     }
   
  }  
}
