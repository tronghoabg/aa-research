package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes.dex */
public abstract class qyg extends ijo implements qyh {
    public qyg() {
        super("com.google.android.gms.car.ICarSensor");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qyk qyiVar = null;
        switch (i) {
            case 1:
                int[] iArrT = t();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrT);
                return true;
            case 2:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarSensorEventListener");
                    qyiVar = iInterfaceQueryLocalInterface instanceof qyk ? (qyk) iInterfaceQueryLocalInterface : new qyi(strongBinder);
                }
                ijp.d(parcel);
                boolean zO = o(i2, i3, qyiVar);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 3:
                int i4 = parcel.readInt();
                ijp.d(parcel);
                CarSensorEvent carSensorEventH = h(i4);
                parcel2.writeNoException();
                ijp.h(parcel2, carSensorEventH);
                return true;
            case 4:
                int i5 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarSensorEventListener");
                    qyiVar = iInterfaceQueryLocalInterface2 instanceof qyk ? (qyk) iInterfaceQueryLocalInterface2 : new qyi(strongBinder2);
                }
                ijp.d(parcel);
                gd(i5, qyiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                int iG = g();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            case 6:
                int[] iArrS = s();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrS);
                return true;
            case 7:
                int[] iArrP = p();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrP);
                return true;
            default:
                return false;
        }
    }
}
