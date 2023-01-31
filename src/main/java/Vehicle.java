public abstract class Vehicle implements Accelerateable{
    private int id;
    private String name;
    int velocity;

    public Vehicle(int id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public Vehicle() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVelocity() {
        return velocity;
    }
}
