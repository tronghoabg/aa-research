package androidx.compose.ui.util;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final long packInts(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    public static final float unpackAbsFloat1(long j2) {
        return Float.intBitsToFloat((int) ((j2 >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackAbsFloat2(long j2) {
        return Float.intBitsToFloat((int) (j2 & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat1(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float unpackFloat2(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    public static final int unpackInt1(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int unpackInt2(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
