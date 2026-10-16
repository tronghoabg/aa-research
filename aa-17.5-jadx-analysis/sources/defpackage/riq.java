package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertySetError;

/* loaded from: classes2.dex */
public final class riq extends ijn implements ris {
    public riq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarPropertySetResultCallback");
    }

    @Override // defpackage.ris
    public final void e(CarProperty carProperty, CarPropertySetError carPropertySetError) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carProperty);
        ijp.g(parcelGh, carPropertySetError);
        gj(3, parcelGh);
    }

    @Override // defpackage.ris
    public final void f(CarProperty carProperty) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carProperty);
        gj(2, parcelGh);
    }
}
