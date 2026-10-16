package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fdp {
    private static long a;
    private static java.lang.reflect.Method b;
    private static java.lang.reflect.Method c;

    public static final void a(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.setCounter(d(str), i);
            return;
        }
        java.lang.String strD = d(str);
        try {
            java.lang.reflect.Method method = c;
            if (method == null) {
                method = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                c = method;
            }
            if (method == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, java.lang.Long.valueOf(a), strD, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            c("traceCounter", e);
        }
    }

    public static final boolean b() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return android.os.Trace.isEnabled();
        }
        try {
            java.lang.reflect.Method method = b;
            if (method == null) {
                a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
                b = method;
            }
            if (method == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            java.lang.Object objInvoke = method.invoke(null, java.lang.Long.valueOf(a));
            objInvoke.getClass();
            return ((java.lang.Boolean) objInvoke).booleanValue();
        } catch (java.lang.Exception e) {
            c("isTagEnabled", e);
            return false;
        }
    }

    private static final void c(java.lang.String str, java.lang.Exception exc) throws java.lang.Throwable {
        if (!(exc instanceof java.lang.reflect.InvocationTargetException)) {
            android.util.Log.v("Trace", defpackage.a.bp(str, "Unable to call ", " via reflection"), exc);
            return;
        }
        java.lang.Throwable cause = ((java.lang.reflect.InvocationTargetException) exc).getCause();
        if (!(cause instanceof java.lang.RuntimeException)) {
            throw new java.lang.RuntimeException(cause);
        }
        throw cause;
    }

    private static final java.lang.String d(java.lang.String str) {
        if (str.length() <= 127) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, 127);
        strSubstring.getClass();
        return strSubstring;
    }
}
