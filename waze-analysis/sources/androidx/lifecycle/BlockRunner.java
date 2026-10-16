package androidx.lifecycle;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.br;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BlockRunner<T> {
    private final p<LiveDataScope<T>, e<? super ab>, Object> block;
    private br cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final a<ab> onDone;
    private br runningJob;
    private final af scope;
    private final long timeoutInMs;

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.BlockRunner$cancel$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BlockRunner<T> blockRunner, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = blockRunner;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(((BlockRunner) this.this$0).timeoutInMs, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                br brVar = ((BlockRunner) this.this$0).runningJob;
                if (brVar != null) {
                    brVar.s(null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.BlockRunner$maybeRun$1, reason: invalid class name and case insensitive filesystem */
    final class C04401 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04401(BlockRunner<T> blockRunner, e<? super C04401> eVar) {
            super(2, eVar);
            this.this$0 = blockRunner;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C04401 c04401 = new C04401(this.this$0, eVar);
            c04401.L$0 = obj;
            return c04401;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04401) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((af) this.L$0).getCoroutineContext());
                p pVar = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (pVar.invoke(liveDataScopeImpl, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(CoroutineLiveData<T> coroutineLiveData, p<? super LiveDataScope<T>, ? super e<? super ab>, ? extends Object> pVar, long j2, af afVar, a<ab> aVar) {
        x.f(coroutineLiveData, "liveData");
        x.f(pVar, "block");
        x.f(afVar, "scope");
        x.f(aVar, "onDone");
        this.liveData = coroutineLiveData;
        this.block = pVar;
        this.timeoutInMs = j2;
        this.scope = afVar;
        this.onDone = aVar;
    }

    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        af afVar = this.scope;
        int i2 = av.f51370a;
        this.cancellationJob = aj.z(afVar, ac.f51860a.c(), null, new AnonymousClass1(this, null), 2);
    }

    public final void maybeRun() {
        br brVar = this.cancellationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = aj.z(this.scope, null, null, new C04401(this, null), 3);
    }
}
