package androidx.compose.ui.graphics;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GradientColorLongVerifier {
    public static final GradientColorLongVerifier INSTANCE = new GradientColorLongVerifier();

    private GradientColorLongVerifier() {
    }

    /* renamed from: createLinearGradientColorLong-VjE6UOU, reason: not valid java name */
    public final android.graphics.LinearGradient m8376createLinearGradientColorLongVjE6UOU(long j2, long j3, long[] jArr, float[] fArr, int i2) {
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3), jArr, fArr, AndroidTileMode_androidKt.m8131toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: createRadialGradientColorLong-8uybcMk, reason: not valid java name */
    public final android.graphics.RadialGradient m8377createRadialGradientColorLong8uybcMk(long j2, float f2, long[] jArr, float[] fArr, int i2) {
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), f2, jArr, fArr, AndroidTileMode_androidKt.m8131toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: createSweepGradientColorLong-9KIMszo, reason: not valid java name */
    public final android.graphics.SweepGradient m8378createSweepGradientColorLong9KIMszo(long j2, long[] jArr, float[] fArr) {
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), jArr, fArr);
    }
}
