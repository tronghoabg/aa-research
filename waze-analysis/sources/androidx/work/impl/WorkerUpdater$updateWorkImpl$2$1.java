package androidx.work.impl;

import androidx.work.ScheduleEventListener;
import androidx.work.WorkInfo;
import h.ab;
import h.c.e;
import h.g.a.r;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WorkerUpdater$updateWorkImpl$2$1 extends u implements r<ScheduleEventListener, WorkInfo, WorkInfo, e<? super ab>, Object> {
    public static final WorkerUpdater$updateWorkImpl$2$1 INSTANCE = new WorkerUpdater$updateWorkImpl$2$1();

    WorkerUpdater$updateWorkImpl$2$1() {
        super(4, ScheduleEventListener.class, "onUpdated", "onUpdated(Landroidx/work/WorkInfo;Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.r
    public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, WorkInfo workInfo2, e<? super ab> eVar) {
        return scheduleEventListener.onUpdated(workInfo, workInfo2, eVar);
    }
}
