package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class qtz extends ijo implements qua {
    public qtz() {
        super("com.google.android.gms.car.IAppDecorServiceReadyCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qtu qtsVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            qtsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAppDecorService");
            qtsVar = iInterfaceQueryLocalInterface instanceof qtu ? (qtu) iInterfaceQueryLocalInterface : new qts(strongBinder);
        }
        ijp.d(parcel);
        a(qtsVar);
        return true;
    }
}
