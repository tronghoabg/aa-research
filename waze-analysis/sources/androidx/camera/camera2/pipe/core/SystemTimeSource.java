package androidx.camera.camera2.pipe.core;

import android.os.SystemClock;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SystemTimeSource implements TimeSource {
    @Override // androidx.camera.camera2.pipe.core.TimeSource
    /* renamed from: now-vQl9yQU, reason: not valid java name */
    public long mo1117nowvQl9yQU() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
