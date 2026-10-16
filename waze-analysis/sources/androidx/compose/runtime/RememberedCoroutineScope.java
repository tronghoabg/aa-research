package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import h.c.j;
import h.c.k;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;
import kotlinx.coroutines.bt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements RememberObserver, af {
    private volatile j _coroutineContext;
    private final Object lock = this;
    private final j overlayContext;
    private final j parentContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final j CancelledCoroutineContext = new CancelledCoroutineContext();

    public RememberedCoroutineScope(j jVar, j jVar2) {
        this.parentContext = jVar;
        this.overlayContext = jVar2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            j jVar = this._coroutineContext;
            if (jVar == null) {
                this._coroutineContext = CancelledCoroutineContext;
            } else {
                o.e(jVar, new ForgottenCoroutineScopeException());
            }
        }
    }

    @Override // kotlinx.coroutines.af
    public j getCoroutineContext() {
        j jVarPlus;
        j jVar = this._coroutineContext;
        if (jVar == null || jVar == CancelledCoroutineContext) {
            CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.parentContext.get(CompositionErrorContextImpl.Key);
            k rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = compositionErrorContextImpl != null ? new RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.f51269c, compositionErrorContextImpl, this) : k.f48060a;
            synchronized (this.lock) {
                jVarPlus = this._coroutineContext;
                if (jVarPlus == null) {
                    j jVar2 = this.parentContext;
                    jVarPlus = jVar2.plus(new bt((br) jVar2.get(br.f51766a))).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                } else if (jVarPlus == CancelledCoroutineContext) {
                    j jVar3 = this.parentContext;
                    bt btVar = new bt((br) jVar3.get(br.f51766a));
                    btVar.s(new ForgottenCoroutineScopeException());
                    jVarPlus = jVar3.plus(btVar).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        jVarPlus = jVarPlus.plus(RememberedCoroutineScopeTracingContext.INSTANCE);
                    }
                }
                this._coroutineContext = jVarPlus;
            }
            jVar = jVarPlus;
        }
        if (jVar == null) {
            x.g();
        }
        return jVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        cancelIfCreated();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
