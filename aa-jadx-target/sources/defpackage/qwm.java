package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qwm extends defpackage.ijw implements defpackage.qwn {
    public qwm() {
        super("com.google.android.gms.car.ICarBluetooth");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qwq qwoVar;
        switch (i) {
            case 1:
                int iC = c();
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    qwoVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetoothClient");
                    qwoVar = iInterfaceQueryLocalInterface instanceof qwq ? (qwq) iInterfaceQueryLocalInterface : new defpackage.qwo(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zV = v(qwoVar);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zQ = q();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                boolean zU = u();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                boolean zT = t();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                boolean zS = s();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader4 = defpackage.ijx.a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean zR = r();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader5 = defpackage.ijx.a;
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String strG = g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 9:
                int[] iArrW = w();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrW);
                return true;
            case 10:
                n();
                parcel2.writeNoException();
                return true;
            case 11:
                java.lang.String strH = h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            case 12:
                java.lang.String strI = i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            default:
                return false;
        }
    }
}
