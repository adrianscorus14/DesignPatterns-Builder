package builder.example;

public class Pizza {
    private final String name;
    private final int size;

    private final boolean isAddCheese;
    private final boolean isAddSauce;
    private final boolean isTakeaway;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isAddChees() {
        return isAddCheese;
    }

    public boolean isAddSauce() {
        return isAddSauce;
    }

    public boolean isTakeaway() {
        return isTakeaway;
    }

    @Override
    public String toString() {
        return "Pizza= " + this.getName() + ", Size= " + this.getSize()
                + (this.isAddCheese ? ", add chees" : "")
                + (this.isAddSauce ? ", add sauce" : "")
                + (this.isTakeaway ? ", takeaway" : "");
    }

    private Pizza(PizzaBuilder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.isAddCheese = builder.isAddCheese;
        this.isAddSauce = builder.isAddSauce;
        this.isTakeaway = builder.isTakeaway;
    }

    public static class PizzaBuilder {

        private String name;
        private int size;

        private boolean isAddCheese;
        private boolean isAddSauce;
        private boolean isTakeaway;

        public PizzaBuilder(String name, int size) {
            this.name = name;
            this.size = size;
        }

        public PizzaBuilder addChees(boolean isAddChees) {
            this.isAddCheese = isAddCheese;
            return this;
        }

        public PizzaBuilder addSauce(boolean isAddSauce) {
            this.isAddSauce = isAddSauce;
            return this;
        }

        public PizzaBuilder takeaway(boolean isTakeaway) {
            this.isTakeaway = isTakeaway;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}
