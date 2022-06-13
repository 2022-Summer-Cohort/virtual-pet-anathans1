//package OriginalVirtualPetRaccoon;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class VirtualPetShelter {
//    private ArrayList<VirtualPet> shelter;
//
//    public ArrayList<VirtualPet> getShelter() {
//        return shelter;
//    }
////    public Collection<VirtualPet> availablePets(){
////        shelter.getHungerLevel();
////        return shelter.set();
////    }
//    public VirtualPetShelter() {
//        shelter = new ArrayList<>();
//        shelter.add(new VirtualPet("Elijah", 5, 5, 5));
//    }
//    public void feedAllPets() {
//        for (VirtualPet pet : shelter) {
//            pet.feed();
//        }
//    }
//    public void waterAllPets() {
//        for (VirtualPet pet : shelter) {
//            pet.water();
//        }
//    }
//    public void playWithAllPets() {
//        for (VirtualPet pet : shelter) {
//            pet.play();
//        }
//    }
//    public void tickShelter() {
//        for (VirtualPet pet : shelter) {
//            pet.tick();
//        }
//    }
//    public VirtualPet findPetByName(String name) {
//        for (VirtualPet temporaryPet : shelter) {
//            if (temporaryPet.getName().equalsIgnoreCase(name)) {
//                return temporaryPet;
//            }
//        }
//        return null;
//    }
//    public void admitToVirtualPetShelter(VirtualPet pet) {
//
//        shelter.add(pet);
//    }
//    public void adoptFromVirtualPetShelter(String name) {
//        shelter.remove(findPetByName(name));
//        //shelter.remove(1);  this was an example that can be deleted
//    }
//    public int shelterPopulation() {
//        return (shelter.size());
//    }
//    public void showAllPetStats() {
//        for (VirtualPet pet : shelter) {
//            pet.greeting();
//        }
//    }
//}




