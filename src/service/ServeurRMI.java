package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			BanqueServiceImpl ob = new BanqueServiceImpl();
			System.out.println(ob.toString());
			Naming.rebind("rmi://localhost:1099/BK", ob);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
