public class Main {
    public static void main(String[] args) {

        rectangle r1=new rectangle(40,4);
        rectangle r2=new rectangle(35.9,3.5);

        r1.To_string();
        r2.To_string();

        System.out.println(rectangle.getNo_of_rectangles());
    }
}