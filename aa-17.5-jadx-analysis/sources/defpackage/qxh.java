package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.gms.car.navigation.NavigationState;
import com.google.android.gms.car.navigation.VehicleEnergyForecast;

/* loaded from: classes.dex */
public final class qxh extends ijn implements qxj {
    public qxh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarNavigationStatus");
    }

    @Override // defpackage.qxj
    public final CarInstrumentClusterInfo f() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxj
    public final void g(AdasRouteInfo adasRouteInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, adasRouteInfo);
        gj(13, parcelGh);
    }

    @Override // defpackage.qxj
    public final void h(NavigationCurrentPosition navigationCurrentPosition) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, navigationCurrentPosition);
        gj(11, parcelGh);
    }

    @Override // defpackage.qxj
    public final void i(NavigationState navigationState) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, navigationState);
        gj(10, parcelGh);
    }

    @Override // defpackage.qxj
    public final void j(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(1, parcelGh);
    }

    @Override // defpackage.qxj
    public final void k(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeInt(i4);
        gj(9, parcelGh);
    }

    @Override // defpackage.qxj
    public final void l(int i, int i2) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxj
    public final void n(int i, int i2, float f, int i3) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxj
    public final void o(int i, String str, int i2, int i3, byte[] bArr, int i4) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeString(str);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeByteArray(bArr);
        parcelGh.writeInt(i4);
        gj(2, parcelGh);
    }

    @Override // defpackage.qxj
    public final void p(VehicleEnergyForecast vehicleEnergyForecast) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, vehicleEnergyForecast);
        gj(12, parcelGh);
    }

    @Override // defpackage.qxj
    public final boolean s() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxj
    public final boolean t(qxm qxmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxmVar);
        Parcel parcelGi = gi(6, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qxj
    public final boolean v(qxm qxmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxmVar);
        Parcel parcelGi = gi(7, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
