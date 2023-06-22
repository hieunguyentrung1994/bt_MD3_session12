package model;

import java.util.Calendar;




    public class Product {
        private int id;

        private String prdName;

        private double price;

        private int quantity;

        private model.Brand brand;

        private model.Color color;

        private model.Category category;

        public Product() {
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", prdName='" + prdName + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", brand=" + brand +
                    ", color=" + color +
                    ", category=" + category +
                    '}';
        }

        public Product(int id, String prdName, double price, int quantity, model.Brand brand, model.Color color, model.Category category) {
            this.id = id;
            this.prdName = prdName;
            this.price = price;
            this.quantity = quantity;
            this.brand = brand;
            this.color = color;
            this.category = category;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPrdName() {
            return prdName;
        }

        public void setPrdName(String prdName) {
            this.prdName = prdName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public model.Brand getBrand() {
            return brand;
        }

        public void setBrand(model.Brand brand) {
            this.brand = brand;
        }

        public model.Color getColor() {
            return color;
        }

        public void setColor(model.Color color) {
            this.color = color;
        }

        public model.Category getCategory() {
            return category;
        }

        public void setCategory(model.Category category) {
            this.category = category;
        }
    }

