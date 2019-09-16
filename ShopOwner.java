public class ShopOwner implements Observer {

    private Subject watchman;

    /**
     * creates the shop owner observer
     * @param watchman
     */
    public ShopOwner(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * takes in the update and prints out the observers response if its in the array list
     * @param warning
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        }
        if(warning == 2) {
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }



}
