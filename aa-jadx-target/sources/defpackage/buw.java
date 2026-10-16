package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class buw implements defpackage.afdm {
    public static final defpackage.bwp a = new defpackage.bwp();

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
    public final /* bridge */ defpackage.afdo plus(defpackage.afdo afdoVar) {
        return defpackage.afga.v(this, afdoVar);
    }
}
