public class method{
    static void studentinfo(){
        System.out.println("student name is shown");
    }

    public void speed(int speed){
        System.out.println("maximum speed is" + speed);
    }
    public static void main(String[] args) {
        method mycar = new method();
        mycar.studentinfo();
        mycar.speed(200);
    }

}