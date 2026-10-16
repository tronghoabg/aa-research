package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qzc extends defpackage.ijw implements defpackage.qzd {
    public qzc() {
        super("com.google.android.gms.car.ICarSensor");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qzg qzeVar = null;
        switch (i) {
            case 1:
                int[] iArrT = t();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrT);
                return true;
            case 2:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarSensorEventListener");
                    qzeVar = iInterfaceQueryLocalInterface instanceof defpackage.qzg ? (defpackage.qzg) iInterfaceQueryLocalInterface : new defpackage.qze(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zO = o(i2, i3, qzeVar);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 3:
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarSensorEvent carSensorEventH = h(i4);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carSensorEventH);
                return true;
            case 4:
                int i5 = parcel.readInt();
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarSensorEventListener");
                    qzeVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qzg ? (defpackage.qzg) iInterfaceQueryLocalInterface2 : new defpackage.qze(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                fl(i5, qzeVar);
                parcel2.writeNoException();
                return true;
            case 5:
                int iG = g();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            case 6:
                int[] iArrS = s();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrS);
                return true;
            case 7:
                int[] iArrP = p();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrP);
                return true;
            default:
                return false;
        }
    }
}
