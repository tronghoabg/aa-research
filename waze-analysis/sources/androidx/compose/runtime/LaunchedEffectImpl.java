package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import h.ab;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver, CoroutineExceptionHandler {
    public static final int $stable = 8;
    private br job;
    private final j parentCoroutineContext;
    private final af scope;
    private final p<af, e<? super ab>, Object> task;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(j jVar, p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        this.parentCoroutineContext = jVar;
        this.task = pVar;
        j jVarPlus = jVar.plus(this);
        this.scope = aj.e(ComposeToolingFlags.isVerboseTracingEnabled ? jVarPlus.plus(LaunchedEffectTracingContext.INSTANCE) : jVarPlus);
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public i<?> getKey() {
        return CoroutineExceptionHandler.f51269c;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(j jVar, Throwable th) throws Throwable {
        CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) jVar.get(CompositionErrorContextImpl.Key);
        if (compositionErrorContextImpl != null) {
            compositionErrorContextImpl.attachComposeStackTrace(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.parentCoroutineContext.get(CoroutineExceptionHandler.f51269c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(jVar, th);
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        br brVar = this.job;
        if (brVar != null) {
            aj.X(brVar, "Old job was still running!", null);
        }
        this.job = aj.z(this.scope, null, null, this.task, 3);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }
}
