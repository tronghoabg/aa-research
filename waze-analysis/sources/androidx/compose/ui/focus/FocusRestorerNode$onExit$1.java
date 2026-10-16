package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FocusRestorerNode$onExit$1 extends y implements l<FocusEnterExitScope, ab> {
    final /* synthetic */ FocusRestorerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusRestorerNode$onExit$1(FocusRestorerNode focusRestorerNode) {
        super(1);
        this.this$0 = focusRestorerNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
        if (ComposeUiFlags.isFocusRestorationEnabled) {
            return;
        }
        FocusRequesterModifierNodeKt.saveFocusedChild(this.this$0);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(FocusEnterExitScope focusEnterExitScope) {
        invoke2(focusEnterExitScope);
        return ab.f48028a;
    }
}
