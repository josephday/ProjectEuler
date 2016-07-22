public class HelloWorld {  
  
  public static void main(String[] args){
  	int n;
   	int largest=0;
   	int counter=0;
   	for (n=9999999; n>0; n--){
     	if (Prime(n)){
       	if (pandigital(n)){
         	System.out.println(n);
         	break;
         	}
     		}
   		}
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
  
  public static boolean pandigital(int n) {
  	int i;
    int length = (int)(Math.log10(n)+1);
    String numtostring = String.valueOf(n);
    String[] parts = numtostring.split("(?!^)");
    for (i=1;i<=length;i++){
      int counter = 0;
   		for(String s: parts){
        if(s.equals(String.valueOf(i))){
					counter ++;
      	  }
   			}
     	if (counter != 1){
     		return false;
     		}
   		}
		return true;
 		}
	
	}
