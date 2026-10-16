package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest;

/* loaded from: classes2.dex */
public final class rhm extends ijn implements rho {
    public rhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.carlocalmedia.ICarLocalMedia");
    }

    @Override // defpackage.rho
    public final void f(rhr rhrVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rhrVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.rho
    public final void g(CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carLocalMediaPlaybackRequest);
        gj(3, parcelGh);
    }

    @Override // defpackage.rho
    public final void h(rhr rhrVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rhrVar);
        gj(4, parcelGh);
    }
}
