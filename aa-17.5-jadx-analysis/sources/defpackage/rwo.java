package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class rwo extends ijo implements rwp {
    public rwo() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rws rwqVar = null;
        switch (i) {
            case 2:
                int[] iArrO = o();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO);
                return true;
            case 3:
                boolean zH = h();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 4:
                int i2 = parcel.readInt();
                long j = parcel.readLong();
                ijp.d(parcel);
                boolean zGm = gm(i2, j);
                parcel2.writeNoException();
                parcel2.writeInt(zGm ? 1 : 0);
                return true;
            case 5:
                int i3 = parcel.readInt();
                ijp.d(parcel);
                byte[] bArrN = n(i3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN);
                return true;
            case 6:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    rwqVar = iInterfaceQueryLocalInterface instanceof rws ? (rws) iInterfaceQueryLocalInterface : new rwq(strongBinder);
                }
                ijp.d(parcel);
                f(rwqVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    rwqVar = iInterfaceQueryLocalInterface2 instanceof rws ? (rws) iInterfaceQueryLocalInterface2 : new rwq(strongBinder2);
                }
                ijp.d(parcel);
                g(rwqVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
