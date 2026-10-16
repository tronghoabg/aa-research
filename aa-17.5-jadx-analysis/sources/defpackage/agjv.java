package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class agjv {
    public static final agjv INSTANCE = new agjv();
    private static agju _cache;

    private agjv() {
    }

    private final agju buildCache(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new agju(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new agju(null, null);
        }
    }

    private final agju initCache(Object obj) {
        agju agjuVar = _cache;
        if (agjuVar != null) {
            return agjuVar;
        }
        agju agjuVarBuildCache = buildCache(obj);
        _cache = agjuVarBuildCache;
        return agjuVarBuildCache;
    }

    public final Method loadGetAccessor(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        obj.getClass();
        Method getAccessor = initCache(obj).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object objInvoke = getAccessor.invoke(obj, null);
        objInvoke.getClass();
        return (Method) objInvoke;
    }

    public final Class<?> loadGetType(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        obj.getClass();
        Method getType = initCache(obj).getGetType();
        if (getType == null) {
            return null;
        }
        Object objInvoke = getType.invoke(obj, null);
        objInvoke.getClass();
        return (Class) objInvoke;
    }
}
