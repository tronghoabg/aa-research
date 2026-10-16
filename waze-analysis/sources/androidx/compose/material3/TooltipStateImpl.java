package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private k<? super ab> job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ l<e<? super ab>, Object> $cancellableShow;
        final /* synthetic */ MutatePriority $mutatePriority;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ l<e<? super ab>, Object> $cancellableShow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(l<? super e<? super ab>, ? extends Object> lVar, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$cancellableShow = lVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.$cancellableShow, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    l<e<? super ab>, Object> lVar = this.$cancellableShow;
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
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, l<? super e<? super ab>, ? extends Object> lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$mutatePriority = mutatePriority;
            this.$cancellableShow = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return TooltipStateImpl.this.new AnonymousClass2(this.$mutatePriority, this.$cancellableShow, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        
            if (r5.invoke(r4) == r0) goto L24;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L15:
                e.b.c.b(r5)     // Catch: java.lang.Throwable -> L19
                goto L50
            L19:
                r5 = move-exception
                goto L5e
            L1b:
                e.b.c.b(r5)
                androidx.compose.material3.TooltipStateImpl r5 = androidx.compose.material3.TooltipStateImpl.this     // Catch: java.lang.Throwable -> L19
                boolean r5 = r5.isPersistent()     // Catch: java.lang.Throwable -> L19
                if (r5 != 0) goto L45
                androidx.compose.foundation.MutatePriority r5 = r4.$mutatePriority     // Catch: java.lang.Throwable -> L19
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.lang.Throwable -> L19
                if (r5 != r1) goto L2d
                goto L45
            L2d:
                androidx.compose.material3.TooltipStateImpl$show$2$1 r5 = new androidx.compose.material3.TooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L19
                h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r1 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L19
                r3 = 0
                r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L19
                h.g.a.p r5 = (h.g.a.p) r5     // Catch: java.lang.Throwable -> L19
                r1 = r4
                h.c.e r1 = (h.c.e) r1     // Catch: java.lang.Throwable -> L19
                r4.label = r2     // Catch: java.lang.Throwable -> L19
                r2 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r5 = kotlinx.coroutines.aj.G(r2, r5, r1)     // Catch: java.lang.Throwable -> L19
                if (r5 != r0) goto L50
                goto L4f
            L45:
                h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r5 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L19
                r4.label = r3     // Catch: java.lang.Throwable -> L19
                java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L19
                if (r5 != r0) goto L50
            L4f:
                return r0
            L50:
                androidx.compose.foundation.MutatePriority r5 = r4.$mutatePriority
                androidx.compose.foundation.MutatePriority r0 = androidx.compose.foundation.MutatePriority.PreventUserInput
                if (r5 == r0) goto L5b
                androidx.compose.material3.TooltipStateImpl r4 = androidx.compose.material3.TooltipStateImpl.this
                r4.dismiss()
            L5b:
                h.ab r4 = h.ab.f48028a
                return r4
            L5e:
                androidx.compose.foundation.MutatePriority r0 = r4.$mutatePriority
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.PreventUserInput
                if (r0 != r1) goto L65
                goto L6a
            L65:
                androidx.compose.material3.TooltipStateImpl r4 = androidx.compose.material3.TooltipStateImpl.this
                r4.dismiss()
            L6a:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipStateImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TooltipStateImpl(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState<>(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        k<? super ab> kVar;
        getTransition().setTargetState$animation_core(false);
        if (!isPersistent() || (kVar = this.job) == null) {
            return;
        }
        kVar.f(null);
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        k<? super ab> kVar = this.job;
        if (kVar != null) {
            kVar.f(null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, e<? super ab> eVar) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new AnonymousClass2(mutatePriority, new TooltipStateImpl$show$cancellableShow$1(this, null), null), eVar);
        return objMutate == a.f48038a ? objMutate : ab.f48028a;
    }
}
