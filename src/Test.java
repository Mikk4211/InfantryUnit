public class Test {

    public static void main(String[] args) {
        Musketeer musk1 = new Musketeer(8, 2, 25, 6);
        Archer arch1 = new Archer(5,2,20,3);

        while ((arch1.hits>0) && (musk1.hits>0)) {
            System.out.println("The archer attacks! ");
            arch1.attack(musk1);
            System.out.println("It dealt "+ arch1.damage + " damage");
            System.out.println("Musketeer now has " + musk1.hits + " hits.");

            System.out.println("The muskteer attacks!");
            musk1.attack(arch1);
            System.out.println("It dealt "+musk1.damage + " damage");
            System.out.println("Archer now has " + arch1.hits + " hits.");
            System.out.println("\n----");

            if (arch1.hits<=0){
                System.out.println("The archer has fallen!");
            }
            if (musk1.hits<=0){
                System.out.println("The musketeer has fallen!");
            }
        }





    }
}
