public class HelloWorld {
  public static void main(String[] args)
  {int n;
  int largest = 0;    
  int given = 60085147;
  for (n=1; (n*2) <= given; n++){
    if (given%n==0){
      if (Prime(given/n)){
        largest = given/n;
        break;
        }
      }
    }
  System.out.println(largest);
  }
  
  public static boolean Prime(int input)
  {int n;
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
