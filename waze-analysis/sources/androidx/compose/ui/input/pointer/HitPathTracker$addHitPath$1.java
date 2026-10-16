package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class HitPathTracker$addHitPath$1 extends y implements a<ab> {
    final /* synthetic */ Modifier.Node $pointerInputNode;
    final /* synthetic */ HitPathTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HitPathTracker$addHitPath$1(HitPathTracker hitPathTracker, Modifier.Node node) {
        super(0);
        this.this$0 = hitPathTracker;
        this.$pointerInputNode = node;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.removePointerInputModifierNode(this.$pointerInputNode);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
