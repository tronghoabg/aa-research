package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qws extends defpackage.ijw implements qwt {
    public qws() {
        super("com.google.android.gms.car.ICarCall");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qww qwuVar = null;
        switch (i) {
            case 1:
                java.util.List listG = g();
                parcel2.writeNoException();
                parcel2.writeTypedList(listG);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                boolean zS = s();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                p(zJ);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int iF = f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int iE = e();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                o(i2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    qww qwwVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
                    qwuVar = qwwVarQueryLocalInterface instanceof qww ? qwwVarQueryLocalInterface : new qwu(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zT = t(qwuVar);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    qww qwwVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
                    qwuVar = qwwVarQueryLocalInterface2 instanceof qww ? qwwVarQueryLocalInterface2 : new qwu(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                boolean zU = u(qwuVar);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 9:
                com.google.android.gms.car.CarCall carCall = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                h(carCall);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.car.CarCall carCall2 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.j(parcel);
                parcel.readString();
                defpackage.ijx.d(parcel);
                z(carCall2);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.car.CarCall carCall3 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                j(carCall3);
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.car.CarCall carCall4 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                l(carCall4);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.car.CarCall carCall5 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                r(carCall5);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.car.CarCall carCall6 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                char c = (char) parcel.readInt();
                defpackage.ijx.d(parcel);
                n(carCall6, c);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.car.CarCall carCall7 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                q(carCall7);
                parcel2.writeNoException();
                return true;
            case 16:
                defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                y();
                parcel2.writeNoException();
                return true;
            case 17:
                com.google.android.gms.car.CarCall carCall8 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                com.google.android.gms.car.CarCall carCall9 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                i(carCall8, carCall9);
                parcel2.writeNoException();
                return true;
            case 18:
                defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                B();
                parcel2.writeNoException();
                return true;
            case 19:
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                m(string);
                parcel2.writeNoException();
                return true;
            case 20:
                k();
                parcel2.writeNoException();
                return true;
            case 21:
            case 25:
            default:
                return false;
            case 22:
                defpackage.ijx.d(parcel);
                w();
                parcel2.writeNoException();
                return true;
            case 23:
                defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                parcel.readString();
                defpackage.ijx.d(parcel);
                A();
                parcel2.writeNoException();
                return true;
            case 24:
                defpackage.ijx.d(parcel);
                x();
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.car.CarCall carCall10 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.ijx.a(parcel, android.telecom.PhoneAccountHandle.CREATOR);
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                v(carCall10, phoneAccountHandle);
                parcel2.writeNoException();
                return true;
        }
    }
}
