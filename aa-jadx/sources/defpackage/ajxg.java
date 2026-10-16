package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
final class ajxg implements java.lang.reflect.InvocationHandler {
    private static final java.lang.reflect.Constructor a;
    private final defpackage.ajqj b;

    static {
        try {
            a = java.lang.reflect.Proxy.getProxyClass(defpackage.ajxg.class.getClassLoader(), defpackage.ajsn.class).getConstructor(java.lang.reflect.InvocationHandler.class);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public ajxg(defpackage.ajqj ajqjVar) {
        this.b = ajqjVar;
    }

    public static defpackage.ajsn a(defpackage.ajqj ajqjVar) {
        try {
            return (defpackage.ajsn) a.newInstance(new defpackage.ajxg(ajqjVar));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalStateException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.IllegalStateException(e3);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        boolean zEquals = method.getName().equals("close");
        defpackage.ajqj ajqjVar = this.b;
        if (zEquals) {
            defpackage.agve.a(ajqjVar.a());
            return null;
        }
        try {
            return method.invoke(ajqjVar, objArr);
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}
