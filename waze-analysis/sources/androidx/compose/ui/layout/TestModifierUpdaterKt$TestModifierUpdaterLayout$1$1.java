package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends y implements l<LayoutNode, ab> {
    final /* synthetic */ l<TestModifierUpdater, ab> $onAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(l<? super TestModifierUpdater, ab> lVar) {
        super(1);
        this.$onAttached = lVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode) {
        this.$onAttached.invoke(new TestModifierUpdater(layoutNode));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return ab.f48028a;
    }
}
