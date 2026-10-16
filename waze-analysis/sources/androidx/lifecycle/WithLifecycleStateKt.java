package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import e.b.c;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.a.a;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;
import kotlinx.coroutines.cj;
import kotlinx.coroutines.e.ac;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WithLifecycleStateKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    public final class AnonymousClass2 implements a {
        final /* synthetic */ a $block;

        public AnonymousClass2(a aVar) {
            this.$block = aVar;
        }

        @Override // h.g.a.a
        public final Object invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z, final ab abVar, final a<? extends R> aVar, e<? super R> eVar) {
        l lVar = new l(h.d(eVar), 1);
        lVar.u();
        final l lVar2 = lVar;
        final ?? r2 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object objA;
                x.f(lifecycleOwner, "source");
                x.f(event, NotificationCompat.CATEGORY_EVENT);
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        lVar2.resumeWith(c.a(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                k kVar = lVar2;
                try {
                    objA = aVar.invoke();
                } catch (Throwable th) {
                    objA = c.a(th);
                }
                kVar.resumeWith(objA);
            }
        };
        if (z) {
            abVar.dispatch(h.c.k.f48060a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r2);
                }
            });
        } else {
            lifecycle.addObserver((LifecycleObserver) r2);
        }
        lVar2.c(new h.g.a.l<Throwable, h.ab>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                h.c.k kVar = h.c.k.f48060a;
                if (!abVar.isDispatchNeeded(kVar)) {
                    lifecycle.removeObserver(r2);
                    return;
                }
                ab abVar2 = abVar;
                final Lifecycle lifecycle2 = lifecycle;
                final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r2;
                abVar2.dispatch(kVar, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lifecycle2.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                    }
                });
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ h.ab invoke(Throwable th) {
                invoke2(th);
                return h.ab.f48028a;
            }
        });
        Object objJ = lVar.j();
        if (objJ == h.c.a.a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, a<? extends R> aVar, e<? super R> eVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, a<? extends R> aVar, e<? super R> eVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, a<? extends R> aVar, e<? super R> eVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            Objects.toString(state);
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)));
        }
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, a<? extends R> aVar, e<? super R> eVar) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            Objects.toString(state);
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)));
        }
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, a<? extends R> aVar, e<? super R> eVar) {
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, a<? extends R> aVar, e<? super R> eVar) {
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        int i2 = av.f51370a;
        ac.f51860a.c();
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, a<? extends R> aVar, e<? super R> eVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            int i2 = av.f51370a;
            ac.f51860a.c();
            throw null;
        }
        Objects.toString(state);
        throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)));
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, a<? extends R> aVar, e<? super R> eVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        int i2 = av.f51370a;
        cj cjVarC = ac.f51860a.c();
        boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, a<? extends R> aVar, e<? super R> eVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            int i2 = av.f51370a;
            cj cjVarC = ac.f51860a.c();
            boolean zIsDispatchNeeded = cjVarC.isDispatchNeeded(eVar.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cjVarC, new AnonymousClass2(aVar), eVar);
        }
        Objects.toString(state);
        throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)));
    }
}
