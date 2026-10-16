package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import h.ab;
import h.g.a.l;
import h.g.b.am;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m3874getTextFieldSelectionLayoutRcvTLA(TextLayoutResult textLayoutResult, int i2, int i3, int i4, long j2, boolean z, boolean z2) {
        return new SingleSelectionLayout(z2, 1, 1, z ? null : new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m10546getStartimpl(j2)), TextRange.m10546getStartimpl(j2), 1L), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m10541getEndimpl(j2)), TextRange.m10541getEndimpl(j2), 1L), TextRange.m10545getReversedimpl(j2)), new SelectableInfo(1L, 1, i2, i3, i4, textLayoutResult));
    }

    public static final boolean isCollapsed(Selection selection, SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final am amVar = new am();
        amVar.f48101a = true;
        selectionLayout.forEachMiddleInfo(new l() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionLayoutKt.isCollapsed$lambda$0(amVar, (SelectableInfo) obj);
            }
        });
        return amVar.f48101a;
    }

    static final ab isCollapsed$lambda$0(am amVar, SelectableInfo selectableInfo) {
        if (selectableInfo.getInputText().length() > 0) {
            amVar.f48101a = false;
        }
        return ab.f48028a;
    }

    public static final Direction resolve2dDirection(Direction direction, Direction direction2) {
        Direction direction3 = Direction.BEFORE;
        int iOrdinal = direction2.ordinal();
        if (iOrdinal == 0) {
            return Direction.BEFORE;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Direction.AFTER;
            }
            throw new i();
        }
        int iOrdinal2 = direction.ordinal();
        if (iOrdinal2 == 0) {
            return Direction.BEFORE;
        }
        if (iOrdinal2 == 1) {
            return Direction.ON;
        }
        if (iOrdinal2 == 2) {
            return Direction.AFTER;
        }
        throw new i();
    }
}
