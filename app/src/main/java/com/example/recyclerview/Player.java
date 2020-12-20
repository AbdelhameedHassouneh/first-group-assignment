package com.example.recyclerview;

public class Player {
    String name;
    int age;
    String dateOfBirth;
    String currentClub;
    int numberOfGoalsScored;
    int numberOfAssists;
    int imageId;



    public static Player[] getPlayers(){
        Player []players={
                new Player("Lionel Messi",33,"18/2/1987","Barcelona",643,200,R.drawable.messi),

                new Player("Cristiano Ronaldo",36,"5/2/1985","Juventus",645,90,R.drawable.ronaldo),

                new Player("Morata",29,"10/3/1995","Juventus",50,20,R.drawable.morata),

                new Player("Lewandoski",31,"1/5/1988","Bayern mucnich",600,100,R.drawable.lewndoski),


                new Player("Suarez",32,"22/4/1987","Atletico madrid",550,20,R.drawable.suarez),

                new Player("Benzema",33,"19/4/1987","Real madrid",550,20,R.drawable.benzema),

                new Player("Ramos",32,"2/2/1987","Real madrid",40,20,R.drawable.ramos),

                new Player("Jordi Alba",33,"2/2/1987","Barcelona",40,90,R.drawable.jordi),

                new Player("Harry Kane",32,"30/6/1987","Spurs",400,100,R.drawable.kane),
                new Player("Bruno",20,"11/7/2000","Manchister united",50,45,R.drawable.bruno),






        };

        return players;

    }
    public Player() {
    }

    public Player(String name, int age, String dateOfBirth, String currentClub, int numberOfGoalsScored, int numberOfAssists, int imageId) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.currentClub = currentClub;
        this.numberOfGoalsScored = numberOfGoalsScored;
        this.numberOfAssists = numberOfAssists;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public void setCurrentClub(String currentClub) {
        this.currentClub = currentClub;
    }

    public int getNumberOfGoalsScored() {
        return numberOfGoalsScored;
    }

    public void setNumberOfGoalsScored(int numberOfGoalsScored) {
        this.numberOfGoalsScored = numberOfGoalsScored;
    }

    public int getNumberOfAssists() {
        return numberOfAssists;
    }

    public void setNumberOfAssists(int numberOfAssists) {
        this.numberOfAssists = numberOfAssists;
    }
}
