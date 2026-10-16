package androidx.room.coroutines;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.c.k;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RunBlockingUninterruptible_androidKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ p<af, e, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name and collision with other inner class name */
        final class C01061 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ p<af, e, Object> $block;
            final /* synthetic */ CompletableDeferred $deferred;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01061(CompletableDeferred completableDeferred, p<? super af, ? super e, ? extends Object> pVar, e<? super C01061> eVar) {
                super(2, eVar);
                this.$deferred = completableDeferred;
                this.$block = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C01061 c01061 = new C01061(this.$deferred, this.$block, eVar);
                c01061.L$0 = obj;
                return c01061;
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C01061) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                Throwable th;
                CompletableDeferred completableDeferred;
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    af afVar = (af) this.L$0;
                    CompletableDeferred completableDeferred2 = this.$deferred;
                    p<af, e, Object> pVar = this.$block;
                    try {
                        this.L$0 = completableDeferred2;
                        this.label = 1;
                        obj = pVar.invoke(afVar, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        completableDeferred = completableDeferred2;
                    } catch (Throwable th2) {
                        th = th2;
                        completableDeferred = completableDeferred2;
                        obj = c.a(th);
                        bo.i(completableDeferred, obj);
                        return ab.f48028a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) this.L$0;
                    try {
                        c.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        obj = c.a(th);
                        bo.i(completableDeferred, obj);
                        return ab.f48028a;
                    }
                }
                bo.i(completableDeferred, obj);
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<af, e, Object> {
            final /* synthetic */ CompletableDeferred $deferred;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CompletableDeferred completableDeferred, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.$deferred = completableDeferred;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass2(this.$deferred, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e eVar) {
                return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
                Object objC = this.$deferred.c(this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super af, ? super e, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            h hVar = ((af) this.L$0).getCoroutineContext().get(h.c.g.f48059a);
            x.c(hVar);
            h.c.g gVar = (h.c.g) hVar;
            CompletableDeferred completableDeferredJ = bo.j();
            aj.x(bj.f51758a, gVar, ag.f51345d, new C01061(completableDeferredJ, this.$block, null));
            while (!completableDeferredJ.ca()) {
                try {
                    return aj.u(gVar, new AnonymousClass2(completableDeferredJ, null));
                } catch (InterruptedException unused) {
                }
            }
            return completableDeferredJ.e();
        }
    }

    public static final <T> T runBlockingUninterruptible(p<? super af, ? super e<? super T>, ? extends Object> pVar) {
        x.f(pVar, "block");
        Thread.interrupted();
        return (T) aj.t(k.f48060a, new AnonymousClass1(pVar, null));
    }
}
