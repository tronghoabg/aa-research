package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class qlh extends ThreadPoolExecutor implements AutoCloseable {
    final /* synthetic */ qlk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlh(qlk qlkVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.a = qlkVar;
        setThreadFactory(new qli());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new qlg(this, runnable, obj);
    }
}
