package guru.qa;

public class Dog {
    int age;
    int weight;
    String name;
    String size;

    public void bark(){
        if(weight<5){
            System.out.println("Тяф!");
        }
        else if(weight<20){
            System.out.println("Вуф-Вуф!");
        }
        else{
            System.out.println("ГААААВ!");
        }
    }

    public void protectOwner(){
        if(size.equals("small")){
            System.out.println("Собака " + name + " испугалась злоумышленника и убежала восвояси");
        }
        else if(size.equals("medium")){
            System.out.println("Собака " + name + " немного помялась, гавкнула, но не смогла защитить хозяина");
        }
        else{
            System.out.println("Собака " + name + " одним своим видом успокоила грабителя и тот сдался добровольно");
        }
    }

    public void catchBall(){
        if(age<5){
            System.out.println("Собака " + name + " радостно побежала за мячиком и тут же принесла его обратно");
        }
        else if(age<9){
            System.out.println("Собака " + name + " неспешно пошла за мячиком, легла, и стала его жевать");
        }
        else{
            System.out.println("Собака " + name + " повернула голову в сторону укатившегося мячика, но не пошла за ним");
        }
    }
}
