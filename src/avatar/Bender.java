package avatar;

public abstract class Bender {

    static int maxId = 0;
    private int id;
    private String name;
    private String type;

    public Bender(String name, String type) {

        maxId++;
        id = maxId;
        this.name = name;
        this.type = type;

    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    // regular method
    public void displayBender() {
        System.out.println(name + "(" + id + ")" + " is a " + type + "bender.");
    }

    public abstract void bend();

    public abstract int number(int number);

}
