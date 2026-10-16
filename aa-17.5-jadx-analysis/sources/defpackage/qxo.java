package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarPhoneStatus;

/* loaded from: classes.dex */
public abstract class qxo extends ijo implements qxp {
    public qxo() {
        super("com.google.android.gms.car.ICarPhoneStatus");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qxs qxqVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qxqVar = iInterfaceQueryLocalInterface instanceof qxs ? (qxs) iInterfaceQueryLocalInterface : new qxq(strongBinder);
                }
                CarPhoneStatus carPhoneStatus = (CarPhoneStatus) ijp.a(parcel, CarPhoneStatus.CREATOR);
                ijp.d(parcel);
                h(qxqVar, carPhoneStatus);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qxqVar = iInterfaceQueryLocalInterface2 instanceof qxs ? (qxs) iInterfaceQueryLocalInterface2 : new qxq(strongBinder2);
                }
                ijp.d(parcel);
                boolean zK = k(qxqVar);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qxqVar = iInterfaceQueryLocalInterface3 instanceof qxs ? (qxs) iInterfaceQueryLocalInterface3 : new qxq(strongBinder3);
                }
                ijp.d(parcel);
                boolean zL = l(qxqVar);
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 4:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 5:
                int i2 = parcel.readInt();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qxqVar = iInterfaceQueryLocalInterface4 instanceof qxs ? (qxs) iInterfaceQueryLocalInterface4 : new qxq(strongBinder4);
                }
                ijp.d(parcel);
                boolean zJ = j(i2, qxqVar);
                parcel2.writeNoException();
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 6:
                CarPhoneStatus carPhoneStatus2 = (CarPhoneStatus) ijp.a(parcel, CarPhoneStatus.CREATOR);
                ijp.d(parcel);
                g(carPhoneStatus2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
