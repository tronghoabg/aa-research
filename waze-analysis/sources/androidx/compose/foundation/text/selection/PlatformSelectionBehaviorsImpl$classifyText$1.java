package androidx.compose.foundation.text.selection;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PlatformSelectionBehaviorsImpl$classifyText$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$classifyText$1(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, e<? super PlatformSelectionBehaviorsImpl$classifyText$1> eVar) {
        super(eVar);
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3857classifyTextM8tDOmk(null, 0L, null, this);
    }
}
