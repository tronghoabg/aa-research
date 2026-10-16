package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qxg extends defpackage.ijw implements defpackage.qxh {
    public qxg() {
        super("com.google.android.gms.car.ICarGalMonitor");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qxe qxeVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qxeVar = iInterfaceQueryLocalInterface instanceof defpackage.qxe ? (defpackage.qxe) iInterfaceQueryLocalInterface : new defpackage.qxe(strongBinder);
                }
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                d(qxeVar, i2);
                break;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qxeVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qxe ? (defpackage.qxe) iInterfaceQueryLocalInterface2 : new defpackage.qxe(strongBinder2);
                }
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                h(qxeVar, i3);
                break;
            case 3:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qxeVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qxe ? (defpackage.qxe) iInterfaceQueryLocalInterface3 : new defpackage.qxe(strongBinder3);
                }
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                c(qxeVar, i4);
                break;
            case 4:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qxeVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qxe ? (defpackage.qxe) iInterfaceQueryLocalInterface4 : new defpackage.qxe(strongBinder4);
                }
                int i5 = parcel.readInt();
                defpackage.ijx.d(parcel);
                g(qxeVar, i5);
                break;
            case 5:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qxeVar = iInterfaceQueryLocalInterface5 instanceof defpackage.qxe ? (defpackage.qxe) iInterfaceQueryLocalInterface5 : new defpackage.qxe(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                b(qxeVar);
                break;
            case 6:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    qxeVar = iInterfaceQueryLocalInterface6 instanceof defpackage.qxe ? (defpackage.qxe) iInterfaceQueryLocalInterface6 : new defpackage.qxe(strongBinder6);
                }
                defpackage.ijx.d(parcel);
                f(qxeVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
