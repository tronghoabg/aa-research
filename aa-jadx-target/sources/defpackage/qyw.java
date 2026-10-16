package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qyw extends defpackage.ijw implements defpackage.qyx {
    public qyw() {
        super("com.google.android.gms.car.ICarRadio");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qza qyyVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    qza qzaVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qyyVar = qzaVarQueryLocalInterface instanceof qza ? qzaVarQueryLocalInterface : new qyy(strongBinder);
                }
                defpackage.ijx.d(parcel);
                s(qyyVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    qza qzaVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qyyVar = qzaVarQueryLocalInterface2 instanceof qza ? qzaVarQueryLocalInterface2 : new qyy(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                x(qyyVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.gms.car.RadioProgramSelector radioProgramSelector = (com.google.android.gms.car.RadioProgramSelector) defpackage.ijx.a(parcel, com.google.android.gms.car.RadioProgramSelector.CREATOR);
                defpackage.ijx.d(parcel);
                w(radioProgramSelector);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                n(zJ);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    qza qzaVarQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qyyVar = qzaVarQueryLocalInterface3 instanceof qza ? qzaVarQueryLocalInterface3 : new qyy(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                t(qyyVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                boolean zJ2 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                u(zJ2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                v(i2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                o(string);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.car.RadioConfiguration radioConfigurationF = f();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, radioConfigurationF);
                return true;
            default:
                return false;
        }
    }
}
