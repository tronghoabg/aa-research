package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nza {
    private defpackage.noz d;
    public static final defpackage.nyz a = new defpackage.nyz();
    private static final defpackage.yqm c = defpackage.yqm.c("GH.UiOverlayDC");
    public static final defpackage.afhl b = new defpackage.nfw(defpackage.mkp.b, 6);

    public static final defpackage.nza a() {
        return a.a();
    }

    public final void b() {
        defpackage.noz nozVar = this.d;
        if (nozVar != null) {
            nozVar.d();
        }
        this.d = null;
    }

    public final void c(defpackage.qsh qshVar) {
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA;
        if (this.d != null) {
            ((defpackage.yqj) c.h()).u("Overlay already shown");
            return;
        }
        try {
            defpackage.yqm yqmVar = defpackage.nte.a;
            defpackage.ntb ntbVarB = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b();
            if (ntbVarB.F() && ntbVarB.D() && !defpackage.lee.a.a().c(qshVar) && (carWindowLayoutParamsA = defpackage.nsu.a(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b(), defpackage.nta.A, new defpackage.nqv(16))) != null) {
                ((defpackage.yqj) c.f()).u("Showing UiOverlayDecorationsFragment");
                this.d = defpackage.nsu.c().a(carWindowLayoutParamsA, "UiOverlayDecorationsFragment", new nzb(), (defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).b(qshVar);
            }
        } catch (defpackage.qst e) {
            ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e)).u("Unable to start UiOverlayDecorationFragment, CarNotConnectedException");
        } catch (defpackage.qsu e2) {
            ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e2)).u("Unable to start UiOverlayDecorationFragment, CarNotSupportedException");
        }
    }
}
