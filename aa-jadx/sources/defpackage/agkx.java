package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agkx {
    public static final defpackage.agkx INSTANCE = new defpackage.agkx();
    private static defpackage.agkw _cache;

    private agkx() {
    }

    private final defpackage.agkw buildCache() {
        try {
            return new defpackage.agkw(java.lang.Class.class.getMethod("isSealed", null), java.lang.Class.class.getMethod("getPermittedSubclasses", null), java.lang.Class.class.getMethod("isRecord", null), java.lang.Class.class.getMethod("getRecordComponents", null));
        } catch (java.lang.NoSuchMethodException unused) {
            return new defpackage.agkw(null, null, null, null);
        }
    }

    private final defpackage.agkw initCache() {
        defpackage.agkw agkwVar = _cache;
        if (agkwVar != null) {
            return agkwVar;
        }
        defpackage.agkw agkwVarBuildCache = buildCache();
        _cache = agkwVarBuildCache;
        return agkwVarBuildCache;
    }

    public final java.lang.Class<?>[] loadGetPermittedSubclasses(java.lang.Class<?> cls) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        cls.getClass();
        java.lang.reflect.Method getPermittedSubclasses = initCache().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        java.lang.Object objInvoke = getPermittedSubclasses.invoke(cls, null);
        objInvoke.getClass();
        return (java.lang.Class[]) objInvoke;
    }

    public final java.lang.Object[] loadGetRecordComponents(java.lang.Class<?> cls) {
        cls.getClass();
        java.lang.reflect.Method getRecordComponents = initCache().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (java.lang.Object[]) getRecordComponents.invoke(cls, null);
    }

    public final java.lang.Boolean loadIsRecord(java.lang.Class<?> cls) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        cls.getClass();
        java.lang.reflect.Method methodIsRecord = initCache().isRecord();
        if (methodIsRecord == null) {
            return null;
        }
        java.lang.Object objInvoke = methodIsRecord.invoke(cls, null);
        objInvoke.getClass();
        return (java.lang.Boolean) objInvoke;
    }

    public final java.lang.Boolean loadIsSealed(java.lang.Class<?> cls) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        cls.getClass();
        java.lang.reflect.Method methodIsSealed = initCache().isSealed();
        if (methodIsSealed == null) {
            return null;
        }
        java.lang.Object objInvoke = methodIsSealed.invoke(cls, null);
        objInvoke.getClass();
        return (java.lang.Boolean) objInvoke;
    }
}
