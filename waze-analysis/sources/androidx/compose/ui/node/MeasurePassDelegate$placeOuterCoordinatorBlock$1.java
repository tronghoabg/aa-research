package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MeasurePassDelegate$placeOuterCoordinatorBlock$1 extends y implements a<ab> {
    final /* synthetic */ MeasurePassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeasurePassDelegate$placeOuterCoordinatorBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Placeable.PlacementScope placementScope;
        NodeCoordinator wrappedBy$ui = this.this$0.getOuterCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui == null || (placementScope = wrappedBy$ui.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this.this$0.getLayoutNode()).getPlacementScope();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        MeasurePassDelegate measurePassDelegate = this.this$0;
        l<? super GraphicsLayerScope, ab> lVar = measurePassDelegate.placeOuterCoordinatorLayerBlock;
        GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
        if (graphicsLayer != null) {
            placementScope2.m9828placeWithLayeraW9wM(measurePassDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, graphicsLayer, measurePassDelegate.placeOuterCoordinatorZIndex);
        } else if (lVar == null) {
            placementScope2.m9819place70tqf50(measurePassDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
        } else {
            placementScope2.m9827placeWithLayeraW9wM(measurePassDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, lVar);
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
