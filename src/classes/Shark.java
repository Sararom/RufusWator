package classes;

public class Shark extends Animal{
    private Integer type = 1;
    private Integer breed;
    private Integer starve;

    public Shark() {
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Shark(int x, int y, int oceanSize, int breed, int starve) {
        super();
        this.breed=breed;
        this.starve=starve;
    }

    public Integer getBreed() {
        return breed;
    }

    public void setBreed(Integer breed) {
        this.breed = breed;
    }

    public Integer getStarve() {
        return starve;
    }

    public void setStarve(Integer starve) {
        this.starve = starve;
    }
}
