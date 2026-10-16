package androidx.camera.viewfinder.core.impl;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class OffsetF {
    private final long packedOffsets;

    private /* synthetic */ OffsetF(long j2) {
        this.packedOffsets = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OffsetF m1548boximpl(long j2) {
        return new OffsetF(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1550equalsimpl(long j2, Object obj) {
        return (obj instanceof OffsetF) && j2 == ((OffsetF) obj).m1556unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1551equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m1552getXimpl(long j2) {
        return TransformationsKt.unpackFloat1(j2);
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m1553getYimpl(long j2) {
        return TransformationsKt.unpackFloat2(j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1554hashCodeimpl(long j2) {
        return OffsetF$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1555toStringimpl(long j2) {
        return "OffsetF(packedOffsets=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m1550equalsimpl(this.packedOffsets, obj);
    }

    public int hashCode() {
        return m1554hashCodeimpl(this.packedOffsets);
    }

    public String toString() {
        return m1555toStringimpl(this.packedOffsets);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1556unboximpl() {
        return this.packedOffsets;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1549constructorimpl(long j2) {
        return j2;
    }
}
