package c01.primero;

public class Animal {
    private int weight;
    private String type;
    private String size;

    public Animal(int weight, String type, String size) {
        this.weight = weight;
        this.type = type;
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean esPesado() {
        return this.weight > 2000 && this.size.equals("grande");
    }
}
