package androidx.compose.ui.node;

import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MeasurePassDelegate$performMeasureBlock$1 extends y implements a<ab> {
    final /* synthetic */ MeasurePassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeasurePassDelegate$performMeasureBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MeasurePassDelegate measurePassDelegate = this.this$0;
        measurePassDelegate.getOuterCoordinator().mo9741measureBRTryo0(measurePassDelegate.performMeasureConstraints);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
