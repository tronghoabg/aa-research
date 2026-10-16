package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class bwg implements CoroutineExceptionHandler, bxq {
    private final afco a;
    private final afeg b;
    private final aitx d;
    private aivh e;

    public bwg(afco afcoVar, afeg afegVar) {
        this.a = afcoVar;
        this.b = afegVar;
        this.d = ahni.b(afcoVar.plus(this));
    }

    @Override // defpackage.bxq
    public final void eW() {
        aivh aivhVar = this.e;
        if (aivhVar != null) {
            aivhVar.s(new bvr());
        }
        this.e = null;
    }

    @Override // defpackage.bxq
    public final void eX() {
        aivh aivhVar = this.e;
        if (aivhVar != null) {
            aivhVar.s(new bvr());
        }
        this.e = null;
    }

    @Override // defpackage.bxq
    public final void eo() {
        aivh aivhVar = this.e;
        if (aivhVar != null) {
            affx.i(aivhVar, "Old job was still running!");
        }
        this.e = ahnc.d(this.d, null, 0, this.b, 3);
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final afcn<?> getKey() {
        return CoroutineExceptionHandler.c;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(afco afcoVar, Throwable th) throws Throwable {
        cff cffVar = (cff) afcoVar.get(cff.a);
        if (cffVar != null) {
            cffVar.c(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.a.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(afcoVar, th);
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
