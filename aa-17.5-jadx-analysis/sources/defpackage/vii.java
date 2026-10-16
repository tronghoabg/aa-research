package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vii extends ijo implements vij {
    public vii() {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        vis viqVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            viqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IStreetViewPanoramaDelegate");
            viqVar = iInterfaceQueryLocalInterface instanceof vis ? (vis) iInterfaceQueryLocalInterface : new viq(strongBinder);
        }
        ijp.d(parcel);
        a(viqVar);
        parcel2.writeNoException();
        return true;
    }
}
