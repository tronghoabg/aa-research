package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fmx implements defpackage.fna {
    public final defpackage.fnj a;

    public fmx(defpackage.fnj fnjVar) {
        this.a = fnjVar;
    }

    @Override // defpackage.fna
    public final defpackage.aizj a(defpackage.fjh fjhVar) {
        fjhVar.getClass();
        return new defpackage.aizc(new defpackage.dnf(this, (defpackage.afdk) null, 7));
    }

    @Override // defpackage.fna
    public final boolean c(defpackage.fok fokVar) {
        return b(fokVar) && e(this.a.b());
    }

    public abstract int d();

    public boolean e(java.lang.Object obj) {
        throw null;
    }
}
