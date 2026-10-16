package androidx.camera.viewfinder.core.impl;

import android.graphics.RectF;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TransformationsKt {
    private static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static final long OffsetF(float f2, float f3) {
        return packFloats(f2, f3);
    }

    public static final long ScaleFactorF(float f2, float f3) {
        return packFloats(f2, f3);
    }

    private static final float floatFromBits(int i2) {
        return Float.intBitsToFloat(i2);
    }

    private static final long packFloats(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float unpackFloat1(long j2) {
        return floatFromBits((int) (j2 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float unpackFloat2(long j2) {
        return floatFromBits((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }
}
