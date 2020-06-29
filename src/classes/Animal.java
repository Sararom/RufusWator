package classes;

public class Animal {
    private Integer x;
    private Integer y;
    private Integer type;
    private Integer id;
    private Integer seaSize;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSeaSize() {
        return seaSize;
    }

    public void setSeaSize(Integer seaSize) {
        this.seaSize = seaSize;
    }

    public void moveX(int dx) { x = validate(x + dx);
    }

    public void moveY(int dy) {
        y = validate(y + dy);
    }

    public int validate(int coord) {
        if (coord==seaSize) {
            coord = 0;
        }else if(coord < 0){
            coord = seaSize-1;
        }
        return coord;
    }
}
