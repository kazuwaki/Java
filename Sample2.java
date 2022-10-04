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
/*演算子	概要	例
+	加算	1 + 2 // 3
–	減算	5 – 2 // 3
*	乗算	3 * 4 // 12
/	除算	5.0 / 2 // 2.5
%	剰余	5 % 2 // 1
+	文字列の連結	“A” + “B” // AB
++	インクリメント	x = 1;x++; // 2
– –	デクリメント */
