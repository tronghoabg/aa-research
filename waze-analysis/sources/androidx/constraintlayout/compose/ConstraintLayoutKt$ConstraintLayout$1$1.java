package androidx.constraintlayout.compose;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$1$1 implements l<SemanticsPropertyReceiver, ab> {
    final /* synthetic */ Measurer2 $measurer;

    public ConstraintLayoutKt$ConstraintLayout$1$1(Measurer2 measurer2) {
        this.$measurer = measurer2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return ab.f48028a;
    }
}
