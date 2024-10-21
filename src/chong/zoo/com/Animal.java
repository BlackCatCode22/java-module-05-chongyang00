package chong.zoo.com;
import java.util.Date;

public class Animal {

    //create a static int that keep track of the number of animals created
    // static means it does not belong to an object
    static int numOfAnimals = 0;

    //create a contructor for our new Animal Object
    public Animal(){
        numOfAnimals++;
    }

    //create a constructor that include all attributes
    public Animal (String sex, int age, int weight, String animalName, String animalID,
                   String animalBirthdate, String animalColor, String animalOrigin){
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
    }

    //create a few attributes
    //sex will be a male or female
    private String sex;
    private int age;
    private int weight;
    private String animalID;
    private String animalName;
    private String animalBirthdate;
    private String animalColor;
    private String animalOrigin;
    private Date animalArrivalDate;



    //create getters and setters

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getAnimalColor(){
        return animalColor;
    }
    public void setAnimalColor(String animalColor){
        this.animalColor = animalColor;
    }

    public String getAnimalID () {return animalID;}
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName (){
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalOrigin(){
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin){
        this.animalOrigin = animalOrigin;
    }

    public Date getAnimalArrivalDate(){
        return animalArrivalDate;
    }
    public void setAnimalArrivalDate(Date animalArrivalDate){
        this.animalArrivalDate = animalArrivalDate;
    }

    public String getAnimalBirthdate(){
        return animalBirthdate;
    }
    public void setAnimalBirthdate(String animalBirthdate){
        this.animalBirthdate = animalBirthdate;
    }
}


