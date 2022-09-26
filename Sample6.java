public class Sample6 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello();
    
    morning("小太郎");
    morning("淳之介");
    
    num(22, 17);
    System.out.println(add(10,29));
    System.out.println(add(3.6,4.9));
    
    System.out.println(add("こんにちは","今日も頑張ろう"));
    System.out.println("メソッドの呼び出しを終了します");
    
    int[] array = {1,3,4};
    printArray(array);
    
    int[] brray = {2,4,5};
    incArray(brray);
    for (int i : brray) {
      System.out.println(i);
    }
  }
  
  public static void hello() {
    System.out.println("湊さんこんにちは");
  }
  
  public static void morning(String name) {
    System.out.println(name + "さん、おはようございます！");
  }
  
  public static void num(int x,int y) {
    int sum = x + y;
    System.out.println("弟と兄の年齢の合計は" + sum + "歳です");
  }
  
  public static int add(int A, int B){
    return A + B ;
  }
  
  public static double add(double A, double B){
    return A + B ;
  }
  public static String add(String A, String B){
    return A + B ;
  }
  
  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }
  
  public static void incArray(int[] brray){
    for (int i = 0; i < brray.length; i++) {
      brray[i]++;
    }
  }
}
//P213