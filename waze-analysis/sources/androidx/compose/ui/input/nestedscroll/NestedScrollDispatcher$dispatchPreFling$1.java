package androidx.compose.ui.input.nestedscroll;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NestedScrollDispatcher$dispatchPreFling$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, e<? super NestedScrollDispatcher$dispatchPreFling$1> eVar) {
        super(eVar);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9459dispatchPreFlingQWom1Mo(0L, this);
    }
}
