package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvn extends defpackage.ijw implements qvo {
    public final defpackage.qvl a;
    private final defpackage.stq b;
    private defpackage.wyz c;

    public qvn(defpackage.qvl qvlVar) {
        super("com.google.android.gms.car.ICarActivityLifecycleEventListener");
        this.b = new defpackage.stq(android.os.Looper.getMainLooper());
        this.a = qvlVar;
    }

    private final void d() {
        if (this.c != null) {
            this.c = null;
            defpackage.rps.l(new defpackage.rev(this, 2));
        }
    }

    public final synchronized void a() {
        if (defpackage.rrx.e("GH.PrxyActLfecycleLstnr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActLfecycleLstnr", null, "Clearing local CarActivityLifecycleEventListener %s", this.c);
        }
        d();
    }

    public final synchronized void b(defpackage.wyz wyzVar) throws android.os.RemoteException {
        if (defpackage.rrx.e("GH.PrxyActLfecycleLstnr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActLfecycleLstnr", null, "Registering local CarActivityLifecycleEventListener %s", wyzVar);
        }
        if (this.c != null) {
            throw new java.lang.IllegalStateException("Attempted registration of multiple CarActivityLifecycleEventListeners");
        }
        this.a.aJ(this);
        this.c = wyzVar;
    }

    public final synchronized void c(defpackage.wyz wyzVar) {
        if (defpackage.rrx.e("GH.PrxyActLfecycleLstnr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActLfecycleLstnr", null, "Unregistering local CarActivityLifecycleEventListener %s", wyzVar);
        }
        defpackage.wyz wyzVar2 = this.c;
        if (wyzVar2 != null && wyzVar2 != wyzVar) {
            throw new java.lang.IllegalStateException("Attempting to unregister wrong CarActivityLifecycleEventListener");
        }
        d();
    }

    public final synchronized void e(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) {
        defpackage.wyz wyzVar = this.c;
        short[] sArr = null;
        if (wyzVar != null) {
            this.b.post(new defpackage.qnf(wyzVar, activityLaunchInfo, 16, sArr));
        } else if (defpackage.rrx.e("GH.PrxyActLfecycleLstnr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActLfecycleLstnr", null, "Trying to send activity destroyed but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = (com.google.android.gms.car.ActivityLaunchInfo) defpackage.ijx.a(parcel, com.google.android.gms.car.ActivityLaunchInfo.CREATOR);
            defpackage.ijx.d(parcel);
            f(activityLaunchInfo);
            return true;
        }
        if (i == 3) {
            com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo2 = (com.google.android.gms.car.ActivityLaunchInfo) defpackage.ijx.a(parcel, com.google.android.gms.car.ActivityLaunchInfo.CREATOR);
            defpackage.ijx.d(parcel);
            e(activityLaunchInfo2);
            return true;
        }
        if (i != 4) {
            return false;
        }
        com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo3 = (com.google.android.gms.car.ActivityLaunchInfo) defpackage.ijx.a(parcel, com.google.android.gms.car.ActivityLaunchInfo.CREATOR);
        defpackage.ijx.d(parcel);
        g(activityLaunchInfo3);
        return true;
    }

    public final synchronized void f(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) {
        defpackage.wyz wyzVar = this.c;
        short[] sArr = null;
        if (wyzVar != null) {
            this.b.post(new defpackage.qnf(wyzVar, activityLaunchInfo, 15, sArr));
        } else if (defpackage.rrx.e("GH.PrxyActLfecycleLstnr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActLfecycleLstnr", null, "Trying to send activity started but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    public final synchronized void g(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) {
        defpackage.wyz wyzVar = this.c;
        short[] sArr = null;
        if (wyzVar != null) {
            this.b.post(new defpackage.qnf(wyzVar, activityLaunchInfo, 17, sArr));
        } else if (defpackage.rrx.e("GH.PrxyActLfecycleLstnr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActLfecycleLstnr", null, "Trying to send activity stopped but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    public qvn() {
        throw null;
    }
}
