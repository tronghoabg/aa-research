package androidx.tracing;

import android.os.Build;
import android.util.Log;
import h.g.b.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Trace {
    public static final Trace INSTANCE = new Trace();
    public static final int MAX_TRACE_LABEL_LENGTH = 127;
    public static final String TAG = "Trace";
    private static Method asyncTraceBeginMethod;
    private static Method asyncTraceEndMethod;
    private static boolean hasAppTracingEnabled;
    private static Method isTagEnabledMethod;
    private static Method traceCounterMethod;
    private static long traceTagApp;

    private Trace() {
    }

    public static final void beginAsyncSection(String str, int i2) {
        TraceApi29Impl.INSTANCE.beginAsyncSection(INSTANCE.truncatedTraceSectionLabel(str), i2);
    }

    private final void beginAsyncSectionFallback(String str, int i2) throws Throwable {
        try {
            Method method = asyncTraceBeginMethod;
            if (method == null) {
                method = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                asyncTraceBeginMethod = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(traceTagApp), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            handleException("asyncTraceBegin", e2);
        }
    }

    public static final void beginSection(String str) {
        android.os.Trace.beginSection(INSTANCE.truncatedTraceSectionLabel(str));
    }

    public static final void endAsyncSection(String str, int i2) {
        TraceApi29Impl.INSTANCE.endAsyncSection(INSTANCE.truncatedTraceSectionLabel(str), i2);
    }

    private final void endAsyncSectionFallback(String str, int i2) throws Throwable {
        try {
            Method method = asyncTraceEndMethod;
            if (method == null) {
                method = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                asyncTraceEndMethod = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(traceTagApp), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            handleException("asyncTraceEnd", e2);
        }
    }

    public static final void endSection() {
        android.os.Trace.endSection();
    }

    public static final void forceEnableAppTracing() throws Throwable {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (hasAppTracingEnabled) {
                    return;
                }
                hasAppTracingEnabled = true;
                android.os.Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
            } catch (Exception e2) {
                INSTANCE.handleException("setAppTracingAllowed", e2);
            }
        }
    }

    private final void handleException(String str, Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
        Log.v(TAG, "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean isEnabled() {
        return TraceApi29Impl.INSTANCE.isEnabled();
    }

    private final boolean isEnabledFallback() throws Throwable {
        try {
            Method method = isTagEnabledMethod;
            if (method == null) {
                traceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
                isTagEnabledMethod = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(traceTagApp));
            x.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e2) {
            handleException("isTagEnabled", e2);
            return false;
        }
    }

    private static /* synthetic */ void isEnabledFallback$annotations() {
    }

    public static final void setCounter(String str, int i2) {
        TraceApi29Impl.INSTANCE.setCounter(INSTANCE.truncatedTraceSectionLabel(str), i2);
    }

    private final void setCounterFallback(String str, int i2) throws Throwable {
        try {
            Method method = traceCounterMethod;
            if (method == null) {
                method = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                traceCounterMethod = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(traceTagApp), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            handleException("traceCounter", e2);
        }
    }

    private final String truncatedTraceSectionLabel(String str) {
        if (str.length() <= 127) {
            return str;
        }
        String strSubstring = str.substring(0, 127);
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void setCounter(String str, long j2) {
        TraceApi29Impl.INSTANCE.setCounter(INSTANCE.truncatedTraceSectionLabel(str), j2);
    }
}
