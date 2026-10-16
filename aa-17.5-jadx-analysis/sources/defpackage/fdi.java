package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class fdi {
    private static long a;
    private static Method b;
    private static Method c;

    public static final void a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(d(str), i);
            return;
        }
        String strD = d(str);
        try {
            Method method = c;
            if (method == null) {
                method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                c = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(a), strD, Integer.valueOf(i));
        } catch (Exception e) {
            c("traceCounter", e);
        }
    }

    public static final boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(a));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            c("isTagEnabled", e);
            return false;
        }
    }

    private static final void c(String str, Exception exc) throws Throwable {
        if (!(exc instanceof InvocationTargetException)) {
            Log.v("Trace", a.bq(str, "Unable to call ", " via reflection"), exc);
            return;
        }
        Throwable cause = ((InvocationTargetException) exc).getCause();
        if (!(cause instanceof RuntimeException)) {
            throw new RuntimeException(cause);
        }
        throw cause;
    }

    private static final String d(String str) {
        if (str.length() <= 127) {
            return str;
        }
        String strSubstring = str.substring(0, 127);
        strSubstring.getClass();
        return strSubstring;
    }
}
