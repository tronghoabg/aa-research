package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NodeCoordinator$speculativeHit$1 extends y implements a<ab> {
    final /* synthetic */ float $distanceFromEdge;
    final /* synthetic */ HitTestResult $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource $hitTestSource;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ int $pointerType;
    final /* synthetic */ Modifier.Node $this_speculativeHit;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NodeCoordinator$speculativeHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z, float f2) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_speculativeHit = node;
        this.$hitTestSource = hitTestSource;
        this.$pointerPosition = j2;
        this.$hitTestResult = hitTestResult;
        this.$pointerType = i2;
        this.$isInLayer = z;
        this.$distanceFromEdge = f2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.m10041outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m10065nextUntilhw7D004(this.$this_speculativeHit, this.$hitTestSource.mo10063entityTypeOLwlOKw(), 2), this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$pointerType, this.$isInLayer, this.$distanceFromEdge, false);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
