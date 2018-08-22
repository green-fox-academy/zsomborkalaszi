class Student extends Person {

    String previousOrganization;
    int skippedDays;

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");

    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");

    }

    void skipDays(int numberOfDays) {

        skippedDays += numberOfDays;
    }

    Student(String name, int age, String gender, String previousOrganization) {

        super(name, age, gender);
        this.skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    Student () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;


    }

}