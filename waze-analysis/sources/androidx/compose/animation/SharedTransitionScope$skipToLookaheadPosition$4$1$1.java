package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScope$skipToLookaheadPosition$4$1$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ a<Boolean> $enabled;
    final /* synthetic */ Placeable $this_run;
    final /* synthetic */ SharedTransitionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedTransitionScope$skipToLookaheadPosition$4$1$1(a<Boolean> aVar, Placeable placeable, SharedTransitionScope sharedTransitionScope) {
        super(1);
        this.$enabled = aVar;
        this.$this_run = placeable;
        this.this$0 = sharedTransitionScope;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        if (!this.$enabled.invoke().booleanValue()) {
            Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
            return;
        }
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates == null) {
            Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
            return;
        }
        SharedTransitionScope sharedTransitionScope = this.this$0;
        Placeable.PlacementScope.m9813place70tqf50$default(placementScope, this.$this_run, IntOffsetKt.m11313roundk4lQ0M(Offset.m7984minusMKHz9U(coordinates.mo9744localPositionOfR5De75A(sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), Offset.m7984minusMKHz9U(LookaheadScope.CC.m9777localLookaheadPositionOfauaQtc$default(sharedTransitionScope, sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), coordinates, 0L, false, 6, null), LayoutCoordinates.CC.m9763localPositionOfS_NoaFU$default(sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), coordinates, 0L, false, 6, null))), LayoutCoordinates.CC.m9763localPositionOfS_NoaFU$default(coordinates, sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), 0L, false, 6, null))), 0.0f, 2, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
