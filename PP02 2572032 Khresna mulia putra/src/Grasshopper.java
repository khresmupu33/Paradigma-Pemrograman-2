public class Grasshopper {
    private String name;

    public Grasshopper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda) {
        System.out.println(panda.getName() + ", get ready.");
        panda.setAgility(panda.getAgility() + 9);
        panda.setEnergy(panda.getEnergy() + 5);
    }
}