package androidx.compose.ui.focus;

import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FocusRestorerNode$onEnter$1 extends y implements l<FocusEnterExitScope, ab> {
    final /* synthetic */ FocusRestorerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusRestorerNode$onEnter$1(FocusRestorerNode focusRestorerNode) {
        super(1);
        this.this$0 = focusRestorerNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
        if (FocusRequesterModifierNodeKt.restoreFocusedChild(this.this$0) || x.n(this.this$0.getFallback(), FocusRequester.Companion.getDefault())) {
            return;
        }
        if (x.n(this.this$0.getFallback(), FocusRequester.Companion.getCancel())) {
            focusEnterExitScope.cancelFocusChange();
        } else {
            FocusRequester.m7885requestFocus3ESFkO8$default(this.this$0.getFallback(), 0, 1, null);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(FocusEnterExitScope focusEnterExitScope) {
        invoke2(focusEnterExitScope);
        return ab.f48028a;
    }
}
