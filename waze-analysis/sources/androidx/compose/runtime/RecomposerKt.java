package androidx.compose.runtime;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RecomposerKt {
    public static final int recomposerKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ q<af, Recomposer, e, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ Recomposer $recomposer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Recomposer recomposer, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$recomposer = recomposer;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.$recomposer, eVar);
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
                    this.label = 1;
                    if (this.$recomposer.runRecomposeAndApplyChanges(this) == aVar) {
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
        AnonymousClass2(q<? super af, ? super Recomposer, ? super e, ? extends Object> qVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = qVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Recomposer recomposer;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                recomposer = new Recomposer(afVar.getCoroutineContext());
                aj.z(afVar, null, null, new AnonymousClass1(recomposer, null), 3);
                q<af, Recomposer, e, Object> qVar = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = qVar.invoke(afVar, recomposer, this);
                if (obj != aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                c.b(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.L$0;
            c.b(obj);
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == aVar ? aVar : obj;
        }
    }

    private static final long getRecomposerCompoundHashKey() {
        return 1000L;
    }

    public static final <R> Object withRunningRecomposer(q<? super af, ? super Recomposer, ? super e<? super R>, ? extends Object> qVar, e<? super R> eVar) {
        return aj.d(new AnonymousClass2(qVar, null), eVar);
    }
}
