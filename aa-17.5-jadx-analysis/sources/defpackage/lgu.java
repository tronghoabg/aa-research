package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class lgu implements lhg {
    public static final lgt a = new lgt();
    public static final yph b = yph.c("GH.ProjIntegOverlayMgr");
    public static final afgl c = new lcj(mki.b, 6);
    public boolean d;
    private final aezr e = woy.dG(new kur(this, 18));
    private final aezr f = woy.dG(new kur(this, 19));

    public static final void a() {
        nso nsoVarB = nsr.c().b();
        nsn nsnVar = nsn.y;
        Rect rectH = nsoVarB.h(nsnVar);
        if (rectH == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Rect rectG = nsoVarB.g(nsnVar);
        int iE = nsoVarB.e(nsnVar);
        khc.t(new wci("GH.ProjIntegOverlayMgr", yzz.INTEGRATED_OVERLAY, yzy.Mp, "Car not connected when sending integrated overlay parameter options.", new Object[0]), new juo(new Rect(rectH.left + rectG.left, rectH.top + rectG.top, rectH.right - rectG.right, rectH.bottom - rectG.bottom), iE, 6));
    }

    private final nsg e() {
        return (nsg) this.e.a();
    }

    public final pxp b() {
        return (pxp) this.f.a();
    }

    @Override // defpackage.lhg
    public final void c() {
        this.d = true;
        nsr.c().b().w(e());
        a();
        khc.t(new wci("GH.ProjIntegOverlayMgr", yzz.INTEGRATED_OVERLAY, yzy.Mm, "Car not connected when registering integrated overlay callbacks.", new Object[0]), new kur(this, 17));
    }

    @Override // defpackage.lhg
    public final void d() {
        nsr.c().b().A(e());
        if (kio.b().q()) {
            khc.t(new wci("GH.ProjIntegOverlayMgr", yzz.INTEGRATED_OVERLAY, yzy.Mn, "Car not connected when unregistering integrated overlay callbacks.", new Object[0]), new kur(this, 20));
        }
        this.d = false;
    }
}
