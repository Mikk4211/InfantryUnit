public class Test {

    public static void main(String[] args) {
        Musketeer musk1 = new Musketeer(8, 2, 2, 6);
        Archer arch1 = new Archer(5,2,2,3);

        arch1.attack(musk1);

        musk1.takeDamage(arch1.damage);






    }
}
