package androidx.lifecycle.compose;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends g implements p<ProduceStateScope, e<? super ab>, Object> {
    final /* synthetic */ j $context;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ k $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ ProduceStateScope $$this$produceState;
        final /* synthetic */ j $context;
        final /* synthetic */ k $this_collectAsStateWithLifecycle;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ ProduceStateScope $$this$produceState;
            final /* synthetic */ k $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(k kVar, ProduceStateScope produceStateScope, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.$this_collectAsStateWithLifecycle = kVar;
                this.$$this$produceState = produceStateScope;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    k kVar = this.$this_collectAsStateWithLifecycle;
                    final ProduceStateScope produceStateScope = this.$$this$produceState;
                    this.label = 1;
                    if (kVar.collect(new l() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.2.1
                        @Override // kotlinx.coroutines.b.l
                        public final Object emit(T t, e<? super ab> eVar) {
                            produceStateScope.setValue(t);
                            return ab.f48028a;
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
        AnonymousClass1(j jVar, k kVar, ProduceStateScope produceStateScope, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$context = jVar;
            this.$this_collectAsStateWithLifecycle = kVar;
            this.$$this$produceState = produceStateScope;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r7.collect(new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.C01001(), r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (kotlinx.coroutines.aj.v(r6.$context, new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.AnonymousClass2(r6.$this_collectAsStateWithLifecycle, r6.$$this$produceState, null), r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            return r0;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L15:
                e.b.c.b(r7)
                goto L57
            L19:
                e.b.c.b(r7)
                h.c.j r7 = r6.$context
                h.c.k r1 = h.c.k.f48060a
                boolean r7 = h.g.b.x.n(r7, r1)
                if (r7 == 0) goto L3d
                kotlinx.coroutines.b.k r7 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.ProduceStateScope r1 = r6.$$this$produceState
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 r2 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1
                r2.<init>()
                kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
                r1 = r6
                h.c.e r1 = (h.c.e) r1
                r6.label = r3
                java.lang.Object r6 = r7.collect(r2, r1)
                if (r6 != r0) goto L57
                goto L56
            L3d:
                h.c.j r7 = r6.$context
                kotlinx.coroutines.b.k r1 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.ProduceStateScope r3 = r6.$$this$produceState
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r4 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                r5 = 0
                r4.<init>(r1, r3, r5)
                h.g.a.p r4 = (h.g.a.p) r4
                r1 = r6
                h.c.e r1 = (h.c.e) r1
                r6.label = r2
                java.lang.Object r6 = kotlinx.coroutines.aj.v(r7, r4, r1)
                if (r6 != r0) goto L57
            L56:
                return r0
            L57:
                h.ab r6 = h.ab.f48028a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, j jVar, k kVar, e<? super FlowExtKt$collectAsStateWithLifecycle$1$1> eVar) {
        super(2, eVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$context = jVar;
        this.$this_collectAsStateWithLifecycle = kVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, eVar);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ProduceStateScope produceStateScope, e<? super ab> eVar) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(produceStateScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, produceStateScope, null), this) == aVar) {
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
