package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes2.dex */
public abstract class sbu extends ijo implements sbv {
    public sbu() {
        super("com.google.android.gms.carsetup.IConnectionTransfer");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sbw sbwVar;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    sbwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.carsetup.IConnectionTransferCallbacks");
                    sbwVar = iInterfaceQueryLocalInterface instanceof sbw ? (sbw) iInterfaceQueryLocalInterface : new sbw(strongBinder);
                }
                ijp.d(parcel);
                j(sbwVar);
                parcel2.writeNoException();
                return true;
            case 3:
                CarInfoInternal carInfoInternalF = f();
                parcel2.writeNoException();
                ijp.h(parcel2, carInfoInternalF);
                return true;
            case 4:
                int iB = b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 5:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 6:
            default:
                return false;
            case 7:
                boolean zH = h();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 8:
                boolean zG = g();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ijp.a;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 9:
                int iC = c();
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 10:
                int iA = a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 11:
                rwp rwpVarD = d();
                parcel2.writeNoException();
                ijp.i(parcel2, rwpVarD);
                return true;
        }
    }
}
