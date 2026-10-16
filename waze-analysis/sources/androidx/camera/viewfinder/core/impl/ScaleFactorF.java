package androidx.camera.viewfinder.core.impl;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class ScaleFactorF {
    private final long packedScales;

    private /* synthetic */ ScaleFactorF(long j2) {
        this.packedScales = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactorF m1558boximpl(long j2) {
        return new ScaleFactorF(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1560equalsimpl(long j2, Object obj) {
        return (obj instanceof ScaleFactorF) && j2 == ((ScaleFactorF) obj).m1566unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1561equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m1562getScaleXimpl(long j2) {
        return TransformationsKt.unpackFloat1(j2);
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m1563getScaleYimpl(long j2) {
        return TransformationsKt.unpackFloat2(j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1564hashCodeimpl(long j2) {
        return ScaleFactorF$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1565toStringimpl(long j2) {
        return "ScaleFactorF(packedScales=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m1560equalsimpl(this.packedScales, obj);
    }

    public int hashCode() {
        return m1564hashCodeimpl(this.packedScales);
    }

    public String toString() {
        return m1565toStringimpl(this.packedScales);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1566unboximpl() {
        return this.packedScales;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1559constructorimpl(long j2) {
        return j2;
    }
}
