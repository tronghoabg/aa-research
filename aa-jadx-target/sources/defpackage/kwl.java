package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kwl implements ngs {
    private final defpackage.ngy a;
    private final /* synthetic */ int b;

    public kwl(defpackage.ngy ngyVar, int i) {
        this.b = i;
        this.a = ngyVar;
    }

    public final /* synthetic */ ngx a(ngt ngtVar) {
        defpackage.mqj mqjVarF;
        int i = this.b;
        if (i == 0) {
            if (ngtVar == ngu.i && defpackage.nte.c().b().m().equals(defpackage.nti.a)) {
                defpackage.ngy ngyVar = this.a;
                kwk kwkVar = kwk.a;
                if (!ngyVar.j(kwkVar)) {
                    return kwkVar;
                }
            }
            return null;
        }
        if (i == 1) {
            if (ngtVar == ngu.a && defpackage.kgl.i()) {
                defpackage.ngy ngyVar2 = this.a;
                if (!ngyVar2.m(kgm.a)) {
                    kgn kgnVar = kgn.a;
                    if (!ngyVar2.j(kgnVar) && ngyVar2.a() >= defpackage.acox.c()) {
                        return kgnVar;
                    }
                }
            }
            return null;
        }
        if (i == 2) {
            if (ngtVar == ngu.a && defpackage.acrr.g()) {
                defpackage.ngy ngyVar3 = this.a;
                if (!ngyVar3.m(ldn.a)) {
                    ldo ldoVar = ldo.a;
                    if (!ngyVar3.j(ldoVar) && ngyVar3.a() >= ((int) defpackage.acrr.d())) {
                        return ldoVar;
                    }
                }
            }
            return null;
        }
        if (i == 3) {
            if (ngtVar == ngu.a && defpackage.acza.E() && ((mqjVarF = defpackage.mpj.b().f()) == null || !mqjVarF.a().equals(defpackage.mkt.s))) {
                defpackage.ngy ngyVar4 = this.a;
                mrc mrcVar = mrc.b;
                if (!ngyVar4.j(mrcVar) && ngyVar4.f(mrb.a) >= ((int) defpackage.acza.l())) {
                    return mrcVar;
                }
            }
            return null;
        }
        if (i == 4) {
            if (ngtVar == ngu.j) {
                defpackage.ngy ngyVar5 = this.a;
                if (!ngyVar5.m(nrf.a)) {
                    nrg nrgVar = nrg.a;
                    if (ngyVar5.b(nrgVar) < 5) {
                        return nrgVar;
                    }
                }
            }
            return null;
        }
        ngu nguVar = ngu.a;
        if ((ngtVar == nguVar || ngtVar == ngu.b) && defpackage.acza.I()) {
            defpackage.ngy ngyVar6 = this.a;
            if (!ngyVar6.j(nvn.b)) {
                nvn nvnVar = nvn.c;
                if (!ngyVar6.j(nvnVar) && ngyVar6.f(nvm.a) >= ((int) defpackage.acza.m()) && !defpackage.nuz.b().e().isEmpty()) {
                    return nvnVar;
                }
            }
        }
        if (ngtVar == nguVar && defpackage.acza.G()) {
            defpackage.ngy ngyVar7 = this.a;
            if (!ngyVar7.m(nvm.a)) {
                nvn nvnVar2 = nvn.a;
                if (ngyVar7.l(nvnVar2)) {
                    return null;
                }
                return nvnVar2;
            }
        }
        return null;
    }

    public kwl(defpackage.ngy ngyVar, int i, int[] iArr) {
        this.b = i;
        this.a = ngyVar;
    }
}
