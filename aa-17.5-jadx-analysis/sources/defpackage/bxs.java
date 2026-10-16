package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class bxs extends afcg implements CoroutineExceptionHandler {
    final /* synthetic */ cff a;
    final /* synthetic */ bxt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxs(bwi bwiVar, cff cffVar, bxt bxtVar) {
        super(bwiVar);
        this.a = cffVar;
        this.b = bxtVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(afco afcoVar, Throwable th) throws Throwable {
        bxt bxtVar = this.b;
        this.a.c(th, bxtVar);
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) bxtVar.b.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(afcoVar, th);
    }
}
