package androidx.media3.common.util;

import com.google.d.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ElapsedRealtimeTicker extends aq {
    @Override // com.google.d.b.aq
    public long read() {
        return android.os.SystemClock.elapsedRealtimeNanos();
    }
}
