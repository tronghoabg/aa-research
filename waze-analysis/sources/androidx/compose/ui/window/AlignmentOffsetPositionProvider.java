package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment, long j2) {
        this.alignment = alignment;
        this.offset = j2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long jMo7648alignKFBX0sM = this.alignment.mo7648alignKFBX0sM(IntSize.Companion.m11344getZeroYbymL2g(), intRect.m11323getSizeYbymL2g(), layoutDirection);
        long jM11304unaryMinusnOccac = IntOffset.m11304unaryMinusnOccac(this.alignment.mo7648alignKFBX0sM(IntSize.Companion.m11344getZeroYbymL2g(), j3, layoutDirection));
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(intRect.m11325getTopLeftnOccac(), jMo7648alignKFBX0sM);
        int i2 = layoutDirection == layoutDirection2 ? 1 : -1;
        long j4 = this.offset;
        return IntOffset.m11300plusqkQi6aY(IntOffset.m11300plusqkQi6aY(jM11300plusqkQi6aY, jM11304unaryMinusnOccac), ((IntOffset.m11296getXimpl(j4) * i2) << 32) | (IntOffset.m11297getYimpl(j4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m11419getOffsetnOccac() {
        return this.offset;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j2, o oVar) {
        this(alignment, j2);
    }
}
