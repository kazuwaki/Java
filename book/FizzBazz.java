public class FizzBazz {
  public static void main(String[] args) {
    System.out.println("好きな数字を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    if (num % 15 == 0){
     System.out.println("FizzBazz"); 
    } else if (num % 5 == 0) {
      System.out.println("Bazz");
    } else if (num % 3 == 0) {
      System.out.println("Fizz"); 
    } else {
      System.out.println(num);
    } 
  }

}