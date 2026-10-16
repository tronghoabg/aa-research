package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m3012boximpl(long j2) {
        return new SpanRange(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3013constructorimpl(int i2, int i3) {
        return ((i2 + i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3015equalsimpl(long j2, Object obj) {
        return (obj instanceof SpanRange) && j2 == ((SpanRange) obj).m3022unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3016equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m3017getEndimpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m3018getSizeimpl(long j2) {
        return ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (j2 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m3019getStartimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3020hashCodeimpl(long j2) {
        return SpanRange$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3021toStringimpl(long j2) {
        return "SpanRange(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m3015equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m3020hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3021toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3022unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m3014constructorimpl(long j2) {
        return j2;
    }
}
