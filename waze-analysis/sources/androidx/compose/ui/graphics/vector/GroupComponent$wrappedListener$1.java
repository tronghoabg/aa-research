package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GroupComponent$wrappedListener$1 extends y implements l<VNode, ab> {
    final /* synthetic */ GroupComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.this$0 = groupComponent;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VNode vNode) {
        this.this$0.markTintForVNode(vNode);
        l<VNode, ab> invalidateListener$ui = this.this$0.getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(vNode);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(VNode vNode) {
        invoke2(vNode);
        return ab.f48028a;
    }
}
