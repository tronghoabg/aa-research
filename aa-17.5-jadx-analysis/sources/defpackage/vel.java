package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vel extends ijo implements vem {
    public vel() {
        super("com.google.android.libraries.maps.internal.ILocationSourceDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        vgg vgeVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                vgeVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnLocationChangeListener");
                vgeVar = iInterfaceQueryLocalInterface instanceof vgg ? (vgg) iInterfaceQueryLocalInterface : new vge(strongBinder);
            }
            ijp.d(parcel);
            a(vgeVar);
        } else {
            if (i != 2) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
