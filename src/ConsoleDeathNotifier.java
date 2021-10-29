public class ConsoleDeathNotifier implements DeathNotifier{

    public Hero[] army;

    public ConsoleDeathNotifier(Hero[] army){
        this.army = army;
    }
    @Override
    public void newDeath(Hero hero){
        System.out.println("Новая смерь! Осталось в живых: " + calcAliveHeroesCount());
    }

    private int calcAliveHeroesCount() {
        int count = 0;
        for (Hero h: army){
            if(h.isAlive()){
                count++;
            }
        }
        return count;
    }
}
