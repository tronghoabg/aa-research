package androidx.compose.runtime.composer.linkbuffer;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GroupHandleKt {
    public static final long NULL_GROUP_HANDLE = -1;

    public static final int getContext(long j2) {
        return (int) (j2 >>> 32);
    }

    public static final int getGroup(long j2) {
        return (int) j2;
    }

    public static final long makeGroupHandle(int i2, int i3, int i4) {
        long j2;
        long j3;
        if (i4 >= 0) {
            j2 = i3 << 32;
            j3 = i4;
        } else {
            j2 = i2 << 32;
            j3 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        }
        return j2 | j3;
    }

    public static final long makeGroupHandle(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }
}
