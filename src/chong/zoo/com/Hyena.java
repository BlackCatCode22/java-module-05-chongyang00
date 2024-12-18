package chong.zoo.com;

public class Hyena extends chong.zoo.com.Animal {
    // static int that keep track of the number of hyenas created.
    static int numOfHyenas = 0;

    // Create a constructor.
    public Hyena(){
        super();
        numOfHyenas++;
    }

    // Create a constructor that will have all the fields I want.
    //inherits all the attributes and constructors from Animal class
    public Hyena(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthDate, String animalColor,
                 String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin);
        numOfHyenas++;
    }



}

