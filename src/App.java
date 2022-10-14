import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter id:");
        Integer id = input.nextInt();
        System.out.println("enter name:");
        String name = input.next();
        System.out.println("enter gender:");
        String gender = input.next();
        System.out.println("enter DOB like (day/month/year):");
        String dateString = input.next();
        System.out.println("enter phonenumber:");
        Integer phonenumber = input.nextInt();
        System.out.println("enter email:");
        String email = input.next();
        System.out.println("enter salary:");
        Double salary = input.nextDouble();
        System.out.println("enter address:");
        String address = input.next();
        System.out.println("enter password:");
        String password = input.next();
        input.close();

        Date date = convertStringToDate(dateString);

        Staff s = new Staff(id, name, gender, "cashier", date, phonenumber, email, salary, address, password);

        System.out.println(s.toString());

    }

    public static Date convertStringToDate(String dob) {
        Date date1 = null;
        boolean theright = false;
        while (theright == false) {

            try {
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dob);

                theright = true;
            } catch (ParseException e) {
                System.out.println("the date must be like (day/month/year)");
                Scanner input = new Scanner(System.in);
                String rightdate = input.next();
                dob = rightdate;
                input.close();
            }
        }
        return date1;

    }

}
