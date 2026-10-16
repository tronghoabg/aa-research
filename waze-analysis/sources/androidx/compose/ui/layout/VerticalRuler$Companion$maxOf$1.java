package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VerticalRuler$Companion$maxOf$1 extends y implements p<Placeable.PlacementScope, Float, Float> {
    final /* synthetic */ VerticalRuler[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalRuler$Companion$maxOf$1(VerticalRuler[] verticalRulerArr) {
        super(2);
        this.$rulers = verticalRulerArr;
    }

    public final Float invoke(Placeable.PlacementScope placementScope, float f2) {
        return Float.valueOf(RulerKt.mergeRulerValues(placementScope, true, this.$rulers, f2));
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Float invoke(Placeable.PlacementScope placementScope, Float f2) {
        return invoke(placementScope, f2.floatValue());
    }
}
