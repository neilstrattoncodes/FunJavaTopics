package JavaConcepts;

/* Example of Encapsulation making data private and will send to class thats needed */


public class Bicycle {


    private String type;
    private String color;
    private int gears;

    Bicycle(String type, String color, int gears) {
        this.type = type;
        this.color = color;
        this.gears = gears;
    }

    /* Setters and Getters */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

}
