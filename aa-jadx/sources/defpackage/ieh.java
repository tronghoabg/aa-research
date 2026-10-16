package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ieh {
    public static defpackage.ief a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            java.lang.Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.IllegalAccessException e) {
                b(cls, e);
            } catch (java.lang.InstantiationException e2) {
                b(cls, e2);
            } catch (java.lang.NoSuchMethodException e3) {
                b(cls, e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                b(cls, e4);
            }
            if (objNewInstance instanceof defpackage.ief) {
                return (defpackage.ief) objNewInstance;
            }
            throw new java.lang.RuntimeException("Expected instanceof GlideModule, but found: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(objNewInstance))));
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void b(java.lang.Class cls, java.lang.Exception exc) {
        throw new java.lang.RuntimeException("Unable to instantiate GlideModule implementation for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))), exc);
    }
}
