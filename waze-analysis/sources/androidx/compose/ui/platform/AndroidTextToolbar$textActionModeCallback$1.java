package androidx.compose.ui.platform;

import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidTextToolbar$textActionModeCallback$1 extends y implements a<ab> {
    final /* synthetic */ AndroidTextToolbar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidTextToolbar$textActionModeCallback$1(AndroidTextToolbar androidTextToolbar) {
        super(0);
        this.this$0 = androidTextToolbar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.actionMode = null;
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
