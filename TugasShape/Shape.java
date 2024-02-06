package TugasShape;

public class Shape {
    String name;
    String size;

    void setname(String name) {
        this.name=name;
    }
    
    void setsize(String size)   {
        this.size = size;
    }
    
    void printname()  {
        System.out.println (name);
    }
    
    void printsize()  {
        System.out.println (size);
    }
}