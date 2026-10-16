package We;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class p extends He.l {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15516a;

    /* renamed from: b, reason: collision with root package name */
    public final Je.a f15517b = new Je.a(0);

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f15518c;

    public p(ScheduledExecutorService scheduledExecutorService) {
        this.f15516a = scheduledExecutorService;
    }

    @Override // He.l
    public final Je.b a(Runnable runnable, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        boolean z2 = this.f15518c;
        Me.b bVar = Me.b.f7635a;
        if (z2) {
            return bVar;
        }
        n nVar = new n(runnable, this.f15517b);
        this.f15517b.a(nVar);
        try {
            nVar.a(this.f15516a.submit((Callable) nVar));
            return nVar;
        } catch (RejectedExecutionException e7) {
            dispose();
            S3.f.A(e7);
            return bVar;
        }
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f15518c) {
            return;
        }
        this.f15518c = true;
        this.f15517b.dispose();
    }
}
