public class Sample5 {
  public static void main(String[] args) {
    //配列
    int[] scores1 = new int [] {20,30,40,50,80};
    int[] scores2 = {25,35,45,55,65};
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < scores1.length; i++) {
      sum1 += scores1[i];
      sum2 += scores2[i];
    }
    double ave1 = 0;
    ave1 = sum1/5;
    double ave2 = 0;
    ave2 = sum2/5;
    System.out.println("合計点は"+sum1+"点です");
    System.out.println("平均点は"+ave1+"点です");
    System.out.println("合計点は"+sum2+"点です");
    System.out.println("平均点は"+ave2+"点です");
    
    //練習問題
    int[] number = {3,4,5};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : number) {
      if (n == input) {
        System.out.println("アタリ!");
      }
    }
  }
}


/*
3名の年齢をそれぞれの変数に格納する場合;
int a_age = 10;
int b_age = 20;
int c_age = 30;

3名の年齢を配列に格納する場合
int ages[] = { 10, 20, 30 };
配列を使わずに書いた場合3行になるコードを、たった1行で書ける
*/