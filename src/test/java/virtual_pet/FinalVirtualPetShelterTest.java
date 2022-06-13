package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FinalVirtualPetShelterTest {
    @Test
    public void shelterPopulationMatchesActualShelterArrayList(){
        FinalVirtualPetShelter underTest = new FinalVirtualPetShelter();
        underTest.shelterPopulation();
        assertEquals(4,underTest.shelterPopulation());
    }

    @Test
    public void feedAllPets() {
        FinalVirtualPetShelter underTest = new FinalVirtualPetShelter();
        underTest.admitOrganicDog("Rocky");
        underTest.feedAllPets();
        underTest.tickShelter();
            assertEquals(0,((OrganicVirtualPet)underTest.getShelter().get(4)).getHungerLevel());
    }
    @Test
    public void waterAllPets() {
        FinalVirtualPetShelter underTest = new FinalVirtualPetShelter();
        underTest.admitOrganicDog("Rocky");
        underTest.waterAllPets();;
        underTest.tickShelter();
        assertEquals(0,((OrganicVirtualPet)underTest.getShelter().get(4)).getThirstLevel());


    }
}
