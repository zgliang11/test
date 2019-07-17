package com.bjca.uums.uumsinterface.services.Department;

public class DepartmentProxy implements com.bjca.uums.uumsinterface.services.Department.Department {
  private String _endpoint = null;
  private com.bjca.uums.uumsinterface.services.Department.Department department = null;
  
  public DepartmentProxy() {
    _initDepartmentProxy();
  }
  
  public DepartmentProxy(String endpoint) {
    _endpoint = endpoint;
    _initDepartmentProxy();
  }
  
  private void _initDepartmentProxy() {
    try {
      department = (new com.bjca.uums.uumsinterface.services.Department.DepartmentServiceLocator()).getDepartment();
      if (department != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)department)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)department)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (department != null)
      ((javax.xml.rpc.Stub)department)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bjca.uums.uumsinterface.services.Department.Department getDepartment() {
    if (department == null)
      _initDepartmentProxy();
    return department;
  }
  
  public com.bjca.uums.java.util.Collection getAllDepartForDC() throws java.rmi.RemoteException{
    if (department == null)
      _initDepartmentProxy();
    return department.getAllDepartForDC();
  }
  
  public com.bjca.uums.client.bean.DepartmentInformation findDepartByDepartCodeForDC(java.lang.String in0) throws java.rmi.RemoteException{
    if (department == null)
      _initDepartmentProxy();
    return department.findDepartByDepartCodeForDC(in0);
  }
  
  public com.bjca.uums.client.bean.DepartmentInformation findDepartByDepartCode(java.lang.String in0) throws java.rmi.RemoteException{
    if (department == null)
      _initDepartmentProxy();
    return department.findDepartByDepartCode(in0);
  }
  
  public com.bjca.uums.java.util.Collection getAllDepart() throws java.rmi.RemoteException{
    if (department == null)
      _initDepartmentProxy();
    return department.getAllDepart();
  }
  
  public com.bjca.uums.client.bean.DepartmentInformation findDepartByDepartID(java.lang.String in0) throws java.rmi.RemoteException{
    if (department == null)
      _initDepartmentProxy();
    return department.findDepartByDepartID(in0);
  }
  
  
}