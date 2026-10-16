package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        FocusTargetPropertiesNode focusTargetPropertiesNode = this;
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(focusTargetPropertiesNode);
        boolean z = false;
        if (getNode().isAttached() && FocusGroupNode_androidKt.getEmbeddedView(focusTargetPropertiesNode).hasFocusable()) {
            z = true;
        }
        focusProperties.setCanFocus(z);
        View viewFindFocus = embeddedView.findFocus();
        if (viewFindFocus != null) {
            focusProperties.setFocusRect(FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindFocus, embeddedView));
        }
    }
}
