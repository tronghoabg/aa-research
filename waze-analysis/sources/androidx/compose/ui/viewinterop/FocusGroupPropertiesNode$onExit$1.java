package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FocusGroupPropertiesNode$onExit$1 extends y implements l<FocusEnterExitScope, ab> {
    final /* synthetic */ FocusGroupPropertiesNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusGroupPropertiesNode$onExit$1(FocusGroupPropertiesNode focusGroupPropertiesNode) {
        super(1);
        this.this$0 = focusGroupPropertiesNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
        if (ComposeUiFlags.isViewFocusFixEnabled) {
            if (embeddedView.hasFocus() || embeddedView.isFocused()) {
                embeddedView.clearFocus();
                return;
            }
            return;
        }
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled || !embeddedView.hasFocus()) {
            return;
        }
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner();
        View viewRequireView = DelegatableNode_androidKt.requireView(this.this$0);
        if (!(embeddedView instanceof ViewGroup)) {
            if (!viewRequireView.requestFocus()) {
                throw new IllegalStateException("host view did not take focus");
            }
            return;
        }
        Rect currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, viewRequireView, embeddedView);
        Integer numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo7851getRequestedFocusDirectiondhqQ8s());
        int iIntValue = numM7867toAndroidFocusDirection3ESFkO8 != null ? numM7867toAndroidFocusDirection3ESFkO8.intValue() : 130;
        FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = focusGroupPropertiesNode.getFocusedChild() != null ? focusFinder.findNextFocus((ViewGroup) viewRequireView, focusGroupPropertiesNode.getFocusedChild(), iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewRequireView, currentlyFocusedRect, iIntValue);
        if (viewFindNextFocus == null || !FocusGroupNode_androidKt.containsDescendant(embeddedView, viewFindNextFocus)) {
            if (!viewRequireView.requestFocus()) {
                throw new IllegalStateException("host view did not take focus");
            }
        } else {
            viewFindNextFocus.requestFocus(iIntValue, currentlyFocusedRect);
            focusEnterExitScope.cancelFocusChange();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(FocusEnterExitScope focusEnterExitScope) {
        invoke2(focusEnterExitScope);
        return ab.f48028a;
    }
}
