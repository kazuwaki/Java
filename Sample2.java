public class Sample2 {
    public static void main(String[] args) {
      // finalを加えることで再宣言できなくなる
      //基本的にfinalの定数名は大文字
      final double PI = 3.14;
      int pie = 5;
      System.out.println("半径" + pie + "cmのパイの面積は,");
      System.out.println(pie * pie * PI);
      System.out.println("パイの半径を二倍にします。");
      pie = 10 ;
      System.out.println("半径"+ pie +"cmのパイの面積は,");
      System.out.println(pie * pie * PI);
    }
}