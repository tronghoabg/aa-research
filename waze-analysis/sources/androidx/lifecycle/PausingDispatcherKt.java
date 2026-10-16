package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.br;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PausingDispatcherKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ p<af, e, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, p<? super af, ? super e, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            LifecycleController lifecycleController;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    c.b(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            c.b(obj);
            br brVar = (br) ((af) this.L$0).getCoroutineContext().get(br.f51766a);
            if (brVar == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, brVar);
            try {
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = aj.v(pausingDispatcher, this.$block, this);
                if (obj == aVar) {
                    return aVar;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, eVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, eVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, eVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        int i2 = av.f51370a;
        return aj.v(ac.f51860a.c(), new AnonymousClass2(lifecycle, state, pVar, null), eVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, eVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, eVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, p<? super af, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, eVar);
    }
}
