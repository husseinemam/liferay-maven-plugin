package com.opensource.techblog.sampleservice.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.opensource.techblog.sampleservice.service.ClpSerializer;
import com.opensource.techblog.sampleservice.service.TeacherLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TeacherClp extends BaseModelImpl<Teacher> implements Teacher {
    private long _teacherId;
    private long _teacherName;
    private long _dob;
    private long _subject;
    private BaseModel<?> _teacherRemoteModel;
    private Class<?> _clpSerializerClass = com.opensource.techblog.sampleservice.service.ClpSerializer.class;

    public TeacherClp() {
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
    public long getPrimaryKey() {
        return _teacherId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTeacherId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _teacherId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getTeacherId() {
        return _teacherId;
    }

    @Override
    public void setTeacherId(long teacherId) {
        _teacherId = teacherId;

        if (_teacherRemoteModel != null) {
            try {
                Class<?> clazz = _teacherRemoteModel.getClass();

                Method method = clazz.getMethod("setTeacherId", long.class);

                method.invoke(_teacherRemoteModel, teacherId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTeacherName() {
        return _teacherName;
    }

    @Override
    public void setTeacherName(long teacherName) {
        _teacherName = teacherName;

        if (_teacherRemoteModel != null) {
            try {
                Class<?> clazz = _teacherRemoteModel.getClass();

                Method method = clazz.getMethod("setTeacherName", long.class);

                method.invoke(_teacherRemoteModel, teacherName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getDob() {
        return _dob;
    }

    @Override
    public void setDob(long dob) {
        _dob = dob;

        if (_teacherRemoteModel != null) {
            try {
                Class<?> clazz = _teacherRemoteModel.getClass();

                Method method = clazz.getMethod("setDob", long.class);

                method.invoke(_teacherRemoteModel, dob);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSubject() {
        return _subject;
    }

    @Override
    public void setSubject(long subject) {
        _subject = subject;

        if (_teacherRemoteModel != null) {
            try {
                Class<?> clazz = _teacherRemoteModel.getClass();

                Method method = clazz.getMethod("setSubject", long.class);

                method.invoke(_teacherRemoteModel, subject);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTeacherRemoteModel() {
        return _teacherRemoteModel;
    }

    public void setTeacherRemoteModel(BaseModel<?> teacherRemoteModel) {
        _teacherRemoteModel = teacherRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _teacherRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_teacherRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TeacherLocalServiceUtil.addTeacher(this);
        } else {
            TeacherLocalServiceUtil.updateTeacher(this);
        }
    }

    @Override
    public Teacher toEscapedModel() {
        return (Teacher) ProxyUtil.newProxyInstance(Teacher.class.getClassLoader(),
            new Class[] { Teacher.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TeacherClp clone = new TeacherClp();

        clone.setTeacherId(getTeacherId());
        clone.setTeacherName(getTeacherName());
        clone.setDob(getDob());
        clone.setSubject(getSubject());

        return clone;
    }

    @Override
    public int compareTo(Teacher teacher) {
        long primaryKey = teacher.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TeacherClp)) {
            return false;
        }

        TeacherClp teacher = (TeacherClp) obj;

        long primaryKey = teacher.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{teacherId=");
        sb.append(getTeacherId());
        sb.append(", teacherName=");
        sb.append(getTeacherName());
        sb.append(", dob=");
        sb.append(getDob());
        sb.append(", subject=");
        sb.append(getSubject());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.opensource.techblog.sampleservice.model.Teacher");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>teacherId</column-name><column-value><![CDATA[");
        sb.append(getTeacherId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>teacherName</column-name><column-value><![CDATA[");
        sb.append(getTeacherName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dob</column-name><column-value><![CDATA[");
        sb.append(getDob());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>subject</column-name><column-value><![CDATA[");
        sb.append(getSubject());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
