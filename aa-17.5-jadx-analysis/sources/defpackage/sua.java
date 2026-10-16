package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* loaded from: classes.dex */
public final class sua extends snw {
    public final aat a;
    private final aat x;
    private final aat y;

    public sua(Context context, Looper looper, snr snrVar, slz slzVar, smu smuVar) {
        super(context, looper, 23, snrVar, slzVar, smuVar);
        this.a = new aat(0);
        this.x = new aat(0);
        this.y = new aat(0);
        new aat(0);
    }

    @Override // defpackage.snp
    public final void E() {
        System.currentTimeMillis();
        aat aatVar = this.a;
        synchronized (aatVar) {
            aatVar.clear();
        }
        aat aatVar2 = this.x;
        synchronized (aatVar2) {
            aatVar2.clear();
        }
        aat aatVar3 = this.y;
        synchronized (aatVar3) {
            aatVar3.clear();
        }
    }

    public final boolean H(Feature feature) {
        Feature feature2;
        Feature[] featureArrR = r();
        if (featureArrR != null) {
            int i = 0;
            while (true) {
                if (i >= featureArrR.length) {
                    feature2 = null;
                    break;
                }
                feature2 = featureArrR[i];
                if (feature.a.equals(feature2.a)) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.a() >= feature.a()) {
                return true;
            }
        }
        return false;
    }

    public final void I(sty styVar, LocationRequest locationRequest, nok nokVar) throws RemoteException {
        ssy ssyVar;
        smr smrVarB = styVar.b();
        smp smpVar = smrVarB.a;
        smpVar.getClass();
        boolean zH = H(ssw.j);
        aat aatVar = this.x;
        synchronized (aatVar) {
            ssy ssyVar2 = (ssy) aatVar.get(smpVar);
            if (ssyVar2 == null || zH) {
                ssy ssyVar3 = new ssy(styVar);
                aatVar.put(smpVar, ssyVar3);
                ssyVar = ssyVar3;
            } else {
                ssyVar2.a.d(smrVarB);
                ssyVar = ssyVar2;
                ssyVar2 = null;
            }
            if (zH) {
                ((stl) v()).e(LocationReceiver.a(ssyVar2, ssyVar, smpVar.a()), locationRequest, new stv(null, nokVar));
            } else {
                ((stl) v()).g(new LocationRequestUpdateData(1, new LocationRequestInternal(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, ssyVar, null, new sts(nokVar, ssyVar), smpVar.a()));
            }
        }
    }

    public final void J(smp smpVar, boolean z, nok nokVar) throws RemoteException {
        aat aatVar = this.x;
        synchronized (aatVar) {
            ssy ssyVar = (ssy) aatVar.remove(smpVar);
            if (ssyVar == null) {
                nokVar.e(false);
                return;
            }
            ssyVar.a.b().a();
            if (!z) {
                nokVar.e(true);
            } else if (H(ssw.j)) {
                ((stl) v()).f(LocationReceiver.a(null, ssyVar, "ILocationCallback@" + System.identityHashCode(ssyVar)), new stv(true, nokVar));
            } else {
                ((stl) v()).g(new LocationRequestUpdateData(2, null, null, ssyVar, null, new stw(true, nokVar), null));
            }
        }
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 11717000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof stl ? (stl) iInterfaceQueryLocalInterface : new stl(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return ssw.q;
    }
}
