package calcapp.main; // code06-05

// chap06
// code06-01 計算機プログラム
//public class Calc {
//
//    // main()メソッド
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int total = tasu(a, b);
//        int delta = hiku(a, b);
//        System.out.println("足すと" + total + "、引くと" + delta);
//        // 実行結果: 足すと30、引くと-10
//    }
//
//    // tasu()メソッド
//    public static int tasu(int a, int b) {
//        return (a + b);
//    }
//
//    // hiku()メソッド
//    public static int hiku(int a, int b) {
//        return (a - b);
//    }
//}

// code06-03 06-01のcalcクラス内のtasu()メソッドとhiku()メソッドをcalsLogicクラスに分割する
//
//public class Calc {
//
//    // main()メソッド
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int total = CalcLogic.tasu(a, b);
//        int delta = CalcLogic.hiku(a, b);
//        System.out.println("足すと" + total + "、引くと" + delta);
//    }
//
//}

// code06-07
//public class Calc {
//
//    // main()メソッド
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int total = calcapp.logics.CalcLogic.tasu(a, b);
//        int delta = calcapp.logics.CalcLogic.hiku(a, b);
//        System.out.println("足すと" + total + "、引くと" + delta);
//    }
//        // エラー: メイン・クラスcalc.Calcを検出およびロードできませんでした
//        // 原因: java.lang.ClassNotFoundException: calc.Calc
//}

// code06-08
import calcapp.logics.CalcLogic;
public class Calc {

    // main()メソッド
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int total = CalcLogic.tasu(a, b); // import文を追加したのでこの書き方でもOK
        int delta = calcapp.logics.CalcLogic.hiku(a, b); // FQCNを指定してもよい
        System.out.println("足すと" + total + "、引くと" + delta);
    }
    // エラー: メイン・クラスcalc.Calcを検出およびロードできませんでした
    // 原因: java.lang.ClassNotFoundException: calc.Calc
    // Calcファイル上で右クリック>Debugから実行でビルド成功
}

// code06-09 calcapp.logicsパッケージに属するすべてのクラスをインポート
// import calcapp.logic.*;
// import calcapp.main.*; // calcapp.mainパッケージに属するすべてのクラスをインポートするときは別途記載すること
// 以下略
