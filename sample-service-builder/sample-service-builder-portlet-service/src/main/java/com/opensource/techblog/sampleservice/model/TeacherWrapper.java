package com.opensource.techblog.sampleservice.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Teacher}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Teacher
 * @generated
 */
public class TeacherWrapper implements Teacher, ModelWrapper<Teacher> {
    private Teacher _teacher;

    public TeacherWrapper(Teacher teacher) {
        _teacher = teacher;
    }

    @Override
    public Class<?> getModelClass() {
        return Teacher.class;
    }

    @Override
    public String getModelClassName() {
        return Teacher.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("teacherId", getTeacherId());
        attributes.put("teacherName", getTeacherName());
        attributes.put("dob", getDob());
        attributes.put("subject", getSubject());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long teacherId = (Long) attributes.get("teacherId");

        if (teacherId != null) {
            setTeacherId(teacherId);
        }

        Long teacherName = (Long) attributes.get("teacherName");

        if (teacherName != null) {
            setTeacherName(teacherName);
        }

        Long dob = (Long) attributes.get("dob");

        if (dob != null) {
            setDob(dob);
        }

        Long subject = (Long) attributes.get("subject");

        if (subject != null) {
            setSubject(subject);
        }
    }

    /**
    * Returns the primary key of this teacher.
    *
    * @return the primary key of this teacher
    */
    @Override
    public long getPrimaryKey() {
        return _teacher.getPrimaryKey();
    }

    /**
    * Sets the primary key of this teacher.
    *
    * @param primaryKey the primary key of this teacher
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _teacher.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the teacher ID of this teacher.
    *
    * @return the teacher ID of this teacher
    */
    @Override
    public long getTeacherId() {
        return _teacher.getTeacherId();
    }

    /**
    * Sets the teacher ID of this teacher.
    *
    * @param teacherId the teacher ID of this teacher
    */
    @Override
    public void setTeacherId(long teacherId) {
        _teacher.setTeacherId(teacherId);
    }

    /**
    * Returns the teacher name of this teacher.
    *
    * @return the teacher name of this teacher
    */
    @Override
    public long getTeacherName() {
        return _teacher.getTeacherName();
    }

    /**
    * Sets the teacher name of this teacher.
    *
    * @param teacherName the teacher name of this teacher
    */
    @Override
    public void setTeacherName(long teacherName) {
        _teacher.setTeacherName(teacherName);
    }

    /**
    * Returns the dob of this teacher.
    *
    * @return the dob of this teacher
    */
    @Override
    public long getDob() {
        return _teacher.getDob();
    }

    /**
    * Sets the dob of this teacher.
    *
    * @param dob the dob of this teacher
    */
    @Override
    public void setDob(long dob) {
        _teacher.setDob(dob);
    }

    /**
    * Returns the subject of this teacher.
    *
    * @return the subject of this teacher
    */
    @Override
    public long getSubject() {
        return _teacher.getSubject();
    }

    /**
    * Sets the subject of this teacher.
    *
    * @param subject the subject of this teacher
    */
    @Override
    public void setSubject(long subject) {
        _teacher.setSubject(subject);
    }

    @Override
    public boolean isNew() {
        return _teacher.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _teacher.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _teacher.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _teacher.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _teacher.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _teacher.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _teacher.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _teacher.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _teacher.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _teacher.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _teacher.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TeacherWrapper((Teacher) _teacher.clone());
    }

    @Override
    public int compareTo(
        com.opensource.techblog.sampleservice.model.Teacher teacher) {
        return _teacher.compareTo(teacher);
    }

    @Override
    public int hashCode() {
        return _teacher.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.opensource.techblog.sampleservice.model.Teacher> toCacheModel() {
        return _teacher.toCacheModel();
    }

    @Override
    public com.opensource.techblog.sampleservice.model.Teacher toEscapedModel() {
        return new TeacherWrapper(_teacher.toEscapedModel());
    }

    @Override
    public com.opensource.techblog.sampleservice.model.Teacher toUnescapedModel() {
        return new TeacherWrapper(_teacher.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _teacher.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _teacher.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _teacher.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TeacherWrapper)) {
            return false;
        }

        TeacherWrapper teacherWrapper = (TeacherWrapper) obj;

        if (Validator.equals(_teacher, teacherWrapper._teacher)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Teacher getWrappedTeacher() {
        return _teacher;
    }

    @Override
    public Teacher getWrappedModel() {
        return _teacher;
    }

    @Override
    public void resetOriginalValues() {
        _teacher.resetOriginalValues();
    }
}
