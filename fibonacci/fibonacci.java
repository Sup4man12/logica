package fibonacci;
public class fibonacci{
  public static void main (String[] args){
    int num1 = 0;
    int num2 = 1;
    int num3 ;
    //		int num4 = 5;
    int num4 = Integer.parseInt(args[0]);
    for (int n = 0; n < num4; n++){
      System.out.println( num1);
      num3 = num1 + num2;
      num1= num2;
      num2= num3;
    }
  }
}
