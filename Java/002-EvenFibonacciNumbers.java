public class HelloWorld {
  public static void main(String[] args)
  {int total = 0;
  int current = 1;
  int next = 1;
  int last = 0;
  int n;
  while (next<4000000){
    next = current + last;
    last = current;
    current = next;
    if (current%2==0){
      total += current;
      }
    }
  System.out.println(total);
  }
}
