package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adyb {
    public final defpackage.admg a;
    public defpackage.adkh b;
    public boolean c = false;
    public defpackage.adki d = defpackage.adki.a(defpackage.adkh.d);

    public adyb(defpackage.admg admgVar, defpackage.adkh adkhVar) {
        this.a = admgVar;
        this.b = adkhVar;
    }

    public final defpackage.adkh a() {
        return this.d.a;
    }

    public final void b(defpackage.adkh adkhVar) {
        boolean z;
        this.b = adkhVar;
        if (adkhVar == defpackage.adkh.b || adkhVar == defpackage.adkh.c) {
            z = true;
        } else if (adkhVar != defpackage.adkh.d) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
