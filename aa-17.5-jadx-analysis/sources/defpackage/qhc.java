package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class qhc implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ qhc(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, qwu] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, qwx] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((View) obj).requestApplyInsets();
                return;
            case 1:
                ((View) obj).requestApplyInsets();
                return;
            case 2:
                qir.n((lue) obj);
                return;
            case 3:
                Bundle bundle = (Bundle) obj;
                lxb.r(bundle, qir.o(bundle));
                return;
            case 4:
                Bundle bundle2 = (Bundle) obj;
                int i = lxb.e;
                if (bundle2.getBoolean("group_conversation")) {
                    lxb.r(bundle2, qir.o(bundle2));
                    return;
                }
                return;
            case 5:
                qir.n((lue) obj);
                return;
            case 6:
                qir.n((lue) obj);
                return;
            case 7:
                return;
            case 8:
                ((rnx) obj).a();
                return;
            case 9:
                sab sabVar = (sab) obj;
                synchronized (sabVar.d) {
                    sabVar.f.clear();
                    qyw qywVar = sabVar.e;
                    if (qywVar != null) {
                        try {
                            sabVar.a.k(qywVar);
                        } catch (RemoteException unused) {
                        }
                        sabVar.e = null;
                    }
                }
                rbe.j(new rzy(sabVar, 0));
                return;
            case 10:
                rdx rdxVar = (rdx) obj;
                ((lah) rdxVar.a).D();
                ((lah) rdxVar.b).D();
                ((lah) rdxVar.c).D();
                ((lah) rdxVar.d).D();
                return;
            case 11:
                return;
            case 12:
                rij rijVar = (rij) obj;
                rijVar.c.D();
                rijVar.d.D();
                return;
            case 13:
                ((rhj) obj).a();
                return;
            case 14:
                ((lah) ((rjr) obj).a).D();
                return;
            case 15:
                ((rfe) obj).d();
                return;
            case 16:
                roa roaVar = (roa) obj;
                if (omc.c("CAR.BT", 3)) {
                    rrd.a("CAR.BT", null, "handleCarDisconnection");
                }
                ((qvt) roaVar.b).a();
                return;
            case 17:
                return;
            case 18:
                qrx qrxVar = (qrx) obj;
                if (rrd.e("CAR.MEDIA", 3)) {
                    rrd.a("CAR.MEDIA", null, "handleCarDisconnection");
                }
                try {
                    Object obj2 = qrxVar.f;
                    ?? r0 = qrxVar.d;
                    Parcel parcelGh = ((ijn) obj2).gh();
                    ijp.i(parcelGh, r0);
                    Parcel parcelGi = ((ijn) obj2).gi(6, parcelGh);
                    ijp.j(parcelGi);
                    parcelGi.recycle();
                } catch (Exception unused2) {
                }
                try {
                    qrxVar.a.i(qrxVar.e);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 19:
                roe roeVar = (roe) obj;
                if (rrd.e("CAR.MSG", 3)) {
                    rrd.a("CAR.MSG", null, "handleCarDisconnection");
                }
                try {
                    roeVar.a.j(roeVar.d);
                } catch (RemoteException | IllegalStateException unused4) {
                }
                roeVar.b = null;
                return;
            default:
                rog rogVar = (rog) obj;
                if (omc.c("CAR.SENSOR", 3)) {
                    rrd.a("CAR.SENSOR", null, "handleCarDisconnection");
                }
                rogVar.a();
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
