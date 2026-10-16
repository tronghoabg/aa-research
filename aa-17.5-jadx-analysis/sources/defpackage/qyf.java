package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes.dex */
public final class qyf extends ijn implements qyh {
    public qyf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarSensor");
    }

    @Override // defpackage.qyh
    public final int g() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qyh
    public final void gd(int i, qyk qykVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ijp.i(parcelGh, qykVar);
        gj(4, parcelGh);
    }

    @Override // defpackage.qyh
    public final CarSensorEvent h(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(3, parcelGh);
        CarSensorEvent carSensorEvent = (CarSensorEvent) ijp.a(parcelGi, CarSensorEvent.CREATOR);
        parcelGi.recycle();
        return carSensorEvent;
    }

    @Override // defpackage.qyh
    public final boolean o(int i, int i2, qyk qykVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        ijp.i(parcelGh, qykVar);
        Parcel parcelGi = gi(2, parcelGh);
        int i3 = parcelGi.readInt();
        parcelGi.recycle();
        return i3 != 0;
    }

    @Override // defpackage.qyh
    public final int[] p() throws RemoteException {
        Parcel parcelGi = gi(7, gh());
        int[] iArrCreateIntArray = parcelGi.createIntArray();
        parcelGi.recycle();
        return iArrCreateIntArray;
    }

    @Override // defpackage.qyh
    public final int[] s() throws RemoteException {
        Parcel parcelGi = gi(6, gh());
        int[] iArrCreateIntArray = parcelGi.createIntArray();
        parcelGi.recycle();
        return iArrCreateIntArray;
    }

    @Override // defpackage.qyh
    public final int[] t() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        int[] iArrCreateIntArray = parcelGi.createIntArray();
        parcelGi.recycle();
        return iArrCreateIntArray;
    }
}
