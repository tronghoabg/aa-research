package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class lmr implements lmt {
    final /* synthetic */ lmu a;
    private final eqa b;
    private lmt c;

    public lmr(lmu lmuVar, eqa eqaVar) {
        this.a = lmuVar;
        this.b = eqaVar;
    }

    @Override // defpackage.lmt
    public final void b() {
        lmt lmtVar = this.c;
        if (lmtVar != null) {
            this.a.k.k(lmtVar);
            this.c = null;
        }
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        loj lojVar = (loj) obj;
        yph yphVar = lmu.a;
        b();
        if (lojVar == null) {
            return;
        }
        int iOrdinal = lojVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                woy.aa(lojVar instanceof lnr, "CONNECTED browser must be Active type");
                lmu lmuVar = this.a;
                eqa eqaVar = this.b;
                lmq lmqVar = new lmq();
                this.c = lmqVar;
                lmuVar.k.fE(eqaVar, lmqVar);
                return;
            }
            if (iOrdinal == 2) {
                Iterator it = this.a.c.iterator();
                while (it.hasNext()) {
                    ((lju) it.next()).e(lojVar.d().c);
                }
                return;
            } else if (iOrdinal == 3) {
                Iterator it2 = this.a.c.iterator();
                while (it2.hasNext()) {
                    ((lju) it2.next()).f();
                }
                return;
            } else if (iOrdinal != 4 && iOrdinal != 5) {
                return;
            }
        }
        ((ype) lmu.a.l().ai((char) 4009)).y("Browser in state %s. Not notifying listeners", lojVar.e());
    }
}
