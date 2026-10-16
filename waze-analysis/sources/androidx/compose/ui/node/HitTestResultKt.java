package androidx.compose.ui.node;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f2, boolean z, boolean z2) {
        return (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L) | (Float.floatToRawIntBits(f2) << 32);
    }
}
