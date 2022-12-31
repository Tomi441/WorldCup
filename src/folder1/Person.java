package folder1;
public class Person {
    private String firstName;
    private String surName;
    private String team;

    public Person(String firstName, String surName, String team) {
        this.firstName = firstName;
        this.surName = surName;
        this.team = team;
    }

    public String getFirstName () {
            return firstName;
    }

    public void setFirstName (String firstName){
            this.firstName = firstName;
    }

    public String getSurName () {
        return surName;
    }

    public void setSurname (String surName){
        this.surName = surName;
    }

    public String getTeam () {
        return team;
    }

    public void setTeam (String team){
        this.team = team;
    }



}
