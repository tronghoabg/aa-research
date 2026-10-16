package androidx.constraintlayout.compose;

import h.ab;
import h.g.a.a;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$3$1 implements a<ab> {
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ ConstraintSet $constraintSet;

    public ConstraintLayoutKt$ConstraintLayout$3$1(o<ConstraintSet> oVar, ConstraintSet constraintSet) {
        this.$channel = oVar;
        this.$constraintSet = constraintSet;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$channel.i(this.$constraintSet);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
