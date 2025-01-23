public class Fruit {
    private String type;
    private String color;

    public Fruit(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getMessage() {
        return "Hi, I am " + type + " and I am " + color + " in color.";
    }
}
