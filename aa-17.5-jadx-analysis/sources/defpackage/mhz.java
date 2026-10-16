package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mhz extends ijn implements mib {
    public mhz(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.projectionstate.IProjectionStateService");
    }

    @Override // defpackage.mib
    public final void e(mhy mhyVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, mhyVar);
        gk(2, parcelGh);
    }
}
