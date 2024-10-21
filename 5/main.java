
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> patients = new ArrayList<>();

        while (true) {
            System.out.print("Enter the patient's name (or press Q to exit): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Q") || name.equalsIgnoreCase("q")) {

                break;
            }

            System.out.println("Select the patient's condition: ");
            System.out.println("(P) Pregnant");
            System.out.println("(S) Senior Citizen");
            System.out.println("(D) Disabled");
            String condition = scanner.nextLine().toUpperCase();

            String conditionDescription;
            switch (condition) {
                case "P":
                    conditionDescription = "Patient is pregnant";
                    break;
                case "S":
                    conditionDescription = "Patient is a senior citizen";
                    break;
                case "D":
                    conditionDescription = "Patient is disabled";
                    break;
                default:
                    conditionDescription = "Patient's condition is not recognized";
            }

            System.out.println("Patient's name: " + name);
            System.out.println(conditionDescription);

            patients.add(name + " - " + conditionDescription);
            System.out.println("List of patients: " + patients);
        }

        scanner.close();
    }
}
