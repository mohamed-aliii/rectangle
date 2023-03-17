public class rectangle {
    private double h;
    private double w;
    private static int  no_of_rectangles;

    public rectangle(){
        h=w=1;
        no_of_rectangles++;
    }

    public rectangle(double height,double width){
        h =height;
        w =width;
        no_of_rectangles++;
    }

    public static int getNo_of_rectangles(){
        return no_of_rectangles;
    }
    public double get_Height() {
        return h;
    }
    public double get_Width() {
        return w;
    }

    public void set_Height(double h) {
        this.h = h;
    }

    public void set_Width(double w) {
        this.w = w;
    }
    public void get_Area(){
        System.out.println(h*w);
    }
    public void get_perimeter(){
        System.out.println(2*(h+w));
    }

    public void To_string(){
        System.out.println("height is: "+h+"  width is: "+w+"  Area is: "+(h*w)+"  perimeter is: "+(2*(h+w)));
    }


    
}


