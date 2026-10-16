package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$layoutNode$1$1 extends y implements l<Modifier, ab> {
    final /* synthetic */ Modifier $coreModifier;
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, Modifier modifier) {
        super(1);
        this.$layoutNode = layoutNode;
        this.$coreModifier = modifier;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Modifier modifier) {
        this.$layoutNode.setModifier(modifier.then(this.$coreModifier));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Modifier modifier) {
        invoke2(modifier);
        return ab.f48028a;
    }
}
