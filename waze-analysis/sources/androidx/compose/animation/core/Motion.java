package androidx.compose.animation.core;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m1897boximpl(long j2) {
        return new Motion(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1899equalsimpl(long j2, Object obj) {
        return (obj instanceof Motion) && j2 == ((Motion) obj).m1905unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1900equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m1901getValueimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m1902getVelocityimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1903hashCodeimpl(long j2) {
        return Motion$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1904toStringimpl(long j2) {
        return "Motion(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m1899equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m1903hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1904toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1905unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1898constructorimpl(long j2) {
        return j2;
    }
}
