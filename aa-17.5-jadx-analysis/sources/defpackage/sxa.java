package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class sxa extends snw {
    private final AtomicReference a;

    public sxa(Context context, Looper looper, snr snrVar, slb slbVar, slc slcVar) {
        super(context, looper, 41, snrVar, slbVar, slcVar);
        this.a = new AtomicReference();
    }

    public final void H(qwr qwrVar, qwr qwrVar2, slu sluVar) throws RemoteException {
        swy swyVar = new swy((swv) v(), sluVar, qwrVar2);
        if (qwrVar == null) {
            if (qwrVar2 == null) {
                sluVar.g();
                return;
            } else {
                ((swv) v()).e(qwrVar2, swyVar);
                return;
            }
        }
        swv swvVar = (swv) v();
        Parcel parcelGh = swvVar.gh();
        ijp.i(parcelGh, qwrVar);
        ijp.i(parcelGh, swyVar);
        swvVar.gj(10, parcelGh);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof swv ? (swv) iInterfaceQueryLocalInterface : new swv(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return swi.g;
    }

    @Override // defpackage.snp
    public final void y() {
        try {
            qwr qwrVar = (qwr) this.a.getAndSet(null);
            if (qwrVar != null) {
                swx swxVar = new swx();
                swv swvVar = (swv) v();
                Parcel parcelGh = swvVar.gh();
                ijp.i(parcelGh, qwrVar);
                ijp.i(parcelGh, swxVar);
                swvVar.gj(5, parcelGh);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.y();
    }
}
