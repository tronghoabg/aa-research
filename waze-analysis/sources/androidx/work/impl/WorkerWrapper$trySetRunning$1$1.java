package androidx.work.impl;

import androidx.work.ExecutionEventListener;
import androidx.work.WorkInfo;
import h.ab;
import h.c.e;
import h.g.a.q;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WorkerWrapper$trySetRunning$1$1 extends u implements q<ExecutionEventListener, WorkInfo, e<? super ab>, Object> {
    public static final WorkerWrapper$trySetRunning$1$1 INSTANCE = new WorkerWrapper$trySetRunning$1$1();

    WorkerWrapper$trySetRunning$1$1() {
        super(3, ExecutionEventListener.class, "onStarted", "onStarted(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.q
    public final Object invoke(ExecutionEventListener executionEventListener, WorkInfo workInfo, e<? super ab> eVar) {
        return executionEventListener.onStarted(workInfo, eVar);
    }
}
