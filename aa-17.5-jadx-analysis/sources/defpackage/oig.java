package defpackage;

/* loaded from: classes.dex */
public final class oig implements lhg, eqa {
    public static final oif a = new oif();
    public static final afgl b = new nfm(mki.b, 8);
    public static final yph c = yph.c("GH.ThemingManager");
    public rju d;
    private final eqc e = new eqc(this, true);

    public static final oig a() {
        return a.a();
    }

    public final void b(qrn qrnVar) throws qrz {
        c.l().u("Setting up theming");
        eqc eqcVar = this.e;
        eqcVar.e(epr.ON_CREATE);
        eqcVar.e(epr.ON_START);
        Object objU = khc.u(new wci("GH.ThemingManager", yzz.CAR_THEME, yzy.MM, "Car not connected when getting CarDisplayThemingManager", new Object[0]), new ngz(qrnVar, 15));
        objU.getClass();
        this.d = (rju) objU;
        oij oijVarA = oij.a.a();
        rju rjuVar = this.d;
        if (rjuVar == null) {
            affa.d("manager");
            rjuVar = null;
        }
        int iA = rjuVar.a();
        oij.h.l().w("Updating theming version to: %d", iA);
        oijVarA.m(Integer.valueOf(iA));
        ksa.a.a().e.fE(this, new kko(new njq(this, 12), 10));
    }

    @Override // defpackage.lhg
    public final void c() throws qrz {
        ((ype) c.f()).u("Setting up on lifetime start");
        qrn qrnVarE = kio.b().e();
        qrnVarE.getClass();
        b(qrnVarE);
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) c.f()).u("Tearing down on lifetime stop");
        e();
    }

    public final void e() {
        this.e.e(epr.ON_STOP);
        ksa.a.a().e.l(this);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.e;
    }
}
