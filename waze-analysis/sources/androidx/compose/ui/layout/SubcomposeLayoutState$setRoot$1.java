package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SubcomposeLayoutState$setRoot$1 extends y implements p<LayoutNode, SubcomposeLayoutState, ab> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        LayoutNodeSubcompositionsState subcompositionsState$ui = layoutNode.getSubcompositionsState$ui();
        if (subcompositionsState$ui == null) {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
            layoutNode.setSubcompositionsState$ui(layoutNodeSubcompositionsState);
            subcompositionsState$ui = layoutNodeSubcompositionsState;
        }
        this.this$0._state = subcompositionsState$ui;
        this.this$0.getState().makeSureStateIsConsistent();
        SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
        subcomposeLayoutState2.getState().setSlotReusePolicy(subcomposeLayoutState2.slotReusePolicy);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        invoke2(layoutNode, subcomposeLayoutState);
        return ab.f48028a;
    }
}
