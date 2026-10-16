package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.p;
import h.g.b.x;
import j$.time.Duration;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.cl;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FlowLiveDataConversions {

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad, e<? super ab>, Object> {
        final /* synthetic */ LiveData $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        final class C00981 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ Observer $observer;
            final /* synthetic */ LiveData $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00981(LiveData liveData, Observer observer, e<? super C00981> eVar) {
                super(2, eVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00981(this.$this_asFlow, this.$observer, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00981) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ Observer $observer;
            final /* synthetic */ LiveData $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LiveData liveData, Observer observer, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData liveData, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$this_asFlow = liveData;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            a aVar = a.f48038a;
            ?? r1 = this.label;
            try {
            } catch (Throwable th) {
                int i2 = av.f51370a;
                this.L$0 = th;
                this.label = 3;
                if (aj.v(ac.f51860a.c().plus(cl.f51810b), new AnonymousClass2(this.$this_asFlow, r1, null), this) != aVar) {
                    throw th;
                }
            }
            if (r1 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                Observer observer2 = new Observer() { // from class: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        adVar.i(obj2);
                    }
                };
                int i3 = av.f51370a;
                this.L$0 = observer2;
                this.label = 1;
                Object objV = aj.v(ac.f51860a.c(), new C00981(this.$this_asFlow, observer2, null), this);
                observer = observer2;
                if (objV != aVar) {
                }
                return aVar;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    Observer observer3 = (Observer) this.L$0;
                    c.b(obj);
                    r1 = observer3;
                    throw new h.e();
                }
                if (r1 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                c.b(obj);
                throw th2;
            }
            Observer observer4 = (Observer) this.L$0;
            c.b(obj);
            observer = observer4;
            this.L$0 = observer;
            this.label = 2;
            r1 = observer;
            if (aj.p(this) == aVar) {
                return aVar;
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    final class C04411 extends g implements p<LiveDataScope, e<? super ab>, Object> {
        final /* synthetic */ k $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04411(k kVar, e<? super C04411> eVar) {
            super(2, eVar);
            this.$this_asLiveData = kVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C04411 c04411 = new C04411(this.$this_asLiveData, eVar);
            c04411.L$0 = obj;
            return c04411;
        }

        @Override // h.g.a.p
        public final Object invoke(LiveDataScope liveDataScope, e<? super ab> eVar) {
            return ((C04411) create(liveDataScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                this.label = 1;
                if (this.$this_asLiveData.collect(new l() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // kotlinx.coroutines.b.l
                    public final Object emit(T t, e<? super ab> eVar) {
                        Object objEmit = liveDataScope.emit(t, eVar);
                        return objEmit == a.f48038a ? objEmit : ab.f48028a;
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public static final <T> k<T> asFlow(LiveData<T> liveData) {
        x.f(liveData, "<this>");
        return ai.u(ai.n(new AnonymousClass1(liveData, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(k<? extends T> kVar, j jVar, long j2) {
        x.f(kVar, "<this>");
        x.f(jVar, "context");
        CoroutineLiveData coroutineLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(jVar, j2, new C04411(kVar, null));
        if (kVar instanceof ch) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                coroutineLiveData.setValue(((ch) kVar).d());
                return coroutineLiveData;
            }
            coroutineLiveData.postValue(((ch) kVar).d());
        }
        return coroutineLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(k kVar, j jVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = h.c.k.f48060a;
        }
        if ((i2 & 2) != 0) {
            j2 = 5000;
        }
        return asLiveData(kVar, jVar, j2);
    }

    public static /* synthetic */ LiveData asLiveData$default(k kVar, Duration duration, j jVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = h.c.k.f48060a;
        }
        return asLiveData(kVar, duration, jVar);
    }

    public static final <T> LiveData<T> asLiveData(k<? extends T> kVar, j jVar) {
        x.f(kVar, "<this>");
        x.f(jVar, "context");
        return asLiveData$default(kVar, jVar, 0L, 2, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(k<? extends T> kVar) {
        x.f(kVar, "<this>");
        return asLiveData$default(kVar, (j) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(k<? extends T> kVar, Duration duration, j jVar) {
        x.f(kVar, "<this>");
        x.f(duration, "timeout");
        x.f(jVar, "context");
        return asLiveData(kVar, jVar, Api26Impl.INSTANCE.toMillis(duration));
    }
}
