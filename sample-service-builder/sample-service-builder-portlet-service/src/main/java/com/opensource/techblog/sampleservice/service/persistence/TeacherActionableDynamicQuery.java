package com.opensource.techblog.sampleservice.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.opensource.techblog.sampleservice.model.Teacher;
import com.opensource.techblog.sampleservice.service.TeacherLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class TeacherActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TeacherActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TeacherLocalServiceUtil.getService());
        setClass(Teacher.class);

        setClassLoader(com.opensource.techblog.sampleservice.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("teacherId");
    }
}
