package com.opensource.techblog.sampleservice.service.impl;

import com.opensource.techblog.sampleservice.service.base.StudentServiceBaseImpl;

/**
 * The implementation of the student remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.opensource.techblog.sampleservice.service.StudentService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.opensource.techblog.sampleservice.service.base.StudentServiceBaseImpl
 * @see com.opensource.techblog.sampleservice.service.StudentServiceUtil
 */
public class StudentServiceImpl extends StudentServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.opensource.techblog.sampleservice.service.StudentServiceUtil} to access the student remote service.
     */
}
