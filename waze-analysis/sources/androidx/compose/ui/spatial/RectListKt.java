package androidx.compose.ui.spatial;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectListKt {
    public static final int AxisEast = 3;
    public static final int AxisNorth = 0;
    public static final int AxisSouth = 1;
    public static final int AxisWest = 2;
    public static final int BitOffsetForFocusable = 61;
    public static final int BitOffsetForGesturable = 62;
    public static final int BitOffsetForHasCallbacks = 63;
    public static final int BitOffsetForLastChildOffset = 50;
    public static final int BitOffsetForParentId = 25;
    public static final int BitOffsetForUpdated = 60;
    private static final long EverythingButLastChildOffset = -1151795604700004353L;
    private static final long EverythingButParentId = -1125899873288193L;
    public static final int InitialSize = 64;
    public static final int LongsPerItem = 3;
    public static final int Lower10Bits = 1023;
    private static final int Lower25Bits = 33554431;
    private static final int MaxSupportedId = 33554431;
    public static final int MaxSupportedLastChildOffset = 1023;
    public static final int NotFound = -4;
    private static final long PackedIntsHighestBit = -9223372034707292160L;
    private static final long PackedIntsLowestBit = 4294967297L;
    private static final long TombStone = (Math.min(0, 1023) << 50) | 1125899906842623L;

    public static final int distanceScore(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 == 0) {
            return distanceScoreAlongAxis(i4, i10, i5, i3, i9, i7);
        }
        if (i2 == 1) {
            return distanceScoreAlongAxis(i8, i6, i5, i3, i9, i7);
        }
        if (i2 == 2) {
            return distanceScoreAlongAxis(i3, i9, i6, i4, i10, i8);
        }
        if (i2 != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i7, i5, i6, i4, i10, i8);
    }

    public static final int distanceScoreAlongAxis(int i2, int i3, int i4, int i5, int i6, int i7) {
        return ((i2 - i3) + 1) * ((((i4 - i5) + Math.max(i5, i7)) - Math.min(i4, i6)) + 1);
    }

    public static final long getEverythingButLastChildOffset() {
        return EverythingButLastChildOffset;
    }

    public static final long getEverythingButParentId() {
        return EverythingButParentId;
    }

    public static final long getTombStone() {
        return TombStone;
    }

    public static final long metaMarkFlags(long j2, boolean z, boolean z2) {
        return (j2 & (-6917529027641081857L)) | ((z ? 1L : 0L) * 2305843009213693952L) | ((z2 ? 1L : 0L) * SieveCacheKt.NodeVisitedBit);
    }

    public static final long metaMarkUpdated(long j2) {
        return j2 | 1152921504606846976L;
    }

    public static final long metaMarkUpdatedAndHasCallbacks(long j2, boolean z, boolean z2) {
        return (j2 & 8070450532247928831L) | ((z ? 1L : 0L) * 1152921504606846976L) | ((z2 ? 1L : 0L) * Long.MIN_VALUE);
    }

    public static final long metaMarkUpdatedIfHasCallbacks(long j2) {
        return j2 | (((j2 >> 63) & 1) << 60);
    }

    public static final long metaUnMarkUpdated(long j2) {
        return j2 & (-1152921504606846977L);
    }

    public static final long metaWithLastChildOffset(long j2, int i2) {
        return (j2 & getEverythingButLastChildOffset()) | (Math.min(i2, 1023) << 50);
    }

    public static final long metaWithParentId(long j2, int i2) {
        return (j2 & getEverythingButParentId()) | ((i2 & 33554431) << 25);
    }

    public static final long packMeta(int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        long jMin = Math.min(i4, 1023);
        long j2 = z4 ? 1L : 0L;
        long j3 = z3 ? 1L : 0L;
        long j4 = z2 ? 1L : 0L;
        return ((z ? 1L : 0L) << 60) | (j3 << 62) | (j2 << 63) | (j4 << 61) | (jMin << 50) | ((i3 & 33554431) << 25) | (i2 & 33554431);
    }

    public static final long packXY(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    public static final boolean rectIntersectsRect(long j2, long j3, long j4, long j5) {
        return ((((j5 - j2) + (-4294967297L)) | ((j3 - j4) + (-4294967297L))) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z) {
        return z ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j2) {
        return ((int) (j2 >> 61)) & 1;
    }

    public static final int unpackMetaGesturable(long j2) {
        return ((int) (j2 >> 62)) & 1;
    }

    public static final int unpackMetaHasCallbacks(long j2) {
        return ((int) (j2 >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j2) {
        return ((int) (j2 >> 50)) & 1023;
    }

    public static final int unpackMetaParentId(long j2) {
        return ((int) (j2 >> 25)) & 33554431;
    }

    public static final int unpackMetaUpdated(long j2) {
        return ((int) (j2 >> 60)) & 1;
    }

    public static final int unpackMetaValue(long j2) {
        return ((int) j2) & 33554431;
    }

    public static final int unpackX(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int unpackY(long j2) {
        return (int) j2;
    }
}
