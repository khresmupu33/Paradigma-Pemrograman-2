public class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda) {
        System.out.println("So " + panda.getName() + ". Let's get started");
        panda.setStrength(panda.getStrength() + 5);
        panda.setAgility(panda.getAgility() + 9);
    }
}