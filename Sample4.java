public class Sample4 {
    public static void main(String[] args) {
    boolean tenki = true ;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
       System.out.print("DVDを鑑賞します");
    }

    //占い if文
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(4) + 1;
    if (fortune == 1) {
      System.out.println("大吉");
    } else if (fortune == 2) {
      System.out.println("小吉");
    } else if (fortune == 3) {
      System.out.println("吉");
    } else {
      System.out.println("凶");
    }
    //占い　switch文
    switch (fortune) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("小吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      case 4:
        System.out.println("凶");
        break;
    }
    //for文
    for (int i = 0; i < 10; i++) {
      System.out.print("こんにちは");
    }
    //for文の繰り返しをネストさせる
    for (int i = 1; i < 10; i++){
      //条件になったら繰り返し処理を中断
      if (i == 8) {
        break;
      }
      for (int j = 1; j < 10; j++) {
        //continueは条件を中断して次の周へ
        if (j == 2){
          continue;
        }
        System.out.println(i * j);
        System.out.println("");
      }
      System.out.println("");
    }

    //練習問題1
    int isHungry = 1;
    String food = "おにぎり";
    System.out.println("こんにちは");
    if (isHungry==0){
      System.out.println("お腹がいっぱいです。");
    } else {
      System.out.println(food + "をいただきます");
      System.out.println("ごちそうさまでした");
    }

    //練習問題2
    System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected){
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }
    //練習問題3
    System.out.println("数当てゲーム");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.println("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans){
        System.out.println("アタリ!");
        break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}