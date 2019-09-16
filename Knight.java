public class Knight implements Observer {
    private Subject watchman;
    /**
     * creates the knight observer
     * @param watchman
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /**
     * takes in the update and prints out the observers response if its in the array list
     * @param warning
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        }
        if(warning == 2) {
            System.out.println("Knight: Prepares for battle");
        }
    }
}
