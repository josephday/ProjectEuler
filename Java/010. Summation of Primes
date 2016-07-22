public class HelloWorld {
  public static void main(String[] args){
    int n = 0;
    long total = 0;    
    int threshold = 2000000;
    while (n < threshold){
      n++;
      if (Prime(n)){
      total += n;
      }
    }
     if (n>=2000000){
      System.out.println(total);
      }
    }
  
  public static boolean Prime(int input)
    int n;
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
  }

