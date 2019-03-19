package lab3;

public class Product {
        public Product(Integer id, String name, String category, Double price) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.category = category;
        }
       private Integer id;
       private String name;
       private Double price;
       private String category;
    public Integer getId(){
        return id;
    }
    public String getCategory() {
        return category;
    }

    public String toString() {
        return name + " " + category;
    }
}
