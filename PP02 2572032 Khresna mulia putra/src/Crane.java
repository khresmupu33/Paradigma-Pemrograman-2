public class Crane {
    private String name;

    public Crane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda) {
        System.out.println("Ok. Let's begin the training");
        panda.setStrength(panda.getStrength() + 3);
        panda.setEnergy(panda.getEnergy() + 11);
    }
}