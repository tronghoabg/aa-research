package androidx.compose.foundation;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends c {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, e<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> eVar) {
        super(eVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1949applyToFlingBMRW4eQ(0L, null, this);
    }
}
