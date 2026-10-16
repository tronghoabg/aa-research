package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qri extends android.app.Service implements defpackage.qrj {
    public defpackage.qrk a;

    public abstract java.lang.Class a();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.qrj
    public int b() {
        return 0;
    }

    public final defpackage.qrd c() {
        return ((defpackage.ror) this.a).I;
    }

    @Override // android.app.Service
    protected final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        defpackage.ror rorVar = (defpackage.ror) this.a;
        if (rorVar.I != null) {
            printWriter.println("activity state:".concat(java.lang.String.valueOf(defpackage.ror.i(rorVar.F))));
        }
        defpackage.rpm rpmVar = rorVar.k;
        if (rpmVar != null) {
            rpmVar.l(printWriter);
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        defpackage.qrk qrkVar = this.a;
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.onBind()", ((defpackage.ror) qrkVar).t);
        }
        defpackage.ror rorVar = (defpackage.ror) qrkVar;
        rorVar.J = new defpackage.qyq(rorVar);
        return rorVar.J;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        defpackage.ror rorVar = (defpackage.ror) this.a;
        if (rorVar.w.P()) {
            rorVar.w();
        }
        defpackage.oml omlVar = rorVar.K;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.a == null) {
            try {
                boolean z = defpackage.rrx.a;
                defpackage.rrx.d(4, "CAR.ApiFactory", null, "Initialized ApiFactory to load from local APK", new java.lang.Object[0]);
                this.a = new defpackage.ror(null);
            } catch (defpackage.qqc e) {
                android.util.Log.e("CAR.PROJECTION", "Error loading car activity host", e);
                throw new java.lang.RuntimeException(e);
            }
        }
        defpackage.ror rorVar = (defpackage.ror) this.a;
        rorVar.f = this;
        rorVar.h = a();
        rorVar.q = b();
        rorVar.g = new defpackage.rop(rorVar.f.getApplicationContext());
        rorVar.t = rorVar.h.getSimpleName();
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.onCreate()", rorVar.t);
        }
        defpackage.rfc rfcVar = rorVar.w;
        rfcVar.F(rorVar.y);
        rorVar.l = new defpackage.roj(rfcVar);
        rorVar.L = new defpackage.kwv(rorVar.l);
        rorVar.K = (defpackage.oml) defpackage.qrf.a.get(rorVar.f.getClass());
        defpackage.oml omlVar = rorVar.K;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        defpackage.qrk qrkVar = this.a;
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.onDestroy()", ((defpackage.ror) qrkVar).t);
        }
        defpackage.ror rorVar = (defpackage.ror) qrkVar;
        vbd vbdVar = rorVar.M;
        if (vbdVar != null) {
            if (defpackage.omv.c("CAR.INPUT", 3)) {
                defpackage.rrx.a("CAR.INPUT", null, "destroy");
            }
            vbdVar.a = true;
        }
        if (rorVar.I != null) {
            rorVar.n(0, false);
        }
        rorVar.l();
        rorVar.w.O(null);
        rorVar.I = null;
        android.os.IBinder.DeathRecipient deathRecipient = rorVar.e;
        synchronized (deathRecipient) {
            defpackage.qyu qyuVar = ((defpackage.ror) qrkVar).i;
            if (qyuVar != null) {
                qyuVar.asBinder().unlinkToDeath(deathRecipient, 0);
                ((defpackage.ror) qrkVar).i = null;
            }
        }
        rorVar.k = null;
        rorVar.L = null;
        rorVar.m = null;
        rorVar.n = null;
        rorVar.s = null;
        rorVar.t = null;
        rorVar.M = null;
        rorVar.r = false;
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        defpackage.qrd qrdVar = ((defpackage.ror) this.a).I;
        if (qrdVar != null) {
            qrdVar.H();
        }
    }

    @Override // android.app.Service
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean onUnbind(android.content.Intent intent) {
        defpackage.qrk qrkVar = this.a;
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.onUnbind()", ((defpackage.ror) qrkVar).t);
        }
        defpackage.ror rorVar = (defpackage.ror) qrkVar;
        rorVar.n(0, false);
        rorVar.l();
        rorVar.J = null;
        return false;
    }
}
