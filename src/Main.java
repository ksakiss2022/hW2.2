public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(35, "Максим", "Минск", " бренд-менеджерa");
        maksim.human();
        //   Human maksim = new Human();
        //   maksim.name = "Максим";
        //   maksim.town = "Минск";
        //   maksim.yearOfBirth = 35;
        //   maksim.job = " бренд-менеджерa";
        //   maksim.human();

        Human anna = new Human(29, "Анна", "Москва", " методистa образовательных программ");
        anna.human();
        //  Human anna = new Human();
        //  anna.name = "Аня";
        //  anna.town = "Москва";
        //  anna.yearOfBirth = 29;
        //  anna.job = " методистa образовательных программ";
        //  anna.human();

        Human katya = new Human(28, "Катя", "Калининград", " продакт-менеджера");
        katya.human();
        // Human katya = new Human();
        // katya.name = "Катя";
        // katya.town = "Калининград";
        // katya.yearOfBirth = 28;
        // katya.job = " продакт-менеджера";
        // katya.human();

        Human artem = new Human(27, "Артем", "Москва", " директора по развитию бизнеса");
        artem.human();
        // Human artem = new Human();
        //artem.name = "Артем";
        //artem.town = "Москва";
        //artem.yearOfBirth = 27;
        //artem.job = " директора по развитию бизнеса";
        //artem.human();

        Human checkingForNullHuman = new Human(-3, null, null, null);
        checkingForNullHuman.human();

        Car ladaGrande = new Car("Lada", "Grande", 1.7f, "желтый", 2015, "России");
        // ladaGrande.brand = "Lada";
        // ladaGrande.model = "Grande";
        // ladaGrande.productionYear = 2015;
        // ladaGrande.productionCountry = "России";
        // ladaGrande.color = "желтый";
        // ladaGrande.engineVolume = 1.7f;
        ladaGrande.car();

        Car audi = new Car("Audi A8 50 L TDI", "quattro", 3.0f, "черный", 2020, "Германия");
        //audi.brand = "Audi A8 50 L TDI";
        //audi.model = "quattro";
        //audi.productionYear = 2020;
        //audi.productionCountry = "Германия";
        //audi.color = "черный";
        //audi.engineVolume = 3.0f;
        audi.car();

        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        // bmw.brand = "BMW";
        // bmw.model = "Z8";
        // bmw.productionYear = 2021;
        // bmw.productionCountry = "Германия";
        // bmw.color = "черный";
        // bmw.engineVolume = 3.0f;
        bmw.car();

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, "красный", 2018, "Южная Корея");
        //kia.brand = "Kia";
        //kia.model = "Sportage 4 поколение";
        //kia.productionYear = 2018;
        //kia.productionCountry = "Южная Корея";
        //kia.color = "красный";
        //kia.engineVolume = 2.4f;
        kia.car();

        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        //hyundai.brand = "Hyundai";
        //hyundai.model = "Avante";
        //hyundai.productionYear = 2016;
        //hyundai.productionCountry = "Южная Корея";
        //hyundai.color = "оранжевый";
        //hyundai.engineVolume = 1.6f;
        hyundai.car();

        Car checkingForNull = new Car(null, null, 0, null, 0, null);
        checkingForNull.car();

    }
}