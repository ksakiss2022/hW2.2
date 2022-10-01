public class Human {


    int yearOfBirth;
    String name;
    String town;
    String job;
    Human[] nameNull;

    // void human() {

    //  System.out.print("Привет! Меня зовут " + name + ". ");
    //   System.out.print("Я из города " + town + ". ");
    //   System.out.print("Мне " + yearOfBirth + " лет. ");
    //   System.out.println("Я работаю на должности" + job + ". Будем знакомы!");
    //  System.out.println();
    //  }

    Human(int yearOfBirth, String name, String town, String job) {

        this.name = name;
        if (name == null) {
            this.name = ",Информация не указана";
        }
        this.town = town;
        if (town == null) {
            this.town = ",Информация не указана";
        }
        this.job = job;
        if (job == null) {
            this.job = ",Информация не указана";
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }


    void human() {

        System.out.print("Привет! Меня зовут " + name + ". ");
        System.out.print("Я из города " + town + ". ");
        System.out.print("Мне " + yearOfBirth + " лет. ");
        System.out.println("Я работаю на должности" + job + ". Будем знакомы!");
        System.out.println();
    }
}
