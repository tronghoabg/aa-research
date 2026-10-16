package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarPropertyState;

/* loaded from: classes2.dex */
public final class rit extends ijn implements riv {
    public rit(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarPropertyUpdateListener");
    }

    @Override // defpackage.riv
    public final void e(CarPropertyState carPropertyState) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carPropertyState);
        gk(1, parcelGh);
    }
}
