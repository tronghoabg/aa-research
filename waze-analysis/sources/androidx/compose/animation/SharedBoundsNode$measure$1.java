package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedBoundsNode$measure$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SharedBoundsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedBoundsNode$measure$1(Placeable placeable, SharedBoundsNode sharedBoundsNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = sharedBoundsNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
        SharedBoundsNode sharedBoundsNode = this.this$0;
        sharedBoundsNode.getSharedElement().onLookaheadPlaced(placementScope, sharedBoundsNode.getSharedElementEntry());
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
