package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qyk extends defpackage.ijw implements defpackage.qyl {
    public qyk() {
        super("com.google.android.gms.car.ICarPhoneStatus");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qyo qymVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qymVar = iInterfaceQueryLocalInterface instanceof defpackage.qyo ? (defpackage.qyo) iInterfaceQueryLocalInterface : new defpackage.qym(strongBinder);
                }
                com.google.android.gms.car.CarPhoneStatus carPhoneStatus = (com.google.android.gms.car.CarPhoneStatus) defpackage.ijx.a(parcel, com.google.android.gms.car.CarPhoneStatus.CREATOR);
                defpackage.ijx.d(parcel);
                h(qymVar, carPhoneStatus);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qymVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qyo ? (defpackage.qyo) iInterfaceQueryLocalInterface2 : new defpackage.qym(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                boolean zK = k(qymVar);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qymVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qyo ? (defpackage.qyo) iInterfaceQueryLocalInterface3 : new defpackage.qym(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                boolean zL = l(qymVar);
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                boolean zI = i();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i2 = parcel.readInt();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    qymVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qyo ? (defpackage.qyo) iInterfaceQueryLocalInterface4 : new defpackage.qym(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                boolean zJ = j(i2, qymVar);
                parcel2.writeNoException();
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.CarPhoneStatus carPhoneStatus2 = (com.google.android.gms.car.CarPhoneStatus) defpackage.ijx.a(parcel, com.google.android.gms.car.CarPhoneStatus.CREATOR);
                defpackage.ijx.d(parcel);
                g(carPhoneStatus2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
