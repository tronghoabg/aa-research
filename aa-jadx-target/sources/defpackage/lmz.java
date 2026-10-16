package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lmz implements lna {
    final /* synthetic */ defpackage.lnb a;
    private final defpackage.eqg b;
    private final defpackage.eqt c;
    private final defpackage.eqt d;
    private final defpackage.eqt e = new defpackage.lkt(3);
    private final defpackage.eqt f;
    private defpackage.eqp g;
    private defpackage.eqp h;
    private defpackage.eqp i;
    private defpackage.eqp j;

    public lmz(defpackage.lnb lnbVar, defpackage.eqg eqgVar) {
        this.a = lnbVar;
        this.b = eqgVar;
        this.c = new defpackage.kqk(lnbVar, 15);
        this.d = new defpackage.kqk(lnbVar, 16);
        this.f = new defpackage.kqk(lnbVar, 17);
    }

    public final void b() {
        defpackage.eqp eqpVar = this.g;
        if (eqpVar != null) {
            eqpVar.k(this.c);
            this.g = null;
        }
        defpackage.eqp eqpVar2 = this.h;
        if (eqpVar2 != null) {
            eqpVar2.k(this.d);
            this.h = null;
        }
        defpackage.eqp eqpVar3 = this.i;
        if (eqpVar3 != null) {
            eqpVar3.k(this.e);
            this.i = null;
        }
        defpackage.eqp eqpVar4 = this.j;
        if (eqpVar4 != null) {
            eqpVar4.k(this.f);
            this.j = null;
        }
    }

    public final /* synthetic */ void ea(java.lang.Object obj) {
        lok lokVar = (los) obj;
        defpackage.yqm yqmVar = defpackage.lnb.a;
        b();
        defpackage.lnb lnbVar = this.a;
        lnbVar.e = lokVar;
        lnbVar.g = null;
        lnbVar.f = null;
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        lnbVar.h = false;
        if (lokVar == null) {
            return;
        }
        int iOrdinal = lokVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.ysr.bk(lokVar instanceof lok, "CONNECTED controller must be Active type");
                lnbVar.j = false;
                lok lokVar2 = lokVar;
                defpackage.eqp eqpVar = lokVar2.e;
                this.g = eqpVar;
                defpackage.eqg eqgVar = this.b;
                eqpVar.eM(eqgVar, this.c);
                defpackage.eqp eqpVar2 = lokVar2.f;
                this.h = eqpVar2;
                eqpVar2.eM(eqgVar, this.d);
                defpackage.eqp eqpVar3 = lokVar2.g;
                this.i = eqpVar3;
                eqpVar3.eM(eqgVar, this.e);
                defpackage.eqp eqpVar4 = lokVar2.h;
                this.j = eqpVar4;
                eqpVar4.eM(eqgVar, this.f);
                if (lnbVar.i) {
                    return;
                }
                java.util.Iterator it = lnbVar.c.iterator();
                while (it.hasNext()) {
                    ((lkb) it.next()).b();
                }
                lnbVar.j = true;
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    java.util.Iterator it2 = lnbVar.c.iterator();
                    while (it2.hasNext()) {
                        ((lkb) it2.next()).j(lokVar.d().c);
                    }
                    return;
                } else if (iOrdinal != 4 && iOrdinal != 5) {
                    return;
                }
            }
        }
        ((defpackage.yqj) defpackage.lnb.a.l().ai((char) 4014)).y("Controller in state %s. Not notifying listeners", lokVar.e());
    }
}
