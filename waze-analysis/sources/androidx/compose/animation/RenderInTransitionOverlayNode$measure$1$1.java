package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RenderInTransitionOverlayNode$measure$1$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ Placeable $this_run;
    final /* synthetic */ RenderInTransitionOverlayNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RenderInTransitionOverlayNode$measure$1$1(MeasureScope measureScope, RenderInTransitionOverlayNode renderInTransitionOverlayNode, Placeable placeable) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = renderInTransitionOverlayNode;
        this.$this_run = placeable;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        if (!this.$this_measure.isLookingAhead()) {
            if (!this.this$0.getRenderInOverlay().invoke().booleanValue()) {
                this.this$0.setEnabled(false);
            } else if (placementScope.getCoordinates() != null) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = this.this$0;
                renderInTransitionOverlayNode.setEnabled(true);
                renderInTransitionOverlayNode.m1802setPositionInOverlayk4lQ0M(renderInTransitionOverlayNode.getSharedScope().getRoot$animation().mo9744localPositionOfR5De75A(DelegatableNodeKt.requireLayoutCoordinates(renderInTransitionOverlayNode), Offset.Companion.m7996getZeroF1C5BW0()));
            }
        }
        Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
