package defpackage;

import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class uot implements uoo {
    private static final ukp b = new ukp(-1, -1, -1, null);
    public final uit a;
    private final plb c;

    public uot(pkx pkxVar, tox toxVar, int i, int i2) {
        abgl abglVar = toxVar.c;
        this.c = new uos(i2, pkz.SOFT_IN_MEMORY_TILE, pkxVar, vky.d(null, abglVar), i);
        abnp abnpVarN = pka.a.n();
        ukr ukrVar = ukr.a;
        ukp ukpVar = b;
        pjy pjyVarM = uqw.m(toxVar, ukrVar, ukpVar, "", "");
        abnpVarN.t();
        pka pkaVar = (pka) abnpVarN.b;
        pjyVarM.getClass();
        pkaVar.c = pjyVarM;
        pkaVar.b |= 1;
        this.a = new uit((pka) abnpVarN.q(), abglVar, ukpVar, toz.a);
    }

    @Override // defpackage.uoo
    public final uko f(ukp ukpVar) {
        plb plbVar = this.c;
        synchronized (plbVar) {
            rjg rjgVar = (rjg) plbVar.h(ukpVar);
            if (rjgVar == null) {
                return null;
            }
            uko ukoVarJ = rjgVar.j();
            if (ukoVarJ == null) {
                plbVar.i(ukpVar);
            }
            return ukoVarJ;
        }
    }

    @Override // defpackage.uoo
    public final void g(ukp ukpVar, uko ukoVar) {
        plb plbVar = this.c;
        synchronized (plbVar) {
            plbVar.n(ukpVar, new rjg(ukoVar));
        }
    }

    @Override // defpackage.uyl
    public final synchronized void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.uoo
    public final boolean h(ukp ukpVar) {
        throw null;
    }

    @Override // defpackage.uoo
    public final boolean i(uko ukoVar) {
        return ukoVar == this.a;
    }

    @Override // defpackage.uoo
    public final void j() {
        plb plbVar = this.c;
        synchronized (plbVar) {
            plbVar.l();
        }
    }
}
