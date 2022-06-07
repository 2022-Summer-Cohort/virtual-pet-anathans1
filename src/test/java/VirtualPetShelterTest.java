import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;
import virtual_pet.VirtualPetShelter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetShelterTest {

    @Test
    public void petIsAdmittedToVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet TestPet = new VirtualPet("testName",2,2,2,2);
       // underTest.admitToVirtualPetShelter("testName");
       // assertEquals( underTest.ge, underTest.findPetByName("testName"));
        underTest.admitToVirtualPetShelter(TestPet);
       // int numOfPets = underTest.shelterPopulation();
        assertEquals(2,underTest.shelterPopulation() );
        assertTrue(underTest.getShelter().add(new VirtualPet("testName",2,2,2,2)));
        //TODO really think through all the things that you would
        // need to test to make it a good test... think stupid
    }

    @Test
    public void petIsAdoptedFromVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        assertTrue(underTest.findPetByName("Elijah") != null);
        int numOfPets = underTest.shelterPopulation();
        underTest.adoptFromVirtualPetShelter("Elijah");
        assertTrue(underTest.findPetByName("Elijah") == null);
        assertEquals(numOfPets-1,underTest.shelterPopulation());

    }
    @Test
    public void shelterPopulationMatchesActualShelterArrayList(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.shelterPopulation();
        assertEquals(1,underTest.shelterPopulation());
    }
    @Test
    public void feedAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitToVirtualPetShelter(new VirtualPet("Rockie",5,5,5,5));
        underTest.feedAllPets();
        underTest.tickShelter();
        for (VirtualPet pet:underTest.getShelter()) {
            assertEquals(0,pet.getHungerLevel());
        }

    }
//    @Test
//    public void specificPetIsFed(){
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        underTest.feedSpecificPet(new VirtualPet("Matt",2,2,2,2));
//        assertEquals(0,underTest.getShelter());
//
//    }
}
//assignment
//action
//assertion