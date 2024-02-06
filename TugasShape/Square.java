package TugasShape;

public class Square extends Shape {
    int panjang;
    int lebar;
    String p, p1;
    
    void setpanjang(int panjang) {
        this.panjang = panjang;
    }

    void setlebar(int lebar) {
        this.lebar = lebar;
    }

    void setp(String p) {
        String y = String.valueOf(panjang);
        System.out.println(y + panjang);
    }

    void setp1(String p1)  {
        String z = String.valueOf(lebar);
        System.out.println(z + lebar);
    }
    
    void printpanjang() {
        System.out.println (panjang);
    }

    void printlebar() {
        System.out.println (lebar);
    }
    
    String getp() {
        return this.p = "Panjang = " + panjang;
    }
    
    String getp1() {
        return this.p1= "Lebar = " + lebar;
    }
}