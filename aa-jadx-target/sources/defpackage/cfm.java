package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfm implements defpackage.cbe, defpackage.afdm {
    public static final defpackage.cfl a = new defpackage.cfl();
    public final defpackage.bwj b;

    public cfm(defpackage.bwj bwjVar) {
        this.b = bwjVar;
    }

    @Override // defpackage.cbe
    public final boolean a() {
        return ((defpackage.bwc) this.b).k;
    }

    @Override // defpackage.cbe
    public final java.util.List b() {
        return this.b.T();
    }

    public final void c(java.lang.Throwable th, java.lang.Object obj) {
        defpackage.vm.a(th, new defpackage.bso(this, obj, 3, null));
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return affgVar.invoke(r, this);
    }

    @Override // defpackage.afdm, defpackage.afdo
    public final /* bridge */ <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) defpackage.afga.t(this, afdnVar);
    }

    @Override // defpackage.afdm
    public final defpackage.afdn<?> getKey() {
        return a;
    }

    @Override // defpackage.afdo
    public final /* bridge */ defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return defpackage.afga.u(this, afdnVar);
    }

    @Override // defpackage.afdo
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return defpackage.afga.w(this, afdoVar);
    }
}
