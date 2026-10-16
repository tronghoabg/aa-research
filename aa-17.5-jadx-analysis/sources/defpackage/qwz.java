package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qwz extends ijo implements qxa {
    public qwz() {
        super("com.google.android.gms.car.ICarMessage");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qxd qxbVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface instanceof qxd ? (qxd) iInterfaceQueryLocalInterface : new qxb(strongBinder);
                }
                ijp.d(parcel);
                c(qxbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface2 instanceof qxd ? (qxd) iInterfaceQueryLocalInterface2 : new qxb(strongBinder2);
                }
                ijp.d(parcel);
                j(qxbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface3 instanceof qxd ? (qxd) iInterfaceQueryLocalInterface3 : new qxb(strongBinder3);
                }
                int i2 = parcel.readInt();
                ijp.d(parcel);
                k(qxbVar, i2);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 4:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface4 instanceof qxd ? (qxd) iInterfaceQueryLocalInterface4 : new qxb(strongBinder4);
                }
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ijp.d(parcel);
                i(qxbVar, i3, i4, i5);
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface5 instanceof qxd ? (qxd) iInterfaceQueryLocalInterface5 : new qxb(strongBinder5);
                }
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                ijp.d(parcel);
                int[] iArrL = l(qxbVar, i6, i7);
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrL);
                return true;
            case 6:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface6 instanceof qxd ? (qxd) iInterfaceQueryLocalInterface6 : new qxb(strongBinder6);
                }
                int i8 = parcel.readInt();
                ijp.d(parcel);
                f(qxbVar, i8);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxbVar = iInterfaceQueryLocalInterface7 instanceof qxd ? (qxd) iInterfaceQueryLocalInterface7 : new qxb(strongBinder7);
                }
                ijp.d(parcel);
                d(qxbVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
