package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyd extends defpackage.ijv implements defpackage.qyf {
    public qyd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarNavigationStatus");
    }

    @Override // defpackage.qyf
    public final com.google.android.gms.car.CarInstrumentClusterInfo f() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qyf
    public final void g(com.google.android.gms.car.navigation.AdasRouteInfo adasRouteInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, adasRouteInfo);
        fr(13, parcelFp);
    }

    @Override // defpackage.qyf
    public final void h(com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, navigationCurrentPosition);
        fr(11, parcelFp);
    }

    @Override // defpackage.qyf
    public final void i(com.google.android.gms.car.navigation.NavigationState navigationState) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, navigationState);
        fr(10, parcelFp);
    }

    @Override // defpackage.qyf
    public final void j(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(1, parcelFp);
    }

    @Override // defpackage.qyf
    public final void k(int i, int i2, int i3, int i4) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(i3);
        parcelFp.writeInt(i4);
        fr(9, parcelFp);
    }

    @Override // defpackage.qyf
    public final void l(int i, int i2) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qyf
    public final void n(int i, int i2, float f, int i3) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qyf
    public final void o(int i, java.lang.String str, int i2, int i3, byte[] bArr, int i4) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeString(str);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(i3);
        parcelFp.writeByteArray(bArr);
        parcelFp.writeInt(i4);
        fr(2, parcelFp);
    }

    @Override // defpackage.qyf
    public final void p(com.google.android.gms.car.navigation.VehicleEnergyForecast vehicleEnergyForecast) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, vehicleEnergyForecast);
        fr(12, parcelFp);
    }

    @Override // defpackage.qyf
    public final boolean s() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qyf
    public final boolean t(qyi qyiVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qyiVar);
        android.os.Parcel parcelFq = fq(6, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qyf
    public final boolean v(qyi qyiVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qyiVar);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
