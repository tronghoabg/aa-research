package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadPassDelegate$layoutModifierBlock$1 extends y implements a<ab> {
    final /* synthetic */ LookaheadPassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookaheadPassDelegate$layoutModifierBlock$1(LookaheadPassDelegate lookaheadPassDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LookaheadDelegate lookaheadDelegate;
        Placeable.PlacementScope placementScope = null;
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.this$0.getLayoutNode()) || this.this$0.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui()) {
            NodeCoordinator wrappedBy$ui = this.this$0.getOuterCoordinator().getWrappedBy$ui();
            if (wrappedBy$ui != null) {
                placementScope = wrappedBy$ui.getPlacementScope();
            }
        } else {
            NodeCoordinator wrappedBy$ui2 = this.this$0.getOuterCoordinator().getWrappedBy$ui();
            if (wrappedBy$ui2 != null && (lookaheadDelegate = wrappedBy$ui2.getLookaheadDelegate()) != null) {
                placementScope = lookaheadDelegate.getPlacementScope();
            }
        }
        if (placementScope == null) {
            placementScope = LayoutNodeKt.requireOwner(this.this$0.getLayoutNode()).getPlacementScope();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
        LookaheadDelegate lookaheadDelegate2 = lookaheadPassDelegate.getOuterCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate2 == null) {
            x.g();
        }
        Placeable.PlacementScope.m9813place70tqf50$default(placementScope2, lookaheadDelegate2, lookaheadPassDelegate.lastPosition, 0.0f, 2, null);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
