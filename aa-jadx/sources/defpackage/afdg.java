package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class afdg implements defpackage.afdm {
    private final defpackage.afdn<?> key;

    public afdg(defpackage.afdn<?> afdnVar) {
        afdnVar.getClass();
        this.key = afdnVar;
    }

    @Override // defpackage.afdo
    public <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        affgVar.getClass();
        return affgVar.invoke(r, this);
    }

    @Override // defpackage.afdm, defpackage.afdo
    public /* bridge */ <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) defpackage.afga.t(this, afdnVar);
    }

    @Override // defpackage.afdm
    public defpackage.afdn<?> getKey() {
        return this.key;
    }

    @Override // defpackage.afdo
    public /* bridge */ defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return defpackage.afga.u(this, afdnVar);
    }

    @Override // defpackage.afdo
    public defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return defpackage.afga.w(this, afdoVar);
    }
}
