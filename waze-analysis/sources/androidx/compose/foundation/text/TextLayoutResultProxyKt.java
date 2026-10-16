package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m3428coerceIn3MmeM6k(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        float left = Float.intBitsToFloat(i2) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i2) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return (Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i3) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i3)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
