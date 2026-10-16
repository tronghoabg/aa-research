package androidx.camera.camera2.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.media3.extractor.text.ttml.TtmlNode;
import e.b.c;
import h.a.i;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseThreads {
    private final ab backgroundDispatcher;
    private final Executor backgroundExecutor;
    private final ThreadLocal<Boolean> isSequentialThread;
    private final Handler mainHandler;
    private final af scope;
    private final ab sequentialDispatcher;
    private final Executor sequentialExecutor;
    private final Executor sequentialExecutorDelegate;
    private af sequentialScope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseThreads$confineDeferred$1, reason: invalid class name */
    public final class AnonymousClass1 extends g implements p<af, e<? super h.ab>, Object> {
        final /* synthetic */ a<am> $block;
        final /* synthetic */ CompletableDeferred $signal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(a<? extends am> aVar, CompletableDeferred completableDeferred, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$block = aVar;
            this.$signal = completableDeferred;
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$block, this.$signal, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super h.ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            CoroutineAdaptersKt.propagateTo(this.$block.invoke(), this.$signal);
            return h.ab.f48028a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            CoroutineAdaptersKt.propagateTo(this.$block.invoke(), this.$signal);
            return h.ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseThreads$confineDeferredList$1, reason: invalid class name and case insensitive filesystem */
    public final class C01511 extends g implements p<af, e<? super h.ab>, Object> {
        final /* synthetic */ a<List<am>> $block;
        final /* synthetic */ List<CompletableDeferred> $deferredList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01511(a<? extends List<? extends am>> aVar, List<? extends CompletableDeferred> list, e<? super C01511> eVar) {
            super(2, eVar);
            this.$block = aVar;
            this.$deferredList = list;
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return new C01511(this.$block, this.$deferredList, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super h.ab> eVar) {
            return ((C01511) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            List<am> listInvoke = this.$block.invoke();
            List<CompletableDeferred> list = this.$deferredList;
            int i2 = 0;
            for (Object obj2 : listInvoke) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                CoroutineAdaptersKt.propagateTo((am) obj2, list.get(i2));
                i2 = i3;
            }
            return h.ab.f48028a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            int i2 = 0;
            for (Object obj2 : this.$block.invoke()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                CoroutineAdaptersKt.propagateTo((am) obj2, this.$deferredList.get(Integer.valueOf(i2).intValue()));
                i2 = i3;
            }
            return h.ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1, reason: invalid class name and case insensitive filesystem */
    public final class C01521 extends g implements p<af, e<? super h.ab>, Object> {
        final /* synthetic */ l<e<? super List<? extends am>>, Object> $block;
        final /* synthetic */ List<CompletableDeferred> $deferredList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01521(l<? super e<? super List<? extends am>>, ? extends Object> lVar, List<? extends CompletableDeferred> list, e<? super C01521> eVar) {
            super(2, eVar);
            this.$block = lVar;
            this.$deferredList = list;
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return new C01521(this.$block, this.$deferredList, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super h.ab> eVar) {
            return ((C01521) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                l<e<? super List<? extends am>>, Object> lVar = this.$block;
                this.label = 1;
                obj = lVar.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            List<CompletableDeferred> list = this.$deferredList;
            int i3 = 0;
            for (Object obj2 : (Iterable) obj) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    i.p();
                }
                CoroutineAdaptersKt.propagateTo((am) obj2, list.get(i3));
                i3 = i4;
            }
            return h.ab.f48028a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            int i2 = 0;
            for (Object obj2 : (Iterable) this.$block.invoke(this)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                CoroutineAdaptersKt.propagateTo((am) obj2, this.$deferredList.get(Integer.valueOf(i2).intValue()));
                i2 = i3;
            }
            return h.ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1, reason: invalid class name and case insensitive filesystem */
    public final class C01531 extends g implements p<af, e<? super h.ab>, Object> {
        final /* synthetic */ l<e<? super am>, Object> $block;
        final /* synthetic */ CompletableDeferred $signal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01531(l<? super e<? super am>, ? extends Object> lVar, CompletableDeferred completableDeferred, e<? super C01531> eVar) {
            super(2, eVar);
            this.$block = lVar;
            this.$signal = completableDeferred;
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return new C01531(this.$block, this.$signal, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super h.ab> eVar) {
            return ((C01531) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                l<e<? super am>, Object> lVar = this.$block;
                this.label = 1;
                obj = lVar.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            CoroutineAdaptersKt.propagateTo((am) obj, this.$signal);
            return h.ab.f48028a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            CoroutineAdaptersKt.propagateTo((am) this.$block.invoke(this), this.$signal);
            return h.ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseThreads$confineLaunch$1, reason: invalid class name and case insensitive filesystem */
    public final class C01541 extends g implements p<af, e<? super h.ab>, Object> {
        final /* synthetic */ l<e<? super h.ab>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01541(l<? super e<? super h.ab>, ? extends Object> lVar, e<? super C01541> eVar) {
            super(2, eVar);
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return new C01541(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super h.ab> eVar) {
            return ((C01541) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                l<e<? super h.ab>, Object> lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return h.ab.f48028a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$block.invoke(this);
            return h.ab.f48028a;
        }
    }

    public UseCaseThreads(af afVar, Executor executor, ab abVar) {
        x.f(afVar, "scope");
        x.f(executor, "backgroundExecutor");
        x.f(abVar, "backgroundDispatcher");
        this.scope = afVar;
        this.backgroundExecutor = executor;
        this.backgroundDispatcher = abVar;
        this.mainHandler = new Handler(Looper.getMainLooper());
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        x.e(executorNewSequentialExecutor, "newSequentialExecutor(...)");
        this.sequentialExecutorDelegate = executorNewSequentialExecutor;
        this.isSequentialThread = new ThreadLocal<>();
        Executor executor2 = new Executor() { // from class: androidx.camera.camera2.impl.UseCaseThreads$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                UseCaseThreads useCaseThreads = this.f$0;
                useCaseThreads.sequentialExecutorDelegate.execute(new Runnable() { // from class: androidx.camera.camera2.impl.UseCaseThreads$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UseCaseThreads.sequentialExecutor$lambda$0$0(useCaseThreads, runnable);
                    }
                });
            }
        };
        this.sequentialExecutor = executor2;
        ab abVarF = bo.f(executor2);
        this.sequentialDispatcher = abVarF;
        this.sequentialScope = aj.e(afVar.getCoroutineContext().plus(aj.Q()).plus(abVarF));
    }

    public static /* synthetic */ List confineDeferredListSuspend$default(UseCaseThreads useCaseThreads, int i2, ag agVar, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            agVar = ag.f51342a;
        }
        x.f(agVar, TtmlNode.START);
        x.f(lVar, "block");
        ArrayList arrayList = new ArrayList(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(bo.j());
        }
        ArrayList arrayList2 = arrayList;
        aj.z(useCaseThreads.getSequentialScope(), null, agVar, new C01521(lVar, arrayList2, null), 1);
        return arrayList2;
    }

    public static /* synthetic */ am confineDeferredSuspend$default(UseCaseThreads useCaseThreads, l lVar, ag agVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            agVar = ag.f51342a;
        }
        x.f(lVar, "block");
        x.f(agVar, TtmlNode.START);
        CompletableDeferred completableDeferredJ = bo.j();
        aj.z(useCaseThreads.getSequentialScope(), null, agVar, new C01531(lVar, completableDeferredJ, null), 1);
        return completableDeferredJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sequentialExecutor$lambda$0$0(UseCaseThreads useCaseThreads, Runnable runnable) {
        useCaseThreads.isSequentialThread.set(true);
        try {
            runnable.run();
        } finally {
            useCaseThreads.isSequentialThread.remove();
        }
    }

    public final void checkOnSequentialThread() {
        if (!isOnSequentialThread()) {
            throw new IllegalStateException("Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ".concat(String.valueOf(Thread.currentThread().getName())));
        }
    }

    public final <T> am<T> confineDeferred(a<? extends am<? extends T>> aVar) {
        x.f(aVar, "block");
        CompletableDeferred completableDeferredJ = bo.j();
        aj.z(getSequentialScope(), null, null, new AnonymousClass1(aVar, completableDeferredJ, null), 3);
        return completableDeferredJ;
    }

    public final <T> List<am<T>> confineDeferredList(int i2, a<? extends List<? extends am<? extends T>>> aVar) {
        x.f(aVar, "block");
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(bo.j());
        }
        ArrayList arrayList2 = arrayList;
        aj.z(getSequentialScope(), null, null, new C01511(aVar, arrayList2, null), 3);
        return arrayList2;
    }

    public final <T> List<am<T>> confineDeferredListSuspend(int i2, ag agVar, l<? super e<? super List<? extends am<? extends T>>>, ? extends Object> lVar) {
        x.f(agVar, TtmlNode.START);
        x.f(lVar, "block");
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(bo.j());
        }
        ArrayList arrayList2 = arrayList;
        aj.z(getSequentialScope(), null, agVar, new C01521(lVar, arrayList2, null), 1);
        return arrayList2;
    }

    public final <T> am<T> confineDeferredSuspend(l<? super e<? super am<? extends T>>, ? extends Object> lVar, ag agVar) {
        x.f(lVar, "block");
        x.f(agVar, TtmlNode.START);
        CompletableDeferred completableDeferredJ = bo.j();
        aj.z(getSequentialScope(), null, agVar, new C01531(lVar, completableDeferredJ, null), 1);
        return completableDeferredJ;
    }

    public final br confineLaunch(l<? super e<? super h.ab>, ? extends Object> lVar) {
        x.f(lVar, "block");
        return aj.z(getSequentialScope(), null, null, new C01541(lVar, null), 3);
    }

    public final ab getBackgroundDispatcher() {
        return this.backgroundDispatcher;
    }

    public final Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    public final Handler getMainHandler() {
        return this.mainHandler;
    }

    public final af getScope() {
        return this.scope;
    }

    public final Executor getSequentialExecutor() {
        return this.sequentialExecutor;
    }

    public final af getSequentialScope() {
        return this.sequentialScope;
    }

    public final boolean isOnSequentialThread() {
        return x.n(this.isSequentialThread.get(), true);
    }

    public final void setSequentialScope(af afVar) {
        x.f(afVar, "<set-?>");
        this.sequentialScope = afVar;
    }
}
