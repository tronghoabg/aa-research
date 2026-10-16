package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vgf extends ijo implements vgg {
    public vgf() {
        super("com.google.android.libraries.maps.internal.IOnLocationChangeListener");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                sqhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
            }
            ijp.d(parcel);
            e(sqhVar);
        } else {
            if (i != 2) {
                return false;
            }
            Location location = (Location) ijp.a(parcel, Location.CREATOR);
            ijp.d(parcel);
            f(location);
        }
        parcel2.writeNoException();
        return true;
    }
}
