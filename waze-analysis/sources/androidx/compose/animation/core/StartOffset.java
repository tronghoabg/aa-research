package androidx.compose.animation.core;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m1908boximpl(long j2) {
        return new StartOffset(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1909constructorimpl(int i2, int i3) {
        return i2 * i3;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m1911constructorimpl$default(int i2, int i3, int i4, o oVar) {
        if ((i4 & 2) != 0) {
            i3 = StartOffsetType.Companion.m1926getDelayEo1U57Q();
        }
        return m1909constructorimpl(i2, i3);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1912equalsimpl(long j2, Object obj) {
        return (obj instanceof StartOffset) && j2 == ((StartOffset) obj).m1918unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1913equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m1914getOffsetMillisimpl(long j2) {
        return Math.abs((int) j2);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m1915getOffsetTypeEo1U57Q(long j2) {
        return j2 > 0 ? StartOffsetType.Companion.m1927getFastForwardEo1U57Q() : StartOffsetType.Companion.m1926getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1916hashCodeimpl(long j2) {
        return StartOffset$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1917toStringimpl(long j2) {
        return "StartOffset(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m1912equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1916hashCodeimpl(this.value);
    }

    public String toString() {
        return m1917toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1918unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m1910constructorimpl(long j2) {
        return j2;
    }
}
