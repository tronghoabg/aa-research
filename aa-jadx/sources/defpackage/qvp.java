package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qvp extends defpackage.ijv implements defpackage.qvr {
    public qvp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityStartListener");
    }

    @Override // defpackage.qvr
    public final void e(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(3, parcelFp);
    }

    @Override // defpackage.qvr
    public final void f(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        fs(1, parcelFp);
    }
}
