package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class scb extends ijo implements scc {
    public scb() {
        super("com.google.android.gms.carsetup.IServiceHandshake");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        scf scdVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            scdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.carsetup.IServiceHandshakeCallback");
            scdVar = iInterfaceQueryLocalInterface instanceof scf ? (scf) iInterfaceQueryLocalInterface : new scd(strongBinder);
        }
        ijp.d(parcel);
        a(scdVar);
        parcel2.writeNoException();
        return true;
    }
}
