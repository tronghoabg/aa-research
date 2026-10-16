package androidx.compose.ui.geometry;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableRectKt {
    /* renamed from: MutableRect-0a9Yr6o, reason: not valid java name */
    public static final MutableRect m7966MutableRect0a9Yr6o(long j2, long j3) {
        int i2 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new MutableRect(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2));
    }

    /* renamed from: MutableRect-3MmeM6k, reason: not valid java name */
    public static final MutableRect m7967MutableRect3MmeM6k(long j2, float f2) {
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2) - f2;
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new MutableRect(fIntBitsToFloat, Float.intBitsToFloat(i3) - f2, Float.intBitsToFloat(i2) + f2, Float.intBitsToFloat(i3) + f2);
    }

    /* renamed from: MutableRect-tz77jQw, reason: not valid java name */
    public static final MutableRect m7968MutableRecttz77jQw(long j2, long j3) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i3 = (int) (j2 >> 32);
        return new MutableRect(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    public static final Rect toRect(MutableRect mutableRect) {
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
