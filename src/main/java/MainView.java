import java.util.Scanner;

public class MainView {

    static Scanner scan = new Scanner(System.in);
    static Boolean running = true;

    public static void main(String[] args) {
        ListItemController listItemController = new ListItemController();
        ListItemModel listItemModel = new ListItemModel();

        while (running) {
            System.out.println("This is your to-do list." + "\n"
                    + "What would you like to do?" + "\n"
                    + "Enter 1 to add an item to the list." + "\n"
                    + "Enter 2 to remove an item fom the list." + "\n"
                    + "Enter 3 to mark the item as completed." + "\n"
                    + "Enter 4 to see all the pending items." + "\n"
                    + "Enter 5 for some more interesting functionality." + "\n"
                    + "Enter 6 to save and quit." + "\n"
            );
            int myChoice = scan.nextInt();

            switch (myChoice) {
                case 1:
                    ListItemController.addAnItemToTheList();
                    break;

                case 2:
                    ListItemController.removeAnItemToTheList();
                    break;

                case 3:
                    ListItemController.markTheCompletedItem();
                    break;

                case 4:
                    ListItemController.seeThePendingItems();
                    break;

                case 5:
                    ListItemController.keepYourPrioritiesStraight();
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        }
        System.exit(0);
    }

}

