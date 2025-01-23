public class FruitApp {
    public static void main(String[] args) {
        Fruit banana = new Fruit("Banana", "Yellow");
        Fruit plum = new Fruit("Plum", "Red");
        Fruit grape = new Fruit("Grape", "Purple");


        System.out.println("The Fruit application has just started.");
        System.out.println(banana.getMessage());
        System.out.println(plum.getMessage());
        System.out.println(grape.getMessage());
        System.out.println("The Fruit application is now about to exit.");
    }
}


