package androidx.compose.ui.focus;

import h.ab;
import h.g.a.a;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FocusTargetNode$invalidateFocus$1 extends y implements a<ab> {
    final /* synthetic */ aq<FocusProperties> $focusProperties;
    final /* synthetic */ FocusTargetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusTargetNode$invalidateFocus$1(aq<FocusProperties> aqVar, FocusTargetNode focusTargetNode) {
        super(0);
        this.$focusProperties = aqVar;
        this.this$0 = focusTargetNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FocusTargetNode focusTargetNode = this.this$0;
        this.$focusProperties.f48105a = focusTargetNode.fetchFocusProperties$ui();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
