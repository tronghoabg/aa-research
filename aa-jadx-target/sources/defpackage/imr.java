package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class imr {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE.PLSC");
    static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.GhLifecycleService");
    public static final android.content.ComponentName c;
    public final defpackage.imp d;
    public final defpackage.jfe e;
    public final defpackage.qvl f;
    public final android.content.Context g;
    public final boolean h;
    public final j$.util.Optional i;
    android.content.Intent l;
    defpackage.rao m;
    public boolean n;
    public android.os.Bundle o;
    public boolean p;
    public boolean q;
    public final android.os.Handler r;
    public final boolean s;
    public int t;
    private final android.content.ComponentName v;
    private final j$.util.Optional x;
    private final defpackage.imo w = new defpackage.imo(this);
    public final defpackage.rar j = new defpackage.raq(this);
    private final j$.time.Instant y = j$.time.Instant.now();
    public defpackage.imq k = defpackage.imq.a;
    public final java.lang.Runnable u = new defpackage.bgf(this, 11);

    static {
        new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.connectivity.usbtrigger.SharedUsbTriggerReceiver");
        c = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.connectivity.usbtrigger.CarUsbTriggerReceiver");
    }

    public imr(android.os.Handler handler, android.content.ComponentName componentName, defpackage.imp impVar, defpackage.jfe jfeVar, defpackage.qvl qvlVar, android.content.Context context, boolean z, j$.util.Optional optional, j$.util.Optional optional2, boolean z2) {
        this.v = componentName;
        this.d = impVar;
        this.e = jfeVar;
        this.f = qvlVar;
        this.g = context;
        this.h = z;
        this.x = optional;
        this.i = optional2;
        this.r = handler;
        this.s = z2;
    }

    private static defpackage.rsq h(int i) {
        if (i != 1) {
            return i != 2 ? defpackage.rsq.a : defpackage.rsq.c;
        }
        return defpackage.rsq.b;
    }

    public final void a() {
        this.l.getClass();
        if (!defpackage.sqf.a().d(this.g, this.l, this.w, true != defpackage.sqs.e() ? 65 : 4161)) {
            throw new java.lang.IllegalStateException("Unable to bind to ProjectionLifecycleService");
        }
    }

    public final void b() {
        try {
            ((defpackage.yqj) a.l().ai(429)).u("Invoking service onPreflightStart");
            defpackage.rao raoVar = this.m;
            raoVar.getClass();
            android.os.Bundle bundle = this.o;
            bundle.getClass();
            raoVar.e(bundle, this.j);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 430)).u("Error when invoking onPreflightStart!");
        }
    }

    public final void c(boolean z, com.google.android.gms.carsetup.CarInfoInternal carInfoInternal) {
        defpackage.ill.d();
        defpackage.ysr.bk(this.n, "Cannot invoke onPreflightStart until onProjectionStart notified");
        defpackage.ysr.bk(this.o == null, "onPreflightStart already invoked!");
        ((defpackage.yqj) a.l().ai((char) 432)).u("onPreflightStart");
        android.os.Bundle bundle = new android.os.Bundle();
        this.o = bundle;
        bundle.putBoolean("legacy_frx_ran", z);
        this.o.putInt("connection_type", this.e.i());
        this.o.putParcelable("car_info", carInfoInternal);
        this.o.putInt("car_process_pid", android.os.Process.myPid());
        this.o.putLong("creation_millis", this.y.toEpochMilli());
        b();
        if (this.h) {
            defpackage.omv.i(this.g, defpackage.yyn.PREFLIGHT_STARTED);
        }
    }

    public final void d(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        defpackage.yyn yynVar;
        defpackage.ill.d();
        int iOrdinal = this.k.ordinal();
        if (iOrdinal == 2) {
            ((defpackage.yqj) a.l().ai((char) 433)).u("Unbinding");
            defpackage.sqf.a().c(this.g, this.w);
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            try {
                ((defpackage.yqj) a.l().ai(434)).u("Invoking service onProjectionEnd");
                defpackage.rao raoVar = this.m;
                raoVar.getClass();
                raoVar.f();
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 435)).u("Executing onProjectionEnd failed!");
            }
            this.m = null;
            ((defpackage.yqj) a.l().ai((char) 433)).u("Unbinding");
            defpackage.sqf.a().c(this.g, this.w);
        }
        this.k = defpackage.imq.a;
        if (this.h) {
            defpackage.rsq rsqVarH = h(this.e.i());
            android.content.Context context = this.g;
            defpackage.omv.h(context, "com.google.android.gms.car.PROJECTION_ENDED", rsqVarH, null);
            int i = criticalError.a;
            boolean z = i == defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER.D || i == defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_CAR.D;
            int iOrdinal2 = rsqVarH.ordinal();
            if (iOrdinal2 == 0) {
                yynVar = z ? defpackage.yyn.PROJECTION_END_BY_REQUEST_UNKNOWN : defpackage.yyn.PROJECTION_END_BY_DISCONNECT_UNKNOWN;
            } else if (iOrdinal2 == 1) {
                yynVar = z ? defpackage.yyn.PROJECTION_END_BY_REQUEST_USB : defpackage.yyn.PROJECTION_END_BY_DISCONNECT_USB;
            } else {
                if (iOrdinal2 != 2) {
                    throw new java.lang.RuntimeException(null, null);
                }
                yynVar = z ? defpackage.yyn.PROJECTION_END_BY_REQUEST_WIFI : defpackage.yyn.PROJECTION_END_BY_DISCONNECT_WIFI;
            }
            defpackage.omv.i(context, yynVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, jfo] */
    public final void e() {
        boolean z;
        defpackage.ill.d();
        if (this.k != defpackage.imq.a) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 436)).u("onProjectionStart");
        android.content.Context context = this.g;
        java.lang.String strC = defpackage.ill.c(context);
        boolean z2 = defpackage.sli.a;
        boolean zEquals = "user".equals(android.os.Build.TYPE);
        defpackage.jfe jfeVar = this.e;
        j$.util.Optional optional = this.x;
        int i = jfeVar.i();
        defpackage.iru iruVar = new defpackage.iru(i, 1);
        if (true == optional.isPresent()) {
            ?? r5 = optional.get();
            int i2 = iruVar.a;
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT, defpackage.zbd.us);
            rrvVarH.k(i2);
            r5.b(rrvVarH.l());
        }
        if (zEquals || i != 0) {
            z = false;
        } else {
            i = 0;
            z = true;
        }
        if (android.text.TextUtils.isEmpty(strC)) {
            if (!z) {
                throw new java.lang.IllegalStateException("No projection lifecycle services installed");
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 438)).u("Using emulator configuration");
            strC = "com.google.android.gms.apitest.car";
        }
        this.l = new android.content.Intent().addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFECYCLE_SERVICE").setPackage(strC).setComponent(this.v);
        if (context.getPackageManager().resolveService(this.l, 0) == null && z) {
            ((defpackage.yqj) yqmVar.l().ai((char) 437)).u("Skipping bind ");
            this.k = defpackage.imq.b;
            return;
        }
        this.k = defpackage.imq.c;
        a();
        if (this.h) {
            defpackage.omv.i(context, defpackage.yyn.PROJECTION_START);
            int iOrdinal = h(i).ordinal();
            if (iOrdinal == 0) {
                defpackage.omv.i(context, defpackage.yyn.PROJECTION_START_UNKNOWN);
            } else if (iOrdinal == 1) {
                defpackage.omv.i(context, defpackage.yyn.PROJECTION_START_USB);
            } else if (iOrdinal == 2) {
                defpackage.omv.i(context, defpackage.yyn.PROJECTION_START_WIFI);
            }
            defpackage.omv.g(context, "com.google.android.gms.car.PROJECTION_STARTED", h(i).ordinal(), null);
        }
    }

    public final void f() {
        try {
            if (this.m == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(439)).u("Null projectionLifecycleService, projection process probably already gone.");
            } else {
                ((defpackage.yqj) a.l().ai(441)).u("Invoking service onProjectionTearDown");
                this.m.i(this.j);
            }
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 440)).u("Executing onProjectionTearDown failed!");
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean g() {
        if (this.m == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 426)).u("Null projectionLifecycleService, projection process probably already gone.");
            return false;
        }
        try {
            ((defpackage.yqj) a.l().ai(424)).u("Invoking service onProjectionReady");
            this.m.g(this.j);
            return true;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 425)).u("Error when invoking onProjectionReady!");
            defpackage.rqt.a(this.g).c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.rK).l());
            return false;
        }
    }
}
