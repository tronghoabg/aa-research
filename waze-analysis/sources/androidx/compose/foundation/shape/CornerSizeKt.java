package androidx.compose.foundation.shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CornerSizeKt {
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    public static final CornerSize CornerSize(int i2) {
        return new PercentCornerSize(i2);
    }

    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m3078CornerSize0680j_4(float f2) {
        return new DpCornerSize(f2, null);
    }

    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    public static final CornerSize CornerSize(float f2) {
        return new PxCornerSize(f2);
    }

    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }
}
