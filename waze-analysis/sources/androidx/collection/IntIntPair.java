package androidx.collection;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m1684boximpl(long j2) {
        return new IntIntPair(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m1685component1impl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m1686component2impl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1687constructorimpl(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1689equalsimpl(long j2, Object obj) {
        return (obj instanceof IntIntPair) && j2 == ((IntIntPair) obj).m1695unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1690equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m1691getFirstimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m1692getSecondimpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1693hashCodeimpl(long j2) {
        return IntIntPair$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1694toStringimpl(long j2) {
        return "(" + m1691getFirstimpl(j2) + ", " + m1692getSecondimpl(j2) + ")";
    }

    public boolean equals(Object obj) {
        return m1689equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1693hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1694toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1695unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1688constructorimpl(long j2) {
        return j2;
    }
}
