package androidx.camera.camera2.pipe.core;

import android.os.Handler;
import e.b.c;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.f;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Threads {
    private final f<Executor> _camera2Executor;
    private final f<Handler> _camera2Handler;
    private final ab backgroundDispatcher;
    private final Executor backgroundExecutor;
    private final ab blockingDispatcher;
    private final Executor blockingExecutor;
    private final af cameraPipeDispatchScope;
    private final af cameraPipeScope;
    private final ab lightweightDispatcher;
    private final Executor lightweightExecutor;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.Threads$runAsyncSupervised$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ l<e, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super e, ? extends Object> lVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<h.ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
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
            l<e, Object> lVar = this.$block;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    public Threads(af afVar, af afVar2, Executor executor, ab abVar, Executor executor2, ab abVar2, Executor executor3, ab abVar3, final h.g.a.a<? extends Handler> aVar, final h.g.a.a<? extends Executor> aVar2) {
        x.f(afVar, "cameraPipeScope");
        x.f(afVar2, "cameraPipeDispatchScope");
        x.f(executor, "blockingExecutor");
        x.f(abVar, "blockingDispatcher");
        x.f(executor2, "backgroundExecutor");
        x.f(abVar2, "backgroundDispatcher");
        x.f(executor3, "lightweightExecutor");
        x.f(abVar3, "lightweightDispatcher");
        x.f(aVar, "camera2Handler");
        x.f(aVar2, "camera2Executor");
        this.cameraPipeScope = afVar;
        this.cameraPipeDispatchScope = afVar2;
        this.blockingExecutor = executor;
        this.blockingDispatcher = abVar;
        this.backgroundExecutor = executor2;
        this.backgroundDispatcher = abVar2;
        this.lightweightExecutor = executor3;
        this.lightweightDispatcher = abVar3;
        this._camera2Handler = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Threads._camera2Handler$lambda$0(aVar);
            }
        });
        this._camera2Executor = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Threads._camera2Executor$lambda$0(aVar2);
            }
        });
    }

    static final Executor _camera2Executor$lambda$0(h.g.a.a aVar) {
        return (Executor) aVar.invoke();
    }

    static final Handler _camera2Handler$lambda$0(h.g.a.a aVar) {
        return (Handler) aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> am<T> runAsyncSupervised(ab abVar, l<? super e<? super T>, ? extends Object> lVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lVar, null);
        return aj.y(this.cameraPipeDispatchScope, abVar, null, anonymousClass1, 2);
    }

    public final ab getBackgroundDispatcher() {
        return this.backgroundDispatcher;
    }

    public final Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    public final ab getBlockingDispatcher() {
        return this.blockingDispatcher;
    }

    public final Executor getBlockingExecutor() {
        return this.blockingExecutor;
    }

    public final Executor getCamera2Executor() {
        return this._camera2Executor.getValue();
    }

    public final Handler getCamera2Handler() {
        return this._camera2Handler.getValue();
    }

    public final af getCameraPipeScope() {
        return this.cameraPipeScope;
    }

    public final ab getLightweightDispatcher() {
        return this.lightweightDispatcher;
    }

    public final Executor getLightweightExecutor() {
        return this.lightweightExecutor;
    }

    /* renamed from: runBlockingChecked-VtjQ1oo, reason: not valid java name */
    public final <T> T m1118runBlockingCheckedVtjQ1oo(long j2, l<? super e<? super T>, ? extends Object> lVar) {
        x.f(lVar, "block");
        return (T) aj.u(this.blockingDispatcher, new Threads$runBlockingChecked$1(this, lVar, j2, null));
    }

    /* renamed from: runBlockingCheckedOrNull-VtjQ1oo, reason: not valid java name */
    public final <T> T m1119runBlockingCheckedOrNullVtjQ1oo(long j2, l<? super e<? super T>, ? extends Object> lVar) {
        x.f(lVar, "block");
        try {
            return (T) aj.u(this.blockingDispatcher, new Threads$runBlockingCheckedOrNull$1(this, lVar, j2, null));
        } catch (InterruptedException e2) {
            InterruptedException interruptedException = e2;
            if (!Log.INSTANCE.getINFO_LOGGABLE()) {
                return null;
            }
            android.util.Log.i(Log.TAG, "runBlockingCheckedOrNull cancelled by thread interruption", interruptedException);
            return null;
        }
    }
}
