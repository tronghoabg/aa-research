package G5;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public abstract class B {
    public static void a(AudioTrack audioTrack, F5.l lVar) {
        F5.k kVar = lVar.f3943a;
        kVar.getClass();
        LogSessionId logSessionId = kVar.f3942a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
