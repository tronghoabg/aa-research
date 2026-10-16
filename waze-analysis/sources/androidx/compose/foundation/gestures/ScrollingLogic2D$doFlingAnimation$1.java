package androidx.compose.foundation.gestures;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollingLogic2D$doFlingAnimation$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic2D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic2D$doFlingAnimation$1(ScrollingLogic2D scrollingLogic2D, e<? super ScrollingLogic2D$doFlingAnimation$1> eVar) {
        super(eVar);
        this.this$0 = scrollingLogic2D;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2286doFlingAnimationQWom1Mo(0L, this);
    }
}
