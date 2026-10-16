package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lei implements defpackage.leh {
    private final defpackage.afar b = new defpackage.afay(new defpackage.djm(this, 11));

    @Override // defpackage.leh
    public final int a() {
        return (int) defpackage.acpp.b();
    }

    @Override // defpackage.leh
    public final absq b() {
        return defpackage.acpp.c();
    }

    @Override // defpackage.leh
    public final absq c() {
        return defpackage.acpp.d();
    }

    @Override // defpackage.leh
    public final boolean d() {
        defpackage.acpp acppVar = defpackage.acpp.a;
        return acppVar.fF().i() && defpackage.afga.f(acppVar.fF().e(), "CAR.SYS") && android.os.Build.VERSION.SDK_INT >= 37;
    }

    @Override // defpackage.leh
    public final boolean e() {
        return f() && defpackage.acpp.j();
    }

    @Override // defpackage.leh
    public final boolean f() {
        if (!((java.lang.Boolean) ((defpackage.nrt) this.b.a()).a()).booleanValue()) {
            return false;
        }
        defpackage.yqm yqmVar = defpackage.nte.a;
        defpackage.ntb ntbVarB = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b();
        if (!lef.a().d() || !ntbVarB.K() || ntbVarB.h.a().get(defpackage.nta.r) == 0) {
            return false;
        }
        if (ntbVarB.m() != defpackage.nti.a) {
            return true;
        }
        defpackage.nsw nswVar = ntbVarB.m;
        boolean z = nswVar.e;
        int i = nswVar.b;
        if (z) {
            return i >= 846;
        }
        return i >= 750;
    }

    @Override // defpackage.leh
    public final boolean g() {
        return e() && defpackage.acpp.m();
    }
}
