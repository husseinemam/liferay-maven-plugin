package com.opensource.techblog.sampleservice.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.opensource.techblog.sampleservice.model.Teacher;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Teacher in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Teacher
 * @generated
 */
public class TeacherCacheModel implements CacheModel<Teacher>, Externalizable {
    public long teacherId;
    public long teacherName;
    public long dob;
    public long subject;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{teacherId=");
        sb.append(teacherId);
        sb.append(", teacherName=");
        sb.append(teacherName);
        sb.append(", dob=");
        sb.append(dob);
        sb.append(", subject=");
        sb.append(subject);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Teacher toEntityModel() {
        TeacherImpl teacherImpl = new TeacherImpl();

        teacherImpl.setTeacherId(teacherId);
        teacherImpl.setTeacherName(teacherName);
        teacherImpl.setDob(dob);
        teacherImpl.setSubject(subject);

        teacherImpl.resetOriginalValues();

        return teacherImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        teacherId = objectInput.readLong();
        teacherName = objectInput.readLong();
        dob = objectInput.readLong();
        subject = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(teacherId);
        objectOutput.writeLong(teacherName);
        objectOutput.writeLong(dob);
        objectOutput.writeLong(subject);
    }
}
