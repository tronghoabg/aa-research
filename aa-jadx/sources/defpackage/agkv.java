package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agkv {
    public static final defpackage.agkv INSTANCE = new defpackage.agkv();
    private static defpackage.agku _cache;

    private agkv() {
    }

    private final defpackage.agku buildCache(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        try {
            return new defpackage.agku(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (java.lang.NoSuchMethodException unused) {
            return new defpackage.agku(null, null);
        }
    }

    private final defpackage.agku initCache(java.lang.Object obj) {
        defpackage.agku agkuVar = _cache;
        if (agkuVar != null) {
            return agkuVar;
        }
        defpackage.agku agkuVarBuildCache = buildCache(obj);
        _cache = agkuVarBuildCache;
        return agkuVarBuildCache;
    }

    public final java.lang.reflect.Method loadGetAccessor(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        obj.getClass();
        java.lang.reflect.Method getAccessor = initCache(obj).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        java.lang.Object objInvoke = getAccessor.invoke(obj, null);
        objInvoke.getClass();
        return (java.lang.reflect.Method) objInvoke;
    }

    public final java.lang.Class<?> loadGetType(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        obj.getClass();
        java.lang.reflect.Method getType = initCache(obj).getGetType();
        if (getType == null) {
            return null;
        }
        java.lang.Object objInvoke = getType.invoke(obj, null);
        objInvoke.getClass();
        return (java.lang.Class) objInvoke;
    }
}
