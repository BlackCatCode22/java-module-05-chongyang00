//Chong Yang 10-03-24
// zooVersion1.java

package chong.zoo.com;

import java.util.Date;
import java.text.SimpleDateFormat;

public class App {

    private static String calcAnimalBirthDate(int age, String theSeason) {

        // create a Date object to represent the current date

        Date today = new Date();

        // define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // output the result
        System.out.println("Today's date in the format yyyy-MM-dd: " + strTodaysDate);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(String.valueOf(age));


        // normalize the input season to lower case for case-insensitive comparison
        String season = theSeason.toLowerCase();

        switch (season) {
            case "spring":
                animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
                break;
            case "fall":
                animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
                break;
            case "winter":
                animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
                break;
            case "summer":
                animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
                break;
            default:
                animalBirthdate = Integer.toString(animalBirthYear) + "-01-01"; // Default case for anything else
                break;
        }

        return animalBirthdate;

    }

    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo Program!");

        // create a Date object to represent the current date
        Date today = new Date();

        // define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // Output the result
        System.out.println("Today's date in the format yyyy-MM-dd: " + strTodaysDate);

        // calculate birthdates for the following two hyenas
        //  4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        //  12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // write Java code to calculate birthdates for the animals and then create a method that returns a string
        // for the animal's birthdate.

        // input: "4 year old female hyena, born in spring"
        // processing: find the age and birth season
        //            and then use decision control structures to
        //             calculate the date.

        // parse the string
        // open arrivingAnimals with BufferedFileReader


        String strStarting = "8 year old female hyena, unknown birth season, black and tan striped\n" +
                "color, 105 pounds, from Friguia Park, Tunisia";
        // split the string on ", "
        System.out.println();
        String[] arrayOfStrPartsOnComma = strStarting.split(", ");
        // output the array elements
        // this is a for : each loop - very handy when examining array elements.
        int elementNum = 0;
        for (String thePart : arrayOfStrPartsOnComma) {
            System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
            elementNum++;
        }
        System.out.println();
        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        elementNum = 0;
        for (String thePart : arrayOfStrPartsOnSpace) {
            System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace is: " + thePart);
            elementNum++;
        }
        System.out.println();

        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        elementNum = 0;
        for (String thePart : arrayOfStrPartsOnSpace02) {
            System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thePart);
            elementNum++;
        }
        System.out.println();

        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);

        // this is a unit test - testing the Animal constructor we  created
        Animal myNewAnimal = new Animal("male", 4, 70, "Korky", "Zzy719",
                "2020-3-21", "brown spots", "from San Diego Zoo");

        // prove it
        System.out.println("\n this is the new animal!\n");
        System.out.println("\n ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");

        System.out.println("animal birthdate is: " + calcAnimalBirthDate(Integer.parseInt(ageInYears), animalBirthSeason));

    }
}