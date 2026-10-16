package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.d.m.a.bm;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> bm<T> future(final Executor executor, final a<? extends T> aVar) {
        bm<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.WorkerKt$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return WorkerKt.future$lambda$0(executor, aVar, completer);
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    static final ab future$lambda$0(Executor executor, final a aVar, final CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.WorkerKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.WorkerKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                WorkerKt.future$lambda$0$1(atomicBoolean, completer, aVar);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void future$lambda$0$1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, a aVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(aVar.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }
}
