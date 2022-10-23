//練習問題
public class Sample7 {
  public static void mySelf() {
    String name = "wakida";
    int age = 22;
    double height = 171.8;
    String eto = "辰";
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳で" + eto + "年です。");
    System.out.println("身長は" + height + "cmあります");
  }
  public static void main(String[] args) {
    mySelf();
    email();
  }

  public static void email(){
    String title = "クラス会について";
    String address = "test@gmail.com";
    String text = "12月29日に開催します";
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }
}
