/**
 * UserCredenceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bjca.uums.client.bean;

public class UserCredenceInformation  implements java.io.Serializable {
    private java.lang.String credenceAppend;

    private java.lang.String credenceCert;

    private java.lang.String credenceClass;

    private java.lang.String credenceDefault1;

    private java.lang.String credenceDescribe;

    private java.lang.String credenceState;

    private java.lang.String credenceUniqueid;

    private java.lang.String loginFailNum;

    private java.lang.String uniqueid;

    public UserCredenceInformation() {
    }

    public UserCredenceInformation(
           java.lang.String credenceAppend,
           java.lang.String credenceCert,
           java.lang.String credenceClass,
           java.lang.String credenceDefault1,
           java.lang.String credenceDescribe,
           java.lang.String credenceState,
           java.lang.String credenceUniqueid,
           java.lang.String loginFailNum,
           java.lang.String uniqueid) {
           this.credenceAppend = credenceAppend;
           this.credenceCert = credenceCert;
           this.credenceClass = credenceClass;
           this.credenceDefault1 = credenceDefault1;
           this.credenceDescribe = credenceDescribe;
           this.credenceState = credenceState;
           this.credenceUniqueid = credenceUniqueid;
           this.loginFailNum = loginFailNum;
           this.uniqueid = uniqueid;
    }


    /**
     * Gets the credenceAppend value for this UserCredenceInformation.
     * 
     * @return credenceAppend
     */
    public java.lang.String getCredenceAppend() {
        return credenceAppend;
    }


    /**
     * Sets the credenceAppend value for this UserCredenceInformation.
     * 
     * @param credenceAppend
     */
    public void setCredenceAppend(java.lang.String credenceAppend) {
        this.credenceAppend = credenceAppend;
    }


    /**
     * Gets the credenceCert value for this UserCredenceInformation.
     * 
     * @return credenceCert
     */
    public java.lang.String getCredenceCert() {
        return credenceCert;
    }


    /**
     * Sets the credenceCert value for this UserCredenceInformation.
     * 
     * @param credenceCert
     */
    public void setCredenceCert(java.lang.String credenceCert) {
        this.credenceCert = credenceCert;
    }


    /**
     * Gets the credenceClass value for this UserCredenceInformation.
     * 
     * @return credenceClass
     */
    public java.lang.String getCredenceClass() {
        return credenceClass;
    }


    /**
     * Sets the credenceClass value for this UserCredenceInformation.
     * 
     * @param credenceClass
     */
    public void setCredenceClass(java.lang.String credenceClass) {
        this.credenceClass = credenceClass;
    }


    /**
     * Gets the credenceDefault1 value for this UserCredenceInformation.
     * 
     * @return credenceDefault1
     */
    public java.lang.String getCredenceDefault1() {
        return credenceDefault1;
    }


    /**
     * Sets the credenceDefault1 value for this UserCredenceInformation.
     * 
     * @param credenceDefault1
     */
    public void setCredenceDefault1(java.lang.String credenceDefault1) {
        this.credenceDefault1 = credenceDefault1;
    }


    /**
     * Gets the credenceDescribe value for this UserCredenceInformation.
     * 
     * @return credenceDescribe
     */
    public java.lang.String getCredenceDescribe() {
        return credenceDescribe;
    }


    /**
     * Sets the credenceDescribe value for this UserCredenceInformation.
     * 
     * @param credenceDescribe
     */
    public void setCredenceDescribe(java.lang.String credenceDescribe) {
        this.credenceDescribe = credenceDescribe;
    }


    /**
     * Gets the credenceState value for this UserCredenceInformation.
     * 
     * @return credenceState
     */
    public java.lang.String getCredenceState() {
        return credenceState;
    }


    /**
     * Sets the credenceState value for this UserCredenceInformation.
     * 
     * @param credenceState
     */
    public void setCredenceState(java.lang.String credenceState) {
        this.credenceState = credenceState;
    }


    /**
     * Gets the credenceUniqueid value for this UserCredenceInformation.
     * 
     * @return credenceUniqueid
     */
    public java.lang.String getCredenceUniqueid() {
        return credenceUniqueid;
    }


    /**
     * Sets the credenceUniqueid value for this UserCredenceInformation.
     * 
     * @param credenceUniqueid
     */
    public void setCredenceUniqueid(java.lang.String credenceUniqueid) {
        this.credenceUniqueid = credenceUniqueid;
    }


    /**
     * Gets the loginFailNum value for this UserCredenceInformation.
     * 
     * @return loginFailNum
     */
    public java.lang.String getLoginFailNum() {
        return loginFailNum;
    }


    /**
     * Sets the loginFailNum value for this UserCredenceInformation.
     * 
     * @param loginFailNum
     */
    public void setLoginFailNum(java.lang.String loginFailNum) {
        this.loginFailNum = loginFailNum;
    }


    /**
     * Gets the uniqueid value for this UserCredenceInformation.
     * 
     * @return uniqueid
     */
    public java.lang.String getUniqueid() {
        return uniqueid;
    }


    /**
     * Sets the uniqueid value for this UserCredenceInformation.
     * 
     * @param uniqueid
     */
    public void setUniqueid(java.lang.String uniqueid) {
        this.uniqueid = uniqueid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCredenceInformation)) return false;
        UserCredenceInformation other = (UserCredenceInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credenceAppend==null && other.getCredenceAppend()==null) || 
             (this.credenceAppend!=null &&
              this.credenceAppend.equals(other.getCredenceAppend()))) &&
            ((this.credenceCert==null && other.getCredenceCert()==null) || 
             (this.credenceCert!=null &&
              this.credenceCert.equals(other.getCredenceCert()))) &&
            ((this.credenceClass==null && other.getCredenceClass()==null) || 
             (this.credenceClass!=null &&
              this.credenceClass.equals(other.getCredenceClass()))) &&
            ((this.credenceDefault1==null && other.getCredenceDefault1()==null) || 
             (this.credenceDefault1!=null &&
              this.credenceDefault1.equals(other.getCredenceDefault1()))) &&
            ((this.credenceDescribe==null && other.getCredenceDescribe()==null) || 
             (this.credenceDescribe!=null &&
              this.credenceDescribe.equals(other.getCredenceDescribe()))) &&
            ((this.credenceState==null && other.getCredenceState()==null) || 
             (this.credenceState!=null &&
              this.credenceState.equals(other.getCredenceState()))) &&
            ((this.credenceUniqueid==null && other.getCredenceUniqueid()==null) || 
             (this.credenceUniqueid!=null &&
              this.credenceUniqueid.equals(other.getCredenceUniqueid()))) &&
            ((this.loginFailNum==null && other.getLoginFailNum()==null) || 
             (this.loginFailNum!=null &&
              this.loginFailNum.equals(other.getLoginFailNum()))) &&
            ((this.uniqueid==null && other.getUniqueid()==null) || 
             (this.uniqueid!=null &&
              this.uniqueid.equals(other.getUniqueid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCredenceAppend() != null) {
            _hashCode += getCredenceAppend().hashCode();
        }
        if (getCredenceCert() != null) {
            _hashCode += getCredenceCert().hashCode();
        }
        if (getCredenceClass() != null) {
            _hashCode += getCredenceClass().hashCode();
        }
        if (getCredenceDefault1() != null) {
            _hashCode += getCredenceDefault1().hashCode();
        }
        if (getCredenceDescribe() != null) {
            _hashCode += getCredenceDescribe().hashCode();
        }
        if (getCredenceState() != null) {
            _hashCode += getCredenceState().hashCode();
        }
        if (getCredenceUniqueid() != null) {
            _hashCode += getCredenceUniqueid().hashCode();
        }
        if (getLoginFailNum() != null) {
            _hashCode += getLoginFailNum().hashCode();
        }
        if (getUniqueid() != null) {
            _hashCode += getUniqueid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserCredenceInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.client.uums.bjca.com", "UserCredenceInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceAppend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceAppend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceCert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceDefault1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceDefault1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceDescribe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceDescribe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenceUniqueid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credenceUniqueid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginFailNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginFailNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
