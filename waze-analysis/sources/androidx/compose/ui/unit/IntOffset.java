package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class IntOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private static final long Max = 9223372034707292159L;

    private /* synthetic */ IntOffset(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m11287boximpl(long j2) {
        return new IntOffset(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m11288component1impl(long j2) {
        return m11296getXimpl(j2);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m11289component2impl(long j2) {
        return m11297getYimpl(j2);
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m11291copyiSbpLlY(long j2, int i2, int i3) {
        return (i2 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m11292copyiSbpLlY$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = (int) (j2 >> 32);
        }
        if ((i4 & 2) != 0) {
            i3 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        }
        return m11291copyiSbpLlY(j2, i2, i3);
    }

    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m11293divBjo55l4(long j2, float f2) {
        return (Math.round(((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.round(((int) (j2 >> 32)) / f2) << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11294equalsimpl(long j2, Object obj) {
        return (obj instanceof IntOffset) && j2 == ((IntOffset) obj).m11305unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11295equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m11296getXimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m11297getYimpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11298hashCodeimpl(long j2) {
        return IntOffset$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m11299minusqkQi6aY(long j2, long j3) {
        return ((((int) (j2 >> 32)) - ((int) (j3 >> 32))) << 32) | ((((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m11300plusqkQi6aY(long j2, long j3) {
        return ((((int) (j2 >> 32)) + ((int) (j3 >> 32))) << 32) | ((((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m11301remBjo55l4(long j2, int i2) {
        return ((((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) % i2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((((int) (j2 >> 32)) % i2) << 32);
    }

    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m11302timesBjo55l4(long j2, float f2) {
        return (Math.round(((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.round(((int) (j2 >> 32)) * f2) << 32);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11303toStringimpl(long j2) {
        return "(" + m11296getXimpl(j2) + ", " + m11297getYimpl(j2) + ')';
    }

    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m11304unaryMinusnOccac(long j2) {
        return ((-((int) (j2 >> 32))) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & (-((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
    }

    public boolean equals(Object obj) {
        return m11294equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m11298hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11303toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11305unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m11306getMaxnOccac() {
            return IntOffset.Max;
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m11307getZeronOccac() {
            return IntOffset.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11290constructorimpl(long j2) {
        return j2;
    }
}
