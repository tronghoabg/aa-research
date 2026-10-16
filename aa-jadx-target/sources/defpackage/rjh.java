package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rjh extends defpackage.ijw implements defpackage.rji {
    public rjh() {
        super("com.google.android.gms.car.control.ICarControl");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        rjl rjmVar = null;
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.car.control.CarProperty carProperty = (com.google.android.gms.car.control.CarProperty) defpackage.ijx.a(parcel, com.google.android.gms.car.control.CarProperty.CREATOR);
                com.google.android.gms.car.control.CarPropertyValue carPropertyValue = (com.google.android.gms.car.control.CarPropertyValue) defpackage.ijx.a(parcel, com.google.android.gms.car.control.CarPropertyValue.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    rjl rjlVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.control.ICarPropertySetResultCallback");
                    rjmVar = rjlVarQueryLocalInterface instanceof rjo ? (rjo) rjlVarQueryLocalInterface : new rjm(strongBinder);
                }
                defpackage.ijx.d(parcel);
                v(carProperty, carPropertyValue, rjmVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    rjl rjlVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.control.ICarPropertyUpdateListener");
                    rjmVar = rjlVarQueryLocalInterface2 instanceof rjr ? (rjr) rjlVarQueryLocalInterface2 : new rjp(strongBinder2);
                }
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.car.control.CarProperty.CREATOR);
                defpackage.ijx.d(parcel);
                u(rjmVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    rjl rjlVarQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.control.ICarPropertyUpdateListener");
                    rjmVar = rjlVarQueryLocalInterface3 instanceof rjr ? (rjr) rjlVarQueryLocalInterface3 : new rjp(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                x(rjmVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.List listK = k();
                parcel2.writeNoException();
                parcel2.writeTypedList(listK);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.List listI = i();
                parcel2.writeNoException();
                parcel2.writeList(listI);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.car.control.CarAction carAction = (com.google.android.gms.car.control.CarAction) defpackage.ijx.a(parcel, com.google.android.gms.car.control.CarAction.CREATOR);
                defpackage.ijx.d(parcel);
                n(carAction);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i2 = parcel.readInt();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    rjl rjlVarQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.control.ICarControlGroupUpdateListener");
                    rjmVar = rjlVarQueryLocalInterface4 instanceof rjl ? rjlVarQueryLocalInterface4 : new rjj(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                t(i2, rjmVar);
                parcel2.writeNoException();
                return true;
            case 9:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    rjl rjlVarQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.control.ICarControlGroupUpdateListener");
                    rjmVar = rjlVarQueryLocalInterface5 instanceof rjl ? rjlVarQueryLocalInterface5 : new rjj(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                w(rjmVar);
                parcel2.writeNoException();
                return true;
            case 10:
                java.util.List listJ = j();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 11:
                l();
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.car.control.CarProperty carProperty2 = (com.google.android.gms.car.control.CarProperty) defpackage.ijx.a(parcel, com.google.android.gms.car.control.CarProperty.CREATOR);
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.control.CarPropertyState carPropertyStateF = f(carProperty2);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carPropertyStateF);
                return true;
            default:
                return false;
        }
    }
}
