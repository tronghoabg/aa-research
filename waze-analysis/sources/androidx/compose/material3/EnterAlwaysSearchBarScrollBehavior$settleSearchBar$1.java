package androidx.compose.material3;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 extends c {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterAlwaysSearchBarScrollBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, e<? super EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1> eVar) {
        super(eVar);
        this.this$0 = enterAlwaysSearchBarScrollBehavior;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4798settleSearchBarOhffZ5M(0.0f, this);
    }
}
