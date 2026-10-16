package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$animSize$1 extends y implements l<EnterExitState, IntSize> {
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionModifierNode$measure$animSize$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$target = j2;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
        return IntSize.m11331boximpl(m1776invokeYEO4UFw(enterExitState));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m1776invokeYEO4UFw(EnterExitState enterExitState) {
        return this.this$0.m1773sizeByStateUzc_VyU(enterExitState, this.$target);
    }
}
