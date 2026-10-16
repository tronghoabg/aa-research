package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import h.g.a.l;
import h.g.b.am;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1 extends y implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ am $foundFocusable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1(am amVar, int i2) {
        super(1);
        this.$foundFocusable = amVar;
        this.$focusDirection = i2;
    }

    @Override // h.g.a.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        this.$foundFocusable.f48101a = true;
        return Boolean.valueOf(focusTargetNode.mo7888requestFocus3ESFkO8(this.$focusDirection));
    }
}
