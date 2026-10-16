package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qxp extends defpackage.ijw implements defpackage.qxq {
    public qxp() {
        super("com.google.android.gms.car.ICarMediaPlaybackStatus");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qxt qxrVar = null;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qxrVar = iInterfaceQueryLocalInterface instanceof defpackage.qxt ? (defpackage.qxt) iInterfaceQueryLocalInterface : new defpackage.qxr(strongBinder);
            }
            defpackage.qxt qxtVar = qxrVar;
            int i2 = parcel.readInt();
            java.lang.String string = parcel.readString();
            int i3 = parcel.readInt();
            boolean zJ = defpackage.ijx.j(parcel);
            boolean zJ2 = defpackage.ijx.j(parcel);
            boolean zJ3 = defpackage.ijx.j(parcel);
            defpackage.ijx.d(parcel);
            g(qxtVar, i2, string, i3, zJ, zJ2, zJ3);
            parcel2.writeNoException();
        } else if (i == 2) {
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qxrVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qxt ? (defpackage.qxt) iInterfaceQueryLocalInterface2 : new defpackage.qxr(strongBinder2);
            }
            defpackage.qxt qxtVar2 = qxrVar;
            java.lang.String string2 = parcel.readString();
            java.lang.String string3 = parcel.readString();
            java.lang.String string4 = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            java.lang.String string5 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            defpackage.ijx.d(parcel);
            f(qxtVar2, string2, string3, string4, bArrCreateByteArray, string5, i4, i5);
            parcel2.writeNoException();
        } else if (i == 3) {
            android.os.IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qxrVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qxt ? (defpackage.qxt) iInterfaceQueryLocalInterface3 : new defpackage.qxr(strongBinder3);
            }
            defpackage.ijx.d(parcel);
            boolean zH = h(qxrVar);
            parcel2.writeNoException();
            parcel2.writeInt(zH ? 1 : 0);
        } else {
            if (i != 4) {
                return false;
            }
            android.os.IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                qxrVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qxt ? (defpackage.qxt) iInterfaceQueryLocalInterface4 : new defpackage.qxr(strongBinder4);
            }
            defpackage.ijx.d(parcel);
            boolean zI = i(qxrVar);
            parcel2.writeNoException();
            parcel2.writeInt(zI ? 1 : 0);
        }
        return true;
    }
}
