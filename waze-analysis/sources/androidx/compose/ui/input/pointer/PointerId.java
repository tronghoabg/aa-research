package androidx.compose.ui.input.pointer;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m9584boximpl(long j2) {
        return new PointerId(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9586equalsimpl(long j2, Object obj) {
        return (obj instanceof PointerId) && j2 == ((PointerId) obj).m9590unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9587equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9588hashCodeimpl(long j2) {
        return PointerId$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9589toStringimpl(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m9586equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m9588hashCodeimpl(this.value);
    }

    public String toString() {
        return m9589toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m9590unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9585constructorimpl(long j2) {
        return j2;
    }
}
