package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.node.DelegatingNode;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FocusGroupNode extends DelegatingNode {
    public FocusGroupNode() {
        delegate(FocusTargetModifierNodeKt.m7892FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m7915getNeverLCbbffg(), null, 2, null));
    }
}
