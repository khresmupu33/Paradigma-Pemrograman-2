public class Tiger {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda) {
        System.out.println("So you are ready to feel the pain.");
        panda.setAgility(panda.getAgility() + 9);
        panda.setStrength(panda.getStrength() + 5);
    }
}