package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.media3.muxer.MuxerUtil;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba A[PHI: r0
  0x00ba: PHI (r0v3 int) = (r0v1 int), (r0v1 int), (r0v6 int), (r0v6 int) binds: [B:23:0x00a6, B:25:0x00ac, B:18:0x008d, B:20:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3847appendSelectableInfoParwq6A(androidx.compose.foundation.text.selection.SelectionLayoutBuilder r16, androidx.compose.ui.text.TextLayoutResult r17, long r18, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegateKt.m3847appendSelectableInfoParwq6A(androidx.compose.foundation.text.selection.SelectionLayoutBuilder, androidx.compose.ui.text.TextLayoutResult, long, long, long):void");
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j2, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j2)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j2, long j3) {
        int iCompare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j2), Long.valueOf(j3));
        return iCompare < 0 ? Direction.BEFORE : iCompare > 0 ? Direction.AFTER : Direction.ON;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m3848getOffsetForPosition3MmeM6k(long j2, TextLayoutResult textLayoutResult) {
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i2) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m10516getOffsetForPositionk4lQ0M(j2);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j2, int i2) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j2));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare <= 0 ? anchorInfo.getOffset() : i2;
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m3849getXDirection3MmeM6k(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        return Float.intBitsToFloat(i2) < rect.getLeft() ? Direction.BEFORE : Float.intBitsToFloat(i2) > rect.getRight() ? Direction.AFTER : Direction.ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m3850getYDirection3MmeM6k(long j2, Rect rect) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return Float.intBitsToFloat(i2) < rect.getTop() ? Direction.BEFORE : Float.intBitsToFloat(i2) > rect.getBottom() ? Direction.AFTER : Direction.ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }
}
