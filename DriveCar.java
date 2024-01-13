public class DriveCar {
    //呼び出す側
    public static void main(String[] args) {
        //オブジェクト生成（クラス名 オブジェクト名 = new クラス名();)
        //Carクラスをもとにオブジェクトが生成される（インスタンス化）
        Car car1 = new Car();
        //Carクラスのメソッドの引数として渡され、メソッドが処理される
        car1.setNo(2525);
        car1.run(30);
        //メソッドが処理される
        car1.display();
        car1.stop();
        car1.display();
    }
}