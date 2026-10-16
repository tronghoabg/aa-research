package defpackage;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.ActivityLaunchInfo;

/* loaded from: classes2.dex */
public interface quv extends IInterface {
    void e(ActivityLaunchInfo activityLaunchInfo) throws RemoteException;

    @Deprecated
    void f(Intent intent) throws RemoteException;
}
