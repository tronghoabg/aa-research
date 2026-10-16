package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class agjx {
    public static final agjx INSTANCE = new agjx();
    private static agjw _cache;

    private agjx() {
    }

    private final agjw buildCache() {
        try {
            return new agjw(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new agjw(null, null, null, null);
        }
    }

    private final agjw initCache() {
        agjw agjwVar = _cache;
        if (agjwVar != null) {
            return agjwVar;
        }
        agjw agjwVarBuildCache = buildCache();
        _cache = agjwVarBuildCache;
        return agjwVarBuildCache;
    }

    public final Class<?>[] loadGetPermittedSubclasses(Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        cls.getClass();
        Method getPermittedSubclasses = initCache().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object objInvoke = getPermittedSubclasses.invoke(cls, null);
        objInvoke.getClass();
        return (Class[]) objInvoke;
    }

    public final Object[] loadGetRecordComponents(Class<?> cls) {
        cls.getClass();
        Method getRecordComponents = initCache().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(cls, null);
    }

    public final Boolean loadIsRecord(Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        cls.getClass();
        Method methodIsRecord = initCache().isRecord();
        if (methodIsRecord == null) {
            return null;
        }
        Object objInvoke = methodIsRecord.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    public final Boolean loadIsSealed(Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        cls.getClass();
        Method methodIsSealed = initCache().isSealed();
        if (methodIsSealed == null) {
            return null;
        }
        Object objInvoke = methodIsSealed.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }
}
