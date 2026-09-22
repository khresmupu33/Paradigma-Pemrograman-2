public class Panda {
    private String name;
    private int strength;
    private int agility;
    private int energy;

    public Panda(String name) {
        this.name = name;
        this.strength = 0;
        this.agility = 0;
        this.energy = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void training(Tiger tiger) {
        tiger.sparring(this);
    }

    public void training(Grasshopper grasshopper) {
        grasshopper.sparring(this);
    }

    public void training(Snake snake) {
        snake.sparring(this);
    }

    public void training(Monkey monkey) {
        monkey.sparring(this);
    }

    public void training(Crane crane) {
        crane.sparring(this);
    }

    public void training(Turtle turtle) {
        turtle.sparring(this);
    }

    public void showMyStatus() {
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Energy: " + energy);
    }
}