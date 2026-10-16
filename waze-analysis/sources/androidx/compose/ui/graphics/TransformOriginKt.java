package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.TransformOrigin;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformOriginKt {
    public static final long TransformOrigin(float f2, float f3) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        TransformOrigin.Companion companion = TransformOrigin.Companion;
        return (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
    }
}
