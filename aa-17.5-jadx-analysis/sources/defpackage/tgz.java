package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class tgz implements svu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tgz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        ConnectionResult connectionResult;
        int i = this.b;
        if (i == 0) {
            mjv.x(thd.d, (CarCall) this.a);
            return;
        }
        if (i == 1) {
            if ((exc instanceof skw) && (connectionResult = ((skw) exc).a.i) != null && connectionResult.c == 24) {
                ((sue) this.a).c.set(SystemClock.elapsedRealtime());
                return;
            }
            return;
        }
        if (i == 2) {
            mjv.x(thd.e, (CarCall) this.a);
            return;
        }
        if (i == 3) {
            mjv.x(thd.c, (CarCall) this.a);
        } else if (i != 4) {
            boolean z = tmt.a;
            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
        } else {
            boolean z2 = tmt.a;
            Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
        }
    }
}
