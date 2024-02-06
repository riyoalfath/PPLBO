package TugasShape;

public class ShapeMain extends Shape {
    public static void main (String [] args)  {
        Shape shape1 = new Shape();
        String name = "Name = Neka";

        shape1.setname(name);
        shape1.printname();

        Shape size1 = new Shape();
        String size = "Size = XL";

        size1.setsize(size);
        size1.printsize();

        Square square1 = new Square();

        square1.setpanjang(100);
        square1.setlebar(150);
        
        System.out.println(square1.getp());
        System.out.println(square1.getp1());
    }
}