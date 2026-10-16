package androidx.work.impl;

import androidx.work.ExecutionEventListener;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import h.ab;
import h.c.e;
import h.g.a.r;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WorkerWrapper$launch$1$1$1 extends u implements r<ExecutionEventListener, ListenableWorker.Result, WorkInfo, e<? super ab>, Object> {
    public static final WorkerWrapper$launch$1$1$1 INSTANCE = new WorkerWrapper$launch$1$1$1();

    WorkerWrapper$launch$1$1$1() {
        super(4, ExecutionEventListener.class, "onFinished", "onFinished(Landroidx/work/ListenableWorker$Result;Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.r
    public final Object invoke(ExecutionEventListener executionEventListener, ListenableWorker.Result result, WorkInfo workInfo, e<? super ab> eVar) {
        return executionEventListener.onFinished(result, workInfo, eVar);
    }
}
