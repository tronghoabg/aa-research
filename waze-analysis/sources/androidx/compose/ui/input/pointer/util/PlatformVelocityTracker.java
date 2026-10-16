package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface PlatformVelocityTracker {
    /* renamed from: addPointerInputChange-Uv8p0NA */
    void mo9704addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j2);

    /* renamed from: addPosition-Uv8p0NA */
    void mo9705addPositionUv8p0NA(long j2, long j3);

    /* renamed from: calculateVelocity-AH228Gc */
    long mo9706calculateVelocityAH228Gc(long j2);

    void resetTracking();
}
