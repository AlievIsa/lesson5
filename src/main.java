import java.util.Random;

public class main {
    public static void main(String[] args){
        Hero[] army = {
                new Swordman(123),
                new Archer(),
                new Archer(),
                new Swordman(50)
        };

        ConsoleDeathNotifier consoleDeathNotifier = new ConsoleDeathNotifier(army);

        army[0].setDeathNotifier(consoleDeathNotifier);

        DeathNotifier anonymDeathNotifier = new DeathNotifier() {
            @Override
            public void newDeath(Hero hero) {
                System.out.println();
            }
        };

        Tower tower = new Tower();
        for(Hero h: army){
            System.out.println(h.toString());
        }
        System.out.println("=========");
        applySomeDamage(army);
        applySomeDamage(army[0], army[3], tower);

        for(Hero h: army) {
            System.out.println(h.toString());
        }
    }

    private static void applySomeDamage(DamageTaker... army) {
        Random random = new Random(4535);
        for(DamageTaker damageTaker: army){
            DamageTaker damageTaker1 = army[0];
            int damage = Math.abs(random.nextInt() % 200);
            damageTaker.takeDamage(damage);
        }
    }
}
