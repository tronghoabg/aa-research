package androidx.compose.ui.viewinterop;

import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$runInvalidate$1 extends y implements a<ab> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$runInvalidate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getLayoutNode().invalidateLayer$ui();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
