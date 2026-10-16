package androidx.compose.foundation.gestures;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogicKt {
    private static final float AnimationSpeed = 1.0f;
    private static final float AnimationThreshold = 6.0f;
    private static final int MaxAnimationDuration = 100;
    private static final long ScrollProgressTimeout = 50;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowScrollingDelta(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }
}
