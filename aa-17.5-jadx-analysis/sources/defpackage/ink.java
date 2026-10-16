package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.car.ActivityLaunchInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class ink implements inv {
    public final /* synthetic */ ActivityLaunchInfo a;
    private final /* synthetic */ int b;

    public /* synthetic */ ink(ActivityLaunchInfo activityLaunchInfo, int i) {
        this.b = i;
        this.a = activityLaunchInfo;
    }

    @Override // defpackage.inv
    public final void a(Object obj) throws RemoteException {
        int i = this.b;
        if (i == 0) {
            Intent intent = iob.a;
            ((quv) obj).e(this.a);
        } else if (i == 1) {
            Intent intent2 = iob.a;
            ((qus) obj).e(this.a);
        } else if (i != 2) {
            Intent intent3 = iob.a;
            ((qus) obj).f(this.a);
        } else {
            Intent intent4 = iob.a;
            ((qus) obj).g(this.a);
        }
    }
}
