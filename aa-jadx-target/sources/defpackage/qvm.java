package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvm extends defpackage.ijv implements qvo {
    public qvm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityLifecycleEventListener");
    }

    public final void e(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(3, parcelFp);
    }

    public final void f(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(2, parcelFp);
    }

    public final void g(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(4, parcelFp);
    }
}
