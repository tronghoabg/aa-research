package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class pbe extends ijn implements pbg {
    public pbe(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedService");
    }

    @Override // defpackage.pbg
    public final int e() throws RemoteException {
        Parcel parcelGi = gi(5, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.pbg
    public final boolean f(IBinder iBinder, pbj pbjVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeStrongBinder(iBinder);
        ijp.i(parcelGh, pbjVar);
        Parcel parcelGi = gi(2, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.pbg
    public final boolean g(IBinder iBinder) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeStrongBinder(iBinder);
        Parcel parcelGi = gi(6, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.pbg
    public final void h(IBinder iBinder) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeStrongBinder(iBinder);
        Parcel parcelGi = gi(3, parcelGh);
        ijp.j(parcelGi);
        parcelGi.recycle();
    }
}
