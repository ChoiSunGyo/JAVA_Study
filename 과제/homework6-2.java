import java.io.PrintStream;

class Animal
{
    public String color = " ";
    public int kg=0;
    public String name = " ";
    
    public PrintStream setSpeck(String speck)
    {
        System.out.println("이름:"+this.name);
        System.out.println("몸무게:"+this.kg);
        System.out.println("색:"+this.color);
        return System.out.printf("짖는소리:"+speck);

    }
}

public class homework6_2 extends Animal
{
    public static void main(String[] args)
    {
        Animal cat = new Animal();
        cat.name = "고양이";
        cat.kg = 10;
        cat.color = "검은색";
        cat.setSpeck("야옹");
        Animal dog = new Animal();
        dog.name = "강아지";
        dog.kg = 11;
        dog.color = "노랑색";
        dog.setSpeck("멍멍");
        Animal chicken = new Animal();
        chicken.name = "닭";
        chicken.kg = 12;
        chicken.color = "하얀색";
        chicken.setSpeck("꼬꼬댁");

        return;

    }
}
