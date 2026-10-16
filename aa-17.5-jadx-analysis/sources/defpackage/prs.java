package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class prs extends ThreadPoolExecutor implements AutoCloseable {
    final /* synthetic */ prt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prs(prt prtVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.a = prtVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        int i = prt.g;
        prt.r(this.a.f, this);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void terminated() {
        this.a.k();
    }
}
