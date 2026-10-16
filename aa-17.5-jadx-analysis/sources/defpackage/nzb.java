package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nzb implements oah {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.GhStatusBarCtrl");
    private noh c;

    @Override // defpackage.oah
    public final void b() {
        b.l().u("HeroStatusBarController.hide()");
        if (this.c == null) {
            return;
        }
        boolean zM = acpf.m();
        noh nohVar = this.c;
        if (zM) {
            if (nohVar != null) {
                nohVar.e(true);
            }
        } else {
            if (nohVar != null) {
                nohVar.d();
            }
            this.c = null;
        }
    }

    @Override // defpackage.oah
    public final void c(boolean z) {
        b.l().y("HeroStatusBarController.setOverlayVisible(%s)", Boolean.valueOf(z));
        noh nohVar = this.c;
        if (nohVar != null) {
            nohVar.q(z);
        }
    }

    @Override // defpackage.oah
    public final void d() {
        b.l().u("HeroStatusBarController.showTransient()");
        noh nohVar = this.c;
        if (nohVar != null) {
            nohVar.r();
        }
    }

    @Override // defpackage.oah
    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
    }

    @Override // defpackage.oah
    public final void h() {
        yph yphVar = b;
        yphVar.l().u("HeroStatusBarController.show()");
        noh nohVar = this.c;
        if (nohVar != null) {
            yphVar.l().u("Redundant call to show StatusBar.");
            nohVar.j(true);
            return;
        }
        nzc nzcVar = new nzc();
        qsw qswVarN = nsr.c().b().n(nsn.m);
        qswVarN.getClass();
        qswVarN.n = R.style.Theme_Gearhead_Projected_TranslucentWindow;
        qswVarN.l = true;
        qswVarN.m = 64;
        this.c = (noh) khc.t(new wci("HeroStatusBar", yzz.STATUS_BAR, yzy.m, "Unable to show StatusBar", new Object[0]), new nlh(qswVarN.a(), nzcVar, 13, null));
    }

    @Override // defpackage.oah
    public final void a() {
    }

    @Override // defpackage.oah
    public final void f() {
    }

    @Override // defpackage.oah
    public final void g() {
    }

    @Override // defpackage.oah
    public final void i() {
    }
}
