//パッケージ宣言
package classMethod.human; 

public class Human02 {
    public String name;
    public int age;

    public Human02() {
        name = "山田";
        age = 20;
    }

    public Human02(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//Human02クラス
//パッケージ宣言をしてclassMethod.human.Human02とクラスのパッケージを指定する
//上記以外はHuman01クラスと同様
