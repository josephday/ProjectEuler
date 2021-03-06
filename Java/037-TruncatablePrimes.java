public class HelloWorld {
  public static void main(String[] args){
    int n=11;
    int total=0;
    int counter=0;
    while (counter < 11){
    	n++;
      if (Prime(n)){
     	  if (PrimeTruncations(n)){
       	  total+=n;
         	counter++;
          }
        }
      }
    System.out.println(total);
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
  
  public static int[] Truncations(int a){
    int i;
    int k;
    String numtostring = String.valueOf(a);
    String[] parts = numtostring.split("(?!^)");
    int[] truncations = new int[2*parts.length];
    truncations[0] = a;
    String base = "";
    for (i=parts.length; i-1>0; i--){
   		base = parts[i-1]+ base;        
      int truncated = Integer.valueOf(base);
      truncations[i-1] = truncated;
      }
    base ="";
    for (i=0;i+1<parts.length;i++){
     	base += parts[i];        
      int truncated = Integer.valueOf(base);
      truncations[2*parts.length-i-1] = truncated;
      }
    return truncations;
    }
  
  public static boolean PrimeTruncations(int a){
    for (int truncation: Truncations(a)){
      if (!(Prime(truncation)) && (truncation != 0)){
        return false;
        }
      }
    return true  ;  
    }
  
  }
