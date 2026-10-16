package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.d.m.a.bm;
import e.b.c;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final ab coroutineContext;
    private final WorkerParameters params;

    /* compiled from: WazeSource */
    final class DeprecatedDispatcher extends ab {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        private static final ab dispatcher = av.a();

        private DeprecatedDispatcher() {
        }

        @Override // kotlinx.coroutines.ab
        public void dispatch(j jVar, Runnable runnable) {
            x.f(jVar, "context");
            x.f(runnable, "block");
            dispatcher.dispatch(jVar, runnable);
        }

        public final ab getDispatcher() {
            return dispatcher;
        }

        @Override // kotlinx.coroutines.ab
        public boolean isDispatchNeeded(j jVar) {
            x.f(jVar, "context");
            return dispatcher.isDispatchNeeded(jVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ForegroundInfo>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return CoroutineWorker.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ForegroundInfo> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object foregroundInfo = CoroutineWorker.this.getForegroundInfo(this);
            return foregroundInfo == aVar ? aVar : foregroundInfo;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    final class C04801 extends g implements p<af, e<? super ListenableWorker.Result>, Object> {
        int label;

        C04801(e<? super C04801> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return CoroutineWorker.this.new C04801(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ListenableWorker.Result> eVar) {
            return ((C04801) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object objDoWork = CoroutineWorker.this.doWork(this);
            return objDoWork == aVar ? aVar : objDoWork;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        x.f(context, "appContext");
        x.f(workerParameters, "params");
        this.params = workerParameters;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, e<? super ForegroundInfo> eVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(e<? super ListenableWorker.Result> eVar);

    public ab getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(e<? super ForegroundInfo> eVar) {
        return getForegroundInfo$suspendImpl(this, eVar);
    }

    @Override // androidx.work.ListenableWorker
    public final bm<ForegroundInfo> getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(o.i()), null, new AnonymousClass1(null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, e<? super h.ab> eVar) throws Throwable {
        bm<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        x.e(foregroundAsync, "setForegroundAsync(...)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, eVar);
        return objAwait == a.f48038a ? objAwait : h.ab.f48028a;
    }

    public final Object setProgress(Data data, e<? super h.ab> eVar) throws Throwable {
        bm<Void> progressAsync = setProgressAsync(data);
        x.e(progressAsync, "setProgressAsync(...)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, eVar);
        return objAwait == a.f48038a ? objAwait : h.ab.f48028a;
    }

    @Override // androidx.work.ListenableWorker
    public final bm<ListenableWorker.Result> startWork() {
        ab coroutineContext = !x.n(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        x.c(coroutineContext);
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(o.i()), null, new C04801(null), 2, null);
    }
}
