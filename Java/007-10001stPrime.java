public class HelloWorld {
  public static void main(String[] args){
    int n = 0;
    int largest = 0;    
    int place = 0;
    while (place < 10001){
      n++;
      if (Prime(n)){
        place ++;
        }
      if (place==10001){
        System.out.println(n);
        }
      }
    System.out.println(largest);
    }
    
  public static boolean Prime(int input){
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
