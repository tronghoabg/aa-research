package defpackage;

import android.graphics.Rect;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final /* synthetic */ class noe implements nsk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ noe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nsk
    public final void a(qrn qrnVar, nsn nsnVar, Rect rect) throws qrz {
        int i = 1;
        if (this.b != 0) {
            int i2 = mpo.a;
            mki.a.g();
            CarRegionId carRegionIdR = nsr.c().a(((nso) this.a).o).r(nsnVar);
            raj rajVar = raj.t;
            rdj rdjVar = (rdj) ((raz) qrnVar).a;
            if (!rdjVar.p(rajVar)) {
                throw new IllegalStateException("This API can only be used if multi-display is enabled");
            }
            rdjVar.f.g(new rdb(rdjVar, carRegionIdR, rect, i));
            return;
        }
        noh nohVar = (noh) this.a;
        rby rbyVar = nohVar.m;
        rzx rzxVar = (rzx) nohVar.k.g.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "attempting to update window layout, but inflater not found: %s", rbyVar);
            return;
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s updateWindowInsets(%s)", rzxVar.a, rect);
        }
        rzxVar.p(rect);
        try {
            rzxVar.i.t(rect);
        } catch (RemoteException e) {
            throw new RuntimeException("updateWindowInsets RemoteException", e);
        }
    }
}
