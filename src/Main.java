
public class Main {
    public static void main(String[] args) {
        DbWorker dbWorker = new DbWorker();
        dbWorker.connect();

        System.out.println("All products and their price: ");
        System.out.println(dbWorker.showAll());

        System.out.println("Products with 50 and more discount: ");
        System.out.println(dbWorker.showDiscount());

        System.out.println("Vegetable table: ");
        System.out.println(dbWorker.showVegetables());

        System.out.println("Fruits table: ");
        System.out.println(dbWorker.showFruits());

        System.out.println("Drinks table: ");
        System.out.println(dbWorker.showDrinks());

        System.out.println("Toys table: ");
        System.out.println(dbWorker.showToys());

        System.out.println("Electronic table: ");
        System.out.println(dbWorker.showElectronic());
    }
}