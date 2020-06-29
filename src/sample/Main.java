package sample;

import enviroment.Ocean;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();
    }

    public static void main(String[] args) {
        //launch(args);
        Integer oceanSize, numFish=0, numSharks=0, sharkStarvationTime, sharkBreedTime, fishBreedTime;
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.print("Por favor ingrese el tamaño de la matriz cuadrada para comenzar la simulación: ");
        oceanSize=Math.abs(in.nextInt());
        do{
            System.out.print("Por favor ingrese el número de peces iniciales: ");
            numFish=Math.abs(in.nextInt());
        }while (!isValid(oceanSize, numFish, numSharks));
        do{
            System.out.print("Por favor ingrese el número de tiburones iniciales: ");
            numSharks=Math.abs(in.nextInt());
        }while (!isValid(oceanSize, numFish, numSharks));

        System.out.print("Cuántos ciclos podrán vivir los tiburones sin comer?");
        sharkStarvationTime=Math.abs(in.nextInt());
        System.out.print("Cada cuantos ciclos se reproduce un tiburón?");
        sharkBreedTime=Math.abs(in.nextInt());
        System.out.print("Cada cuantos ciclos se reproduce un pez?");
        fishBreedTime=Math.abs(in.nextInt());

        new Ocean(oceanSize,numFish,numSharks, sharkStarvationTime, sharkBreedTime, fishBreedTime);

        return;
    }

    private static boolean isValid(int oceanSize, int numberF, int numberS ) {
        Integer total = oceanSize*oceanSize;
        if(numberF+numberS > total || numberF <0 || numberS <0){
            System.out.println("El dato ingresado no es válido");
            return false;
        }else {
            return true;
        }
    }
}
