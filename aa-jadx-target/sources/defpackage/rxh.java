package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rxh extends defpackage.ijw implements defpackage.rxi {
    public rxh() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rxl rxjVar = null;
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArrO = o();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zH = h();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i2 = parcel.readInt();
                long j = parcel.readLong();
                defpackage.ijx.d(parcel);
                boolean zFu = fu(i2, j);
                parcel2.writeNoException();
                parcel2.writeInt(zFu ? 1 : 0);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                byte[] bArrN = n(i3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    rxj rxjVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    rxjVar = rxjVarQueryLocalInterface instanceof defpackage.rxl ? (defpackage.rxl) rxjVarQueryLocalInterface : new rxj(strongBinder);
                }
                defpackage.ijx.d(parcel);
                f(rxjVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    rxj rxjVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    rxjVar = rxjVarQueryLocalInterface2 instanceof defpackage.rxl ? (defpackage.rxl) rxjVarQueryLocalInterface2 : new rxj(strongBinder2);
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
