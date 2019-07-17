package com.bjca.uums.test;

import java.rmi.RemoteException;

import com.bjca.uums.uumsinterface.services.Department.Department;
import com.bjca.uums.uumsinterface.services.Department.DepartmentProxy;
import com.bjca.uums.uumsinterface.services.user.User;
import com.bjca.uums.uumsinterface.services.user.UserProxy;

public class Test
{

    public static void main(String[] args) throws RemoteException {
        Department department = new DepartmentProxy();
        department.getAllDepart();
        department.getAllDepartForDC();
        System.out.println(department.getAllDepart());

        User user = new UserProxy();
        user.findAllSystemInfos();
        System.out.println(1111111);
    }

}
