package J3;

import A7.RunnableC0285r1;
import A7.W0;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class q {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public q(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f19062f;
    }

    public p8.p getForegroundInfoAsync() {
        U3.j jVar = new U3.j();
        jVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f19057a;
    }

    public final h getInputData() {
        return this.mWorkerParams.f19058b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f19060d.f19398d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f19061e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f19059c;
    }

    public V3.a getTaskExecutor() {
        return this.mWorkerParams.f19063g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f19060d.f19396b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f19060d.f19397c;
    }

    public z getWorkerFactory() {
        return this.mWorkerParams.f19064h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final p8.p setForegroundAsync(j jVar) {
        T3.t tVar = this.mWorkerParams.f19066j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        tVar.getClass();
        U3.j jVar2 = new U3.j();
        tVar.f11444a.v(new RunnableC0285r1(tVar, jVar2, id2, jVar, applicationContext, 2));
        return jVar2;
    }

    public p8.p setProgressAsync(h hVar) {
        T3.u uVar = this.mWorkerParams.f19065i;
        getApplicationContext();
        UUID id2 = getId();
        uVar.getClass();
        U3.j jVar = new U3.j();
        uVar.f11449b.v(new W0(uVar, id2, hVar, jVar, 13));
        return jVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract p8.p startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
