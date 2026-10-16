package androidx.compose.material3.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
final class BasicTooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private final MutableState isVisible$delegate;
    private k<? super ab> job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition = new MutableTransitionState<>(false);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.BasicTooltipStateImpl$show$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ l<e<? super ab>, Object> $cancellableShow;
        final /* synthetic */ MutatePriority $mutatePriority;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
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
            return BasicTooltipStateImpl.this.new AnonymousClass2(this.$mutatePriority, this.$cancellableShow, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            if (r6.invoke(r5) == r0) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [h.ab, java.lang.Object] */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r5.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L16
                if (r1 != r3) goto Le
                goto L16
            Le:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L16:
                e.b.c.b(r6)     // Catch: java.lang.Throwable -> L1a
                goto L51
            L1a:
                r6 = move-exception
                goto L59
            L1c:
                e.b.c.b(r6)
                androidx.compose.material3.internal.BasicTooltipStateImpl r6 = androidx.compose.material3.internal.BasicTooltipStateImpl.this     // Catch: java.lang.Throwable -> L1a
                boolean r6 = r6.isPersistent()     // Catch: java.lang.Throwable -> L1a
                if (r6 != 0) goto L46
                androidx.compose.foundation.MutatePriority r6 = r5.$mutatePriority     // Catch: java.lang.Throwable -> L1a
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.lang.Throwable -> L1a
                if (r6 != r1) goto L2e
                goto L46
            L2e:
                androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1 r6 = new androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L1a
                h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r1 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L1a
                r4 = 0
                r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1a
                h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.lang.Throwable -> L1a
                r1 = r5
                h.c.e r1 = (h.c.e) r1     // Catch: java.lang.Throwable -> L1a
                r5.label = r3     // Catch: java.lang.Throwable -> L1a
                r3 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = kotlinx.coroutines.aj.G(r3, r6, r1)     // Catch: java.lang.Throwable -> L1a
                if (r6 != r0) goto L51
                goto L50
            L46:
                h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r6 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L1a
                r5.label = r4     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L1a
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                androidx.compose.material3.internal.BasicTooltipStateImpl r5 = androidx.compose.material3.internal.BasicTooltipStateImpl.this
                r5.setVisible(r2)
                h.ab r5 = h.ab.f48028a
                return r5
            L59:
                androidx.compose.material3.internal.BasicTooltipStateImpl r5 = androidx.compose.material3.internal.BasicTooltipStateImpl.this
                r5.setVisible(r2)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipStateImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BasicTooltipStateImpl(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        k<? super ab> kVar = this.job;
        if (kVar != null) {
            kVar.f(null);
        }
    }

    public void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, e<? super ab> eVar) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new AnonymousClass2(mutatePriority, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), eVar);
        return objMutate == a.f48038a ? objMutate : ab.f48028a;
    }
}
