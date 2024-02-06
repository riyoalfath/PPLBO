package TugasBinatang;

public class AnimalMain {
        public static void main (String[]args)  {
                Animal fish1 = new Animal();
                String fish = "Fish makan cacing dan bergerak dengan sirip";
        
                Animal bear2 = new Animal();
                String bear= "Bear makan madu dan bergerak dengan kaki";
        
                fish1.setfish(fish);
                fish1.printfish();
                bear2.setbear(bear);
                bear2.printbear();
        }
}
