package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private static final long Unspecified = androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;

    private /* synthetic */ DpSize(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m11250boximpl(long j2) {
        return new DpSize(j2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m11251component1D9Ej5fM(long j2) {
        return m11262getWidthD9Ej5fM(j2);
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m11252component2D9Ej5fM(long j2) {
        return m11260getHeightD9Ej5fM(j2);
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m11254copyDwJknco(long j2, float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m11255copyDwJknco$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m11262getWidthD9Ej5fM(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m11260getHeightD9Ej5fM(j2);
        }
        return m11254copyDwJknco(j2, f2, f3);
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m11257divGh9hcWk(long j2, int i2) {
        float f2 = i2;
        float fM11262getWidthD9Ej5fM = m11262getWidthD9Ej5fM(j2) / f2;
        float fM11260getHeightD9Ej5fM = m11260getHeightD9Ej5fM(j2) / f2;
        return (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32) | (Float.floatToRawIntBits(fM11260getHeightD9Ej5fM) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11258equalsimpl(long j2, Object obj) {
        return (obj instanceof DpSize) && j2 == ((DpSize) obj).m11270unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11259equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m11260getHeightD9Ej5fM(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m11262getWidthD9Ej5fM(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11264hashCodeimpl(long j2) {
        return DpSize$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m11265minuse_xh8Ic(long j2, long j3) {
        float fM11262getWidthD9Ej5fM = m11262getWidthD9Ej5fM(j2) - m11262getWidthD9Ej5fM(j3);
        float fM11260getHeightD9Ej5fM = m11260getHeightD9Ej5fM(j2) - m11260getHeightD9Ej5fM(j3);
        return (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fM11260getHeightD9Ej5fM));
    }

    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m11266pluse_xh8Ic(long j2, long j3) {
        float fM11262getWidthD9Ej5fM = m11262getWidthD9Ej5fM(j2) + m11262getWidthD9Ej5fM(j3);
        float fM11260getHeightD9Ej5fM = m11260getHeightD9Ej5fM(j2) + m11260getHeightD9Ej5fM(j3);
        return (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fM11260getHeightD9Ej5fM));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m11268timesGh9hcWk(long j2, int i2) {
        float f2 = i2;
        float fM11262getWidthD9Ej5fM = m11262getWidthD9Ej5fM(j2) * f2;
        float fM11260getHeightD9Ej5fM = m11260getHeightD9Ej5fM(j2) * f2;
        return (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32) | (Float.floatToRawIntBits(fM11260getHeightD9Ej5fM) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11269toStringimpl(long j2) {
        if (j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.m11175toStringimpl(m11262getWidthD9Ej5fM(j2))) + " x " + ((Object) Dp.m11175toStringimpl(m11260getHeightD9Ej5fM(j2)));
    }

    public boolean equals(Object obj) {
        return m11258equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11264hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11269toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11270unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m11271getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m11272getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11261getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11263getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11253constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m11256divGh9hcWk(long j2, float f2) {
        float fM11262getWidthD9Ej5fM = m11262getWidthD9Ej5fM(j2) / f2;
        float fM11260getHeightD9Ej5fM = m11260getHeightD9Ej5fM(j2) / f2;
        return (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32) | (Float.floatToRawIntBits(fM11260getHeightD9Ej5fM) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m11267timesGh9hcWk(long j2, float f2) {
        float fM11262getWidthD9Ej5fM = m11262getWidthD9Ej5fM(j2) * f2;
        float fM11260getHeightD9Ej5fM = m11260getHeightD9Ej5fM(j2) * f2;
        return (Float.floatToRawIntBits(fM11262getWidthD9Ej5fM) << 32) | (Float.floatToRawIntBits(fM11260getHeightD9Ej5fM) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
