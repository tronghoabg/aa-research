package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$offsetDelta$2 extends y implements l<EnterExitState, IntOffset> {
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionModifierNode$measure$offsetDelta$2(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$target = j2;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
        return IntOffset.m11287boximpl(m1778invokeBjo55l4(enterExitState));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1778invokeBjo55l4(EnterExitState enterExitState) {
        return this.this$0.m1775targetOffsetByStateoFUgxo0(enterExitState, this.$target);
    }
}
