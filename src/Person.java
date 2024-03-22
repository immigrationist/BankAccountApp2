public class Person
{
    private int age;
    private char gender;
    private String name;
    private String homeAddress;
    private int phoneNumber;

    public Person(String initName, char initGender, int initAge, String initHomeAddress,
                  int initPhoneNumber)
    {
        setName(initName);
        setGender(initGender);
        setAge(initAge);
        setHomeAddress(initHomeAddress);
        setPhoneNumber(initPhoneNumber);
    }



    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(int newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }

    public String getHomeAddress()
    {
        return homeAddress;
    }
    public void setHomeAddress(String newHomeAddress)
    {

        homeAddress = newHomeAddress;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        if(newAge >= 0)
            age = newAge;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public String toString()
    {
        String info = "";

        info += "\n ACCOUNT HOLDER:" + "\n NAME: " + getName() + "\n Gender: ";
        if(getGender() == 'm')
            info += "male";
        else if(getGender() == 'f')
            info += "female";

        info += "\n Age: " + getAge() + "\n Phone Number: " + getPhoneNumber() + "\n Address: " + getHomeAddress();

        return info;
    }
}
