package com.opensource.techblog.sampleservice.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.opensource.techblog.sampleservice.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
    public long studentId;
    public long studentName;
    public String dob;
    public long standard;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{studentId=");
        sb.append(studentId);
        sb.append(", studentName=");
        sb.append(studentName);
        sb.append(", dob=");
        sb.append(dob);
        sb.append(", standard=");
        sb.append(standard);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentId(studentId);
        studentImpl.setStudentName(studentName);

        if (dob == null) {
            studentImpl.setDob(StringPool.BLANK);
        } else {
            studentImpl.setDob(dob);
        }

        if (standard == Long.MIN_VALUE) {
            studentImpl.setStandard(null);
        } else {
            studentImpl.setStandard(new Date(standard));
        }

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        studentId = objectInput.readLong();
        studentName = objectInput.readLong();
        dob = objectInput.readUTF();
        standard = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(studentId);
        objectOutput.writeLong(studentName);

        if (dob == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dob);
        }

        objectOutput.writeLong(standard);
    }
}
