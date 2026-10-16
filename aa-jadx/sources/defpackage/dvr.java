package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dvr extends defpackage.dvq {
    @Override // defpackage.dvq
    protected final android.graphics.Typeface c(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.a, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            try {
                return (android.graphics.Typeface) this.g.invoke(null, objNewInstance, "sans-serif", -1, -1);
            } catch (java.lang.reflect.InvocationTargetException e) {
                e = e;
                throw new java.lang.RuntimeException(e);
            }
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            e = e2;
        }
    }

    @Override // defpackage.dvq
    protected final java.lang.reflect.Method e(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass(), java.lang.String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
