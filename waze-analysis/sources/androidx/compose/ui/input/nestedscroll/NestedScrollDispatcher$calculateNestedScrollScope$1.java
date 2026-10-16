package androidx.compose.ui.input.nestedscroll;

import h.g.a.a;
import h.g.b.y;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NestedScrollDispatcher$calculateNestedScrollScope$1 extends y implements a<af> {
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$calculateNestedScrollScope$1(NestedScrollDispatcher nestedScrollDispatcher) {
        super(0);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // h.g.a.a
    public final af invoke() {
        return this.this$0.getScope$ui();
    }
}
