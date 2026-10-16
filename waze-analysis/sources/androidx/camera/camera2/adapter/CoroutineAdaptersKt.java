package androidx.camera.camera2.adapter;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.d.m.a.bm;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CoroutineAdaptersKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CoroutineAdaptersKt.awaitUntil(null, 0L, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ am $this_awaitUntil;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(am amVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_awaitUntil = amVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$this_awaitUntil, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object objC = this.$this_awaitUntil.c(this);
            return objC == aVar ? aVar : objC;
        }
    }

    public static final <T> bm<T> asListenableFuture(final am<? extends T> amVar, final Object obj) {
        x.f(amVar, "<this>");
        bm<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda5
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                am amVar2 = amVar;
                Object obj2 = obj;
                CoroutineAdaptersKt.asListenableFuture$lambda$1(amVar2, obj2, completer);
                return obj2;
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    public static /* synthetic */ bm asListenableFuture$default(am amVar, Object obj, int i2, Object obj2) {
        if (1 == (i2 & 1)) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(amVar, obj);
    }

    static final Object asListenableFuture$lambda$0(br brVar, Object obj, final CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "completer");
        brVar.bY(new l() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return CoroutineAdaptersKt.asListenableFuture$lambda$0$0(completer, (Throwable) obj2);
            }
        });
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab asListenableFuture$lambda$0$0(CallbackToFutureAdapter.Completer completer, Throwable th) {
        if (th == null) {
            completer.set(null);
        } else if (th instanceof CancellationException) {
            completer.setCancelled();
        } else {
            completer.setException(th);
        }
        return ab.f48028a;
    }

    static final Object asListenableFuture$lambda$1(final am amVar, Object obj, final CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "completer");
        amVar.bY(new l() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return CoroutineAdaptersKt.asListenableFuture$lambda$1$0(completer, amVar, (Throwable) obj2);
            }
        });
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab asListenableFuture$lambda$1$0(CallbackToFutureAdapter.Completer completer, am amVar, Throwable th) {
        if (th == null) {
            completer.set(amVar.e());
        } else if (th instanceof CancellationException) {
            completer.setCancelled();
        } else {
            completer.setException(th);
        }
        return ab.f48028a;
    }

    public static final <T> bm<Void> asVoidListenableFuture(am<? extends T> amVar) {
        x.f(amVar, "<this>");
        FutureChain<T> futureChainTransform = FutureChain.from(asListenableFuture$default((am) amVar, (Object) null, 1, (Object) null)).transform(new Function() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return null;
            }
        }, CameraXExecutors.directExecutor());
        x.e(futureChainTransform, "transform(...)");
        return futureChainTransform;
    }

    static final Void asVoidListenableFuture$lambda$0(Object obj) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object awaitUntil(kotlinx.coroutines.am<? extends T> r4, long r5, h.c.e<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof androidx.camera.camera2.adapter.CoroutineAdaptersKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1 r0 = (androidx.camera.camera2.adapter.CoroutineAdaptersKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1 r0 = new androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2 r7 = new androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2
            r2 = 0
            r7.<init>(r4, r2)
            h.g.a.p r7 = (h.g.a.p) r7
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.I(r5, r7, r0)
            if (r7 == r1) goto L4b
        L42:
            if (r7 == 0) goto L45
            goto L46
        L45:
            r3 = 0
        L46:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.CoroutineAdaptersKt.awaitUntil(kotlinx.coroutines.am, long, h.c.e):java.lang.Object");
    }

    public static final <T> void completeFailing(CompletableDeferred<T> completableDeferred, Throwable th) {
        x.f(completableDeferred, "<this>");
        x.f(th, "cause");
        if (th instanceof CancellationException) {
            completableDeferred.s((CancellationException) th);
        } else {
            completableDeferred.b(th);
        }
    }

    public static final <T> bm<T> future(final af afVar, final l<? super e<? super T>, ? extends Object> lVar) {
        x.f(afVar, "<this>");
        x.f(lVar, "block");
        bm<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$future$resolver$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.camera.camera2.adapter.CoroutineAdaptersKt$future$resolver$1$1, reason: invalid class name */
            public final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ l<e<? super T>, Object> $block;
                final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(CallbackToFutureAdapter.Completer<T> completer, l<? super e<? super T>, ? extends Object> lVar, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.$completer = completer;
                    this.$block = lVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new AnonymousClass1(this.$completer, this.$block, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    CallbackToFutureAdapter.Completer completer;
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        e.b.c.b(obj);
                        CallbackToFutureAdapter.Completer<T> completer2 = this.$completer;
                        l<e<? super T>, Object> lVar = this.$block;
                        this.L$0 = completer2;
                        this.label = 1;
                        Object objInvoke = lVar.invoke(this);
                        if (objInvoke == aVar) {
                            return aVar;
                        }
                        obj = objInvoke;
                        completer = completer2;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CallbackToFutureAdapter.Completer completer3 = (CallbackToFutureAdapter.Completer) this.L$0;
                        e.b.c.b(obj);
                        completer = completer3;
                    }
                    completer.set(obj);
                    return ab.f48028a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object invokeSuspend$$forInline(Object obj) {
                    this.$completer.set(this.$block.invoke(this));
                    return ab.f48028a;
                }
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                x.f(completer, "completer");
                return aj.z(afVar, null, null, new AnonymousClass1(completer, lVar, null), 3);
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    public static final <T, R> void propagateCompletion(am<? extends T> amVar, CompletableDeferred<R> completableDeferred, Throwable th, l<? super T, ? extends R> lVar) {
        x.f(amVar, "<this>");
        x.f(completableDeferred, "destination");
        x.f(lVar, "transform");
        if (th != null) {
            completeFailing(completableDeferred, th);
        } else {
            completableDeferred.a(lVar.invoke((Object) amVar.e()));
        }
    }

    public static final <T, R> void propagateTo(final am<? extends T> amVar, final CompletableDeferred<R> completableDeferred, final l<? super T, ? extends R> lVar) {
        x.f(amVar, "<this>");
        x.f(completableDeferred, "destination");
        x.f(lVar, "transform");
        amVar.bY(new l() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CoroutineAdaptersKt.propagateTo$lambda$1(amVar, completableDeferred, lVar, (Throwable) obj);
            }
        });
    }

    static final ab propagateTo$lambda$0(am amVar, CompletableDeferred completableDeferred, Throwable th) {
        propagateCompletion(amVar, completableDeferred, th);
        return ab.f48028a;
    }

    static final ab propagateTo$lambda$1(am amVar, CompletableDeferred completableDeferred, l lVar, Throwable th) {
        propagateCompletion(amVar, completableDeferred, th, lVar);
        return ab.f48028a;
    }

    public static /* synthetic */ bm asListenableFuture$default(br brVar, Object obj, int i2, Object obj2) {
        if (1 == (i2 & 1)) {
            obj = "Job.asListenableFuture";
        }
        return asListenableFuture(brVar, obj);
    }

    public static final bm<Void> asListenableFuture(final br brVar, final Object obj) {
        x.f(brVar, "<this>");
        bm<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                br brVar2 = brVar;
                Object obj2 = obj;
                CoroutineAdaptersKt.asListenableFuture$lambda$0(brVar2, obj2, completer);
                return obj2;
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    public static final <T> void propagateTo(final am<? extends T> amVar, final CompletableDeferred<T> completableDeferred) {
        x.f(amVar, "<this>");
        x.f(completableDeferred, "destination");
        amVar.bY(new l() { // from class: androidx.camera.camera2.adapter.CoroutineAdaptersKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CoroutineAdaptersKt.propagateTo$lambda$0(amVar, completableDeferred, (Throwable) obj);
            }
        });
    }

    public static final <T> void propagateCompletion(am<? extends T> amVar, CompletableDeferred<T> completableDeferred, Throwable th) {
        x.f(amVar, "<this>");
        x.f(completableDeferred, "destination");
        if (th != null) {
            completeFailing(completableDeferred, th);
        } else {
            completableDeferred.a(amVar.e());
        }
    }
}
