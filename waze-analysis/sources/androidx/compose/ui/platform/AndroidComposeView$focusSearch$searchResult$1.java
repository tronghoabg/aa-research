package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$focusSearch$searchResult$1 extends y implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ aq<FocusTargetNode> $focusTarget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$focusSearch$searchResult$1(aq<FocusTargetNode> aqVar) {
        super(1);
        this.$focusTarget = aqVar;
    }

    @Override // h.g.a.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        this.$focusTarget.f48105a = focusTargetNode;
        return true;
    }
}
