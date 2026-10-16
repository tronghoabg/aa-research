package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$2 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ State<IntOffset> $animSlideOffsetState;
    final /* synthetic */ long $currentSize;
    final /* synthetic */ l<GraphicsLayerScope, ab> $layerBlock;
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EnterExitTransitionModifierNode$measure$2(EnterExitTransitionModifierNode enterExitTransitionModifierNode, State<IntOffset> state, long j2, long j3, long j4, Placeable placeable, long j5, l<? super GraphicsLayerScope, ab> lVar) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$animSlideOffsetState = state;
        this.$measuredSize = j2;
        this.$target = j3;
        this.$currentSize = j4;
        this.$placeable = placeable;
        this.$offsetDelta = j5;
        this.$layerBlock = lVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        State<IntOffset> state = this.$animSlideOffsetState;
        long jM1810combinedSlidezPqKDFQ = this.this$0.getMutableTransformState().m1810combinedSlidezPqKDFQ(state != null ? state.getValue().m11305unboximpl() : IntOffset.Companion.m11307getZeronOccac(), this.$measuredSize);
        Alignment currentAlignment = this.this$0.getCurrentAlignment();
        long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(currentAlignment != null ? currentAlignment.mo7648alignKFBX0sM(this.$target, this.$currentSize, LayoutDirection.Ltr) : IntOffset.Companion.m11307getZeronOccac(), jM1810combinedSlidezPqKDFQ);
        Placeable placeable = this.$placeable;
        long j2 = this.$offsetDelta;
        placementScope.placeWithLayer(placeable, IntOffset.m11296getXimpl(jM11300plusqkQi6aY) + IntOffset.m11296getXimpl(j2), IntOffset.m11297getYimpl(jM11300plusqkQi6aY) + IntOffset.m11297getYimpl(j2), 0.0f, this.$layerBlock);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
