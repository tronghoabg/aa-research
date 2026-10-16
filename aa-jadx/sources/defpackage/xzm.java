package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xzm {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.Object b;

    static {
        java.lang.Object objInvoke = null;
        try {
            objInvoke = java.lang.Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (java.lang.Throwable th) {
            e(th);
        }
        b = objInvoke;
        if (objInvoke != null) {
            d("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
        }
        if (objInvoke == null) {
            return;
        }
        f(objInvoke);
    }

    public static java.lang.String a(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void b(java.lang.Throwable th, java.lang.Class cls) throws java.lang.Throwable {
        if (cls.isInstance(th)) {
            throw ((java.lang.Throwable) cls.cast(th));
        }
    }

    public static void c(java.lang.Throwable th) {
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
    }

    private static java.lang.reflect.Method d(java.lang.String str, java.lang.Class... clsArr) {
        try {
            return java.lang.Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (java.lang.Throwable th) {
            e(th);
            return null;
        }
    }

    private static void e(java.lang.Throwable th) {
        if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
            throw ((java.lang.Error) th);
        }
    }

    private static void f(java.lang.Object obj) {
        try {
            java.lang.reflect.Method methodD = d("getStackTraceDepth", java.lang.Throwable.class);
            if (methodD == null) {
                return;
            }
            methodD.invoke(obj, new java.lang.Throwable());
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
        }
    }
}
