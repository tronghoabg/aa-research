package androidx.datastore.core;

import androidx.datastore.core.MultiProcessCoordinator;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(MultiProcessCoordinator.Companion companion, e<? super MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1> eVar) {
        super(eVar);
        this.this$0 = companion;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
