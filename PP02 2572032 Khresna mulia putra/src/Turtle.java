public class Turtle {
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda) {
        System.out.println("Come " + panda.getName() + ". I will show you the dragon scroll");
        panda.setStrength(panda.getStrength() + 8);
        panda.setAgility(panda.getAgility() + 8);
        panda.setEnergy(panda.getEnergy() + 8);
    }
}