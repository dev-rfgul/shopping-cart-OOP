 class GroceryProduct extends Product {
        private double weight;
        public GroceryProduct(String name, double price, double weight) {
            super(name, price);
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
        }
         public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return String.format("Name: %s, Price: Rs. %.2f, Weight: %.2f kg", name, price, weight);
        }
    }