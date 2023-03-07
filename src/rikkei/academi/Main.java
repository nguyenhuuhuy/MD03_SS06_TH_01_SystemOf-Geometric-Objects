package rikkei.academi;

public class Main {
    public static void main(String[] args) {
        //Kiểm thử Class Shape
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        // khởi tạo ban đầu có giá trị mặc định màu là green và biến là true
        System.out.println(shape);
        // sau khi set lại thuộc tính thì bị thay đổi
        shape = new Shape("red",false);
        System.out.println(shape);

        //kiểm thử Class Circle
        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        // khởi tạo ban đầu có giá trị mặc định màu là green và biến là true và radius = 1
        System.out.println(circle);
        // set radius thì biến color và filled không đổi
        circle = new Circle(3.5);
        System.out.println(circle);
        // set 3 thuộc tính thì bị thay đổi hết
        circle = new Circle("Violet",false,4);
        System.out.println(circle);
        // thêm mới set lại mặc định
        Circle a = new Circle();
        System.out.println(a);

        //Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        // khởi tạo kế thừa 2 thuộc tính của cha và có thêm 2 thuộc tính của class
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        // thay đổi hai thuộc tính trong class con lớp cha ko bị tác động
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        // thay đổi hết các thuộc tính kể cả thuộc tính cha
        rectangle = new Rectangle("blue",false,3.4,5.0);
        System.out.println(rectangle);

        //Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");


        Square square = new Square();
        System.out.println(square);


        square = new Square(2.3);
        System.out.println(square);

        square = new Square("black",false,5);
        System.out.println(square);
    }
}
