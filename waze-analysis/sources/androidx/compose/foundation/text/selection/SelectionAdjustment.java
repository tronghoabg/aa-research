package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SelectionAdjustment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
            }
        };
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                return SelectionAdjustmentKt.ensureAtLeastOneChar(SelectionAdjustment.Companion.None.adjust(selectionLayout), selectionLayout);
            }
        };
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda2
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                return SelectionAdjustmentKt.adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                    @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                    /* renamed from: getBoundary-fzxv0v0 */
                    public final long mo3844getBoundaryfzxv0v0(SelectableInfo selectableInfo, int i2) {
                        return selectableInfo.getTextLayoutResult().m10518getWordBoundaryjx7JFs(i2);
                    }
                });
            }
        };
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda3
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                return SelectionAdjustmentKt.adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                    @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                    /* renamed from: getBoundary-fzxv0v0 */
                    public final long mo3844getBoundaryfzxv0v0(SelectableInfo selectableInfo, int i2) {
                        return StringHelpersKt.getParagraphBoundary(selectableInfo.getInputText(), i2);
                    }
                });
            }
        };
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda4
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
            }
        };

        private Companion() {
        }

        static final Selection CharacterWithWordAccelerate$lambda$0(SelectionLayout selectionLayout) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo anchorInfoUpdateSelectionBoundary;
            Selection.AnchorInfo start;
            Selection.AnchorInfo end2;
            Selection previousSelection = selectionLayout.getPreviousSelection();
            if (previousSelection == null) {
                return Word.adjust(selectionLayout);
            }
            if (selectionLayout.isStartHandle()) {
                end = previousSelection.getStart();
                anchorInfoUpdateSelectionBoundary = SelectionAdjustmentKt.updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), end);
                end2 = previousSelection.getEnd();
                start = anchorInfoUpdateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                anchorInfoUpdateSelectionBoundary = SelectionAdjustmentKt.updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), end);
                start = previousSelection.getStart();
                end2 = anchorInfoUpdateSelectionBoundary;
            }
            if (x.n(anchorInfoUpdateSelectionBoundary, end)) {
                return previousSelection;
            }
            boolean z = true;
            if (selectionLayout.getCrossStatus() != CrossStatus.CROSSED && (selectionLayout.getCrossStatus() != CrossStatus.COLLAPSED || start.getOffset() <= end2.getOffset())) {
                z = false;
            }
            return SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(start, end2, z), selectionLayout);
        }

        static final Selection None$lambda$0(SelectionLayout selectionLayout) {
            return new Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().getRawStartHandleOffset()), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().getRawEndHandleOffset()), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
        }

        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        public final SelectionAdjustment getNone() {
            return None;
        }

        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    Selection adjust(SelectionLayout selectionLayout);
}
