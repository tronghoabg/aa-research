package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m10713updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int iM10542getLengthimpl;
        int iM10544getMinimpl = TextRange.m10544getMinimpl(j2);
        int iM10543getMaximpl = TextRange.m10543getMaximpl(j2);
        if (TextRange.m10548intersects5zctL8(j3, j2)) {
            if (TextRange.m10536contains5zctL8(j3, j2)) {
                iM10544getMinimpl = TextRange.m10544getMinimpl(j3);
                iM10543getMaximpl = iM10544getMinimpl;
            } else {
                if (TextRange.m10536contains5zctL8(j2, j3)) {
                    iM10542getLengthimpl = TextRange.m10542getLengthimpl(j3);
                } else if (TextRange.m10537containsimpl(j3, iM10544getMinimpl)) {
                    iM10544getMinimpl = TextRange.m10544getMinimpl(j3);
                    iM10542getLengthimpl = TextRange.m10542getLengthimpl(j3);
                } else {
                    iM10543getMaximpl = TextRange.m10544getMinimpl(j3);
                }
                iM10543getMaximpl -= iM10542getLengthimpl;
            }
        } else if (iM10543getMaximpl > TextRange.m10544getMinimpl(j3)) {
            iM10544getMinimpl -= TextRange.m10542getLengthimpl(j3);
            iM10542getLengthimpl = TextRange.m10542getLengthimpl(j3);
            iM10543getMaximpl -= iM10542getLengthimpl;
        }
        return TextRangeKt.TextRange(iM10544getMinimpl, iM10543getMaximpl);
    }
}
