package androidx.camera.camera2.pipe.core;

import androidx.core.app.NotificationCompat;
import h.a.c;
import h.a.i;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Log {
    private static final int LOG_LEVEL = 1;
    private static final int LOG_LEVEL_DEBUG = 1;
    private static final int LOG_LEVEL_ERROR = 4;
    private static final int LOG_LEVEL_INFO = 2;
    private static final int LOG_LEVEL_WARN = 3;
    public static final String TAG = "CXCP";
    public static final Log INSTANCE = new Log();
    private static final boolean DEBUG_LOGGABLE = true;
    private static final boolean INFO_LOGGABLE = true;
    private static final boolean WARN_LOGGABLE = true;
    private static final boolean ERROR_LOGGABLE = true;

    /* compiled from: WazeSource */
    public final class MonitoredLogMessages {
        public static final MonitoredLogMessages INSTANCE = new MonitoredLogMessages();
        public static final String REPEATING_REQUEST_STARTED_TIMEOUT = "awaitStarted on last repeating request timed out";

        private MonitoredLogMessages() {
        }
    }

    private Log() {
    }

    public static /* synthetic */ String readStackTrace$default(Log log, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 4;
        }
        return log.readStackTrace(i2);
    }

    public final void debug(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getDEBUG_LOGGABLE()) {
            android.util.Log.d(TAG, aVar.invoke(), th);
        }
    }

    public final void error(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getERROR_LOGGABLE()) {
            android.util.Log.e(TAG, aVar.invoke(), th);
        }
    }

    public final boolean getDEBUG_LOGGABLE() {
        return DEBUG_LOGGABLE;
    }

    public final boolean getERROR_LOGGABLE() {
        return ERROR_LOGGABLE;
    }

    public final boolean getINFO_LOGGABLE() {
        return INFO_LOGGABLE;
    }

    public final boolean getWARN_LOGGABLE() {
        return WARN_LOGGABLE;
    }

    public final void info(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getINFO_LOGGABLE()) {
            android.util.Log.i(TAG, aVar.invoke(), th);
        }
    }

    public final String readStackTrace(int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        x.c(stackTrace);
        return i.aM(c.Q(stackTrace, 3), "\t", "\n\t", null, i2, null, 52);
    }

    public final <T> T rethrowExceptionAfterLogging(String str, a<? extends T> aVar) throws Exception {
        x.f(str, NotificationCompat.CATEGORY_MESSAGE);
        x.f(aVar, "block");
        try {
            return aVar.invoke();
        } catch (Exception e2) {
            Exception exc = e2;
            if (this.getERROR_LOGGABLE()) {
                android.util.Log.e(TAG, str, exc);
            }
            throw e2;
        }
    }

    public final void warn(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getWARN_LOGGABLE()) {
            android.util.Log.w(TAG, aVar.invoke(), th);
        }
    }

    public final void debug(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getDEBUG_LOGGABLE()) {
            android.util.Log.d(TAG, aVar.invoke());
        }
    }

    public final void error(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getERROR_LOGGABLE()) {
            android.util.Log.e(TAG, aVar.invoke());
        }
    }

    public final void info(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getINFO_LOGGABLE()) {
            android.util.Log.i(TAG, aVar.invoke());
        }
    }

    public final void warn(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (getWARN_LOGGABLE()) {
            android.util.Log.w(TAG, aVar.invoke());
        }
    }
}
