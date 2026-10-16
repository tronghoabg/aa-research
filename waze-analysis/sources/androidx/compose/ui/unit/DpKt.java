package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DpKt {
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m11185DpOffsetYgX7TsA(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m11186DpSizeYgX7TsA(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m11187coerceAtLeastYgX7TsA(float f2, float f3) {
        return n.e(f2, f3);
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m11188coerceAtMostYgX7TsA(float f2, float f3) {
        return n.f(f2, f3);
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m11189coerceIn2z7ARbQ(float f2, float f3, float f4) {
        return n.g(f2, f3, f4);
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m11190getCenterEaSLcWc(long j2) {
        float fM11262getWidthD9Ej5fM = DpSize.m11262getWidthD9Ej5fM(j2) / 2.0f;
        float fM11260getHeightD9Ej5fM = DpSize.m11260getHeightD9Ej5fM(j2) / 2.0f;
        return (Float.floatToRawIntBits(fM11260getHeightD9Ej5fM) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32);
    }

    public static final float getDp(double d2) {
        return (float) d2;
    }

    public static final float getHeight(DpRect dpRect) {
        return dpRect.m11246getBottomD9Ej5fM() - dpRect.m11249getTopD9Ej5fM();
    }

    public static final long getSize(DpRect dpRect) {
        return m11186DpSizeYgX7TsA(dpRect.m11248getRightD9Ej5fM() - dpRect.m11247getLeftD9Ej5fM(), dpRect.m11246getBottomD9Ej5fM() - dpRect.m11249getTopD9Ej5fM());
    }

    public static final float getWidth(DpRect dpRect) {
        return dpRect.m11248getRightD9Ej5fM() - dpRect.m11247getLeftD9Ej5fM();
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m11192isFinite0680j_4(float f2) {
        return (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m11194isSpecified0680j_4(float f2) {
        return !Float.isNaN(f2);
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m11196isSpecifiedEaSLcWc(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m11198isSpecifiedjoFl9I(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m11200isUnspecified0680j_4(float f2) {
        return Float.isNaN(f2);
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m11202isUnspecifiedEaSLcWc(long j2) {
        return j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m11204isUnspecifiedjoFl9I(long j2) {
        return j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m11206lerpIDex15A(long j2, long j3, float f2) {
        float fM11207lerpMdfbLM = m11207lerpMdfbLM(DpSize.m11262getWidthD9Ej5fM(j2), DpSize.m11262getWidthD9Ej5fM(j3), f2);
        float fM11207lerpMdfbLM2 = m11207lerpMdfbLM(DpSize.m11260getHeightD9Ej5fM(j2), DpSize.m11260getHeightD9Ej5fM(j3), f2);
        return (Float.floatToRawIntBits(fM11207lerpMdfbLM) << 32) | (Float.floatToRawIntBits(fM11207lerpMdfbLM2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m11207lerpMdfbLM(float f2, float f3, float f4) {
        return MathHelpersKt.lerp(f2, f3, f4);
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m11208lerpxhh869w(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m11225getXD9Ej5fM(j2), DpOffset.m11225getXD9Ej5fM(j3), f2);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m11227getYD9Ej5fM(j2), DpOffset.m11227getYD9Ej5fM(j3), f2);
        return (Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m11209maxYgX7TsA(float f2, float f3) {
        return Math.max(f2, f3);
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m11210minYgX7TsA(float f2, float f3) {
        return Math.min(f2, f3);
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m11211takeOrElseD5KLDUw(float f2, a<Dp> aVar) {
        return !Float.isNaN(f2) ? f2 : aVar.invoke().m11178unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m11212takeOrElsegVKV90s(long j2, a<DpOffset> aVar) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : aVar.invoke().m11233unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m11213takeOrElseitqla9I(long j2, a<DpSize> aVar) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : aVar.invoke().m11270unboximpl();
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m11214times3ABfNKs(double d2, float f2) {
        return ((float) d2) * f2;
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m11217times6HolHcs(float f2, long j2) {
        return DpSize.m11267timesGh9hcWk(j2, f2);
    }

    public static /* synthetic */ void getDp$annotations(float f2) {
    }

    public static final float getDp(float f2) {
        return f2;
    }

    public static /* synthetic */ void getDp$annotations(int i2) {
    }

    public static final float getDp(int i2) {
        return i2;
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m11215times3ABfNKs(float f2, float f3) {
        return f2 * f3;
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m11216times3ABfNKs(int i2, float f2) {
        return i2 * f2;
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m11218times6HolHcs(int i2, long j2) {
        return DpSize.m11268timesGh9hcWk(j2, i2);
    }

    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m11191getCenterEaSLcWc$annotations(long j2) {
    }

    public static /* synthetic */ void getDp$annotations(double d2) {
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m11193isFinite0680j_4$annotations(float f2) {
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m11195isSpecified0680j_4$annotations(float f2) {
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m11197isSpecifiedEaSLcWc$annotations(long j2) {
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m11199isSpecifiedjoFl9I$annotations(long j2) {
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m11201isUnspecified0680j_4$annotations(float f2) {
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m11203isUnspecifiedEaSLcWc$annotations(long j2) {
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m11205isUnspecifiedjoFl9I$annotations(long j2) {
    }
}
