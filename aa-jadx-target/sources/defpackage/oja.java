package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oja implements defpackage.lhn, defpackage.eqg {
    public static final defpackage.oiz a = new defpackage.oiz();
    public static final defpackage.afhl b = new defpackage.nfw(defpackage.mkp.b, 9);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.ThemingManager");
    public defpackage.rkq d;
    private final defpackage.eqi e = new defpackage.eqi(this, true);

    public static final defpackage.oja a() {
        return a.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final void b(defpackage.qsh qshVar) throws afbj, defpackage.qst {
        c.l().u("Setting up theming");
        defpackage.eqi eqiVar = this.e;
        eqiVar.e(defpackage.epw.ON_CREATE);
        eqiVar.e(defpackage.epw.ON_START);
        java.lang.Object objV = defpackage.khg.v(new defpackage.wde("GH.ThemingManager", defpackage.zbe.CAR_THEME, defpackage.zbd.MQ, "Car not connected when getting CarDisplayThemingManager", new java.lang.Object[0]), new defpackage.njw(qshVar, 10));
        objV.getClass();
        this.d = (defpackage.rkq) objV;
        defpackage.ojd ojdVarA = defpackage.ojd.a.a();
        defpackage.rkq rkqVar = this.d;
        if (rkqVar == null) {
            defpackage.afga.d("manager");
            rkqVar = null;
        }
        int iA = rkqVar.a();
        defpackage.ojd.h.l().w("Updating theming version to: %d", iA);
        ojdVarA.m(java.lang.Integer.valueOf(iA));
        defpackage.ksi.a.a().e.eM(this, new defpackage.kku(new defpackage.nnp(this, 11), 10));
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) c.f()).u("Tearing down on lifetime stop");
        e();
    }

    public final void e() {
        this.e.e(defpackage.epw.ON_STOP);
        defpackage.ksi.a.a().e.l(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.lhn
    public final void eQ() throws afbj, defpackage.qst {
        ((defpackage.yqj) c.f()).u("Setting up on lifetime start");
        defpackage.qsh qshVarE = defpackage.kit.b().e();
        qshVarE.getClass();
        b(qshVarE);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.e;
    }
}
