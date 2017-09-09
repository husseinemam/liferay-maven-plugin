package com.opensource.techblog.sampleservice.service.impl;

import com.opensource.techblog.sampleservice.service.base.TeacherLocalServiceBaseImpl;

/**
 * The implementation of the teacher local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.opensource.techblog.sampleservice.service.TeacherLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.opensource.techblog.sampleservice.service.base.TeacherLocalServiceBaseImpl
 * @see com.opensource.techblog.sampleservice.service.TeacherLocalServiceUtil
 */
public class TeacherLocalServiceImpl extends TeacherLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.opensource.techblog.sampleservice.service.TeacherLocalServiceUtil} to access the teacher local service.
     */
}
