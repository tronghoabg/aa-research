package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mkf extends defpackage.ijv implements defpackage.mkh {
    public mkf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.service.ICarModeSharedService");
    }

    @Override // defpackage.mkh
    public final void e(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, telemetryEvent);
        fs(4, parcelFp);
    }

    @Override // defpackage.mkh
    public final void f(com.google.android.apps.auto.components.car.info.StartingProcessInfo startingProcessInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, startingProcessInfo);
        fr(2, parcelFp);
    }

    @Override // defpackage.mkh
    public final void g(android.os.IBinder iBinder) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeStrongBinder(iBinder);
        fr(3, parcelFp);
    }
}
