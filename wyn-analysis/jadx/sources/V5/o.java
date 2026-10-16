package V5;

import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public abstract class o {
    public static void a(i iVar, F5.l lVar) {
        F5.k kVar = lVar.f3943a;
        kVar.getClass();
        LogSessionId logSessionId = kVar.f3942a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        iVar.f13056b.setString("log-session-id", logSessionId.getStringId());
    }
}
