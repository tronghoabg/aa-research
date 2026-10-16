package androidx.work.impl.workers;

import C8.g;
import J3.q;
import J3.r;
import O3.b;
import U3.j;
import W3.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import p8.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "LJ3/q;", "LO3/b;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final WorkerParameters f19090a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19091b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f19092c;

    /* renamed from: d, reason: collision with root package name */
    public final j f19093d;

    /* renamed from: e, reason: collision with root package name */
    public q f19094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        AbstractC3340k.e(appContext, "appContext");
        AbstractC3340k.e(workerParameters, "workerParameters");
        this.f19090a = workerParameters;
        this.f19091b = new Object();
        this.f19093d = new j();
    }

    @Override // O3.b
    public final void b(ArrayList workSpecs) {
        AbstractC3340k.e(workSpecs, "workSpecs");
        r.d().a(a.f15146a, "Constraints changed for " + workSpecs);
        synchronized (this.f19091b) {
            this.f19092c = true;
        }
    }

    @Override // O3.b
    public final void f(List list) {
    }

    @Override // J3.q
    public final void onStopped() {
        super.onStopped();
        q qVar = this.f19094e;
        if (qVar == null || qVar.isStopped()) {
            return;
        }
        qVar.stop();
    }

    @Override // J3.q
    public final p startWork() {
        getBackgroundExecutor().execute(new g(this, 18));
        j future = this.f19093d;
        AbstractC3340k.d(future, "future");
        return future;
    }
}
