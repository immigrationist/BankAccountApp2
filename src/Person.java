public class Person {
    private double height;
    private double weight;
    private int age;
    private char gender;
    private String name;
    private String eyeColor;
    private String hairColor;
    private String homeAddress;
    private int phoneNumber;

    public Person(){
        height = 0.0;
        weight = 0.0;
        age = 0;
        setName("");
        setGender('m');
        eyeColor = "";
        hairColor = "";
    }
    public Person(String initName, char initGender, int initAge, double initHeight,
                  double initWeight){
        setName(initName);
        setGender(initGender);
        age = initAge;
        eyeColor = "Green";
        hairColor = "Black";
        height = initHeight;
        weight = initWeight;
    }



    public int getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(int newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }

    public String getHomeAddress(){return homeAddress;}
    public void setHomeAddress(String newHomeAddress){
        homeAddress = newHomeAddress;
    }

    public int getAge() { return age; }

    public void setAge(int newAge){
        if(newAge >= 0)
            age = newAge;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double newHeight){
        if(newHeight >= 0){
            height = newHeight;
        }
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if(weight >= 0)
            this.weight = weight;
    }

    public String getHairColor(){
        return hairColor;
    }
    public void setHairColor(String newHairColor){
        if(newHairColor.equalsIgnoreCase("Black") || newHairColor.equalsIgnoreCase("Brown") ||
                newHairColor.equalsIgnoreCase("Blond") || newHairColor.equalsIgnoreCase("Red") ||
                newHairColor.equalsIgnoreCase("Grey") || newHairColor.equalsIgnoreCase("White"))
            hairColor = newHairColor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString(){
        String info = "";

        info += "\n PERSONAL INFORMATION:";
        info += "\n NAME: " + name + "\n Gender: ";
        if(getGender() == 'm')
            info += "male";
        else if(getGender() == 'f')
            info += "female";

        info += "\n Age: " + age + "\n Phone Number: " + phoneNumber + "\n Address: " + homeAddress;
        info += " \n Height: " + height + "\n Weight: " + weight;



        return info;
    }


}
