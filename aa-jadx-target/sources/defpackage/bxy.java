package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxy extends defpackage.afdg implements kotlinx.coroutines.CoroutineExceptionHandler {
    final /* synthetic */ defpackage.cfm a;
    final /* synthetic */ defpackage.bxz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxy(defpackage.bwp bwpVar, defpackage.cfm cfmVar, defpackage.bxz bxzVar) {
        super(bwpVar);
        this.a = cfmVar;
        this.b = bxzVar;
    }

    public final void handleException(defpackage.afdo afdoVar, java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.bxz bxzVar = this.b;
        this.a.c(th, bxzVar);
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = bxzVar.b.get(kotlinx.coroutines.CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(afdoVar, th);
    }
}
