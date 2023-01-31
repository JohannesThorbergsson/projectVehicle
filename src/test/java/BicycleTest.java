import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BicycleTest {
    //TestBikes
    Bicycle testBikeFasterThan35 = new Bicycle(45, "Conway MC400", 33);
    Bicycle testBikeSlowerThan35 = new Bicycle(45, "Conway MC400", 20);

    @Test
    void testAccelerateFasterThan35() {
        Assertions.assertEquals(33, testBikeFasterThan35.accelerate(5));
    }

    @Test
    void testAccelerateSlowerThan35() {
        Assertions.assertEquals(25, testBikeSlowerThan35.accelerate(5));
    }
    @Test
    void testBreak(){
        Assertions.assertEquals(0,testBikeFasterThan35.brake());
    }
}
