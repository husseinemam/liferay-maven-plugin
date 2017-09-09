package com.opensource.techblog.sampleservice.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
    private Student _student;

    public StudentWrapper(Student student) {
        _student = student;
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentId", getStudentId());
        attributes.put("studentName", getStudentName());
        attributes.put("dob", getDob());
        attributes.put("standard", getStandard());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        Long studentName = (Long) attributes.get("studentName");

        if (studentName != null) {
            setStudentName(studentName);
        }

        String dob = (String) attributes.get("dob");

        if (dob != null) {
            setDob(dob);
        }

        Date standard = (Date) attributes.get("standard");

        if (standard != null) {
            setStandard(standard);
        }
    }

    /**
    * Returns the primary key of this student.
    *
    * @return the primary key of this student
    */
    @Override
    public long getPrimaryKey() {
        return _student.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student.
    *
    * @param primaryKey the primary key of this student
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _student.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the student ID of this student.
    *
    * @return the student ID of this student
    */
    @Override
    public long getStudentId() {
        return _student.getStudentId();
    }

    /**
    * Sets the student ID of this student.
    *
    * @param studentId the student ID of this student
    */
    @Override
    public void setStudentId(long studentId) {
        _student.setStudentId(studentId);
    }

    /**
    * Returns the student name of this student.
    *
    * @return the student name of this student
    */
    @Override
    public long getStudentName() {
        return _student.getStudentName();
    }

    /**
    * Sets the student name of this student.
    *
    * @param studentName the student name of this student
    */
    @Override
    public void setStudentName(long studentName) {
        _student.setStudentName(studentName);
    }

    /**
    * Returns the dob of this student.
    *
    * @return the dob of this student
    */
    @Override
    public java.lang.String getDob() {
        return _student.getDob();
    }

    /**
    * Sets the dob of this student.
    *
    * @param dob the dob of this student
    */
    @Override
    public void setDob(java.lang.String dob) {
        _student.setDob(dob);
    }

    /**
    * Returns the standard of this student.
    *
    * @return the standard of this student
    */
    @Override
    public java.util.Date getStandard() {
        return _student.getStandard();
    }

    /**
    * Sets the standard of this student.
    *
    * @param standard the standard of this student
    */
    @Override
    public void setStandard(java.util.Date standard) {
        _student.setStandard(standard);
    }

    @Override
    public boolean isNew() {
        return _student.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _student.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _student.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _student.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _student.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _student.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _student.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _student.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _student.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _student.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _student.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StudentWrapper((Student) _student.clone());
    }

    @Override
    public int compareTo(
        com.opensource.techblog.sampleservice.model.Student student) {
        return _student.compareTo(student);
    }

    @Override
    public int hashCode() {
        return _student.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.opensource.techblog.sampleservice.model.Student> toCacheModel() {
        return _student.toCacheModel();
    }

    @Override
    public com.opensource.techblog.sampleservice.model.Student toEscapedModel() {
        return new StudentWrapper(_student.toEscapedModel());
    }

    @Override
    public com.opensource.techblog.sampleservice.model.Student toUnescapedModel() {
        return new StudentWrapper(_student.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _student.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _student.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _student.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentWrapper)) {
            return false;
        }

        StudentWrapper studentWrapper = (StudentWrapper) obj;

        if (Validator.equals(_student, studentWrapper._student)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Student getWrappedStudent() {
        return _student;
    }

    @Override
    public Student getWrappedModel() {
        return _student;
    }

    @Override
    public void resetOriginalValues() {
        _student.resetOriginalValues();
    }
}
