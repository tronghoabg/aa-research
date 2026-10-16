package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class dwk {
    private static long a;
    private static java.lang.reflect.Method b;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
                android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            } catch (java.lang.Exception e) {
                android.util.Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    public static boolean a() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return ep$.ExternalSyntheticApiModelOutline0.m();
        }
        try {
            return ((java.lang.Boolean) b.invoke(null, java.lang.Long.valueOf(a))).booleanValue();
        } catch (java.lang.Exception unused) {
            android.util.Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
