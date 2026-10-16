package androidx.compose.foundation.text.selection;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionRegistrarImplKt {
    /* renamed from: inARow-zwwh4xc, reason: not valid java name */
    public static final boolean m3908inARowzwwh4xc(long j2, long j3, long j4, long j5) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i2);
        int i4 = (int) (j2 >> 32);
        int i5 = (int) (j3 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i5) - Float.intBitsToFloat(i4);
        int i6 = (int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i7 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j5);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i7) - Float.intBitsToFloat(i6);
        int i8 = (int) (j4 >> 32);
        int i9 = (int) (j5 >> 32);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i9) - Float.intBitsToFloat(i8);
        float fMax = Math.max(0.0f, Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i7)) - Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i6)));
        float f2 = fIntBitsToFloat * 0.5f;
        float fMax2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i9)) - Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i8)));
        return ((fMax > f2 ? 1 : (fMax == f2 ? 0 : -1)) >= 0 || (fMax > (fIntBitsToFloat3 * 0.5f) ? 1 : (fMax == (fIntBitsToFloat3 * 0.5f) ? 0 : -1)) >= 0) && ((fMax2 > (fIntBitsToFloat2 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat2 * 0.5f) ? 0 : -1)) < 0 && (fMax2 > (fIntBitsToFloat4 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat4 * 0.5f) ? 0 : -1)) < 0);
    }
}
