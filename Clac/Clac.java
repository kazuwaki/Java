package clacapp.main;
import clacapp.main.*;
//import パッケージ名.クラス名
//import 宣言はクラスの定義を行うよりも前に行う
//import clacapp.logics.*;

public class Clac{
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = ClacLogic.tasu(a, b);
    int delta = clacapp.logicsClacLogic.hiku(a, b);
    /* int total = tasu(a,b);
    int delta = hiku(a,b);
    6,7行目でtasu()やhiku()を呼び出しているがメソッドがないのでエラーが起きる
    mainから呼び出すにはClacLogicのtasu()とClacLogicのhiku()と明確に所属を示す（4,5行目）*/
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
