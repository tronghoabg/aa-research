package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* loaded from: classes.dex */
public final class sae implements ServiceConnection {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public sae(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        sbq sbqVar = null;
        mka mjyVar = null;
        if (this.b == 0) {
            if (omc.c("CAR.DATA.SERVICE", 3)) {
                Log.d("CAR.DATA.SERVICE", "connected");
            }
            Object obj = this.a;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ICarData");
                sbqVar = iInterfaceQueryLocalInterface instanceof sbq ? (sbq) iInterfaceQueryLocalInterface : new sbq(iBinder);
            }
            saf safVar = (saf) obj;
            safVar.b = sbqVar;
            safVar.a.release();
            return;
        }
        ((ype) ((ype) qjt.a.f()).ai(7416)).M("onServiceConnected(ComponentName:%s, service:%s)", componentName, iBinder);
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.auto.components.service.ICarModeSharedService");
            mjyVar = iInterfaceQueryLocalInterface2 instanceof mka ? (mka) iInterfaceQueryLocalInterface2 : new mjy(iBinder);
        }
        qjt qjtVar = (qjt) this.a;
        qjtVar.d = mjyVar;
        mka mkaVar = qjtVar.d;
        if (mkaVar != null) {
            qjtVar.c.a(mkaVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (this.b == 0) {
            if (omc.c("CAR.DATA.SERVICE", 3)) {
                Log.d("CAR.DATA.SERVICE", "CarDataService disconnected");
            }
            ((saf) this.a).b = null;
        } else {
            ((ype) ((ype) qjt.a.f()).ai((char) 7417)).y("onServiceDisconnected(ComponentName:%s)", componentName);
            qjt qjtVar = (qjt) this.a;
            if (qjtVar.d != null) {
                qjtVar.c.b();
            }
        }
    }
}
