package classes;

public class Fish extends Animal{
    private Integer type = 2;
    private Integer breed;

    public Fish() {
    }

    public Fish(int x, int y, int oceanSize, int breed) {
        super();
        this.breed=breed;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getBreed() {
        return breed;
    }

    public void setBreed(Integer breed) {
        this.breed = breed;
    }
}
