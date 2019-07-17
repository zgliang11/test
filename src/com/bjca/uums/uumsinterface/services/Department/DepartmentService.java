/**
 * DepartmentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bjca.uums.uumsinterface.services.Department;

public interface DepartmentService extends javax.xml.rpc.Service {
    public java.lang.String getDepartmentAddress();

    public com.bjca.uums.uumsinterface.services.Department.Department getDepartment() throws javax.xml.rpc.ServiceException;

    public com.bjca.uums.uumsinterface.services.Department.Department getDepartment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
