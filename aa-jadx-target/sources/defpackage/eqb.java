package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eqb implements aiuw, defpackage.eqe {
    public final defpackage.epy a;
    public final defpackage.afdo b;

    public eqb(defpackage.epy epyVar, defpackage.afdo afdoVar) {
        afdoVar.getClass();
        this.a = epyVar;
        this.b = afdoVar;
        if (epyVar.a() == defpackage.epx.a) {
            defpackage.afgz.r(afdoVar, null);
        }
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        defpackage.epy epyVar = this.a;
        if (epyVar.a().compareTo(defpackage.epx.a) <= 0) {
            epyVar.d(this);
            defpackage.afgz.r(this.b, null);
        }
    }

    public final defpackage.afdo c() {
        return this.b;
    }

    public eqb() {
        throw null;
    }
}
