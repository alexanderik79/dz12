public class Creature extends Thread{
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    @Override
    public  void  run() {
        System.out.println(name);
    }
}
