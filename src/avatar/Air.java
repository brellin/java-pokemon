package avatar;

public class Air extends Bender {

    public Air(String name) {
        super(name, "air");
    }

    @Override
    public void bend() {
        System.out.println(getName() + " floats in the air!!!");
    }

    @Override
    public int number(int number) {
        return number + 5;
    }

}
