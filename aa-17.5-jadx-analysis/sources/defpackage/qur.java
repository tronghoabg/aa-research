package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.ActivityLaunchInfo;

/* loaded from: classes.dex */
public final class qur extends ijo implements qus {
    public final qup a;
    private final sss b;
    private wyd c;

    public qur(qup qupVar) {
        super("com.google.android.gms.car.ICarActivityLifecycleEventListener");
        this.b = new sss(Looper.getMainLooper());
        this.a = qupVar;
    }

    private final void d() {
        if (this.c != null) {
            this.c = null;
            rox.l(new rea(this, 2));
        }
    }

    public final synchronized void a() {
        if (rrd.e("GH.PrxyActLfecycleLstnr", 3)) {
            rrd.d(3, "GH.PrxyActLfecycleLstnr", null, "Clearing local CarActivityLifecycleEventListener %s", this.c);
        }
        d();
    }

    public final synchronized void b(wyd wydVar) throws RemoteException {
        if (rrd.e("GH.PrxyActLfecycleLstnr", 3)) {
            rrd.d(3, "GH.PrxyActLfecycleLstnr", null, "Registering local CarActivityLifecycleEventListener %s", wydVar);
        }
        if (this.c != null) {
            throw new IllegalStateException("Attempted registration of multiple CarActivityLifecycleEventListeners");
        }
        this.a.aJ(this);
        this.c = wydVar;
    }

    public final synchronized void c(wyd wydVar) {
        if (rrd.e("GH.PrxyActLfecycleLstnr", 3)) {
            rrd.d(3, "GH.PrxyActLfecycleLstnr", null, "Unregistering local CarActivityLifecycleEventListener %s", wydVar);
        }
        wyd wydVar2 = this.c;
        if (wydVar2 != null && wydVar2 != wydVar) {
            throw new IllegalStateException("Attempting to unregister wrong CarActivityLifecycleEventListener");
        }
        d();
    }

    @Override // defpackage.qus
    public final synchronized void e(ActivityLaunchInfo activityLaunchInfo) {
        wyd wydVar = this.c;
        char[] cArr = null;
        if (wydVar != null) {
            this.b.post(new qqy(wydVar, activityLaunchInfo, 13, cArr));
        } else if (rrd.e("GH.PrxyActLfecycleLstnr", 4)) {
            rrd.d(4, "GH.PrxyActLfecycleLstnr", null, "Trying to send activity destroyed but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    @Override // defpackage.qus
    public final synchronized void f(ActivityLaunchInfo activityLaunchInfo) {
        wyd wydVar = this.c;
        char[] cArr = null;
        if (wydVar != null) {
            this.b.post(new qqy(wydVar, activityLaunchInfo, 12, cArr));
        } else if (rrd.e("GH.PrxyActLfecycleLstnr", 4)) {
            rrd.d(4, "GH.PrxyActLfecycleLstnr", null, "Trying to send activity started but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            ActivityLaunchInfo activityLaunchInfo = (ActivityLaunchInfo) ijp.a(parcel, ActivityLaunchInfo.CREATOR);
            ijp.d(parcel);
            f(activityLaunchInfo);
            return true;
        }
        if (i == 3) {
            ActivityLaunchInfo activityLaunchInfo2 = (ActivityLaunchInfo) ijp.a(parcel, ActivityLaunchInfo.CREATOR);
            ijp.d(parcel);
            e(activityLaunchInfo2);
            return true;
        }
        if (i != 4) {
            return false;
        }
        ActivityLaunchInfo activityLaunchInfo3 = (ActivityLaunchInfo) ijp.a(parcel, ActivityLaunchInfo.CREATOR);
        ijp.d(parcel);
        g(activityLaunchInfo3);
        return true;
    }

    @Override // defpackage.qus
    public final synchronized void g(ActivityLaunchInfo activityLaunchInfo) {
        wyd wydVar = this.c;
        char[] cArr = null;
        if (wydVar != null) {
            this.b.post(new qqy(wydVar, activityLaunchInfo, 14, cArr));
        } else if (rrd.e("GH.PrxyActLfecycleLstnr", 4)) {
            rrd.d(4, "GH.PrxyActLfecycleLstnr", null, "Trying to send activity stopped but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    public qur() {
        throw null;
    }
}
