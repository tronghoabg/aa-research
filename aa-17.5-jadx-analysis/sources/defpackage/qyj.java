package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes.dex */
public abstract class qyj extends ijo implements qyk {
    public qyj() {
        super("com.google.android.gms.car.ICarSensorEventListener");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CarSensorEvent carSensorEvent = (CarSensorEvent) ijp.a(parcel, CarSensorEvent.CREATOR);
        ijp.d(parcel);
        b(carSensorEvent);
        return true;
    }
}
