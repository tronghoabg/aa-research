package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class ufm extends ufs implements tzl {
    private static final tox V = new tox("m", abgl.GMM_VECTOR_BASE);
    private final ucf W;
    private trz X;
    private tzk Y;
    private volatile uij Z;
    private tzi aa;
    private final Object ab;
    private final txe ac;

    public ufm(uvg uvgVar, usy usyVar, tox toxVar, ukr ukrVar, uor uorVar, ugy ugyVar, ums umsVar, ugq ugqVar, tmb tmbVar, ScheduledExecutorService scheduledExecutorService, rjr rjrVar, ttx ttxVar, ukz ukzVar, int i, txe txeVar, ucf ucfVar, aezk aezkVar, tpa tpaVar, boolean z, ackk ackkVar, boolean z2, uaj uajVar, plq plqVar) {
        super(uvgVar, usyVar, toxVar, ukrVar, uorVar, ugyVar, umsVar, ugqVar, tmbVar, scheduledExecutorService, rjrVar, new ufl(ttxVar, ukzVar), null, null, i, true, 256, false, true, aezkVar, tpaVar, z, ackkVar, z2, false, xvy.a, uajVar, plqVar);
        this.Z = null;
        this.ab = new Object();
        new ArrayList();
        this.ac = txeVar;
        this.W = ucfVar;
    }

    private final trz M() {
        tzi tziVar;
        abnp abnpVarN = abif.a.n();
        abnpVarN.t();
        abif abifVar = (abif) abnpVarN.b;
        abifVar.b |= 2;
        abifVar.d = true;
        synchronized (this.ab) {
            tziVar = this.aa;
        }
        if (tziVar != null) {
            Iterator it = tziVar.c.iterator();
            while (it.hasNext()) {
                tzx tzxVarA = tziVar.a(((tzw) it.next()).b);
                if (tzxVarA != null) {
                    String strF = tzxVarA.a().f();
                    abnpVarN.t();
                    abif abifVar2 = (abif) abnpVarN.b;
                    aboh abohVar = abifVar2.c;
                    if (!abohVar.c()) {
                        abifVar2.c = abnv.I(abohVar);
                    }
                    abifVar2.c.add(strF);
                }
            }
        }
        abnp abnpVarN2 = abjm.a.n();
        abnpVarN2.t();
        abjm abjmVar = (abjm) abnpVarN2.b;
        abif abifVar3 = (abif) abnpVarN.q();
        abifVar3.getClass();
        abjmVar.c = abifVar3;
        abjmVar.b = 3;
        abjm abjmVar2 = (abjm) abnpVarN2.q();
        switch (abjl.a(abjmVar2.b).ordinal()) {
            case 1:
                return new trz(new jud(abjmVar2, 9), abjmVar2);
            case 2:
                return new trz(new jud(ygr.n((abjmVar2.b == 3 ? (abif) abjmVar2.c : abif.a).c), 7), abjmVar2);
            case 3:
                return new trz(trz.c, abjmVar2);
            case 4:
                return new trz(new jud(ygr.n((abjmVar2.b == 5 ? (abie) abjmVar2.c : abie.a).b), 8), abjmVar2);
            case 5:
                return new trz(trz.b, abjmVar2);
            case 6:
                return new trz(trz.d, abjmVar2);
            default:
                ((ynz) ((ynz) trz.a.h()).ai((char) 9100)).y("Unsupported restriction type: %s", abjl.a(abjmVar2.b));
                return new trz(new ptu(4), abjmVar2);
        }
    }

    @Override // defpackage.tzl
    public final void b(tzi tziVar) {
        if (this.Y == null) {
            return;
        }
        synchronized (this.ab) {
            this.aa = tziVar;
            tzk tzkVar = this.Y;
            synchronized (tzkVar.c) {
                tzkVar.b = tziVar;
            }
            tzkVar.a = true;
        }
        trz trzVar = this.X;
        if (trzVar != null) {
            trz trzVarM = M();
            if (this.N) {
                ucf ucfVar = this.W;
                ucfVar.q(trzVar);
                ucfVar.f(trzVarM);
            } else {
                txe txeVar = this.ac;
                txeVar.f(trzVar.e);
                txeVar.b(trzVarM.e);
            }
            this.X = trzVarM;
        }
        this.Q.k();
    }

    @Override // defpackage.ufs
    public final ufs g(ukr ukrVar, uor uorVar) {
        tzi tziVar;
        ugy ugyVarC = this.e.c(ukrVar, uorVar);
        ufl uflVar = (ufl) this.z;
        ttx ttxVar = uflVar.a;
        ukz ukzVar = uflVar.b;
        int i = this.l;
        txe txeVar = this.ac;
        ucf ucfVar = this.W;
        aezk aezkVar = this.I;
        tpa tpaVar = this.J;
        ums umsVar = this.D;
        boolean z = this.L;
        ugq ugqVar = this.G;
        ackk ackkVar = this.M;
        uvg uvgVar = this.Q;
        tmb tmbVar = this.n;
        boolean z2 = this.N;
        ufm ufmVar = new ufm(uvgVar, this.R, this.c, ukrVar, uorVar, ugyVarC, umsVar, ugqVar, tmbVar, this.F, this.S, ttxVar, ukzVar, i, txeVar, ucfVar, aezkVar, tpaVar, z, ackkVar, z2, this.P, this.O);
        synchronized (this.ab) {
            tziVar = this.aa;
        }
        if (tziVar != null) {
            ufmVar.v();
            ufmVar.b(tziVar);
        }
        return ufmVar;
    }

    @Override // defpackage.ufs, defpackage.ufj
    public final void k() {
        super.k();
        trz trzVarM = M();
        if (this.N) {
            this.W.f(trzVarM);
        } else {
            this.ac.b(trzVarM.e);
        }
        this.X = trzVarM;
    }

    @Override // defpackage.ufs, defpackage.ufj
    public final void l() {
        super.l();
        trz trzVar = this.X;
        this.X = null;
        if (trzVar != null) {
            if (this.N) {
                this.W.q(trzVar);
            } else {
                this.ac.f(trzVar.e);
            }
        }
    }

    @Override // defpackage.ufs, defpackage.ufj
    public final void m(uly ulyVar, boolean z) {
        if (n(ulyVar)) {
            super.m(ulyVar, z);
            this.Z = null;
        }
    }

    @Override // defpackage.ufs
    @ResultIgnorabilityUnspecified
    protected final uii o(ukp ukpVar, long j, uij uijVar) {
        uii uiiVarO = super.o(ukpVar, j, uijVar);
        if (uiiVarO != null) {
            return uiiVarO;
        }
        if (this.Z == null && uijVar != null) {
            String str = uijVar.f;
            aacq aacqVar = uijVar.g;
            int i = uijVar.e;
            uxb uxbVar = uijVar.c;
            this.Z = uij.a(V, uijVar.b, uijVar.d, uxbVar, Integer.valueOf(i), aacqVar, str);
        }
        return this.e.d(ukpVar, j, this.Z);
    }

    @Override // defpackage.ufs
    protected final void p(ttv ttvVar) {
        this.Y = (tzk) ttvVar;
        super.p(ttvVar);
    }

    @Override // defpackage.ufs
    protected final boolean q(List list, int i, too tooVar, long j, Set set) {
        tzx tzxVarA;
        boolean zQ = super.q(list, i, tooVar, j, set);
        vaq.d();
        synchronized (this.ab) {
            if (this.aa == null) {
                return zQ;
            }
            synchronized (this.ab) {
                tzi tziVar = this.aa;
                tzxVarA = tziVar.a(tziVar.a);
            }
            aeuf aeufVar = new aeuf((aeug) set);
            while (aeufVar.hasNext()) {
                uih uihVar = (uih) aeufVar.next();
                tzy tzyVar = uihVar.o().d;
                if (tzyVar != null) {
                    ((uht) uihVar).v(tzxVarA == null ? false : tzxVarA.a().equals(tzyVar.b));
                }
            }
            return zQ;
        }
    }

    @Override // defpackage.ufs
    protected final void r(Set set) {
        tzk tzkVar = this.Y;
        if (tzkVar == null) {
            return;
        }
        tzj tzjVar = tzkVar.d;
        synchronized (tzjVar) {
            set.clear();
            set.addAll(tzjVar.d);
        }
    }
}
