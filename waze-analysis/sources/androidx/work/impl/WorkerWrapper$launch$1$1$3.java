package androidx.work.impl;

import androidx.work.ExecutionEventListener;
import androidx.work.WorkInfo;
import h.ab;
import h.c.e;
import h.g.a.r;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WorkerWrapper$launch$1$1$3 extends u implements r<ExecutionEventListener, Integer, WorkInfo, e<? super ab>, Object> {
    public static final WorkerWrapper$launch$1$1$3 INSTANCE = new WorkerWrapper$launch$1$1$3();

    WorkerWrapper$launch$1$1$3() {
        super(4, ExecutionEventListener.class, "onStopped", "onStopped(ILandroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.r
    public /* bridge */ /* synthetic */ Object invoke(ExecutionEventListener executionEventListener, Integer num, WorkInfo workInfo, e<? super ab> eVar) {
        return invoke(executionEventListener, num.intValue(), workInfo, eVar);
    }

    public final Object invoke(ExecutionEventListener executionEventListener, int i2, WorkInfo workInfo, e<? super ab> eVar) {
        return executionEventListener.onStopped(i2, workInfo, eVar);
    }
}
