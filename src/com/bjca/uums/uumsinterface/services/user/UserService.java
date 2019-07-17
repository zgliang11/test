/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bjca.uums.uumsinterface.services.user;

public interface UserService extends javax.xml.rpc.Service {
    public java.lang.String getUserAddress();

    public com.bjca.uums.uumsinterface.services.user.User getUser() throws javax.xml.rpc.ServiceException;

    public com.bjca.uums.uumsinterface.services.user.User getUser(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
