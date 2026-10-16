package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1 implements a<ab> {
    final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    final /* synthetic */ MutableState<Boolean> $remeasureRequesterState;

    public ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(MutableState<Boolean> mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        this.$remeasureRequesterState = mutableState;
        this.$constraintSet = constraintSetForInlineDsl;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$remeasureRequesterState.setValue(Boolean.valueOf(!this.$remeasureRequesterState.getValue().booleanValue()));
        this.$constraintSet.setKnownDirty(true);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
