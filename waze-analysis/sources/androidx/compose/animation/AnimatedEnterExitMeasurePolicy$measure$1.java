package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.l;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy$measure$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimatedEnterExitMeasurePolicy$measure$1(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        List<Placeable> list = this.$placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.place$default(placementScope, list.get(i2), 0, 0, 0.0f, 4, null);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
