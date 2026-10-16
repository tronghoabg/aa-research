package defpackage;

import com.google.android.gms.car.CarWindowLayoutParams;

/* loaded from: classes.dex */
public final class nyf {
    private noh d;
    public static final nye a = new nye();
    private static final yph c = yph.c("GH.UiOverlayDC");
    public static final afgl b = new nfm(mki.b, 5);

    public static final nyf a() {
        return a.a();
    }

    public final void b() {
        noh nohVar = this.d;
        if (nohVar != null) {
            nohVar.d();
        }
        this.d = null;
    }

    public final void c(qrn qrnVar) {
        CarWindowLayoutParams carWindowLayoutParamsA;
        if (this.d != null) {
            ((ype) c.h()).u("Overlay already shown");
            return;
        }
        try {
            yph yphVar = nsr.a;
            nso nsoVarB = ((nsr) mki.a.i(nsr.class)).b();
            if (nsoVarB.F() && nsoVarB.D() && !ldz.a.a().c(qrnVar) && (carWindowLayoutParamsA = nsh.a(((nsr) mki.a.i(nsr.class)).b(), nsn.A, new nqz(13))) != null) {
                ((ype) c.f()).u("Showing UiOverlayDecorationsFragment");
                this.d = nsh.c().a(carWindowLayoutParamsA, "UiOverlayDecorationsFragment", new nyg(), (lhm) mki.a.i(lhm.class)).b(qrnVar);
            }
        } catch (qrz e) {
            ((ype) ((ype) c.g()).p(e)).u("Unable to start UiOverlayDecorationFragment, CarNotConnectedException");
        } catch (qsa e2) {
            ((ype) ((ype) c.g()).p(e2)).u("Unable to start UiOverlayDecorationFragment, CarNotSupportedException");
        }
    }
}
