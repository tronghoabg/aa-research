package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class qwk extends ijo implements qwl {
    public qwk() {
        super("com.google.android.gms.car.ICarGalMonitor");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qwi qwiVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qwiVar = iInterfaceQueryLocalInterface instanceof qwi ? (qwi) iInterfaceQueryLocalInterface : new qwi(strongBinder);
                }
                int i2 = parcel.readInt();
                ijp.d(parcel);
                d(qwiVar, i2);
                break;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qwiVar = iInterfaceQueryLocalInterface2 instanceof qwi ? (qwi) iInterfaceQueryLocalInterface2 : new qwi(strongBinder2);
                }
                int i3 = parcel.readInt();
                ijp.d(parcel);
                h(qwiVar, i3);
                break;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qwiVar = iInterfaceQueryLocalInterface3 instanceof qwi ? (qwi) iInterfaceQueryLocalInterface3 : new qwi(strongBinder3);
                }
                int i4 = parcel.readInt();
                ijp.d(parcel);
                c(qwiVar, i4);
                break;
            case 4:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qwiVar = iInterfaceQueryLocalInterface4 instanceof qwi ? (qwi) iInterfaceQueryLocalInterface4 : new qwi(strongBinder4);
                }
                int i5 = parcel.readInt();
                ijp.d(parcel);
                g(qwiVar, i5);
                break;
            case 5:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qwiVar = iInterfaceQueryLocalInterface5 instanceof qwi ? (qwi) iInterfaceQueryLocalInterface5 : new qwi(strongBinder5);
                }
                ijp.d(parcel);
                b(qwiVar);
                break;
            case 6:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qwiVar = iInterfaceQueryLocalInterface6 instanceof qwi ? (qwi) iInterfaceQueryLocalInterface6 : new qwi(strongBinder6);
                }
                ijp.d(parcel);
                f(qwiVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
