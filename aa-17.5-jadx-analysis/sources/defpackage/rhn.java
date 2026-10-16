package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest;

/* loaded from: classes.dex */
public abstract class rhn extends ijo implements rho {
    public rhn() {
        super("com.google.android.gms.car.carlocalmedia.ICarLocalMedia");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rhr rhpVar = null;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
                rhpVar = iInterfaceQueryLocalInterface instanceof rhr ? (rhr) iInterfaceQueryLocalInterface : new rhp(strongBinder);
            }
            ijp.d(parcel);
            f(rhpVar);
        } else if (i == 3) {
            CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest = (CarLocalMediaPlaybackRequest) ijp.a(parcel, CarLocalMediaPlaybackRequest.CREATOR);
            ijp.d(parcel);
            g(carLocalMediaPlaybackRequest);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
                rhpVar = iInterfaceQueryLocalInterface2 instanceof rhr ? (rhr) iInterfaceQueryLocalInterface2 : new rhp(strongBinder2);
            }
            ijp.d(parcel);
            h(rhpVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
