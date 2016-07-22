public class HelloWorld {
  public static void main(String[] args)
  {int i=0;
  int counter = 0;
  while (i < 1000000){
    i++;
    if (Prime(i)){
      if(PrimeRotations(i)){
      	counter++;
        }
      }
    }
  System.out.println(counter);
  }
  
  public static boolean Prime(int input)
  {int n;
  if(input < 0) input *= -1;
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
  
  public static int[] Rotations(int a)
  {int i;
  int k;
  String numtostring = String.valueOf(a);
  String[] parts = numtostring.split("(?!^)");
  int[] rotations = new int[parts.length-1];
  for (i=1; i<parts.length; i++){
    String base = "";
    for (k=i; k-i<parts.length; k++){
    	base += parts[k%parts.length];
      }
    int rotated = Integer.valueOf(base);
    rotations[i-1] = rotated;
    }
  return rotations;
  }
  
  public static boolean PrimeRotations(int a)
  {for (int rotation: Rotations(a)){
    if (!(Prime(rotation))){
      return false;
      }
    }
  return true;  
  }
}
