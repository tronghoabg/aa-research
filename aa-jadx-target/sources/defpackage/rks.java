package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rks extends defpackage.ijw implements defpackage.rkt {
    public rks() {
        super("com.google.android.gms.car.display.manager.ICarDisplay");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        rll qzhVar = null;
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.rab rabVarD = d();
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, rabVarD);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.gms.car.CarUiInfo carUiInfoC = c();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carUiInfoC);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    rll rllVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    qzhVar = rllVarQueryLocalInterface instanceof defpackage.qzj ? (defpackage.qzj) rllVarQueryLocalInterface : new defpackage.qzh(strongBinder);
                }
                defpackage.ijx.d(parcel);
                n(qzhVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    rll rllVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    qzhVar = rllVarQueryLocalInterface2 instanceof defpackage.qzj ? (defpackage.qzj) rllVarQueryLocalInterface2 : new defpackage.qzh(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                s(qzhVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.display.CarDisplay carDisplayG = g();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carDisplayG);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    rll rllVarQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
                    qzhVar = rllVarQueryLocalInterface3 instanceof defpackage.rkz ? (defpackage.rkz) rllVarQueryLocalInterface3 : new defpackage.rkx(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                k(qzhVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    rll rllVarQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
                    qzhVar = rllVarQueryLocalInterface4 instanceof defpackage.rkz ? (defpackage.rkz) rllVarQueryLocalInterface4 : new defpackage.rkx(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                p(qzhVar);
                parcel2.writeNoException();
                return true;
            case 9:
                android.graphics.Rect rectA = a();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, rectA);
                return true;
            case 10:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    rll rllVarQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
                    qzhVar = rllVarQueryLocalInterface5 instanceof defpackage.rlc ? (defpackage.rlc) rllVarQueryLocalInterface5 : new defpackage.rla(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                l(qzhVar);
                parcel2.writeNoException();
                return true;
            case 11:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    rll rllVarQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
                    qzhVar = rllVarQueryLocalInterface6 instanceof defpackage.rlc ? (defpackage.rlc) rllVarQueryLocalInterface6 : new defpackage.rla(strongBinder6);
                }
                defpackage.ijx.d(parcel);
                q(qzhVar);
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeaturesH = h();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carDisplayUiFeaturesH);
                return true;
            case 13:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    rll rllVarQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
                    qzhVar = rllVarQueryLocalInterface7 instanceof rll ? rllVarQueryLocalInterface7 : new defpackage.rlj(strongBinder7);
                }
                defpackage.ijx.d(parcel);
                m(qzhVar);
                parcel2.writeNoException();
                return true;
            case 14:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    rll rllVarQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
                    qzhVar = rllVarQueryLocalInterface8 instanceof rll ? rllVarQueryLocalInterface8 : new defpackage.rlj(strongBinder8);
                }
                defpackage.ijx.d(parcel);
                r(qzhVar);
                parcel2.writeNoException();
                return true;
            case 15:
                java.util.List listI = i();
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 16:
                o();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
