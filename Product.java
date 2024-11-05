abstract class Product {
    String name;
    double price;

    public abstract String getDetails();
}

class Electronics extends Product {
    public Electronics() {
        this.name = "Электроника";
        this.price = 100.0;
    }

    @Override
    public String getDetails() {
        return "Электроника, цена: " + price;
    }
}

class Clothing extends Product {
    public Clothing() {
        this.name = "Одежда";
        this.price = 50.0;
    }

    @Override
    public String getDetails() {
        return "Одежда, цена: " + price;
    }
}

class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "Electronics": return new Electronics();
            case "Clothing": return new Clothing();
            default: throw new IllegalArgumentException("Неверный тип продукта");
        }
    }
}
