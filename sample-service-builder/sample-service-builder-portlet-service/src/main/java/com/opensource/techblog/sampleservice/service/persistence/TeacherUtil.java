package com.opensource.techblog.sampleservice.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.opensource.techblog.sampleservice.model.Teacher;

import java.util.List;

/**
 * The persistence utility for the teacher service. This utility wraps {@link TeacherPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherPersistence
 * @see TeacherPersistenceImpl
 * @generated
 */
public class TeacherUtil {
    private static TeacherPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Teacher teacher) {
        getPersistence().clearCache(teacher);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Teacher> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Teacher> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Teacher> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Teacher update(Teacher teacher) throws SystemException {
        return getPersistence().update(teacher);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Teacher update(Teacher teacher, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(teacher, serviceContext);
    }

    /**
    * Caches the teacher in the entity cache if it is enabled.
    *
    * @param teacher the teacher
    */
    public static void cacheResult(
        com.opensource.techblog.sampleservice.model.Teacher teacher) {
        getPersistence().cacheResult(teacher);
    }

    /**
    * Caches the teachers in the entity cache if it is enabled.
    *
    * @param teachers the teachers
    */
    public static void cacheResult(
        java.util.List<com.opensource.techblog.sampleservice.model.Teacher> teachers) {
        getPersistence().cacheResult(teachers);
    }

    /**
    * Creates a new teacher with the primary key. Does not add the teacher to the database.
    *
    * @param teacherId the primary key for the new teacher
    * @return the new teacher
    */
    public static com.opensource.techblog.sampleservice.model.Teacher create(
        long teacherId) {
        return getPersistence().create(teacherId);
    }

    /**
    * Removes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher that was removed
    * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opensource.techblog.sampleservice.model.Teacher remove(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.sampleservice.NoSuchTeacherException {
        return getPersistence().remove(teacherId);
    }

    public static com.opensource.techblog.sampleservice.model.Teacher updateImpl(
        com.opensource.techblog.sampleservice.model.Teacher teacher)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(teacher);
    }

    /**
    * Returns the teacher with the primary key or throws a {@link com.opensource.techblog.sampleservice.NoSuchTeacherException} if it could not be found.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher
    * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opensource.techblog.sampleservice.model.Teacher findByPrimaryKey(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.sampleservice.NoSuchTeacherException {
        return getPersistence().findByPrimaryKey(teacherId);
    }

    /**
    * Returns the teacher with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher, or <code>null</code> if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opensource.techblog.sampleservice.model.Teacher fetchByPrimaryKey(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(teacherId);
    }

    /**
    * Returns all the teachers.
    *
    * @return the teachers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.opensource.techblog.sampleservice.model.Teacher> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the teachers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.sampleservice.model.impl.TeacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teachers
    * @param end the upper bound of the range of teachers (not inclusive)
    * @return the range of teachers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.opensource.techblog.sampleservice.model.Teacher> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the teachers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.sampleservice.model.impl.TeacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teachers
    * @param end the upper bound of the range of teachers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of teachers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.opensource.techblog.sampleservice.model.Teacher> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the teachers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of teachers.
    *
    * @return the number of teachers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TeacherPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TeacherPersistence) PortletBeanLocatorUtil.locate(com.opensource.techblog.sampleservice.service.ClpSerializer.getServletContextName(),
                    TeacherPersistence.class.getName());

            ReferenceRegistry.registerReference(TeacherUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TeacherPersistence persistence) {
    }
}
