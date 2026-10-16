package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import h.c.a;
import h.c.j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ac;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends a implements CoroutineExceptionHandler {
    final /* synthetic */ CompositionErrorContextImpl $traceContext$inlined;
    final /* synthetic */ RememberedCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(ac acVar, CompositionErrorContextImpl compositionErrorContextImpl, RememberedCoroutineScope rememberedCoroutineScope) {
        super(acVar);
        this.$traceContext$inlined = compositionErrorContextImpl;
        this.this$0 = rememberedCoroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(j jVar, Throwable th) throws Throwable {
        this.$traceContext$inlined.attachComposeStackTrace(th, this.this$0);
        j jVar2 = this.this$0.overlayContext;
        ac acVar = CoroutineExceptionHandler.f51269c;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) jVar2.get(acVar);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(jVar, th);
            return;
        }
        CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) this.this$0.parentContext.get(acVar);
        if (coroutineExceptionHandler2 == null) {
            throw th;
        }
        coroutineExceptionHandler2.handleException(jVar, th);
    }
}
