package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lmy implements lna {
    final /* synthetic */ defpackage.lnb a;
    private final defpackage.eqg b;
    private lna c;

    public lmy(defpackage.lnb lnbVar, defpackage.eqg eqgVar) {
        this.a = lnbVar;
        this.b = eqgVar;
    }

    public final void b() {
        defpackage.eqt eqtVar = this.c;
        if (eqtVar != null) {
            this.a.k.k(eqtVar);
            this.c = null;
        }
    }

    public final /* synthetic */ void ea(java.lang.Object obj) {
        lny lnyVar = (loq) obj;
        defpackage.yqm yqmVar = defpackage.lnb.a;
        b();
        if (lnyVar == null) {
            return;
        }
        int iOrdinal = lnyVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.ysr.bk(lnyVar instanceof lny, "CONNECTED browser must be Active type");
                defpackage.lnb lnbVar = this.a;
                defpackage.eqg eqgVar = this.b;
                defpackage.eqt lmxVar = new lmx();
                this.c = lmxVar;
                lnbVar.k.eM(eqgVar, lmxVar);
                return;
            }
            if (iOrdinal == 2) {
                java.util.Iterator it = this.a.c.iterator();
                while (it.hasNext()) {
                    ((lkb) it.next()).e(lnyVar.d().c);
                }
                return;
            } else if (iOrdinal == 3) {
                java.util.Iterator it2 = this.a.c.iterator();
                while (it2.hasNext()) {
                    ((lkb) it2.next()).f();
                }
                return;
            } else if (iOrdinal != 4 && iOrdinal != 5) {
                return;
            }
        }
        ((defpackage.yqj) defpackage.lnb.a.l().ai((char) 4012)).y("Browser in state %s. Not notifying listeners", lnyVar.e());
    }
}
