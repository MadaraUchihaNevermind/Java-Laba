import java.rmi.Naming;
import java.rmi.Remote;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Получение удаленной службы
            Remote remoteService = Naming.lookup("rmi://localhost/InsuranceService");

            if (remoteService instanceof InsuranceService) {
                InsuranceService insuranceService = (InsuranceService) remoteService;


                System.out.print("Введите тип страхования: ");
                String type = scanner.nextLine();
                System.out.print("Введите страховую сумму: ");
                int coverage = scanner.nextInt();
                Insurance insurance = new Insurance(type, coverage);
                insuranceService.processInsurance(insurance); // удаленный метод

                System.out.println("Метод выполнен успешно");
            } else {
                System.out.println("Полученный объект не является экземпляром InsuranceService");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}