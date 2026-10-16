package androidx.compose.ui.input.pointer.util;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class FrameworkVelocityTracker$$ExternalSyntheticBackport0 {
    public static /* synthetic */ float m(float f2, float f3, float f4) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("min is NaN");
        }
        if (Float.isNaN(f4)) {
            throw new IllegalArgumentException("max is NaN");
        }
        if (Float.compare(f3, f4) <= 0) {
            return Math.min(f4, Math.max(f2, f3));
        }
        throw new IllegalArgumentException(f3 + " > " + f4);
    }
}
