package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.unit.VelocityKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private final PlatformVelocityTracker platformVelocityTracker = PlatformVelocityTracker_androidKt.PlatformVelocityTracker();

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m9713addPositionUv8p0NA(long j2, long j3) {
        this.platformVelocityTracker.mo9705addPositionUv8p0NA(j2, j3);
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m9714calculateVelocity9UxMQ8M() {
        return m9715calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m9715calculateVelocityAH228Gc(long j2) {
        return this.platformVelocityTracker.mo9706calculateVelocityAH228Gc(j2);
    }

    public final PlatformVelocityTracker getPlatformVelocityTracker$ui() {
        return this.platformVelocityTracker;
    }

    public final void resetTracking() {
        this.platformVelocityTracker.resetTracking();
    }
}
