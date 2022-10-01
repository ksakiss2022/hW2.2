public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            this.engineVolume = Float.parseFloat("1.5");
        }

        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (productionYear == 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null) {
            this.productionCountry = "default";
        }
    }


    void car() {
        System.out.print(brand + " ");
        System.out.print(model + ", ");
        System.out.print(productionYear + " год выпуска, ");
        System.out.print("сборка " + productionCountry + ", ");
        System.out.print("цвет кузова " + color + ", ");
        System.out.print("объем двигателя " + engineVolume + " литра");
        System.out.println();
    }
}
