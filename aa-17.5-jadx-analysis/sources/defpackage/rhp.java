package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus;

/* loaded from: classes2.dex */
public final class rhp extends ijn implements rhr {
    public rhp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
    }

    @Override // defpackage.rhr
    public final void e(CarLocalMediaPlaybackMetadata carLocalMediaPlaybackMetadata) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carLocalMediaPlaybackMetadata);
        gk(2, parcelGh);
    }

    @Override // defpackage.rhr
    public final void f(CarLocalMediaPlaybackStatus carLocalMediaPlaybackStatus) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carLocalMediaPlaybackStatus);
        gk(1, parcelGh);
    }
}
