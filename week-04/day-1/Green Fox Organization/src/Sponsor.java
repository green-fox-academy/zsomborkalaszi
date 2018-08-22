class Sponsor extends Person {

    String company;
    int hiredStudents;


    public void introduce() {
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " who represents " + company +
                " and hired " + hiredStudents + " so far. ");

    }

    public void getGoal() {

        System.out.println("Hire brilliant junior software developers.");
    }

    void hire (){

        this.hiredStudents++;
    }

    Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    Sponsor () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;


    }

}
