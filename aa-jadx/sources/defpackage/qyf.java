package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface qyf extends android.os.IInterface {
    com.google.android.gms.car.CarInstrumentClusterInfo f() throws android.os.RemoteException;

    void g(com.google.android.gms.car.navigation.AdasRouteInfo adasRouteInfo) throws android.os.RemoteException;

    void h(com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition) throws android.os.RemoteException;

    void i(com.google.android.gms.car.navigation.NavigationState navigationState) throws android.os.RemoteException;

    void j(int i) throws android.os.RemoteException;

    void k(int i, int i2, int i3, int i4) throws android.os.RemoteException;

    void l(int i, int i2) throws android.os.RemoteException;

    void n(int i, int i2, float f, int i3) throws android.os.RemoteException;

    void o(int i, java.lang.String str, int i2, int i3, byte[] bArr, int i4) throws android.os.RemoteException;

    void p(com.google.android.gms.car.navigation.VehicleEnergyForecast vehicleEnergyForecast) throws android.os.RemoteException;

    boolean s() throws android.os.RemoteException;

    boolean t(defpackage.qyi qyiVar) throws android.os.RemoteException;

    boolean v(defpackage.qyi qyiVar) throws android.os.RemoteException;
}
