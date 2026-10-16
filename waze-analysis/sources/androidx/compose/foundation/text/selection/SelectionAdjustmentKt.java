package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextRange;
import h.f;
import h.g;
import h.g.a.a;
import h.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z, false, selectionLayout.getEndSlot(), boundaryFunction), z);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z, boolean z2, int i2, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z2 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i2 != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long jMo3844getBoundaryfzxv0v0 = boundaryFunction.mo3844getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z ^ z2 ? TextRange.m10546getStartimpl(jMo3844getBoundaryfzxv0v0) : TextRange.m10541getEndimpl(jMo3844getBoundaryfzxv0v0));
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i2) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i2), i2, 0L, 4, null);
    }

    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || selectionLayout.getCurrentInfo().getInputText().length() == 0) ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int iFindFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindFollowingBreak), null, true, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindFollowingBreak), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iFindPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindPrecedingBreak), null, false, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindPrecedingBreak), true, 1, null);
        }
        Selection previousSelection = selectionLayout.getPreviousSelection();
        boolean z = previousSelection != null && previousSelection.getHandlesCrossed();
        int iFindPrecedingBreak2 = selectionLayout.isStartHandle() ^ z ? StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset) : StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindPrecedingBreak2), null, z, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindPrecedingBreak2), z, 1, null);
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i2, boolean z) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i2 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED)) {
            if (i2 < selectableInfo.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i2 > selectableInfo.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i2, int i3, int i4, boolean z, boolean z2) {
        long jM10518getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m10518getWordBoundaryjx7JFs(i3);
        int iM10546getStartimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m10546getStartimpl(jM10518getWordBoundaryjx7JFs)) == i2 ? TextRange.m10546getStartimpl(jM10518getWordBoundaryjx7JFs) : i2 >= selectableInfo.getTextLayoutResult().getLineCount() ? selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1) : selectableInfo.getTextLayoutResult().getLineStart(i2);
        int iM10541getEndimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m10541getEndimpl(jM10518getWordBoundaryjx7JFs)) == i2 ? TextRange.m10541getEndimpl(jM10518getWordBoundaryjx7JFs) : i2 >= selectableInfo.getTextLayoutResult().getLineCount() ? selectableInfo.getTextLayoutResult().getLineEnd(selectableInfo.getTextLayoutResult().getLineCount() - 1, false & ((2 & 2) == 0)) : selectableInfo.getTextLayoutResult().getLineEnd(i2, false & ((2 & 2) == 0));
        if (iM10546getStartimpl == i4) {
            return selectableInfo.anchorForOffset(iM10541getEndimpl);
        }
        if (iM10541getEndimpl == i4) {
            return selectableInfo.anchorForOffset(iM10546getStartimpl);
        }
        if (!(z ^ z2) ? i3 >= iM10546getStartimpl : i3 > iM10541getEndimpl) {
            iM10546getStartimpl = iM10541getEndimpl;
        }
        return selectableInfo.anchorForOffset(iM10546getStartimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.isStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        h hVar = h.f48132c;
        final f fVarB = g.b(hVar, new a() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(selectableInfo.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        f fVarB2 = g.b(hVar, new a() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                SelectableInfo selectableInfo2 = selectableInfo;
                int i2 = rawStartHandleOffset;
                int i3 = rawEndHandleOffset;
                SelectionLayout selectionLayout2 = selectionLayout;
                return SelectionAdjustmentKt.snapToWordBoundary(selectableInfo2, SelectionAdjustmentKt.updateSelectionBoundary$lambda$1(fVarB), i2, i3, selectionLayout2.isStartHandle(), selectionLayout2.getCrossStatus() == CrossStatus.CROSSED);
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$3(fVarB2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$1(fVarB) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$3(fVarB2);
        }
        int offset = anchorInfo.getOffset();
        long jM10518getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m10518getWordBoundaryjx7JFs(offset);
        return !isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.isStartHandle()) ? selectableInfo.anchorForOffset(rawStartHandleOffset) : (offset == TextRange.m10546getStartimpl(jM10518getWordBoundaryjx7JFs) || offset == TextRange.m10541getEndimpl(jM10518getWordBoundaryjx7JFs)) ? updateSelectionBoundary$lambda$3(fVarB2) : selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    private static final int updateSelectionBoundary$lambda$1(f<Integer> fVar) {
        return fVar.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$3(f<Selection.AnchorInfo> fVar) {
        return fVar.getValue();
    }
}
