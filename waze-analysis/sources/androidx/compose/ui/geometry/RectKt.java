package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectKt {
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m8018Rect0a9Yr6o(long j2, long j3) {
        int i2 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new Rect(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2));
    }

    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m8019Rect3MmeM6k(long j2, float f2) {
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2) - f2;
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new Rect(fIntBitsToFloat, Float.intBitsToFloat(i3) - f2, Float.intBitsToFloat(i2) + f2, Float.intBitsToFloat(i3) + f2);
    }

    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m8020Recttz77jQw(long j2, long j3) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i3 = (int) (j2 >> 32);
        return new Rect(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    public static final Rect lerp(Rect rect, Rect rect2, float f2) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f2), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f2), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f2), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f2));
    }
}
