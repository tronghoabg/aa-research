package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FocusGroupPropertiesNode$onEnter$1 extends y implements l<FocusEnterExitScope, ab> {
    final /* synthetic */ FocusGroupPropertiesNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusGroupPropertiesNode$onEnter$1(FocusGroupPropertiesNode focusGroupPropertiesNode) {
        super(1);
        this.this$0 = focusGroupPropertiesNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
        if (embeddedView.isFocused() || embeddedView.hasFocus()) {
            return;
        }
        if (FocusInteropUtils_androidKt.requestInteropFocus(embeddedView, FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo7851getRequestedFocusDirectiondhqQ8s()), FocusGroupNode_androidKt.getCurrentlyFocusedRect(DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner(), DelegatableNode_androidKt.requireView(this.this$0), embeddedView))) {
            return;
        }
        focusEnterExitScope.cancelFocusChange();
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(FocusEnterExitScope focusEnterExitScope) {
        invoke2(focusEnterExitScope);
        return ab.f48028a;
    }
}
