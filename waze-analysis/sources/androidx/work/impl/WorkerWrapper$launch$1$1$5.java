package androidx.work.impl;

import androidx.work.ScheduleEventListener;
import androidx.work.WorkInfo;
import h.ab;
import h.c.e;
import h.g.a.q;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WorkerWrapper$launch$1$1$5 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
    public static final WorkerWrapper$launch$1$1$5 INSTANCE = new WorkerWrapper$launch$1$1$5();

    WorkerWrapper$launch$1$1$5() {
        super(3, ScheduleEventListener.class, "onPrerequisiteFailed", "onPrerequisiteFailed(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.q
    public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
        return scheduleEventListener.onPrerequisiteFailed(workInfo, eVar);
    }
}
