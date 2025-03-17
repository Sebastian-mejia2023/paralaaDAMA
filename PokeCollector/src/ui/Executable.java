package ui;

import java.util.Scanner;
import model.Controller;

public class Executable{

    private static Scanner input;
    private static Controller controller; //
    
    public static void main(String[] args) {

        initializer();
        menu();
        
    }

    public static void initializer(){

        input = new Scanner(System.in);
        controller = new Controller(); //


    }

    public static void registerPokemonCard(){

        System.out.println("Digite el nombre");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida");
        int hp = input.nextInt();

        input.nextLine();

        System.out.println(controller.PokemonTypeList());


        System.out.println("Digite el tipo del Pokemon");
        
        int type = input.nextInt();

        System.out.println("Digite el poder de ataque");
        int aP = input.nextInt();

        if(controller.savePokemonCard(name, hp, type, aP)){
            System.out.println("Carta registrada exitosamente");
        }else{
            System.out.println("Coleccion llena");
        }
    }

    public static void menu(){

        registerPokemonCard();
        System.out.println(controller.getCollection());

    }





}