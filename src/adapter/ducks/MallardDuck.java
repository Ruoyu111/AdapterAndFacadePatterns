package adapter.ducks;

/**
 * @author Ruoyu Chen
 * Created on 1/3/2019
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

}
