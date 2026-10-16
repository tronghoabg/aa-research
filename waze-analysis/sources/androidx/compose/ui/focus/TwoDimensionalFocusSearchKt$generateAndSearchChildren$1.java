package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends y implements l<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {
    final /* synthetic */ FocusTargetNode $activeNodeBeforeSearch;
    final /* synthetic */ int $direction;
    final /* synthetic */ Rect $focusedItem;
    final /* synthetic */ l<FocusTargetNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, Rect rect, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        super(1);
        this.$activeNodeBeforeSearch = focusTargetNode;
        this.$this_generateAndSearchChildren = focusTargetNode2;
        this.$focusedItem = rect;
        this.$direction = i2;
        this.$onFound = lVar;
    }

    @Override // h.g.a.l
    public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        if (this.$activeNodeBeforeSearch != DelegatableNodeKt.requireOwner(this.$this_generateAndSearchChildren).getFocusOwner().getActiveFocusTargetNode()) {
            return true;
        }
        boolean zM7929searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m7929searchChildren4C6V_qg(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
        Boolean boolValueOf = Boolean.valueOf(zM7929searchChildren4C6V_qg);
        boolValueOf.getClass();
        if (zM7929searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
            return boolValueOf;
        }
        return null;
    }
}
