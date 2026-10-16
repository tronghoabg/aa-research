package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusState;
import h.ab;
import h.g.a.p;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends u implements p<FocusState, FocusState, ab> {
    FocusTargetInteropNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusTargetInteropNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(FocusState focusState, FocusState focusState2) {
        invoke2(focusState, focusState2);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState focusState, FocusState focusState2) {
        ((FocusTargetInteropNode) this.receiver).onFocusStateChange(focusState, focusState2);
    }
}
