package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rxh extends defpackage.ijw implements defpackage.rxi {
    public rxh() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rxl rxjVar = null;
        switch (i) {
            case 2:
                int[] iArrO = o();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO);
                return true;
            case 3:
                boolean zH = h();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 4:
                int i2 = parcel.readInt();
                long j = parcel.readLong();
                defpackage.ijx.d(parcel);
                boolean zFu = fu(i2, j);
                parcel2.writeNoException();
                parcel2.writeInt(zFu ? 1 : 0);
                return true;
            case 5:
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                byte[] bArrN = n(i3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN);
                return true;
            case 6:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    rxjVar = iInterfaceQueryLocalInterface instanceof defpackage.rxl ? (defpackage.rxl) iInterfaceQueryLocalInterface : new defpackage.rxj(strongBinder);
                }
                defpackage.ijx.d(parcel);
                f(rxjVar);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    rxjVar = iInterfaceQueryLocalInterface2 instanceof defpackage.rxl ? (defpackage.rxl) iInterfaceQueryLocalInterface2 : new defpackage.rxj(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                g(rxjVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
