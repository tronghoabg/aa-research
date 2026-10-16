package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qts extends ijn implements qtu {
    public qts(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorService");
    }

    @Override // defpackage.qtu
    public final Bundle e() throws RemoteException {
        Parcel parcelGi = gi(7, gh());
        Bundle bundle = (Bundle) ijp.a(parcelGi, Bundle.CREATOR);
        parcelGi.recycle();
        return bundle;
    }

    @Override // defpackage.qtu
    public final Bundle f() throws RemoteException {
        Parcel parcelGi = gi(6, gh());
        Bundle bundle = (Bundle) ijp.a(parcelGi, Bundle.CREATOR);
        parcelGi.recycle();
        return bundle;
    }

    @Override // defpackage.qtu
    public final rab g(int i, int i2) throws RemoteException {
        rab qzzVar;
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        Parcel parcelGi = gi(11, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qzzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ISystemUiService");
            qzzVar = iInterfaceQueryLocalInterface instanceof rab ? (rab) iInterfaceQueryLocalInterface : new qzz(strongBinder);
        }
        parcelGi.recycle();
        return qzzVar;
    }

    @Override // defpackage.qtu
    public final void h(qzm qzmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qzmVar);
        gj(3, parcelGh);
    }

    @Override // defpackage.qtu
    public final void i(boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(z2 ? 1 : 0);
        gj(9, parcelGh);
    }

    @Override // defpackage.qtu
    public final void j(qzm qzmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qzmVar);
        gj(4, parcelGh);
    }
}
