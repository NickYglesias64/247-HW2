public class Teacher implements Observer {
    private Subject watchman;
    /**
     * creates the teacher observer
     * @param watchman
     */
    public Teacher(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /**
     * takes in the update and prints out the observers response if its in the array list
     * @param warning
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        }
        if(warning == 2) {
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}
