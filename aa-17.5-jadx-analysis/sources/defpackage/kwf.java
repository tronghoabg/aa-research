package defpackage;

/* loaded from: classes.dex */
public final class kwf implements nfz {
    private final ngf a;
    private final /* synthetic */ int b;

    public kwf(ngf ngfVar, int i) {
        this.b = i;
        this.a = ngfVar;
    }

    @Override // defpackage.nfz
    public final /* synthetic */ nge a(nga ngaVar) {
        mqc mqcVarF;
        int i = this.b;
        if (i == 0) {
            if (ngaVar == ngb.i && nsr.c().b().m().equals(nsv.a)) {
                ngf ngfVar = this.a;
                kwe kweVar = kwe.DASHBOARD_UNAVAILABLE_TOOLTIP;
                if (!ngfVar.j(kweVar)) {
                    return kweVar;
                }
            }
            return null;
        }
        if (i == 1) {
            if (ngaVar == ngb.a && kgi.i()) {
                ngf ngfVar2 = this.a;
                if (!ngfVar2.m(kgj.a)) {
                    kgk kgkVar = kgk.a;
                    if (!ngfVar2.j(kgkVar) && ngfVar2.a() >= acnv.c()) {
                        return kgkVar;
                    }
                }
            }
            return null;
        }
        if (i == 2) {
            if (ngaVar == ngb.a && acqp.g()) {
                ngf ngfVar3 = this.a;
                if (!ngfVar3.m(ldi.a)) {
                    ldj ldjVar = ldj.a;
                    if (!ngfVar3.j(ldjVar) && ngfVar3.a() >= ((int) acqp.d())) {
                        return ldjVar;
                    }
                }
            }
            return null;
        }
        if (i == 3) {
            if (ngaVar == ngb.a && acxy.E() && ((mqcVarF = mpd.b().f()) == null || !mqcVarF.a().equals(mkn.s))) {
                ngf ngfVar4 = this.a;
                mqy mqyVar = mqy.NTH_RUN;
                if (!ngfVar4.j(mqyVar) && ngfVar4.f(mqx.a) >= ((int) acxy.l())) {
                    return mqyVar;
                }
            }
            return null;
        }
        if (i == 4) {
            if (ngaVar == ngb.j) {
                ngf ngfVar5 = this.a;
                if (!ngfVar5.m(nqm.a)) {
                    nqn nqnVar = nqn.a;
                    if (ngfVar5.b(nqnVar) < 5) {
                        return nqnVar;
                    }
                }
            }
            return null;
        }
        ngb ngbVar = ngb.a;
        if ((ngaVar == ngbVar || ngaVar == ngb.b) && acxy.I()) {
            ngf ngfVar6 = this.a;
            if (!ngfVar6.j(nux.NEW_NOTIFICATION)) {
                nux nuxVar = nux.NEW_NOTIFICATION_NTH_RUN;
                if (!ngfVar6.j(nuxVar) && ngfVar6.f(nuw.a) >= ((int) acxy.m()) && !nuj.b().e().isEmpty()) {
                    return nuxVar;
                }
            }
        }
        if (ngaVar == ngbVar && acxy.G()) {
            ngf ngfVar7 = this.a;
            if (!ngfVar7.m(nuw.a)) {
                nux nuxVar2 = nux.FIRST_RUN;
                if (ngfVar7.l(nuxVar2)) {
                    return null;
                }
                return nuxVar2;
            }
        }
        return null;
    }

    public kwf(ngf ngfVar, int i, int[] iArr) {
        this.b = i;
        this.a = ngfVar;
    }
}
