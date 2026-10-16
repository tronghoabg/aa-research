package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.ActivityLaunchInfo;

/* loaded from: classes.dex */
public final class quq extends ijn implements qus {
    public quq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityLifecycleEventListener");
    }

    @Override // defpackage.qus
    public final void e(ActivityLaunchInfo activityLaunchInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, activityLaunchInfo);
        gk(3, parcelGh);
    }

    @Override // defpackage.qus
    public final void f(ActivityLaunchInfo activityLaunchInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, activityLaunchInfo);
        gk(2, parcelGh);
    }

    @Override // defpackage.qus
    public final void g(ActivityLaunchInfo activityLaunchInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, activityLaunchInfo);
        gk(4, parcelGh);
    }
}
