public class test {
  public static void main(String[] args){
    //1以上5未満の数の2乗を出力
    int num = 1;
    while (1 <= num && num < 5) {
      System.out.println(num*num);
      num++;
    }
    //要素数が4の「int」配列を初期化
    int arry[] = {2, 4, 5, 79};
    for (int i = 0; i < arry.length; i++){
      System.out.println(arry[i]); 
    }
    
    //arryの偶数をスキップ（continue)
    for (int i = 0; i < arry.length; i++){
      if (arry[i] % 2 == 0) {
        continue;
      }
      System.out.println(arry[i]);
    }
  }
}