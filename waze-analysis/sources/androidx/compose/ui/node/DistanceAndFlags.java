package androidx.compose.ui.node;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m9938boximpl(long j2) {
        return new DistanceAndFlags(j2);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m9939compareTo9YPOF3E(long j2, long j3) {
        boolean zM9946isInLayerimpl = m9946isInLayerimpl(j2);
        if (zM9946isInLayerimpl != m9946isInLayerimpl(j3)) {
            return zM9946isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m9943getDistanceimpl(j2), m9943getDistanceimpl(j3)) >= 0.0f && m9945isInExpandedBoundsimpl(j2) != m9945isInExpandedBoundsimpl(j3)) ? m9945isInExpandedBoundsimpl(j2) ? -1 : 1 : (int) Math.signum(m9943getDistanceimpl(j2) - m9943getDistanceimpl(j3));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9941equalsimpl(long j2, Object obj) {
        return (obj instanceof DistanceAndFlags) && j2 == ((DistanceAndFlags) obj).m9948unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9942equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m9943getDistanceimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9944hashCodeimpl(long j2) {
        return DistanceAndFlags$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m9945isInExpandedBoundsimpl(long j2) {
        return (j2 & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m9946isInLayerimpl(long j2) {
        return (j2 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9947toStringimpl(long j2) {
        return "DistanceAndFlags(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m9941equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m9944hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m9947toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m9948unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9940constructorimpl(long j2) {
        return j2;
    }
}
