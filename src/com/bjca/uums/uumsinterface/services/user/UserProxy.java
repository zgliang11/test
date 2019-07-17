package com.bjca.uums.uumsinterface.services.user;

public class UserProxy implements com.bjca.uums.uumsinterface.services.user.User {
  private String _endpoint = null;
  private com.bjca.uums.uumsinterface.services.user.User user = null;
  
  public UserProxy() {
    _initUserProxy();
  }
  
  public UserProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserProxy();
  }
  
  private void _initUserProxy() {
    try {
      user = (new com.bjca.uums.uumsinterface.services.user.UserServiceLocator()).getUser();
      if (user != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)user)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (user != null)
      ((javax.xml.rpc.Stub)user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bjca.uums.uumsinterface.services.user.User getUser() {
    if (user == null)
      _initUserProxy();
    return user;
  }
  
  public com.bjca.uums.client.bean.DepartmentInformation findDepartByDepartID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findDepartByDepartID(in0);
  }
  
  public com.bjca.uums.java.util.Collection findDepartsByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findDepartsByUserID(in0);
  }
  
  public com.bjca.uums.client.bean.SystemInformation findSystemInfoBySystemId(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findSystemInfoBySystemId(in0);
  }
  
  public com.bjca.uums.client.bean.LoginInformation getLoginInformationByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getLoginInformationByUserID(in0);
  }
  
  public int updateUserpwByUserNameAndPwd(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.updateUserpwByUserNameAndPwd(in0, in1);
  }
  
  public com.bjca.uums.java.util.Collection findAllSystemInfos() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findAllSystemInfos();
  }
  
  public com.bjca.uums.java.util.Collection findSystemInfosAccessedByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findSystemInfosAccessedByUserID(in0);
  }
  
  public com.bjca.uums.client.bean.CustomContentInfo findCustomContentInfoByCustomID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findCustomContentInfoByCustomID(in0);
  }
  
  public com.bjca.uums.java.util.Collection findRoleInfosBySystemCodeAndUserID(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findRoleInfosBySystemCodeAndUserID(in0, in1);
  }
  
  public com.bjca.uums.client.bean.UserCredenceInformation findCredenceInfoByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findCredenceInfoByUserID(in0);
  }
  
  public com.bjca.uums.java.util.Collection findCustomContentInfosBySystemCodeAndUserType(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findCustomContentInfosBySystemCodeAndUserType(in0, in1);
  }
  
  public com.bjca.uums.client.bean.SystemInformation findSystemInfoBySystemCode(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findSystemInfoBySystemCode(in0);
  }
  
  public java.lang.String getAuthorityAndSystemIDByUsernameAndPw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getAuthorityAndSystemIDByUsernameAndPw(in0, in1);
  }
  
  public com.bjca.uums.client.bean.UserInformation findWholeUserInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findWholeUserInfosByUserIDForDC(in0);
  }
  
  public com.bjca.uums.client.bean.UserInformation findUserInfosByUserSIDForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUserInfosByUserSIDForDC(in0);
  }
  
  public com.bjca.uums.client.bean.UserInformation findUserInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUserInfosByUserIDForDC(in0);
  }
  
  public com.bjca.uums.java.util.Collection findUserInfosBySystemIDForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUserInfosBySystemIDForDC(in0);
  }
  
  public com.bjca.uums.client.bean.UnitInformation findUnitInfosByUserIDFroDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUnitInfosByUserIDFroDC(in0);
  }
  
  public com.bjca.uums.client.bean.PersonInformation findWholePersonInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findWholePersonInfosByUserIDForDC(in0);
  }
  
  public com.bjca.uums.client.bean.PersonInformation findPersonInfosByUserIDForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findPersonInfosByUserIDForDC(in0);
  }
  
  public java.lang.String getAuthorityByUserIDAndPw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getAuthorityByUserIDAndPw(in0, in1);
  }
  
  public java.lang.String findRoleInfosByUserIDForStrType(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findRoleInfosByUserIDForStrType(in0);
  }
  
  public com.bjca.uums.client.bean.RoleInformation findRoleInfoByRoleId(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findRoleInfoByRoleId(in0);
  }
  
  public com.bjca.uums.client.bean.RoleInformation findRoleInfoByRoleCode(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findRoleInfoByRoleCode(in0);
  }
  
  public com.bjca.uums.client.bean.UnitInformation findUnitInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUnitInfosByUserID(in0);
  }
  
  public com.bjca.uums.client.bean.PersonInformation findPersonInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findPersonInfosByUserID(in0);
  }
  
  public int updateUserpw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.updateUserpw(in0, in1);
  }
  
  public java.lang.String getAuthorityByUsernameAndPw(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getAuthorityByUsernameAndPw(in0, in1);
  }
  
  public com.bjca.uums.java.util.Collection findUserInfosBySystemID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUserInfosBySystemID(in0);
  }
  
  public com.bjca.uums.java.util.Collection findRoleInfosBySystemID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findRoleInfosBySystemID(in0);
  }
  
  public com.bjca.uums.java.util.Collection findRoleInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findRoleInfosByUserID(in0);
  }
  
  public com.bjca.uums.client.bean.UserInformation findUserInfosByUserID(java.lang.String in0) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.findUserInfosByUserID(in0);
  }
  
  
}