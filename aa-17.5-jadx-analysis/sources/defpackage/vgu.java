package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vgu extends ijo implements vgv {
    public vgu() {
        super("com.google.android.libraries.maps.internal.IOnMapReadyCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        veg veeVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            veeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IGoogleMapDelegate");
            veeVar = iInterfaceQueryLocalInterface instanceof veg ? (veg) iInterfaceQueryLocalInterface : new vee(strongBinder);
        }
        ijp.d(parcel);
        a(veeVar);
        parcel2.writeNoException();
        return true;
    }
}
