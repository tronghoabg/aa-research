package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ehu implements defpackage.afdm {
    private final defpackage.ehu a;
    private final defpackage.egk b;

    public ehu(defpackage.ehu ehuVar, defpackage.egk egkVar) {
        this.a = ehuVar;
        this.b = egkVar;
    }

    public final void a(defpackage.efh efhVar) {
        if (this.b == efhVar) {
            throw new java.lang.IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        defpackage.ehu ehuVar = this.a;
        if (ehuVar != null) {
            ehuVar.a(efhVar);
        }
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
        return defpackage.bwp.c;
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
