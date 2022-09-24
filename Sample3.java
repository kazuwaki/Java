public class Sample3 {
    public static void main(String[] args) {
      System.out.println("あなたの名前を入力してください。");
      //nextLineは文字列の入力を受け取る
      String name = new java.util.Scanner(System.in).nextLine();
      System.out.println("あなたの年齢を入力してください。");
      //nextIntは数値の入力を受け取る
      int age = new java.util.Scanner(System.in).nextInt();
      //Randomを使うと指定した数値未満をランダムに表示する
      int r = new java.util.Random().nextInt(30);
      System.out.println("ようこそ"+age+"歳の"+name+"さん!"+r+"歳かと思いました");
      
      
      int x = 5;
      int y = 10;
      String ans = "x+yは"+(x+y);
      System.out.println(ans);
    
    
    //練習問題
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してくだいさい。");
    String names = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    int ages = new java.util.Scanner(System.in).nextInt();
    int fortune = new java.util.Random().nextInt(4);
    fortune ++;
    System.out.println("占いの結果が出ました！");
    System.out.println(ages + "歳の" + names + "さん、あなたの運気番号は"+ fortune +"です");
    System.out.println("1: 大吉 2: 中吉 3: 吉 4: 凶");
  }
}