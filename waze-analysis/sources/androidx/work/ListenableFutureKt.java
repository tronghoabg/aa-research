package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.d.m.a.bm;
import h.c.e;
import h.c.j;
import h.c.k;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ListenableFutureKt {
    public static final <V> bm<V> executeAsync(final Executor executor, final String str, final a<? extends V> aVar) {
        x.f(executor, "<this>");
        x.f(str, "debugTag");
        x.f(aVar, "block");
        bm<V> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Executor executor2 = executor;
                String str2 = str;
                ListenableFutureKt.executeAsync$lambda$0(executor2, str2, aVar, completer);
                return str2;
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    static final Object executeAsync$lambda$0(Executor executor, String str, final a aVar, final CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.executeAsync$lambda$0$1(atomicBoolean, completer, aVar);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$0$1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, a aVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(aVar.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }

    public static final <T> bm<T> launchFuture(final j jVar, final ag agVar, final p<? super af, ? super e<? super T>, ? extends Object> pVar) {
        x.f(jVar, "context");
        x.f(agVar, TtmlNode.START);
        x.f(pVar, "block");
        bm<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.launchFuture$lambda$0(jVar, agVar, pVar, completer);
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    public static /* synthetic */ bm launchFuture$default(j jVar, ag agVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = k.f48060a;
        }
        if ((i2 & 2) != 0) {
            agVar = ag.f51342a;
        }
        return launchFuture(jVar, agVar, pVar);
    }

    static final Object launchFuture$lambda$0(j jVar, ag agVar, p pVar, CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "completer");
        final br brVar = (br) jVar.get(br.f51766a);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.launchFuture$lambda$0$0(brVar);
            }
        }, DirectExecutor.INSTANCE);
        return aj.z(aj.e(jVar), null, agVar, new ListenableFutureKt$launchFuture$1$2(pVar, completer, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$0$0(br brVar) {
        if (brVar != null) {
            brVar.s(null);
        }
    }
}
