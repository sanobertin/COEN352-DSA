import java.util.*;

public class Intro {
    private String name;
    //double PI = java.Math.abs(-9)l
    public Intro(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println(name+"\t"+name);
    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in); // read inputs
    Intro myIntro = new Intro("My Intro");
    myIntro.printName();
    Float[] myrandom = new Float[20];
    for(int i = 0; i < myrandom.length; i++){
        Random rand = new Random();
        myrandom[i] = rand.nextFloat()*100;
    }
    for(int i = myrandom.length - 1; i >= 0; i--){
        System.out.println(myrandom[i]);
    }
    }

}

