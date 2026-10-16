package E5;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public abstract class B {
    public static F5.l a(Context context, I i5, boolean z2) {
        MediaMetricsManager mediaMetricsManagerE = V1.h.e(context.getSystemService("media_metrics"));
        F5.j jVar = mediaMetricsManagerE == null ? null : new F5.j(context, mediaMetricsManagerE.createPlaybackSession());
        if (jVar == null) {
            AbstractC4256a.E("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new F5.l(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z2) {
            i5.getClass();
            F5.f fVar = i5.f3098r;
            fVar.getClass();
            fVar.f3896f.d(jVar);
        }
        return new F5.l(jVar.f3918c.getSessionId());
    }
}
