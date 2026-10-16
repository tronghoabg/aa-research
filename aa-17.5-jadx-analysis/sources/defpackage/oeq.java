package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class oeq extends kfn {
    final /* synthetic */ oer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeq(oer oerVar) {
        super(null);
        this.a = oerVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qvr] */
    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        String strG;
        String str = null;
        try {
            mki.a.g();
            roa roaVarJ = ols.j(qrnVar);
            if (omc.c("CAR.BT", 3)) {
                rrd.a("CAR.BT", null, "getCarBluetoothAddress");
            }
            try {
                strG = roaVarJ.a.g();
            } catch (RemoteException | IllegalStateException e) {
                roaVarJ.a(e);
                strG = null;
            }
            ((ype) ((ype) oer.a.f()).ai(5632)).y("car bluetooth address: %s", strG);
            str = strG;
        } catch (qrz | qsa e2) {
            ((ype) ((ype) ((ype) oer.a.h()).p(e2)).ai((char) 5633)).u("Error getting car bluetooth address");
        }
        oer oerVar = this.a;
        oerVar.i = str;
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, oerVar.i != null ? yzy.DX : yzy.DY).l());
    }
}
