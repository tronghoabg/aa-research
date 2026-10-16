package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FlowExtKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad, e<? super ab>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ k $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        final class C00961 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ ad $$this$callbackFlow;
            final /* synthetic */ k $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00961(k kVar, ad adVar, e<? super C00961> eVar) {
                super(2, eVar);
                this.$this_flowWithLifecycle = kVar;
                this.$$this$callbackFlow = adVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00961(this.$this_flowWithLifecycle, this.$$this$callbackFlow, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00961) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    k kVar = this.$this_flowWithLifecycle;
                    final ad adVar = this.$$this$callbackFlow;
                    this.label = 1;
                    if (kVar.collect(new l() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // kotlinx.coroutines.b.l
                        public final Object emit(T t, e<? super ab> eVar) {
                            Object objG = adVar.g(t, eVar);
                            return objG == a.f48038a ? objG : ab.f48028a;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, k kVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = kVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ad adVar;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ad adVar2 = (ad) this.L$0;
                this.L$0 = adVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new C00961(this.$this_flowWithLifecycle, adVar2, null), this) == aVar) {
                    return aVar;
                }
                adVar = adVar2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                adVar = (ad) this.L$0;
                c.b(obj);
            }
            adVar.v(null);
            return ab.f48028a;
        }
    }

    public static final <T> k<T> flowWithLifecycle(k<? extends T> kVar, Lifecycle lifecycle, Lifecycle.State state) {
        x.f(kVar, "<this>");
        x.f(lifecycle, "lifecycle");
        x.f(state, "minActiveState");
        return ai.n(new AnonymousClass1(lifecycle, state, kVar, null));
    }

    public static /* synthetic */ k flowWithLifecycle$default(k kVar, Lifecycle lifecycle, Lifecycle.State state, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(kVar, lifecycle, state);
    }
}
