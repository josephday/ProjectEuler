public class HelloWorld
{
  public static void main(String[] args)
  {int p;
   int highest = 0;
   int highestp=0;
   int current;
   for (p=1;p<1000;p++){
   	 current = Triangles(p);
     if (current>=highest){
     	highest=current;
     	highestp=p;}
     
   }
    
    System.out.print(highestp);
  }


	public static int Triangles(int n)
	{int a;
	 int b;
 	 int c;
     int counter = 0;
     for (a=1;a<n;a++){
       for (b=1;b<n;b++){
            c = n - b - a;	
            if (a*a + b*b == c*c){
            counter++;	
         	}

       }
     }
    return counter/2;  
	}
}
