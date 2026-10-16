package androidx.compose.ui.node;

import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadPassDelegate$performMeasureBlock$1 extends y implements a<ab> {
    final /* synthetic */ LookaheadPassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookaheadPassDelegate$performMeasureBlock$1(LookaheadPassDelegate lookaheadPassDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LookaheadDelegate lookaheadDelegate = this.this$0.getOuterCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        lookaheadDelegate.mo9741measureBRTryo0(this.this$0.performMeasureConstraints);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
