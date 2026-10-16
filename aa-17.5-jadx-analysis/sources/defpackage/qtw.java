package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qtw extends ijo implements qtx {
    public qtw() {
        super("com.google.android.gms.car.IAppDecorServiceProvider");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qua qtyVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            qtyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAppDecorServiceReadyCallback");
            qtyVar = iInterfaceQueryLocalInterface instanceof qua ? (qua) iInterfaceQueryLocalInterface : new qty(strongBinder);
        }
        ijp.d(parcel);
        h(qtyVar);
        return true;
    }
}
