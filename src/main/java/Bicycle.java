public class Bicycle extends Vehicle{
    public Bicycle(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        if((velocity +kmh)> 35) {
            System.out.println("Speed faster than 35 not allowed");
        } else {
            velocity+=kmh;
            System.out.println("New speed: " +velocity);
        }
        return velocity;
    }

    @Override
    public int brake() {
        velocity=0;
        return velocity;
    }

}
