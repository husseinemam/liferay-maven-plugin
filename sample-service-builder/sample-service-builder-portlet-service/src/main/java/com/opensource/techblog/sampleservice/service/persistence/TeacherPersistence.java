package com.opensource.techblog.sampleservice.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.opensource.techblog.sampleservice.model.Teacher;

/**
 * The persistence interface for the teacher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherPersistenceImpl
 * @see TeacherUtil
 * @generated
 */
public interface TeacherPersistence extends BasePersistence<Teacher> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TeacherUtil} to access the teacher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the teacher in the entity cache if it is enabled.
    *
    * @param teacher the teacher
    */
    public void cacheResult(
        com.opensource.techblog.sampleservice.model.Teacher teacher);

    /**
    * Caches the teachers in the entity cache if it is enabled.
    *
    * @param teachers the teachers
    */
    public void cacheResult(
        java.util.List<com.opensource.techblog.sampleservice.model.Teacher> teachers);

    /**
    * Creates a new teacher with the primary key. Does not add the teacher to the database.
    *
    * @param teacherId the primary key for the new teacher
    * @return the new teacher
    */
    public com.opensource.techblog.sampleservice.model.Teacher create(
        long teacherId);

    /**
    * Removes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher that was removed
    * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.sampleservice.model.Teacher remove(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.sampleservice.NoSuchTeacherException;

    public com.opensource.techblog.sampleservice.model.Teacher updateImpl(
        com.opensource.techblog.sampleservice.model.Teacher teacher)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teacher with the primary key or throws a {@link com.opensource.techblog.sampleservice.NoSuchTeacherException} if it could not be found.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher
    * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.sampleservice.model.Teacher findByPrimaryKey(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.sampleservice.NoSuchTeacherException;

    /**
    * Returns the teacher with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher, or <code>null</code> if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.sampleservice.model.Teacher fetchByPrimaryKey(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the teachers.
    *
    * @return the teachers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.sampleservice.model.Teacher> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opensource.techblog.sampleservice.model.Teacher> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opensource.techblog.sampleservice.model.Teacher> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the teachers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teachers.
    *
    * @return the number of teachers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
