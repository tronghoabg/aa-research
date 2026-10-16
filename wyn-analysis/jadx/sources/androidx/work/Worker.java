package androidx.work;

import A7.RunnableC0278p;
import A7.V;
import J3.p;
import J3.q;
import U3.j;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class Worker extends q {

    /* renamed from: a, reason: collision with root package name */
    public j f19056a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract p doWork();

    public J3.j getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // J3.q
    public p8.p getForegroundInfoAsync() {
        j jVar = new j();
        getBackgroundExecutor().execute(new RunnableC0278p(20, this, jVar));
        return jVar;
    }

    @Override // J3.q
    public final p8.p startWork() {
        this.f19056a = new j();
        getBackgroundExecutor().execute(new V(this, 15));
        return this.f19056a;
    }
}
