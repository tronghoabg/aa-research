package androidx.compose.ui.focus;

import h.g.a.l;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FocusOwnerImpl$moveFocus$focusSearchSuccess$1 extends y implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ aq<Boolean> $requestFocusSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusOwnerImpl$moveFocus$focusSearchSuccess$1(aq<Boolean> aqVar, int i2) {
        super(1);
        this.$requestFocusSuccess = aqVar;
        this.$focusDirection = i2;
    }

    @Override // h.g.a.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        Boolean boolValueOf = Boolean.valueOf(focusTargetNode.mo7888requestFocus3ESFkO8(this.$focusDirection));
        aq<Boolean> aqVar = this.$requestFocusSuccess;
        aqVar.f48105a = boolValueOf;
        return (Boolean) aqVar.f48105a;
    }
}
