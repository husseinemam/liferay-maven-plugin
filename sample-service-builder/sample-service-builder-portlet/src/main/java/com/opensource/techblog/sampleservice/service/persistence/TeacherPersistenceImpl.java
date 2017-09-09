package com.opensource.techblog.sampleservice.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.opensource.techblog.sampleservice.NoSuchTeacherException;
import com.opensource.techblog.sampleservice.model.Teacher;
import com.opensource.techblog.sampleservice.model.impl.TeacherImpl;
import com.opensource.techblog.sampleservice.model.impl.TeacherModelImpl;
import com.opensource.techblog.sampleservice.service.persistence.TeacherPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the teacher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherPersistence
 * @see TeacherUtil
 * @generated
 */
public class TeacherPersistenceImpl extends BasePersistenceImpl<Teacher>
    implements TeacherPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TeacherUtil} to access the teacher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TeacherImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeacherModelImpl.ENTITY_CACHE_ENABLED,
            TeacherModelImpl.FINDER_CACHE_ENABLED, TeacherImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeacherModelImpl.ENTITY_CACHE_ENABLED,
            TeacherModelImpl.FINDER_CACHE_ENABLED, TeacherImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeacherModelImpl.ENTITY_CACHE_ENABLED,
            TeacherModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TEACHER = "SELECT teacher FROM Teacher teacher";
    private static final String _SQL_COUNT_TEACHER = "SELECT COUNT(teacher) FROM Teacher teacher";
    private static final String _ORDER_BY_ENTITY_ALIAS = "teacher.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Teacher exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TeacherPersistenceImpl.class);
    private static Teacher _nullTeacher = new TeacherImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Teacher> toCacheModel() {
                return _nullTeacherCacheModel;
            }
        };

    private static CacheModel<Teacher> _nullTeacherCacheModel = new CacheModel<Teacher>() {
            @Override
            public Teacher toEntityModel() {
                return _nullTeacher;
            }
        };

    public TeacherPersistenceImpl() {
        setModelClass(Teacher.class);
    }

    /**
     * Caches the teacher in the entity cache if it is enabled.
     *
     * @param teacher the teacher
     */
    @Override
    public void cacheResult(Teacher teacher) {
        EntityCacheUtil.putResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
            TeacherImpl.class, teacher.getPrimaryKey(), teacher);

        teacher.resetOriginalValues();
    }

    /**
     * Caches the teachers in the entity cache if it is enabled.
     *
     * @param teachers the teachers
     */
    @Override
    public void cacheResult(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            if (EntityCacheUtil.getResult(
                        TeacherModelImpl.ENTITY_CACHE_ENABLED,
                        TeacherImpl.class, teacher.getPrimaryKey()) == null) {
                cacheResult(teacher);
            } else {
                teacher.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all teachers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TeacherImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TeacherImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the teacher.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Teacher teacher) {
        EntityCacheUtil.removeResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
            TeacherImpl.class, teacher.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Teacher> teachers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Teacher teacher : teachers) {
            EntityCacheUtil.removeResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
                TeacherImpl.class, teacher.getPrimaryKey());
        }
    }

    /**
     * Creates a new teacher with the primary key. Does not add the teacher to the database.
     *
     * @param teacherId the primary key for the new teacher
     * @return the new teacher
     */
    @Override
    public Teacher create(long teacherId) {
        Teacher teacher = new TeacherImpl();

        teacher.setNew(true);
        teacher.setPrimaryKey(teacherId);

        return teacher;
    }

    /**
     * Removes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param teacherId the primary key of the teacher
     * @return the teacher that was removed
     * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teacher remove(long teacherId)
        throws NoSuchTeacherException, SystemException {
        return remove((Serializable) teacherId);
    }

    /**
     * Removes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the teacher
     * @return the teacher that was removed
     * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teacher remove(Serializable primaryKey)
        throws NoSuchTeacherException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Teacher teacher = (Teacher) session.get(TeacherImpl.class,
                    primaryKey);

            if (teacher == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTeacherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(teacher);
        } catch (NoSuchTeacherException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Teacher removeImpl(Teacher teacher) throws SystemException {
        teacher = toUnwrappedModel(teacher);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(teacher)) {
                teacher = (Teacher) session.get(TeacherImpl.class,
                        teacher.getPrimaryKeyObj());
            }

            if (teacher != null) {
                session.delete(teacher);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (teacher != null) {
            clearCache(teacher);
        }

        return teacher;
    }

    @Override
    public Teacher updateImpl(
        com.opensource.techblog.sampleservice.model.Teacher teacher)
        throws SystemException {
        teacher = toUnwrappedModel(teacher);

        boolean isNew = teacher.isNew();

        Session session = null;

        try {
            session = openSession();

            if (teacher.isNew()) {
                session.save(teacher);

                teacher.setNew(false);
            } else {
                session.merge(teacher);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
            TeacherImpl.class, teacher.getPrimaryKey(), teacher);

        return teacher;
    }

    protected Teacher toUnwrappedModel(Teacher teacher) {
        if (teacher instanceof TeacherImpl) {
            return teacher;
        }

        TeacherImpl teacherImpl = new TeacherImpl();

        teacherImpl.setNew(teacher.isNew());
        teacherImpl.setPrimaryKey(teacher.getPrimaryKey());

        teacherImpl.setTeacherId(teacher.getTeacherId());
        teacherImpl.setTeacherName(teacher.getTeacherName());
        teacherImpl.setDob(teacher.getDob());
        teacherImpl.setSubject(teacher.getSubject());

        return teacherImpl;
    }

    /**
     * Returns the teacher with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the teacher
     * @return the teacher
     * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teacher findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTeacherException, SystemException {
        Teacher teacher = fetchByPrimaryKey(primaryKey);

        if (teacher == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTeacherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return teacher;
    }

    /**
     * Returns the teacher with the primary key or throws a {@link com.opensource.techblog.sampleservice.NoSuchTeacherException} if it could not be found.
     *
     * @param teacherId the primary key of the teacher
     * @return the teacher
     * @throws com.opensource.techblog.sampleservice.NoSuchTeacherException if a teacher with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teacher findByPrimaryKey(long teacherId)
        throws NoSuchTeacherException, SystemException {
        return findByPrimaryKey((Serializable) teacherId);
    }

    /**
     * Returns the teacher with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the teacher
     * @return the teacher, or <code>null</code> if a teacher with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teacher fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Teacher teacher = (Teacher) EntityCacheUtil.getResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
                TeacherImpl.class, primaryKey);

        if (teacher == _nullTeacher) {
            return null;
        }

        if (teacher == null) {
            Session session = null;

            try {
                session = openSession();

                teacher = (Teacher) session.get(TeacherImpl.class, primaryKey);

                if (teacher != null) {
                    cacheResult(teacher);
                } else {
                    EntityCacheUtil.putResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
                        TeacherImpl.class, primaryKey, _nullTeacher);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TeacherModelImpl.ENTITY_CACHE_ENABLED,
                    TeacherImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return teacher;
    }

    /**
     * Returns the teacher with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param teacherId the primary key of the teacher
     * @return the teacher, or <code>null</code> if a teacher with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teacher fetchByPrimaryKey(long teacherId) throws SystemException {
        return fetchByPrimaryKey((Serializable) teacherId);
    }

    /**
     * Returns all the teachers.
     *
     * @return the teachers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teacher> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Teacher> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Teacher> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Teacher> list = (List<Teacher>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TEACHER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TEACHER;

                if (pagination) {
                    sql = sql.concat(TeacherModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Teacher>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Teacher>(list);
                } else {
                    list = (List<Teacher>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the teachers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Teacher teacher : findAll()) {
            remove(teacher);
        }
    }

    /**
     * Returns the number of teachers.
     *
     * @return the number of teachers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_TEACHER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the teacher persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.opensource.techblog.sampleservice.model.Teacher")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Teacher>> listenersList = new ArrayList<ModelListener<Teacher>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Teacher>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TeacherImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
