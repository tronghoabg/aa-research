package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusTargetNode;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2 extends y implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ FocusDirection $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2(FocusDirection focusDirection) {
        super(1);
        this.$focusDirection = focusDirection;
    }

    @Override // h.g.a.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.mo7888requestFocus3ESFkO8(this.$focusDirection.m7858unboximpl()));
    }
}
