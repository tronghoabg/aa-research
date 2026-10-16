package androidx.compose.foundation.text.input.internal;

import androidx.collection.SieveCacheKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntervalKt {
    private static final long FLAG1_MASK = Long.MIN_VALUE;
    private static final long FLAG2_MASK = 2147483648L;
    private static final long INT1_MASK = 9223372032559808512L;
    private static final long INT2_MASK = 2147483647L;

    /* renamed from: overlaps-NFQVc3s, reason: not valid java name */
    public static final boolean m3634overlapsNFQVc3s(long j2, int i2, int i3) {
        return IntIntervalTreeKt.intersect(i2, i3, Interval.m3618getStartimpl(j2), Interval.m3615getEndimpl(j2));
    }

    public static final long packFlag1(long j2, boolean z) {
        return z ? j2 | Long.MIN_VALUE : j2 & Long.MAX_VALUE;
    }

    public static final long packFlag2(long j2, boolean z) {
        return z ? j2 | FLAG2_MASK : j2 & (-2147483649L);
    }

    public static final long packValue1(long j2, int i2) {
        return (j2 & (-9223372032559808513L)) | ((i2 << 32) & INT1_MASK);
    }

    public static final long packValue2(long j2, int i2) {
        return (j2 & SieveCacheKt.NodeMetaAndPreviousMask) | i2;
    }

    public static final long packValuesAndFlags(boolean z, int i2, boolean z2, int i3) {
        long j2 = i2 << 32;
        long j3 = z ? Long.MIN_VALUE | j2 : Long.MAX_VALUE & j2;
        long j4 = i3 & 2147483647L;
        if (z2) {
            j4 |= FLAG2_MASK;
        }
        return j3 | j4;
    }

    public static final boolean unpackFlag1(long j2) {
        return (j2 & Long.MIN_VALUE) != 0;
    }

    public static final boolean unpackFlag2(long j2) {
        return (j2 & FLAG2_MASK) != 0;
    }

    public static final int unpackValue1(long j2) {
        return (int) ((j2 & INT1_MASK) >>> 32);
    }

    public static final int unpackValue2(long j2) {
        return (int) (j2 & 2147483647L);
    }
}
