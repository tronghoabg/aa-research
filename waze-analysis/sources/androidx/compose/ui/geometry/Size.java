package androidx.compose.ui.geometry;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private static final long Unspecified = InlineClassHelperKt.UnspecifiedPackedFloats;

    private /* synthetic */ Size(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m8037boximpl(long j2) {
        return new Size(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m8038component1impl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m8039component2impl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m8041copyxjbvk4A(long j2, float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m8042copyxjbvk4A$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        return m8041copyxjbvk4A(j2, f2, f3);
    }

    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m8043div7Ah8Wj8(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8044equalsimpl(long j2, Object obj) {
        return (obj instanceof Size) && j2 == ((Size) obj).m8054unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8045equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m8046getHeightimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m8047getMaxDimensionimpl(long j2) {
        return Math.max(Float.intBitsToFloat((int) ((j2 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j2 & SieveCacheKt.NodeLinkMask)));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m8048getMinDimensionimpl(long j2) {
        return Math.min(Float.intBitsToFloat((int) ((j2 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j2 & SieveCacheKt.NodeLinkMask)));
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m8049getWidthimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8050hashCodeimpl(long j2) {
        return Size$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m8051isEmptyimpl(long j2) {
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        return (fIntBitsToFloat <= 0.0f) | (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) | (fIntBitsToFloat2 <= 0.0f);
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m8052times7Ah8Wj8(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8053toStringimpl(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j2 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m8044equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m8050hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8053toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8054unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m8057getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m8058getZeroNHjbRc() {
            return Size.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8055getUnspecifiedNHjbRc$annotations() {
        }

        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8056getZeroNHjbRc$annotations() {
        }
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8040constructorimpl(long j2) {
        return j2;
    }
}
