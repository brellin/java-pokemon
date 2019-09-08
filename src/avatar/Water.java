package avatar;

public class Water extends Bender {

    public Water(String name) {
        super(name, "water");
    }

    @Override
    public void bend() {
        System.out.println(getName() + " crashes some water!!!");
    }

    @Override
    public int number(int number) {
        return number / 5;
    }

}
