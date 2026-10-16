package androidx.compose.foundation.gestures;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollingLogic$doFlingAnimation$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, e<? super ScrollingLogic$doFlingAnimation$1> eVar) {
        super(eVar);
        this.this$0 = scrollingLogic;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2286doFlingAnimationQWom1Mo(0L, this);
    }
}
