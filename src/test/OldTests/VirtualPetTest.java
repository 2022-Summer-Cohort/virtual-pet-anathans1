//package virtual_pet;
//
////import static org.junit.Assert.assertEquals;
////import org.testng.annotations.Test;
////import static org.junit.jupiter.api.Assertion;
//import static org.testng.AssertJUnit.assertEquals;
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//public class VirtualPetTest {
//    private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//
//    @BeforeEach
//    public void setUp() {
//        System.setOut(new PrintStream(outputStreamCaptor));
//    }
//    @Test
//    void greetingShouldReturnStatus() {
//        VirtualPet underTest = new VirtualPet("test", 2, 3, 4);
//        String expectedOutput = "\uD83E\uDD9Dtest's\uD83E\uDD9D hunger level is 2, his thirst level is 3, his boredom level is 4.";
//        //Object assertEquals = VirtualPet;
//        underTest.greeting();
//        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
//
////
//    }
//    // TODO: 5/27/22 create feed test
//    @Test
//    void hungerLevelShouldGoTo0WhenFeed() {
//        VirtualPet underTest = new VirtualPet("test", 2, 3, 4);
//        underTest.feed();
//        underTest.tick();
//        assertEquals(0, underTest.getHungerLevel());
//    }
//    // TODO: 5/27/22  just like above but assert 0 for hunger level and put it under test
//    @Test
//    void thirstLevelShouldGoTo0WhenWater() {
//        VirtualPet underTest = new VirtualPet("test", 3, 4, 5);
//        underTest.water();
//        underTest.tick();
//        assertEquals(0, underTest.getThirstLevel());
//    }
//    @Test
//    void boredomLevelShouldGoTo0WhenPlay() {
//        VirtualPet underTest = new VirtualPet("test", 3, 4, 5);
//        underTest.play();
//        underTest.tick();
//        assertEquals(0, underTest.getBoredomLevel());
//    }
//}