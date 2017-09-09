package com.opensource.techblog.sampleservice.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TeacherService}.
 *
 * @author Brian Wing Shun Chan
 * @see TeacherService
 * @generated
 */
public class TeacherServiceWrapper implements TeacherService,
    ServiceWrapper<TeacherService> {
    private TeacherService _teacherService;

    public TeacherServiceWrapper(TeacherService teacherService) {
        _teacherService = teacherService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teacherService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teacherService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teacherService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TeacherService getWrappedTeacherService() {
        return _teacherService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeacherService(TeacherService teacherService) {
        _teacherService = teacherService;
    }

    @Override
    public TeacherService getWrappedService() {
        return _teacherService;
    }

    @Override
    public void setWrappedService(TeacherService teacherService) {
        _teacherService = teacherService;
    }
}
