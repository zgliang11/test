/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bjca.uums.uumsinterface.services.user;

public interface User extends java.rmi.Remote {
    public com.bjca.uums.client.bean.DepartmentInformation findDepartByDepartID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findDepartsByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.SystemInformation findSystemInfoBySystemId(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.LoginInformation getLoginInformationByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public int updateUserpwByUserNameAndPwd(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findAllSystemInfos() throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findSystemInfosAccessedByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.CustomContentInfo findCustomContentInfoByCustomID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findRoleInfosBySystemCodeAndUserID(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UserCredenceInformation findCredenceInfoByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findCustomContentInfosBySystemCodeAndUserType(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.SystemInformation findSystemInfoBySystemCode(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getAuthorityAndSystemIDByUsernameAndPw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UserInformation findWholeUserInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UserInformation findUserInfosByUserSIDForDC(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UserInformation findUserInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findUserInfosBySystemIDForDC(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UnitInformation findUnitInfosByUserIDFroDC(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.PersonInformation findWholePersonInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.PersonInformation findPersonInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getAuthorityByUserIDAndPw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String findRoleInfosByUserIDForStrType(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.RoleInformation findRoleInfoByRoleId(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.RoleInformation findRoleInfoByRoleCode(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UnitInformation findUnitInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.PersonInformation findPersonInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public int updateUserpw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getAuthorityByUsernameAndPw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findUserInfosBySystemID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findRoleInfosBySystemID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.java.util.Collection findRoleInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException;
    public com.bjca.uums.client.bean.UserInformation findUserInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException;
}
