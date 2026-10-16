package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlayerId {
    private final LogSessionIdApi31 logSessionIdApi31;
    public final String name;
    public static final PlayerId UNSET = new PlayerId("");
    public static final PlayerId PRELOAD = new PlayerId("preload");

    /* compiled from: WazeSource */
    final class LogSessionIdApi31 {
        public LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;

        public void setLogSessionId(LogSessionId logSessionId) {
            an.u(this.logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.logSessionId = logSessionId;
        }
    }

    public PlayerId(String str) {
        this.name = str;
        this.logSessionIdApi31 = Build.VERSION.SDK_INT >= 31 ? new LogSessionIdApi31() : null;
    }

    public synchronized LogSessionId getLogSessionId() {
        LogSessionIdApi31 logSessionIdApi31;
        logSessionIdApi31 = this.logSessionIdApi31;
        an.B(logSessionIdApi31);
        return logSessionIdApi31.logSessionId;
    }

    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        LogSessionIdApi31 logSessionIdApi31 = this.logSessionIdApi31;
        an.B(logSessionIdApi31);
        logSessionIdApi31.setLogSessionId(logSessionId);
    }
}
