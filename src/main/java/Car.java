public class Car extends Vehicle{
    public Car(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    public int accelerate(int kmh) {
    velocity += kmh;
    System.out.println("Current speed: "+ velocity);
    return velocity;
    }
    @Override
    public int brake() {
        velocity=0;
        return velocity;
    }
}
