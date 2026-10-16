package androidx.work;

import androidx.tracing.Trace;
import h.c.g;
import h.c.j;
import h.g.b.x;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(j jVar) {
        g gVar = jVar != null ? (g) jVar.get(g.f48059a) : null;
        ab abVar = gVar instanceof ab ? (ab) gVar : null;
        if (abVar != null) {
            return bo.e(abVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                x.f(runnable, "runnable");
                return new Thread(runnable, (true != z ? "androidx.work-" : "WM.task-") + this.threadCount.incrementAndGet());
            }
        });
        x.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public void beginAsyncSection(String str, int i2) {
                x.f(str, "methodName");
                Trace.beginAsyncSection(str, i2);
            }

            @Override // androidx.work.Tracer
            public void beginSection(String str) {
                x.f(str, "label");
                Trace.beginSection(str);
            }

            @Override // androidx.work.Tracer
            public void endAsyncSection(String str, int i2) {
                x.f(str, "methodName");
                Trace.endAsyncSection(str, i2);
            }

            @Override // androidx.work.Tracer
            public void endSection() {
                Trace.endSection();
            }

            @Override // androidx.work.Tracer
            public boolean isEnabled() {
                return Trace.isEnabled();
            }
        };
    }
}
