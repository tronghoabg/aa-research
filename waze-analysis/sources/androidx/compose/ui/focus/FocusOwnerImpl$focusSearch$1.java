package androidx.compose.ui.focus;

import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FocusOwnerImpl$focusSearch$1 extends y implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ l<FocusTargetNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetNode $source;
    final /* synthetic */ FocusOwnerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FocusOwnerImpl$focusSearch$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, l<? super FocusTargetNode, Boolean> lVar) {
        super(1);
        this.$source = focusTargetNode;
        this.this$0 = focusOwnerImpl;
        this.$onFound = lVar;
    }

    @Override // h.g.a.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        boolean zBooleanValue;
        if (x.n(focusTargetNode, this.$source)) {
            zBooleanValue = false;
        } else {
            if (x.n(focusTargetNode, this.this$0.getRootFocusNode$ui())) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            zBooleanValue = this.$onFound.invoke(focusTargetNode).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
