package calcapp.main;

public class Sample9 {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = calcapp.logics.Sample9Debug.tasu(a, b);
    int delta = calcapp.logics.Sample9Debug.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
