package com.opensource.techblog.sampleservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.opensource.techblog.sampleservice.service.http.TeacherServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.opensource.techblog.sampleservice.service.http.TeacherServiceSoap
 * @generated
 */
public class TeacherSoap implements Serializable {
    private long _teacherId;
    private long _teacherName;
    private long _dob;
    private long _subject;

    public TeacherSoap() {
    }

    public static TeacherSoap toSoapModel(Teacher model) {
        TeacherSoap soapModel = new TeacherSoap();

        soapModel.setTeacherId(model.getTeacherId());
        soapModel.setTeacherName(model.getTeacherName());
        soapModel.setDob(model.getDob());
        soapModel.setSubject(model.getSubject());

        return soapModel;
    }

    public static TeacherSoap[] toSoapModels(Teacher[] models) {
        TeacherSoap[] soapModels = new TeacherSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TeacherSoap[][] toSoapModels(Teacher[][] models) {
        TeacherSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TeacherSoap[models.length][models[0].length];
        } else {
            soapModels = new TeacherSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TeacherSoap[] toSoapModels(List<Teacher> models) {
        List<TeacherSoap> soapModels = new ArrayList<TeacherSoap>(models.size());

        for (Teacher model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TeacherSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _teacherId;
    }

    public void setPrimaryKey(long pk) {
        setTeacherId(pk);
    }

    public long getTeacherId() {
        return _teacherId;
    }

    public void setTeacherId(long teacherId) {
        _teacherId = teacherId;
    }

    public long getTeacherName() {
        return _teacherName;
    }

    public void setTeacherName(long teacherName) {
        _teacherName = teacherName;
    }

    public long getDob() {
        return _dob;
    }

    public void setDob(long dob) {
        _dob = dob;
    }

    public long getSubject() {
        return _subject;
    }

    public void setSubject(long subject) {
        _subject = subject;
    }
}
