package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwn implements kotlinx.coroutines.CoroutineExceptionHandler, defpackage.bxw {
    private final defpackage.afdo a;
    private final defpackage.affg b;
    private final aiuw d;
    private aiwg e;

    /* JADX WARN: Multi-variable type inference failed */
    public bwn(defpackage.afdo afdoVar, defpackage.affg affgVar) {
        this.a = afdoVar;
        this.b = affgVar;
        this.d = ahoi.b(afdoVar.plus(this));
    }

    @Override // defpackage.bxw
    public final void dw() {
        aiwg aiwgVar = this.e;
        if (aiwgVar != null) {
            defpackage.afgz.v(aiwgVar, "Old job was still running!");
        }
        this.e = ahoc.d(this.d, (defpackage.afdo) null, 0, this.b, 3);
    }

    @Override // defpackage.bxw
    public final void ee() {
        aiwg aiwgVar = this.e;
        if (aiwgVar != null) {
            aiwgVar.s(new defpackage.bvy());
        }
        this.e = null;
    }

    @Override // defpackage.bxw
    public final void ef() {
        aiwg aiwgVar = this.e;
        if (aiwgVar != null) {
            aiwgVar.s(new defpackage.bvy());
        }
        this.e = null;
    }

    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return affgVar.invoke(r, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) defpackage.afga.t(this, afdnVar);
    }

    public final defpackage.afdn<?> getKey() {
        return kotlinx.coroutines.CoroutineExceptionHandler.c;
    }

    public final void handleException(defpackage.afdo afdoVar, java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.cfm cfmVar = (defpackage.cfm) afdoVar.get(defpackage.cfm.a);
        if (cfmVar != null) {
            cfmVar.c(th, this);
        }
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = this.a.get(kotlinx.coroutines.CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(afdoVar, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return defpackage.afga.u(this, afdnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return defpackage.afga.w(this, afdoVar);
    }
}
