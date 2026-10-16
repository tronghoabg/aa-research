package androidx.room.coroutines;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class Pool$acquireWithTimeout$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$1(Pool pool, e<? super Pool$acquireWithTimeout$1> eVar) {
        super(eVar);
        this.this$0 = pool;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m13237acquireWithTimeoutKLykuaI(0L, null, this);
    }
}
