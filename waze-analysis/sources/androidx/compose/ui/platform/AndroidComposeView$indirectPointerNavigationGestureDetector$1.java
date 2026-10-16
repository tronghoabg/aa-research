package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$indirectPointerNavigationGestureDetector$1 extends y implements l<FocusDirection, ab> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$indirectPointerNavigationGestureDetector$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(FocusDirection focusDirection) {
        m10192invoke3ESFkO8(focusDirection.m7858unboximpl());
        return ab.f48028a;
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final void m10192invoke3ESFkO8(int i2) {
        this.this$0.getFocusOwner().mo7874moveFocusaToIllA(i2, false);
    }
}
