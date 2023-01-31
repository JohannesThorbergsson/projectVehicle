public class Bicycle extends Vehicle{
    public Bicycle(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        if(velocity +kmh>= 35) {
            System.out.println("Speed faster than 35 not allowed");
            return 35;
        } else {
            System.out.println("New speed: " +(velocity+kmh));
            return velocity+kmh;
        }
    }

    @Override
    public int brake() {
        velocity=0;
        return velocity;
    }

}
