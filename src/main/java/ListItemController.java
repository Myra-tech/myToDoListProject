import java.sql.*;
import java.util.Scanner;

public class ListItemController {

    public static int addAnItemToTheList() {
        ListItemModel listItemModel = new ListItemModel();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tell me what you need to do: ");
        String listEntry = scanner.nextLine();


        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:G:/javaProjects/Accenture Bootcamp/myToDoListProject/src/to_do_list.db");

            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO list1 (listEntry) VALUES( '" + listEntry + "');");

            String generateListNumber = "SELECT last_insert_rowid() AS list_number;";
            statement.execute(generateListNumber);
            ResultSet rs = statement.getResultSet();
            rs.next();
            int listNumber = rs.getInt("list_number");

            System.out.println("List entry: '" + listEntry + "' added to the list with the number " + listNumber + ".");
            return listNumber;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Failed to add the item.");
            return -1;
        }
    }


    public static void removeAnItemToTheList() {
    }


    public static void markTheCompletedItem() {
    }

    public static void seeThePendingItems() {
    }

    public static void keepYourPrioritiesStraight() {
    }
}

