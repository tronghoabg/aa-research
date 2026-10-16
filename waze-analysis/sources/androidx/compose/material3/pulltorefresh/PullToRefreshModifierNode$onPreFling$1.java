package androidx.compose.material3.pulltorefresh;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PullToRefreshModifierNode$onPreFling$1 extends c {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$onPreFling$1(PullToRefreshModifierNode pullToRefreshModifierNode, e<? super PullToRefreshModifierNode$onPreFling$1> eVar) {
        super(eVar);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2299onPreFlingQWom1Mo(0L, this);
    }
}
