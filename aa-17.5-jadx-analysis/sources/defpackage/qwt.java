package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qwt extends ijo implements qwu {
    public qwt() {
        super("com.google.android.gms.car.ICarMediaPlaybackStatus");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qwx qwvVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qwvVar = iInterfaceQueryLocalInterface instanceof qwx ? (qwx) iInterfaceQueryLocalInterface : new qwv(strongBinder);
            }
            qwx qwxVar = qwvVar;
            int i2 = parcel.readInt();
            String string = parcel.readString();
            int i3 = parcel.readInt();
            boolean zJ = ijp.j(parcel);
            boolean zJ2 = ijp.j(parcel);
            boolean zJ3 = ijp.j(parcel);
            ijp.d(parcel);
            g(qwxVar, i2, string, i3, zJ, zJ2, zJ3);
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qwvVar = iInterfaceQueryLocalInterface2 instanceof qwx ? (qwx) iInterfaceQueryLocalInterface2 : new qwv(strongBinder2);
            }
            qwx qwxVar2 = qwvVar;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            String string5 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            ijp.d(parcel);
            f(qwxVar2, string2, string3, string4, bArrCreateByteArray, string5, i4, i5);
            parcel2.writeNoException();
        } else if (i == 3) {
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qwvVar = iInterfaceQueryLocalInterface3 instanceof qwx ? (qwx) iInterfaceQueryLocalInterface3 : new qwv(strongBinder3);
            }
            ijp.d(parcel);
            boolean zH = h(qwvVar);
            parcel2.writeNoException();
            parcel2.writeInt(zH ? 1 : 0);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qwvVar = iInterfaceQueryLocalInterface4 instanceof qwx ? (qwx) iInterfaceQueryLocalInterface4 : new qwv(strongBinder4);
            }
            ijp.d(parcel);
            boolean zI = i(qwvVar);
            parcel2.writeNoException();
            parcel2.writeInt(zI ? 1 : 0);
        }
        return true;
    }
}
