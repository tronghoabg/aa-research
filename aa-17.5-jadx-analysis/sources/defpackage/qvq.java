package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qvq extends ijo implements qvr {
    public qvq() {
        super("com.google.android.gms.car.ICarBluetooth");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qvu qvsVar;
        switch (i) {
            case 1:
                int iC = c();
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    qvsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetoothClient");
                    qvsVar = iInterfaceQueryLocalInterface instanceof qvu ? (qvu) iInterfaceQueryLocalInterface : new qvs(strongBinder);
                }
                ijp.d(parcel);
                boolean zV = v(qvsVar);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 3:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 4:
                boolean zU = u();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 5:
                boolean zT = t();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ijp.a;
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 6:
                boolean zS = s();
                parcel2.writeNoException();
                ClassLoader classLoader4 = ijp.a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 7:
                boolean zR = r();
                parcel2.writeNoException();
                ClassLoader classLoader5 = ijp.a;
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 8:
                String strG = g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 9:
                int[] iArrW = w();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrW);
                return true;
            case 10:
                n();
                parcel2.writeNoException();
                return true;
            case 11:
                String strH = h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            case 12:
                String strI = i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            default:
                return false;
        }
    }
}
