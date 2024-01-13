public class Car { 
    //呼び出される側
    //メンバ変数（属性）
    int no;      
    int speed;
    
    //メソッド（操作）
    void setNo(int n){
        no = n;
    }
    
    void run(int s){
        speed = s;
    }
    
    void stop(){
        speed = 0;
    }
    
    void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
}