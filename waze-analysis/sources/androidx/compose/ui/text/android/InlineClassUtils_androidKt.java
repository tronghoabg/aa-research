package androidx.compose.ui.text.android;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InlineClassUtils_androidKt {
    public static final long packInts(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    public static final int unpackInt1(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int unpackInt2(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
