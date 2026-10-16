package androidx.collection;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SieveCacheKt {
    public static final long EmptyNode = 4611686018427387903L;
    private static final long[] EmptyNodes = new long[0];
    public static final long InvalidMapping = 9223372034707292159L;
    public static final int InvalidMappingLink = Integer.MAX_VALUE;
    private static final long MaxSize = 2147483646;
    public static final int NodeInvalidLink = Integer.MAX_VALUE;
    public static final long NodeLinkMask = 2147483647L;
    public static final long NodeLinksMask = 4611686018427387903L;
    public static final long NodeMetaAndNextMask = -4611686016279904257L;
    public static final long NodeMetaAndPreviousMask = -2147483648L;
    public static final long NodeMetaMask = -4611686018427387904L;
    public static final long NodeVisitedBit = 4611686018427387904L;

    public static final long clearVisitedBit(long j2) {
        return j2 & 4611686018427387903L;
    }

    public static final long createDstMapping(long j2, int i2) {
        return (j2 & (-4294967296L)) | i2;
    }

    public static final long createLinkToNext(int i2) {
        return (i2 & NodeLinkMask) | 4611686016279904256L;
    }

    public static final long createLinks(long j2, int i2, int i3, long[] jArr) {
        x.f(jArr, "mapping");
        return (((j2 & NodeMetaMask) | (i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i2] & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) << 31) | (i3 != Integer.MAX_VALUE ? (int) (jArr[i3] & MuxerUtil.UNSIGNED_INT_MAX_VALUE) : Integer.MAX_VALUE);
    }

    public static final long createMapping(int i2, int i3) {
        return i3 | (i2 << 32);
    }

    public static final long createSrcMapping(long j2, int i2) {
        return (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    public static final long eraseSrcMapping(long j2) {
        return (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (-4294967296L);
    }

    public static final int getDst(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final long[] getEmptyNodes() {
        return EmptyNodes;
    }

    public static final int getNextNode(long j2) {
        return (int) (j2 & NodeLinkMask);
    }

    public static final int getPreviousNode(long j2) {
        return (int) ((j2 >> 31) & NodeLinkMask);
    }

    public static final int getSrc(long j2) {
        return (int) ((j2 >> 32) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final int getVisited(long j2) {
        return (int) ((j2 >> 62) & 1);
    }

    public static final long setLinkToNext(long j2, int i2) {
        return (j2 & NodeMetaAndPreviousMask) | (i2 & NodeLinkMask);
    }

    public static final long setLinkToPrevious(long j2, int i2) {
        return (j2 & NodeMetaAndNextMask) | ((i2 & NodeLinkMask) << 31);
    }

    public static /* synthetic */ void getNodeInvalidLink$annotations() {
    }

    public static /* synthetic */ void getNodeLinkMask$annotations() {
    }

    public static /* synthetic */ void getNextNode$annotations(long j2) {
    }

    public static /* synthetic */ void getPreviousNode$annotations(long j2) {
    }

    public static final long createLinks(long j2, int i2, int i3, int[] iArr) {
        x.f(iArr, "mapping");
        return (((j2 & NodeMetaMask) | (i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i2])) << 31) | (i3 != Integer.MAX_VALUE ? iArr[i3] : Integer.MAX_VALUE);
    }
}
