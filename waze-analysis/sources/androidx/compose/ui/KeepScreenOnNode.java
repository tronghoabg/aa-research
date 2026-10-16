package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class KeepScreenOnNode extends Modifier.Node {
    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireOwner(this).incrementKeepScreenOnCount();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).decrementKeepScreenOnCount();
    }
}
