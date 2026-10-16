package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class swv extends ijn implements IInterface {
    public swv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(qwr qwrVar, swu swuVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwrVar);
        ijp.i(parcelGh, swuVar);
        gj(4, parcelGh);
    }
}
