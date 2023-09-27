import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InsuranceServiceImpl extends UnicastRemoteObject implements InsuranceService {
    public InsuranceServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public void processInsurance(Insurance insurance) throws RemoteException {
        System.out.println("Processing insurance: " + insurance.getType() + ", coverage: " + insurance.getCoverage());
        // здесь можно добавить код для обработки страхования
    }
}
