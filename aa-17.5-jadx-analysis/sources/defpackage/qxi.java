package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.gms.car.navigation.NavigationState;
import com.google.android.gms.car.navigation.VehicleEnergyForecast;

/* loaded from: classes.dex */
public abstract class qxi extends ijo implements qxj {
    public qxi() {
        super("com.google.android.gms.car.ICarNavigationStatus");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qxm qxkVar = null;
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                j(i2);
                parcel2.writeNoException();
                return true;
            case 2:
                int i3 = parcel.readInt();
                String string = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i6 = parcel.readInt();
                ijp.d(parcel);
                o(i3, string, i4, i5, bArrCreateByteArray, i6);
                parcel2.writeNoException();
                return true;
            case 3:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                ijp.d(parcel);
                l(i7, i8);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zS = s();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 5:
                CarInstrumentClusterInfo carInstrumentClusterInfoF = f();
                parcel2.writeNoException();
                ijp.h(parcel2, carInstrumentClusterInfoF);
                return true;
            case 6:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatusEventListener");
                    qxkVar = iInterfaceQueryLocalInterface instanceof qxm ? (qxm) iInterfaceQueryLocalInterface : new qxk(strongBinder);
                }
                ijp.d(parcel);
                boolean zT = t(qxkVar);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatusEventListener");
                    qxkVar = iInterfaceQueryLocalInterface2 instanceof qxm ? (qxm) iInterfaceQueryLocalInterface2 : new qxk(strongBinder2);
                }
                ijp.d(parcel);
                boolean zV = v(qxkVar);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 8:
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                float f = parcel.readFloat();
                int i11 = parcel.readInt();
                ijp.d(parcel);
                n(i9, i10, f, i11);
                parcel2.writeNoException();
                return true;
            case 9:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                ijp.d(parcel);
                k(i12, i13, i14, i15);
                parcel2.writeNoException();
                return true;
            case 10:
                NavigationState navigationState = (NavigationState) ijp.a(parcel, NavigationState.CREATOR);
                ijp.d(parcel);
                i(navigationState);
                parcel2.writeNoException();
                return true;
            case 11:
                NavigationCurrentPosition navigationCurrentPosition = (NavigationCurrentPosition) ijp.a(parcel, NavigationCurrentPosition.CREATOR);
                ijp.d(parcel);
                h(navigationCurrentPosition);
                parcel2.writeNoException();
                return true;
            case 12:
                VehicleEnergyForecast vehicleEnergyForecast = (VehicleEnergyForecast) ijp.a(parcel, VehicleEnergyForecast.CREATOR);
                ijp.d(parcel);
                p(vehicleEnergyForecast);
                parcel2.writeNoException();
                return true;
            case 13:
                AdasRouteInfo adasRouteInfo = (AdasRouteInfo) ijp.a(parcel, AdasRouteInfo.CREATOR);
                ijp.d(parcel);
                g(adasRouteInfo);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
