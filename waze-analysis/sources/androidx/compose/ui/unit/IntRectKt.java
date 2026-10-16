package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntRectKt {
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m11328IntRectE1MhUcY(long j2, long j3) {
        return new IntRect(IntOffset.m11296getXimpl(j2), IntOffset.m11297getYimpl(j2), IntOffset.m11296getXimpl(j3), IntOffset.m11297getYimpl(j3));
    }

    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m11329IntRectVbeCjmY(long j2, long j3) {
        return new IntRect(IntOffset.m11296getXimpl(j2), IntOffset.m11297getYimpl(j2), IntOffset.m11296getXimpl(j2) + ((int) (j3 >> 32)), IntOffset.m11297getYimpl(j2) + ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3)));
    }

    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m11330IntRectar5cAso(long j2, int i2) {
        int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
        int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
        return new IntRect(IntOffset.m11296getXimpl(j2) - i2, IntOffset.m11297getYimpl(j2) - i2, iM11296getXimpl + i2, iM11297getYimpl + i2);
    }

    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f2) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f2), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f2), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f2), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f2));
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
