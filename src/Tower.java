public class Tower implements DamageTaker {
    @Override
    public void takeDamage(int damage){
        System.out.println("Стена впитывает " + damage + " урона");
    }
}
