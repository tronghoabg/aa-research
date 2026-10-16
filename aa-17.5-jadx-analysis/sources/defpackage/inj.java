package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.car.ActivityLaunchInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class inj implements inv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ inj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.inv
    public final void a(Object obj) throws RemoteException {
        int i = this.b;
        if (i == 0) {
            Intent intent = iob.a;
            ((quv) obj).f((Intent) this.a);
        } else if (i != 1) {
            Intent intent2 = iob.a;
            ((quv) obj).f((Intent) this.a);
        } else {
            Intent intent3 = iob.a;
            ((quv) obj).e((ActivityLaunchInfo) this.a);
        }
    }
}
