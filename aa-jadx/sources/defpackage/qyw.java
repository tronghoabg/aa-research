package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qyw extends defpackage.ijw implements defpackage.qyx {
    public qyw() {
        super("com.google.android.gms.car.ICarRadio");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qza qyyVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qyyVar = iInterfaceQueryLocalInterface instanceof defpackage.qza ? (defpackage.qza) iInterfaceQueryLocalInterface : new defpackage.qyy(strongBinder);
                }
                defpackage.ijx.d(parcel);
                s(qyyVar);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qyyVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qza ? (defpackage.qza) iInterfaceQueryLocalInterface2 : new defpackage.qyy(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                x(qyyVar);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.car.RadioProgramSelector radioProgramSelector = (com.google.android.gms.car.RadioProgramSelector) defpackage.ijx.a(parcel, com.google.android.gms.car.RadioProgramSelector.CREATOR);
                defpackage.ijx.d(parcel);
                w(radioProgramSelector);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                n(zJ);
                parcel2.writeNoException();
                return true;
            case 5:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qyyVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qza ? (defpackage.qza) iInterfaceQueryLocalInterface3 : new defpackage.qyy(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                t(qyyVar);
                parcel2.writeNoException();
                return true;
            case 6:
                boolean zJ2 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                u(zJ2);
                parcel2.writeNoException();
                return true;
            case 7:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                v(i2);
                parcel2.writeNoException();
                return true;
            case 8:
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
