package defpackage;

import j$.time.Duration;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class prt extends prb {
    public static final /* synthetic */ int g = 0;
    private static final Duration h = Duration.ofSeconds(5);
    final ThreadPoolExecutor e;
    public final vky f;

    /* JADX WARN: Illegal instructions before constructor call */
    public prt(psb psbVar, tmb tmbVar, ScheduledExecutorService scheduledExecutorService) {
        BlockingQueue linkedBlockingQueue;
        int i;
        String str = psbVar.M;
        psbVar.b();
        super(str, psbVar.a(), tmbVar, scheduledExecutorService);
        int iA = psbVar.a();
        woy.N(iA > 0);
        this.f = vky.a(new vky("Queue-"), psbVar.N);
        if (psbVar == psb.BLOCKING_THREADPOOL) {
            linkedBlockingQueue = new SynchronousQueue();
            i = 0;
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
            i = iA;
        }
        prs prsVar = new prs(this, i, iA, h.toMillis(), TimeUnit.MILLISECONDS, linkedBlockingQueue, new prn(psbVar));
        this.e = prsVar;
        prsVar.allowCoreThreadTimeOut(iA > 1);
    }

    public static void r(vky vkyVar, ThreadPoolExecutor threadPoolExecutor) {
        vaq.a(vkyVar, threadPoolExecutor.getQueue().size());
    }

    @Override // defpackage.prb
    protected final pra a() {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        return new pra(threadPoolExecutor.getActiveCount(), threadPoolExecutor.getPoolSize(), threadPoolExecutor.getMaximumPoolSize(), threadPoolExecutor.getQueue().size());
    }

    @Override // defpackage.prb
    protected final void j(pqz pqzVar) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        threadPoolExecutor.execute(pqzVar);
        r(this.f, threadPoolExecutor);
    }

    @Override // defpackage.prb, java.util.concurrent.ExecutorService
    public final void shutdown() {
        super.n();
        this.e.shutdown();
    }

    @Override // defpackage.prb, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List listShutdownNow = super.shutdownNow();
        List<Runnable> listShutdownNow2 = this.e.shutdownNow();
        yfl yflVar = new yfl(4);
        yflVar.k(listShutdownNow2);
        yflVar.k(listShutdownNow);
        return yflVar.g();
    }
}
