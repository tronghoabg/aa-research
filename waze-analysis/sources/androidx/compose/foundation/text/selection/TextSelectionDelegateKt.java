package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.media3.muxer.MuxerUtil;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i2, boolean z, boolean z2) {
        int iMax;
        if (z) {
            if (z2) {
                z2 = true;
                if (z) {
                }
            }
        } else {
            iMax = (z && z2) ? i2 : Math.max(i2 - 1, 0);
        }
        return textLayoutResult.getHorizontalPosition(i2, textLayoutResult.getBidiRunDirection(iMax) == textLayoutResult.getParagraphDirection(i2));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i2, boolean z, boolean z2) {
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        float fG = n.g(getHorizontalPosition(textLayoutResult, i2, z, z2), 0.0f, (int) (textLayoutResult.m10517getSizeYbymL2g() >> 32));
        float fG2 = n.g(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fG) << 32) | (Float.floatToRawIntBits(fG2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
