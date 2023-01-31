public abstract class Vehicle implements Accelerateable{
    protected int id;
    protected String name;
    protected int velocity;

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
