package androidx.compose.foundation.lazy.grid;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m2895boximpl(long j2) {
        return new GridItemSpan(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2897equalsimpl(long j2, Object obj) {
        return (obj instanceof GridItemSpan) && j2 == ((GridItemSpan) obj).m2902unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2898equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m2899getCurrentLineSpanimpl(long j2) {
        return (int) j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2900hashCodeimpl(long j2) {
        return GridItemSpan$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2901toStringimpl(long j2) {
        return "GridItemSpan(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m2897equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2900hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2901toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2902unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2896constructorimpl(long j2) {
        return j2;
    }
}
