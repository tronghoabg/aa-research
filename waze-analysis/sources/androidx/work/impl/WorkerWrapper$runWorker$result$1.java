package androidx.work.impl;

import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.utils.WorkForegroundKt;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class WorkerWrapper$runWorker$result$1 extends g implements p<af, e<? super ListenableWorker.Result>, Object> {
    final /* synthetic */ ForegroundUpdater $foregroundUpdater;
    final /* synthetic */ ListenableWorker $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, e<? super WorkerWrapper$runWorker$result$1> eVar) {
        super(2, eVar);
        this.this$0 = workerWrapper;
        this.$worker = listenableWorker;
        this.$foregroundUpdater = foregroundUpdater;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ListenableWorker.Result> eVar) {
        return ((WorkerWrapper$runWorker$result$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            WorkerWrapper workerWrapper = this.this$0;
            ListenableWorker listenableWorker = this.$worker;
            ForegroundUpdater foregroundUpdater = this.$foregroundUpdater;
            this.label = 1;
            if (WorkForegroundKt.workForeground(workerWrapper.appContext, workerWrapper.getWorkSpec(), listenableWorker, foregroundUpdater, workerWrapper.workTaskExecutor, this) != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        Logger.get().debug(WorkerWrapperKt.TAG, "Starting work for ".concat(String.valueOf(this.this$0.getWorkSpec().workerClassName)));
        bm<ListenableWorker.Result> bmVarStartWork = this.$worker.startWork();
        x.e(bmVarStartWork, "startWork(...)");
        this.label = 2;
        Object objAwaitWithin = WorkerWrapperKt.awaitWithin(bmVarStartWork, this.$worker, this);
        return objAwaitWithin == aVar ? aVar : objAwaitWithin;
    }
}
