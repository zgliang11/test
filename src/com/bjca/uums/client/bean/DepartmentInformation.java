/**
 * DepartmentInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bjca.uums.client.bean;

public class DepartmentInformation  implements java.io.Serializable {
    private java.lang.String departCode;

    private java.lang.String departDefault;

    private java.lang.String departDescript;

    private java.lang.String departName;

    private java.lang.String departSortNum;

    private java.lang.String departUpcode;

    public DepartmentInformation() {
    }

    public DepartmentInformation(
           java.lang.String departCode,
           java.lang.String departDefault,
           java.lang.String departDescript,
           java.lang.String departName,
           java.lang.String departSortNum,
           java.lang.String departUpcode) {
           this.departCode = departCode;
           this.departDefault = departDefault;
           this.departDescript = departDescript;
           this.departName = departName;
           this.departSortNum = departSortNum;
           this.departUpcode = departUpcode;
    }


    /**
     * Gets the departCode value for this DepartmentInformation.
     * 
     * @return departCode
     */
    public java.lang.String getDepartCode() {
        return departCode;
    }


    /**
     * Sets the departCode value for this DepartmentInformation.
     * 
     * @param departCode
     */
    public void setDepartCode(java.lang.String departCode) {
        this.departCode = departCode;
    }


    /**
     * Gets the departDefault value for this DepartmentInformation.
     * 
     * @return departDefault
     */
    public java.lang.String getDepartDefault() {
        return departDefault;
    }


    /**
     * Sets the departDefault value for this DepartmentInformation.
     * 
     * @param departDefault
     */
    public void setDepartDefault(java.lang.String departDefault) {
        this.departDefault = departDefault;
    }


    /**
     * Gets the departDescript value for this DepartmentInformation.
     * 
     * @return departDescript
     */
    public java.lang.String getDepartDescript() {
        return departDescript;
    }


    /**
     * Sets the departDescript value for this DepartmentInformation.
     * 
     * @param departDescript
     */
    public void setDepartDescript(java.lang.String departDescript) {
        this.departDescript = departDescript;
    }


    /**
     * Gets the departName value for this DepartmentInformation.
     * 
     * @return departName
     */
    public java.lang.String getDepartName() {
        return departName;
    }


    /**
     * Sets the departName value for this DepartmentInformation.
     * 
     * @param departName
     */
    public void setDepartName(java.lang.String departName) {
        this.departName = departName;
    }


    /**
     * Gets the departSortNum value for this DepartmentInformation.
     * 
     * @return departSortNum
     */
    public java.lang.String getDepartSortNum() {
        return departSortNum;
    }


    /**
     * Sets the departSortNum value for this DepartmentInformation.
     * 
     * @param departSortNum
     */
    public void setDepartSortNum(java.lang.String departSortNum) {
        this.departSortNum = departSortNum;
    }


    /**
     * Gets the departUpcode value for this DepartmentInformation.
     * 
     * @return departUpcode
     */
    public java.lang.String getDepartUpcode() {
        return departUpcode;
    }


    /**
     * Sets the departUpcode value for this DepartmentInformation.
     * 
     * @param departUpcode
     */
    public void setDepartUpcode(java.lang.String departUpcode) {
        this.departUpcode = departUpcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepartmentInformation)) return false;
        DepartmentInformation other = (DepartmentInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departCode==null && other.getDepartCode()==null) || 
             (this.departCode!=null &&
              this.departCode.equals(other.getDepartCode()))) &&
            ((this.departDefault==null && other.getDepartDefault()==null) || 
             (this.departDefault!=null &&
              this.departDefault.equals(other.getDepartDefault()))) &&
            ((this.departDescript==null && other.getDepartDescript()==null) || 
             (this.departDescript!=null &&
              this.departDescript.equals(other.getDepartDescript()))) &&
            ((this.departName==null && other.getDepartName()==null) || 
             (this.departName!=null &&
              this.departName.equals(other.getDepartName()))) &&
            ((this.departSortNum==null && other.getDepartSortNum()==null) || 
             (this.departSortNum!=null &&
              this.departSortNum.equals(other.getDepartSortNum()))) &&
            ((this.departUpcode==null && other.getDepartUpcode()==null) || 
             (this.departUpcode!=null &&
              this.departUpcode.equals(other.getDepartUpcode())));
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
        if (getDepartCode() != null) {
            _hashCode += getDepartCode().hashCode();
        }
        if (getDepartDefault() != null) {
            _hashCode += getDepartDefault().hashCode();
        }
        if (getDepartDescript() != null) {
            _hashCode += getDepartDescript().hashCode();
        }
        if (getDepartName() != null) {
            _hashCode += getDepartName().hashCode();
        }
        if (getDepartSortNum() != null) {
            _hashCode += getDepartSortNum().hashCode();
        }
        if (getDepartUpcode() != null) {
            _hashCode += getDepartUpcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepartmentInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.client.uums.bjca.com", "DepartmentInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departDescript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departDescript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departSortNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departSortNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departUpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departUpcode"));
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
