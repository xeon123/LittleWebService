package com.ulht.lws;

import com.ulht.rmi.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GreetingService {

    public String greeting(String name) {
        try {
            RMIInterface look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
            return look_up.greeting(name);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
