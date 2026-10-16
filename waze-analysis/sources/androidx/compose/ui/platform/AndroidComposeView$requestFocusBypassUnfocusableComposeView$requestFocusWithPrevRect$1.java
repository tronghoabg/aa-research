package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1 extends y implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ int $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1(int i2) {
        super(1);
        this.$focusDirection = i2;
    }

    @Override // h.g.a.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.mo7888requestFocus3ESFkO8(this.$focusDirection));
    }
}
