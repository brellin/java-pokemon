package avatar;

public class Fire extends Bender {

    public Fire(String name) {
        super(name, "fire");
    }

    @Override
    public void bend() {
        System.out.println(getName() + " blasts something with fire!!!");
    }

    @Override
    public int number(int number) {
        return number * 5;
    }

}
