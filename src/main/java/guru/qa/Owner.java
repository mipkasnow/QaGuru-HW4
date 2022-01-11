package guru.qa;

import java.util.Scanner;

public class Owner {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.weight = 3;
        dog1.name = "Малявка";
        dog1.size = "small";
        dog1.age = 2;

        dog2.weight = 15;
        dog2.name = "Бобик";
        dog2.size = "medium";
        dog2.age = 6;

        dog3.weight = 50;
        dog3.name = "Полкан";
        dog3.size = "big";
        dog3.age = 9;

        Scanner in = new Scanner(System.in);
        System.out.print("Выберете любимца для истории: 1,2 или 3\n");
        int num = in.nextInt();

        feedDog(num);

        if(num==1){
            dog1.bark();
            letsPlay();
            dog1.catchBall();
            robberBob();
            dog1.protectOwner();
        }
        else if(num==2){
            dog2.bark();
            letsPlay();
            dog2.catchBall();
            robberBob();
            dog2.protectOwner();
        }
        else if(num==3){
            dog3.bark();
            letsPlay();
            dog3.catchBall();
            robberBob();
            dog3.protectOwner();
        }
    }

    public static void feedDog(int num){
        System.out.println("Пришло время подкрепиться!");
        for(int i = 0; i<num; i++){
            System.out.println(i+1 + " кость вы дали собаке");
        }
        if(num==1){
            System.out.println("Собака съела " + num + " кость");
        }
        else{
            System.out.println("Собака съела " + num + " кости");
        }
    }

    public static void letsPlay(){
        System.out.println("Давай поиграем!");
    }

    public static void robberBob(){
        System.out.println("Внезапно на хозяина напал грабитель");
    }
}
