package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.gms.car.navigation.NavigationState;
import com.google.android.gms.car.navigation.VehicleEnergyForecast;

/* loaded from: classes.dex */
public interface qxj extends IInterface {
    CarInstrumentClusterInfo f() throws RemoteException;

    void g(AdasRouteInfo adasRouteInfo) throws RemoteException;

    void h(NavigationCurrentPosition navigationCurrentPosition) throws RemoteException;

    void i(NavigationState navigationState) throws RemoteException;

    void j(int i) throws RemoteException;

    void k(int i, int i2, int i3, int i4) throws RemoteException;

    void l(int i, int i2) throws RemoteException;

    void n(int i, int i2, float f, int i3) throws RemoteException;

    void o(int i, String str, int i2, int i3, byte[] bArr, int i4) throws RemoteException;

    void p(VehicleEnergyForecast vehicleEnergyForecast) throws RemoteException;

    boolean s() throws RemoteException;

    boolean t(qxm qxmVar) throws RemoteException;

    boolean v(qxm qxmVar) throws RemoteException;
}
