package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.core.Logger;
import androidx.core.app.NotificationCompat;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Logger {
    public static final Camera2Logger INSTANCE;
    private static final int MAX_TAG_LENGTH = 23;
    private static final String TAG = "CXCP";
    private static final String TRUNCATED_TAG;

    static {
        Camera2Logger camera2Logger = new Camera2Logger();
        INSTANCE = camera2Logger;
        camera2Logger.truncateTag("CXCP");
        TRUNCATED_TAG = "CXCP";
    }

    private Camera2Logger() {
    }

    public final void debug(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isDebugEnabled("CXCP")) {
            Log.d(TRUNCATED_TAG, aVar.invoke(), th);
        }
    }

    public final void error(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isErrorEnabled("CXCP")) {
            Log.e(TRUNCATED_TAG, aVar.invoke(), th);
        }
    }

    public final void info(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isInfoEnabled("CXCP")) {
            Log.i(TRUNCATED_TAG, aVar.invoke(), th);
        }
    }

    public final void verbose(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isVerboseEnabled("CXCP")) {
            Log.v(TRUNCATED_TAG, aVar.invoke(), th);
        }
    }

    public final void warn(Throwable th, a<String> aVar) {
        x.f(th, "throwable");
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isWarnEnabled("CXCP")) {
            Log.w(TRUNCATED_TAG, aVar.invoke(), th);
        }
    }

    private final String truncateTag(String str) {
        return str;
    }

    public final void debug(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isDebugEnabled("CXCP")) {
            Log.d(TRUNCATED_TAG, aVar.invoke());
        }
    }

    public final void error(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isErrorEnabled("CXCP")) {
            Log.e(TRUNCATED_TAG, aVar.invoke());
        }
    }

    public final void info(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isInfoEnabled("CXCP")) {
            Log.i(TRUNCATED_TAG, aVar.invoke());
        }
    }

    public final void verbose(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isVerboseEnabled("CXCP")) {
            Log.v(TRUNCATED_TAG, aVar.invoke());
        }
    }

    public final void warn(a<String> aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        if (Logger.isWarnEnabled("CXCP")) {
            Log.w(TRUNCATED_TAG, aVar.invoke());
        }
    }
}
