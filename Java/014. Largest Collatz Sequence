public class HelloWorld {  
  public static void main(String[] args)
  {int a;
   int largest = 0;
   int moststeps= 0;
   for (a=1000000;a>0;a--){
     int trans = Collatzstepper(a);
     if (trans >= moststeps){
     moststeps= trans;
     largest = a;
     }
   }
    System.out.println(a);
       
     
    }
  
  public static int Collatzstepper(int a){
  int steps = 1;
    while (a != 1){  
      if (a%2==0){
    	a = a/2;
    	steps++;}
      else if (a%2==1){
      	a = 3*a+1;
      	steps++;}
    }
    return steps;
  }
}
