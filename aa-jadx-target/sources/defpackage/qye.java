package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qye extends defpackage.ijw implements defpackage.qyf {
    public qye() {
        super("com.google.android.gms.car.ICarNavigationStatus");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qyi qygVar = null;
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                j(i2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = parcel.readInt();
                java.lang.String string = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i6 = parcel.readInt();
                defpackage.ijx.d(parcel);
                o(i3, string, i4, i5, bArrCreateByteArray, i6);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                defpackage.ijx.d(parcel);
                l(i7, i8);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                boolean zS = s();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.gms.car.CarInstrumentClusterInfo carInstrumentClusterInfoF = f();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carInstrumentClusterInfoF);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatusEventListener");
                    qygVar = iInterfaceQueryLocalInterface instanceof qyi ? (qyi) iInterfaceQueryLocalInterface : new defpackage.qyg(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zT = t(qygVar);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatusEventListener");
                    qygVar = iInterfaceQueryLocalInterface2 instanceof qyi ? (qyi) iInterfaceQueryLocalInterface2 : new defpackage.qyg(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                boolean zV = v(qygVar);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                float f = parcel.readFloat();
                int i11 = parcel.readInt();
                defpackage.ijx.d(parcel);
                n(i9, i10, f, i11);
                parcel2.writeNoException();
                return true;
            case 9:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                defpackage.ijx.d(parcel);
                k(i12, i13, i14, i15);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.car.navigation.NavigationState navigationState = (com.google.android.gms.car.navigation.NavigationState) defpackage.ijx.a(parcel, com.google.android.gms.car.navigation.NavigationState.CREATOR);
                defpackage.ijx.d(parcel);
                i(navigationState);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition = (com.google.android.gms.car.navigation.NavigationCurrentPosition) defpackage.ijx.a(parcel, com.google.android.gms.car.navigation.NavigationCurrentPosition.CREATOR);
                defpackage.ijx.d(parcel);
                h(navigationCurrentPosition);
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.car.navigation.VehicleEnergyForecast vehicleEnergyForecast = (com.google.android.gms.car.navigation.VehicleEnergyForecast) defpackage.ijx.a(parcel, com.google.android.gms.car.navigation.VehicleEnergyForecast.CREATOR);
                defpackage.ijx.d(parcel);
                p(vehicleEnergyForecast);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.car.navigation.AdasRouteInfo adasRouteInfo = (com.google.android.gms.car.navigation.AdasRouteInfo) defpackage.ijx.a(parcel, com.google.android.gms.car.navigation.AdasRouteInfo.CREATOR);
                defpackage.ijx.d(parcel);
                g(adasRouteInfo);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
