package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qxv extends defpackage.ijw implements defpackage.qxw {
    public qxv() {
        super("com.google.android.gms.car.ICarMessage");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qxz qxxVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface : new defpackage.qxx(strongBinder);
                }
                defpackage.ijx.d(parcel);
                c(qxxVar);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface2 : new defpackage.qxx(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                j(qxxVar);
                parcel2.writeNoException();
                return true;
            case 3:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface3 : new defpackage.qxx(strongBinder3);
                }
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                k(qxxVar, i2);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 4:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface4 : new defpackage.qxx(strongBinder4);
                }
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                defpackage.ijx.d(parcel);
                i(qxxVar, i3, i4, i5);
                parcel2.writeNoException();
                return true;
            case 5:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface5 instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface5 : new defpackage.qxx(strongBinder5);
                }
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                defpackage.ijx.d(parcel);
                int[] iArrL = l(qxxVar, i6, i7);
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrL);
                return true;
            case 6:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface6 instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface6 : new defpackage.qxx(strongBinder6);
                }
                int i8 = parcel.readInt();
                defpackage.ijx.d(parcel);
                f(qxxVar, i8);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    qxxVar = iInterfaceQueryLocalInterface7 instanceof defpackage.qxz ? (defpackage.qxz) iInterfaceQueryLocalInterface7 : new defpackage.qxx(strongBinder7);
                }
                defpackage.ijx.d(parcel);
                d(qxxVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
