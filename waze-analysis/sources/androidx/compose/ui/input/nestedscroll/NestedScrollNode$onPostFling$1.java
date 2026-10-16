package androidx.compose.ui.input.nestedscroll;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NestedScrollNode$onPostFling$1 extends c {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, e<? super NestedScrollNode$onPostFling$1> eVar) {
        super(eVar);
        this.this$0 = nestedScrollNode;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2297onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
