package androidx.compose.ui;

import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ZIndexNode$measure$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ ZIndexNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZIndexNode$measure$1(Placeable placeable, ZIndexNode zIndexNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = zIndexNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        placementScope.place(this.$placeable, 0, 0, this.this$0.getZIndex());
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
