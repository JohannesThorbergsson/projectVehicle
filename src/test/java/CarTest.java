import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    Accelerateable testCar = new Car(4564, "Ford Fiesta", 60);
    @Test
    void testAccelerate() {
        //WHEN

        Assertions.assertEquals(80, testCar.accelerate(20));
    }
    @Test
    void testBreak(){
        Assertions.assertEquals(0, testCar.brake());
    }
}
