package androidx.compose.foundation.text.input.internal;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Interval {
    public static final Companion Companion = new Companion(null);
    private static final long Invalid = m3612constructorimpl$default(Integer.MAX_VALUE, 0, false, false, 12, null);
    private final long packed;

    private /* synthetic */ Interval(long j2) {
        this.packed = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Interval m3609boximpl(long j2) {
        return new Interval(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3610constructorimpl(int i2, int i3, boolean z, boolean z2) {
        return IntervalKt.packValuesAndFlags(z, i2, z2, i3);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m3612constructorimpl$default(int i2, int i3, boolean z, boolean z2, int i4, o oVar) {
        return m3610constructorimpl(i2, i3, z & ((i4 & 4) == 0), z2 & ((i4 & 8) == 0));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3613equalsimpl(long j2, Object obj) {
        return (obj instanceof Interval) && j2 == ((Interval) obj).m3621unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3614equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m3615getEndimpl(long j2) {
        return IntervalKt.unpackValue2(j2);
    }

    /* renamed from: getFlag1-impl, reason: not valid java name */
    public static final boolean m3616getFlag1impl(long j2) {
        return IntervalKt.unpackFlag1(j2);
    }

    /* renamed from: getFlag2-impl, reason: not valid java name */
    public static final boolean m3617getFlag2impl(long j2) {
        return IntervalKt.unpackFlag2(j2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m3618getStartimpl(long j2) {
        return IntervalKt.unpackValue1(j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3619hashCodeimpl(long j2) {
        return Interval$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3620toStringimpl(long j2) {
        return "Interval(packed=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m3613equalsimpl(this.packed, obj);
    }

    public final long getPacked() {
        return this.packed;
    }

    public int hashCode() {
        return m3619hashCodeimpl(this.packed);
    }

    public String toString() {
        return m3620toStringimpl(this.packed);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3621unboximpl() {
        return this.packed;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getInvalid-7D3R4FY, reason: not valid java name */
        public final long m3622getInvalid7D3R4FY() {
            return Interval.Invalid;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3611constructorimpl(long j2) {
        return j2;
    }
}
