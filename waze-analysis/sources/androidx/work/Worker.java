package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.d.m.a.bm;
import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class Worker extends ListenableWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        x.f(context, "context");
        x.f(workerParameters, "workerParams");
    }

    public abstract ListenableWorker.Result doWork();

    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.ListenableWorker
    public bm<ForegroundInfo> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        x.e(backgroundExecutor, "getBackgroundExecutor(...)");
        return WorkerKt.future(backgroundExecutor, new a() { // from class: androidx.work.Worker$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.getForegroundInfo();
            }
        });
    }

    @Override // androidx.work.ListenableWorker
    public final bm<ListenableWorker.Result> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        x.e(backgroundExecutor, "getBackgroundExecutor(...)");
        return WorkerKt.future(backgroundExecutor, new a() { // from class: androidx.work.Worker$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.doWork();
            }
        });
    }
}
