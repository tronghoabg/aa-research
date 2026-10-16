package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qvm extends defpackage.ijv implements defpackage.qvo {
    public qvm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityLifecycleEventListener");
    }

    @Override // defpackage.qvo
    public final void e(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(3, parcelFp);
    }

    @Override // defpackage.qvo
    public final void f(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(2, parcelFp);
    }

    @Override // defpackage.qvo
    public final void g(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, activityLaunchInfo);
        fs(4, parcelFp);
    }
}
