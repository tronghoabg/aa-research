package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$animSlideOffsetState$1 extends y implements l<EnterExitState, IntOffset> {
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionModifierNode$measure$animSlideOffsetState$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$target = j2;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
        return IntOffset.m11287boximpl(m1777invokeBjo55l4(enterExitState));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1777invokeBjo55l4(EnterExitState enterExitState) {
        return (enterExitState == EnterExitState.PostExit && this.this$0.getExit().getData$animation().getSlide() == null) ? this.this$0.getMutableTransformState().m1814getLastSlidenOccac() : this.this$0.m1774slideTargetValueByStateoFUgxo0(enterExitState, this.$target);
    }
}
