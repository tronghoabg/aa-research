package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class esu implements defpackage.eqt {
    public final defpackage.etb a;
    public final defpackage.esr b;
    public boolean c = false;

    public esu(defpackage.etb etbVar, defpackage.esr esrVar) {
        this.a = etbVar;
        this.b = esrVar;
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        if (defpackage.ess.d(2)) {
            android.util.Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + defpackage.etb.q(obj));
        }
        this.c = true;
        this.b.c(obj);
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
