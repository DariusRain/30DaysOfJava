// Max int value is -2,000,000,000,001+ <-> +2,000,000,000,001
public class Car {
    public String make;
    private String model;
    private String color;
    String[] makes = {"Acura",
        "Alfa Romeo",
        "AM General",
        "AMC",
        "Aston Martin",
        "Audi",
        "Bentley",
        "BMW",
        "Bricklin",
        "Buick",
        "Cadillac",
        "Chevrolet",
        "Chrysler",
        "Daewoo",
        "Datsun",
        "Dodge",
        "Eagle",
        "Ferrari",
        "Fiat",
        "Ford",
        "Geo",
        "GMC",
        "Honda",
        "HUMMER",
        "Hyundai",
        "Infiniti",
        "Isuzu",
        "Jaguar",
        "Jeep",
        "Kia",
        "Land Rover",
        "Lexus",
        "Lincoln",
        "Lamborghini",
        "Lotus",
        "Maserati",
        "Mazda",
        "Mercedes-Benz",
        "Mercury",
        "MG",
        "MINI",
        "Mitsubishi",
        "Nissan",
        "Oldsmobile",
        "Plymouth",
        "Pontiac",
        "Porsche",
        "RAM",
        "Renault",
        "Rolls Royce",
        "Saab",
        "Saturn",
        "Scion",
        "Shelby",
        "Smart",
        "Subaru",
        "Suzuki",
        "Toyota",
        "Triumph",
        "Volkswagen",
        "Volvo"};

    private boolean validateCar(String type, String valToCheck) {
        if (type == "make") {

        }
        if (type == "model") {

        }
//        return false;

        return true;
    }
    void setMake(String iMake) {
            make = iMake;
    }

    void setModel(String iModel) {
        model = iModel;
        System.out.println("Model is set to:" + iModel);
    }

    void setColor(String iColor) {
        color = iColor;
        System.out.println("Make is set to:" + iColor);
    }
    public static void main (String[] args) {

    }
}

