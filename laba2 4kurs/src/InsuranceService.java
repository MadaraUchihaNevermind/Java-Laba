import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InsuranceService extends Remote {
    void processInsurance(Insurance insurance) throws RemoteException;
}