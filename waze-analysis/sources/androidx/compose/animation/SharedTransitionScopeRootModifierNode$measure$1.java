package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScopeRootModifierNode$measure$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ Placeable $p;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ SharedTransitionScopeRootModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedTransitionScopeRootModifierNode$measure$1(MeasureScope measureScope, SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode, Placeable placeable) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = sharedTransitionScopeRootModifierNode;
        this.$p = placeable;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            boolean zIsLookingAhead = this.$this_measure.isLookingAhead();
            SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode = this.this$0;
            if (zIsLookingAhead) {
                sharedTransitionScopeRootModifierNode.getSharedScope().setLookaheadRoot$animation(coordinates);
            } else {
                sharedTransitionScopeRootModifierNode.getSharedScope().setRoot$animation(coordinates);
            }
        }
        Placeable.PlacementScope.place$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
