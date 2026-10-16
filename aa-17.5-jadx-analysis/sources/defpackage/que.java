package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class que extends ijn implements qug {
    public que(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAudioPolicy");
    }

    @Override // defpackage.qug
    public final int e() throws RemoteException {
        Parcel parcelGi = gi(3, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qug
    public final qum f(int i) throws RemoteException {
        qum qukVar;
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(1, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qukVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioRecord");
            qukVar = iInterfaceQueryLocalInterface instanceof qum ? (qum) iInterfaceQueryLocalInterface : new quk(strongBinder);
        }
        parcelGi.recycle();
        return qukVar;
    }

    @Override // defpackage.qug
    public final qum g(int i, int[] iArr) throws RemoteException {
        qum qukVar;
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeIntArray(iArr);
        Parcel parcelGi = gi(2, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qukVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioRecord");
            qukVar = iInterfaceQueryLocalInterface instanceof qum ? (qum) iInterfaceQueryLocalInterface : new quk(strongBinder);
        }
        parcelGi.recycle();
        return qukVar;
    }

    @Override // defpackage.qug
    public final void h() throws RemoteException {
        gj(4, gh());
    }
}
