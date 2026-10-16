package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarGalMessage;

/* loaded from: classes2.dex */
public final class qwi extends ijn implements IInterface {
    public qwi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGalListener");
    }

    public final void e(long j, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        gk(5, parcelGh);
    }

    public final void f(long j, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        gk(6, parcelGh);
    }

    public final void g(long j, int i, int i2, int i3, int i4) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeInt(i4);
        gk(4, parcelGh);
    }

    public final void h(long j, int i, int i2, int i3, int i4) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeInt(i4);
        gk(3, parcelGh);
    }

    public final void i(CarGalMessage carGalMessage) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carGalMessage);
        gk(2, parcelGh);
    }

    public final void j(CarGalMessage carGalMessage) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carGalMessage);
        gk(1, parcelGh);
    }
}
