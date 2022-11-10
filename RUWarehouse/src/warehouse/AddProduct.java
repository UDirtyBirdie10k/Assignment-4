package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        
        
	// Use this file to test addProduct

        int numberOfProduct = StdIn.readInt();

        Warehouse x = new Warehouse();


        for(int i = 0; i < numberOfProduct; i++){
            
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();


            x.addProduct(id, name, stock, day, demand);


        }

        StdOut.println(x);


    }

    
}
