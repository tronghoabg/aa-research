package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private static final long Unspecified = androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;

    private /* synthetic */ DpOffset(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m11219boximpl(long j2) {
        return new DpOffset(j2);
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m11221copytPigGR8(long j2, float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m11222copytPigGR8$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m11225getXD9Ej5fM(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m11227getYD9Ej5fM(j2);
        }
        return m11221copytPigGR8(j2, f2, f3);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11223equalsimpl(long j2, Object obj) {
        return (obj instanceof DpOffset) && j2 == ((DpOffset) obj).m11233unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11224equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m11225getXD9Ej5fM(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m11227getYD9Ej5fM(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11229hashCodeimpl(long j2) {
        return DpOffset$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m11230minusCBMgk4(long j2, long j3) {
        float fM11225getXD9Ej5fM = m11225getXD9Ej5fM(j2) - m11225getXD9Ej5fM(j3);
        float fM11227getYD9Ej5fM = m11227getYD9Ej5fM(j2) - m11227getYD9Ej5fM(j3);
        return (Float.floatToRawIntBits(fM11225getXD9Ej5fM) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fM11227getYD9Ej5fM));
    }

    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m11231plusCBMgk4(long j2, long j3) {
        float fM11225getXD9Ej5fM = m11225getXD9Ej5fM(j2) + m11225getXD9Ej5fM(j3);
        float fM11227getYD9Ej5fM = m11227getYD9Ej5fM(j2) + m11227getYD9Ej5fM(j3);
        return (Float.floatToRawIntBits(fM11225getXD9Ej5fM) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fM11227getYD9Ej5fM));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11232toStringimpl(long j2) {
        if (j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.m11175toStringimpl(m11225getXD9Ej5fM(j2))) + ", " + ((Object) Dp.m11175toStringimpl(m11227getYD9Ej5fM(j2))) + ')';
    }

    public boolean equals(Object obj) {
        return m11223equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m11229hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11232toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11233unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m11234getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m11235getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11226getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11228getYD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11220constructorimpl(long j2) {
        return j2;
    }
}
