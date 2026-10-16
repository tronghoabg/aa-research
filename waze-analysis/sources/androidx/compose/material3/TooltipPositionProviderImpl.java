package androidx.compose.material3;

import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TooltipPositionProviderImpl implements PopupPositionProvider {
    private final int tooltipAnchorSpacing;
    private final int type;
    private final long windowContainerSize;

    private TooltipPositionProviderImpl(int i2, int i3, long j2) {
        this.type = i2;
        this.tooltipAnchorSpacing = i3;
        this.windowContainerSize = j2;
    }

    /* renamed from: abovePositioning-uHY26d4, reason: not valid java name */
    public final long m6056abovePositioninguHY26d4(IntRect intRect, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int left = intRect.getLeft() + ((intRect.getWidth() - i2) / 2);
        int i3 = (int) (j3 >> 32);
        if (left < 0) {
            left = intRect.getLeft() - n.h((intRect.getLeft() + i2) - i3, 0);
        } else if (left + i2 > i3) {
            left = n.h(intRect.getRight() - i2, 0);
        }
        int top = (intRect.getTop() - ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - this.tooltipAnchorSpacing;
        if (top < 0) {
            top = intRect.getBottom() + this.tooltipAnchorSpacing;
        }
        return (left << 32) | (top & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: belowPositioning-uHY26d4, reason: not valid java name */
    public final long m6057belowPositioninguHY26d4(IntRect intRect, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int left = intRect.getLeft() + ((intRect.getWidth() - i2) / 2);
        int i3 = (int) (j3 >> 32);
        if (left < 0) {
            left = intRect.getLeft() - n.h((intRect.getLeft() + i2) - i3, 0);
        } else if (left + i2 > i3) {
            left = n.h(intRect.getRight() - i2, 0);
        }
        int bottom = intRect.getBottom() + this.tooltipAnchorSpacing;
        int i4 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (bottom + i4 > ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) {
            bottom = (intRect.getTop() - i4) - this.tooltipAnchorSpacing;
        }
        return (left << 32) | (bottom & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int iM6036getLeftlOKsHw4 = TooltipAnchorPosition.Companion.m6036getLeftlOKsHw4();
        int i2 = this.type;
        if (TooltipAnchorPosition.m6029equalsimpl0(i2, iM6036getLeftlOKsHw4)) {
            return m6061leftPositioninguHY26d4(intRect, j3, this.windowContainerSize);
        }
        if (TooltipAnchorPosition.m6029equalsimpl0(i2, TooltipAnchorPosition.Companion.m6037getRightlOKsHw4())) {
            return m6062rightPositioninguHY26d4(intRect, j3, this.windowContainerSize);
        }
        if (TooltipAnchorPosition.m6029equalsimpl0(i2, TooltipAnchorPosition.Companion.m6033getAbovelOKsHw4())) {
            return m6056abovePositioninguHY26d4(intRect, j3, this.windowContainerSize);
        }
        if (TooltipAnchorPosition.m6029equalsimpl0(i2, TooltipAnchorPosition.Companion.m6034getBelowlOKsHw4())) {
            return m6057belowPositioninguHY26d4(intRect, j3, this.windowContainerSize);
        }
        if (TooltipAnchorPosition.m6029equalsimpl0(i2, TooltipAnchorPosition.Companion.m6038getStartlOKsHw4())) {
            return m6063startPositioning_JLpSYE(layoutDirection, intRect, j3, this.windowContainerSize);
        }
        boolean zM6029equalsimpl0 = TooltipAnchorPosition.m6029equalsimpl0(i2, TooltipAnchorPosition.Companion.m6035getEndlOKsHw4());
        long j4 = this.windowContainerSize;
        return zM6029equalsimpl0 ? m6058endPositioning_JLpSYE(layoutDirection, intRect, j3, j4) : m6056abovePositioninguHY26d4(intRect, j3, j4);
    }

    /* renamed from: endPositioning-_JLpSYE, reason: not valid java name */
    public final long m6058endPositioning_JLpSYE(LayoutDirection layoutDirection, IntRect intRect, long j2, long j3) {
        return layoutDirection == LayoutDirection.Ltr ? m6062rightPositioninguHY26d4(intRect, j2, j3) : m6061leftPositioninguHY26d4(intRect, j2, j3);
    }

    public final int getTooltipAnchorSpacing() {
        return this.tooltipAnchorSpacing;
    }

    /* renamed from: getType-lOKsHw4, reason: not valid java name */
    public final int m6059getTypelOKsHw4() {
        return this.type;
    }

    /* renamed from: getWindowContainerSize-YbymL2g, reason: not valid java name */
    public final long m6060getWindowContainerSizeYbymL2g() {
        return this.windowContainerSize;
    }

    /* renamed from: leftPositioning-uHY26d4, reason: not valid java name */
    public final long m6061leftPositioninguHY26d4(IntRect intRect, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int left = intRect.getLeft() - (this.tooltipAnchorSpacing + i2);
        if (left < 0) {
            left = (intRect.getRight() + this.tooltipAnchorSpacing) - n.h(((intRect.getRight() + this.tooltipAnchorSpacing) + i2) - ((int) (j3 >> 32)), 0);
        }
        return ((((intRect.getTop() + intRect.getBottom()) - ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (left << 32);
    }

    /* renamed from: rightPositioning-uHY26d4, reason: not valid java name */
    public final long m6062rightPositioninguHY26d4(IntRect intRect, long j2, long j3) {
        int right = intRect.getRight() + this.tooltipAnchorSpacing;
        int i2 = (int) (j2 >> 32);
        if (right + i2 > ((int) (j3 >> 32))) {
            right = n.h(intRect.getLeft() - (i2 + this.tooltipAnchorSpacing), 0);
        }
        return ((((intRect.getTop() + intRect.getBottom()) - ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (right << 32);
    }

    /* renamed from: startPositioning-_JLpSYE, reason: not valid java name */
    public final long m6063startPositioning_JLpSYE(LayoutDirection layoutDirection, IntRect intRect, long j2, long j3) {
        return layoutDirection == LayoutDirection.Ltr ? m6061leftPositioninguHY26d4(intRect, j2, j3) : m6062rightPositioninguHY26d4(intRect, j2, j3);
    }

    public /* synthetic */ TooltipPositionProviderImpl(int i2, int i3, long j2, o oVar) {
        this(i2, i3, j2);
    }
}
