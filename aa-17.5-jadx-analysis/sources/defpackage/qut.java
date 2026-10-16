package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.ActivityLaunchInfo;

/* loaded from: classes.dex */
public final class qut extends ijn implements quv {
    public qut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityStartListener");
    }

    @Override // defpackage.quv
    public final void e(ActivityLaunchInfo activityLaunchInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, activityLaunchInfo);
        gk(3, parcelGh);
    }

    @Override // defpackage.quv
    public final void f(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        gk(1, parcelGh);
    }
}
