package avatar;

public class Earth extends Bender {

    public Earth(String name) {
        super(name, "earth");
    }

    @Override
    public void bend() {
        System.out.println(getName() + " smacks the ground and a stone comes out!!!");
    }

    @Override
    public int number(int number) {
        return number - 5;
    }

}
