package androidx.camera.camera2.pipe.core;

import h.g.a;
import h.o.c;
import h.o.d;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class TimestampNs {
    private final long value;

    private /* synthetic */ TimestampNs(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimestampNs m1120boximpl(long j2) {
        return new TimestampNs(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1122equalsimpl(long j2, Object obj) {
        return (obj instanceof TimestampNs) && j2 == ((TimestampNs) obj).m1128unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1123equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1124hashCodeimpl(long j2) {
        return TimestampNs$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: minus-sWBZAkE, reason: not valid java name */
    public static final long m1125minussWBZAkE(long j2, long j3) {
        c cVar = h.o.a.f48264a;
        return c.j(j2 - j3, d.f48270a);
    }

    /* renamed from: plus-EjltJFA, reason: not valid java name */
    public static final long m1126plusEjltJFA(long j2, long j3) {
        return j2 + h.o.a.o(j3);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1127toStringimpl(long j2) {
        return "TimestampNs(value=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m1122equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1124hashCodeimpl(this.value);
    }

    public String toString() {
        return m1127toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1128unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1121constructorimpl(long j2) {
        return j2;
    }
}
