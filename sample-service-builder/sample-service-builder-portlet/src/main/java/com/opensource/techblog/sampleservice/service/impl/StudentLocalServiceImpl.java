package com.opensource.techblog.sampleservice.service.impl;

import com.opensource.techblog.sampleservice.service.base.StudentLocalServiceBaseImpl;

/**
 * The implementation of the student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.opensource.techblog.sampleservice.service.StudentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.opensource.techblog.sampleservice.service.base.StudentLocalServiceBaseImpl
 * @see com.opensource.techblog.sampleservice.service.StudentLocalServiceUtil
 */
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.opensource.techblog.sampleservice.service.StudentLocalServiceUtil} to access the student local service.
     */
}
