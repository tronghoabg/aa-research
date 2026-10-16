package androidx.compose.ui.layout;

import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    public static final long ScaleFactor(float f2, float f3) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        ScaleFactor.Companion companion = ScaleFactor.Companion;
        return (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
    }

    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m9871divUQTWf7w(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m9872isSpecifiedFK8aYYs(long j2) {
        return j2 != ScaleFactor.Companion.m9870getUnspecified_hLwfpc();
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m9874isUnspecifiedFK8aYYs(long j2) {
        return j2 == ScaleFactor.Companion.m9870getUnspecified_hLwfpc();
    }

    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m9876lerpbDIf60(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), f2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fLerp);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fLerp2);
        ScaleFactor.Companion companion = ScaleFactor.Companion;
        return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m9877takeOrElseoyDd2qo(long j2, h.g.a.a<ScaleFactor> aVar) {
        return j2 != ScaleFactor.Companion.m9870getUnspecified_hLwfpc() ? j2 : aVar.invoke().m9868unboximpl();
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m9878timesUQTWf7w(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m9879timesmw2e94(long j2, long j3) {
        return m9878timesUQTWf7w(j3, j2);
    }

    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m9873isSpecifiedFK8aYYs$annotations(long j2) {
    }

    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m9875isUnspecifiedFK8aYYs$annotations(long j2) {
    }
}
