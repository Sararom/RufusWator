package enviroment;

import classes.Animal;
import classes.Fish;
import classes.Shark;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ocean {

    private Animal[][] ocean;
    private List<Fish> fishes;
    private List<Shark> sharks;
    private int numFish;
    private int numSharks;
    private int oceanSize;
    private int sharkStarvationTime;
    private int sharkBreedTime;
    private int fishBreedTime;
    private Random random;

    public Ocean(Integer oceanSize, Integer numFish, Integer numSharks, Integer sharkStarvationTime, Integer sharkBreedTime, Integer fishBreedTime){
        this.oceanSize = oceanSize-1;
        this.numFish = numFish;
        this.numSharks = numSharks;
        this.sharkStarvationTime = sharkStarvationTime;
        this.sharkBreedTime = sharkBreedTime;
        this.fishBreedTime = fishBreedTime;
        random = new Random();
        ocean = new Animal[oceanSize][oceanSize];
        fishes = new ArrayList<>();
        sharks = new ArrayList<>();

        initializeOcean();
        fillOcean();
        printOcean();

    }

    private void fillOcean() {
        for (int i = 0; i < numFish; i++) {
            int x = random.nextInt(oceanSize);
            int y = random.nextInt(oceanSize);
            Fish f = new Fish(x,y,oceanSize, fishBreedTime);
            addF(x,y,f);
        }
        for (int i = 0; i < numSharks; i++) {
            int x = random.nextInt(oceanSize);
            int y = random.nextInt(oceanSize);
            Shark s = new Shark(x,y,oceanSize, sharkBreedTime, sharkStarvationTime);
            addS(x, y, s);
        }
    }

    private void addF(int x, int y, Fish a) {
        Boolean canAddF = false;
        while (!canAddF)
            if(ocean[x][y].getType()==0){
                a.setX(x);
                a.setY(y);
                fishes.add(a);
                ocean[x][y]=a;
                ocean[x][y].setId(fishes.indexOf(a));
                canAddF=true;
            }else {
                x = random.nextInt(oceanSize);
                y = random.nextInt(oceanSize);
            }
    }

    private void addS(int x, int y, Shark a) {
        Boolean canAddS = false;
        while (!canAddS)
            if(ocean[x][y].getType()==0){
                a.setX(x);
                a.setY(y);
                sharks.add(a);
                ocean[x][y]=a;
                ocean[x][y].setId(sharks.indexOf(a));
                canAddS=true;
            }else {
                x = random.nextInt(oceanSize);
                y = random.nextInt(oceanSize);
            }
    }

    private void initializeOcean() {
        Animal noAnimal = new Animal();
        noAnimal.setType(0);
        for(int i = 0 ; i<=oceanSize; i++){
            for(int j=0 ; j<=oceanSize;j++){
                ocean[i][j] = noAnimal;
            }
        }
    }

    private void printOcean(){
        for(int i = 0 ; i<=oceanSize; i++){
            for(int j=0 ; j<=oceanSize;j++){
                System.out.print(" "+ocean[i][j].getType());
//                if(ocean[i][j].getType()==1){
//                    System.out.print(sharks.get(ocean[i][j].getId()).getStarve());
//                }else if (ocean[i][j].getType()==2){
//                    System.out.print(fishes.get(ocean[i][j].getId()).getBreed());
//                }
            }
            System.out.println();
        }
    }
}

