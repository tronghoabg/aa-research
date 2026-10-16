package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TouchBoundsExpansionKt {
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m10171DpTouchBoundsExpansiona9UjIt4(float f2, float f3, float f4, float f5) {
        return new DpTouchBoundsExpansion(f2, f3, f4, f5, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m10172DpTouchBoundsExpansiona9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m10171DpTouchBoundsExpansiona9UjIt4(f2, f3, f4, f5);
    }

    public static final long TouchBoundsExpansion(int i2, int i3, int i4, int i5) {
        if (i2 < 0 || i2 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (i3 < 0 || i3 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (i4 < 0 || i4 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (i5 < 0 || i5 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.Companion.pack$ui(i2, i3, i4, i5, true);
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if (1 == (i6 & 1)) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return TouchBoundsExpansion(i2, i3, i4, i5);
    }
}
