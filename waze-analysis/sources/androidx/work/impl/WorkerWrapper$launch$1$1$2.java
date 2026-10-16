package androidx.work.impl;

import androidx.work.ExecutionEventListener;
import androidx.work.WorkInfo;
import h.ab;
import h.c.e;
import h.g.a.r;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WorkerWrapper$launch$1$1$2 extends u implements r<ExecutionEventListener, Throwable, WorkInfo, e<? super ab>, Object> {
    public static final WorkerWrapper$launch$1$1$2 INSTANCE = new WorkerWrapper$launch$1$1$2();

    WorkerWrapper$launch$1$1$2() {
        super(4, ExecutionEventListener.class, "onException", "onException(Ljava/lang/Throwable;Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.r
    public final Object invoke(ExecutionEventListener executionEventListener, Throwable th, WorkInfo workInfo, e<? super ab> eVar) {
        return executionEventListener.onException(th, workInfo, eVar);
    }
}
