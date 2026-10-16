package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes.dex */
public final class qyi extends ijn implements qyk {
    public qyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarSensorEventListener");
    }

    @Override // defpackage.qyk
    public final void b(CarSensorEvent carSensorEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carSensorEvent);
        gk(1, parcelGh);
    }
}
