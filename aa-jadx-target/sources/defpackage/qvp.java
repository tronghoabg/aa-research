package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvp extends defpackage.ijv implements qvr {
    public qvp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityStartListener");
    }

    public final void e(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(3, parcelFp);
    }

    public final void f(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        fs(1, parcelFp);
    }
}
