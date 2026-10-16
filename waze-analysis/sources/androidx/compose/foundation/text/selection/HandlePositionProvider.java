package androidx.compose.foundation.text.selection;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment handleReferencePoint;
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m7996getZeroF1C5BW0();

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long jMo3222provideF1C5BW0 = this.positionProvider.mo3222provideF1C5BW0();
        if ((9223372034707292159L & jMo3222provideF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jMo3222provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = jMo3222provideF1C5BW0;
        return IntOffset.m11300plusqkQi6aY(IntOffset.m11300plusqkQi6aY(intRect.m11325getTopLeftnOccac(), IntOffsetKt.m11313roundk4lQ0M(jMo3222provideF1C5BW0)), this.handleReferencePoint.mo7648alignKFBX0sM(j3, IntSize.Companion.m11344getZeroYbymL2g(), layoutDirection));
    }
}
