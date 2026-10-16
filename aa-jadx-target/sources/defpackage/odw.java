package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class odw extends defpackage.cge implements defpackage.cwv, defpackage.cwm, defpackage.ciw, defpackage.cza, defpackage.cic {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Tooltip.Anchor");
    public defpackage.ask b;
    public defpackage.ctc c;
    public final java.util.List d = new java.util.ArrayList();
    public final defpackage.odu e = new defpackage.odu(this);
    public defpackage.lhe f;
    private boolean g;

    public odw(defpackage.lhe lheVar, defpackage.ask askVar) {
        this.f = lheVar;
        this.b = askVar;
    }

    @Override // defpackage.cza
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.cwv
    public final void dA(defpackage.ctc ctcVar) {
        this.c = ctcVar;
        java.util.List list = this.d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        list.clear();
    }

    @Override // defpackage.cic
    public final void dC(defpackage.cja cjaVar) {
        odl odlVar = this.e.a;
        if (odlVar != null && this.g && !cjaVar.a()) {
            a.l().u("Dismissing tooltip due to losing focus");
            defpackage.mcl.v(odlVar, defpackage.zbd.lO);
            odlVar.a();
        }
        this.g = cjaVar.a();
    }

    @Override // defpackage.cza
    public final /* synthetic */ long dy() {
        return defpackage.ud.b(0, 0, 0, 0);
    }

    @Override // defpackage.cge
    public final void dz() {
        ((defpackage.bzc) this.f.a).n(this);
        ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ber(this, (defpackage.afdk) null, 11), 3);
    }

    @Override // defpackage.cge
    public final void q() {
        ((defpackage.bzc) this.f.a).m(this);
        odl odlVar = this.e.a;
        if (odlVar != null) {
            defpackage.mcl.v(odlVar, defpackage.zbd.lK);
            odlVar.a();
        }
    }

    @Override // defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        odl odlVar = this.e.a;
        if (odlVar == null || !defpackage.a.X(cquVar.e, 1)) {
            return;
        }
        a.l().u("Dismissing tooltip due to click on anchor");
        defpackage.mcl.v(odlVar, defpackage.zbd.lL);
        odlVar.a();
    }

    @Override // defpackage.cza
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.cza
    public final void o() {
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.cza
    public final /* synthetic */ void t() {
    }
}
