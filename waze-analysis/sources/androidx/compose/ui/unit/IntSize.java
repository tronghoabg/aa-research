package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private final long packedValue;

    private /* synthetic */ IntSize(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m11331boximpl(long j2) {
        return new IntSize(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m11332component1impl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m11333component2impl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m11335divYEO4UFw(long j2, int i2) {
        return ((((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / i2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((((int) (j2 >> 32)) / i2) << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11336equalsimpl(long j2, Object obj) {
        return (obj instanceof IntSize) && j2 == ((IntSize) obj).m11343unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11337equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m11338getHeightimpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m11339getWidthimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11340hashCodeimpl(long j2) {
        return IntSize$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m11341timesYEO4UFw(long j2, int i2) {
        return ((((int) (j2 >> 32)) * i2) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & (((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * i2));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11342toStringimpl(long j2) {
        return ((int) (j2 >> 32)) + " x " + ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    public boolean equals(Object obj) {
        return m11336equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m11340hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11342toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11343unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m11344getZeroYbymL2g() {
            return IntSize.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11334constructorimpl(long j2) {
        return j2;
    }
}
