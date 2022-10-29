public class FizzBazz {
  public static void main(String[] args) {
    System.out.println("好きな数字を入力してください");
    //nextIntは数値の入力を受け取る
    int num = new java.util.Scanner(System.in).nextInt();
    //１５から割り算しないと5や3が先に引っかかるからだめ
    if (num % 15 == 0){
     System.out.println("FizzBuzz"); 
    } else if (num % 5 == 0) {
      System.out.println("Buzz");
    } else if (num % 3 == 0) {
      System.out.println("Fizz"); 
    } else {
      System.out.println(num);
    } 
  }
  
}