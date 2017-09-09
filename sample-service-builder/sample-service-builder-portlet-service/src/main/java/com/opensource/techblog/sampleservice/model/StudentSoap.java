package com.opensource.techblog.sampleservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.opensource.techblog.sampleservice.service.http.StudentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.opensource.techblog.sampleservice.service.http.StudentServiceSoap
 * @generated
 */
public class StudentSoap implements Serializable {
    private long _studentId;
    private long _studentName;
    private String _dob;
    private Date _standard;

    public StudentSoap() {
    }

    public static StudentSoap toSoapModel(Student model) {
        StudentSoap soapModel = new StudentSoap();

        soapModel.setStudentId(model.getStudentId());
        soapModel.setStudentName(model.getStudentName());
        soapModel.setDob(model.getDob());
        soapModel.setStandard(model.getStandard());

        return soapModel;
    }

    public static StudentSoap[] toSoapModels(Student[] models) {
        StudentSoap[] soapModels = new StudentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[][] toSoapModels(Student[][] models) {
        StudentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[] toSoapModels(List<Student> models) {
        List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

        for (Student model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _studentId;
    }

    public void setPrimaryKey(long pk) {
        setStudentId(pk);
    }

    public long getStudentId() {
        return _studentId;
    }

    public void setStudentId(long studentId) {
        _studentId = studentId;
    }

    public long getStudentName() {
        return _studentName;
    }

    public void setStudentName(long studentName) {
        _studentName = studentName;
    }

    public String getDob() {
        return _dob;
    }

    public void setDob(String dob) {
        _dob = dob;
    }

    public Date getStandard() {
        return _standard;
    }

    public void setStandard(Date standard) {
        _standard = standard;
    }
}
