public class AppleFactory implements GroceryProductFactory {

    // variables used to keep track of inventory
    int invTotal = 0;
    int invFuji = 0;
    int invGala = 0;

    // returns inventory of this factory
    public void returnInventory()
    {
        System.out.println("-----");
        System.out.println("Inventory:");
        System.out.println(invTotal + " apples");
        System.out.println(invFuji + " fuji apples");
        System.out.println(invGala + " gala apples");
        System.out.println("-----");
    }

    @Override
    public Product makeProduct(String productName) {
        if (productName == "Fuji Apple")
        {
            invTotal++;
            invFuji++;
            return new FujiApple();
        }
        else if (productName == "Gala Apple")
        {
            invTotal++;
            invGala++;
            return new GalaApple();
        }
        else
        {
            System.out.println("This factory does not make the product '" + productName + "'");
            return null;
        }
    }
}