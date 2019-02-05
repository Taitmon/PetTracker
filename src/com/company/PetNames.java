package com.company;

public class PetNames
{
    public static void receivedPetNames()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numEntered = input.nextInt();

        String[] petName = new String[numEntered];

        //TODO I need to go back and make it where this code allows you to input the correct amount of names.
        //TODO it stops allowing input 1 position less of your entered amount of names. 
        System.out.println("Please enter the name of your pet.");
        int index = 0;
        while (index < numEntered)
        {
            String nameEntered = input.nextLine();
            petName[index] = nameEntered;


            index++;
        }

        System.out.println("The pets names are:");
        for(String petNames: petName)
        {
            System.out.println(petNames);
        }

    }
}
