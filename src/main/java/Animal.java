public abstract class Animal {
    public String name;

    public int satiety;

    public Animal(String name, int satiety) {
        this.name = name;
        this.satiety = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}