package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Instant;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class imj {
    public static final yph a = yph.c("CAR.SERVICE.PLSC");
    static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.GhLifecycleService");
    public static final ComponentName c;
    public final imh d;
    public final jew e;
    public final qup f;
    public final Context g;
    public final boolean h;
    public final Optional i;
    Intent l;
    qzs m;
    public boolean n;
    public Bundle o;
    public boolean p;
    public boolean q;
    public final Handler r;
    public final boolean s;
    public int t;
    private final ComponentName v;
    private final Optional x;
    private final img w = new img(this);
    public final qzv j = new qzu(this);
    private final Instant y = Instant.now();
    public imi k = imi.a;
    public final Runnable u = new ne(this, 17, null);

    static {
        new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.connectivity.usbtrigger.SharedUsbTriggerReceiver");
        c = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.connectivity.usbtrigger.CarUsbTriggerReceiver");
    }

    public imj(Handler handler, ComponentName componentName, imh imhVar, jew jewVar, qup qupVar, Context context, boolean z, Optional optional, Optional optional2, boolean z2) {
        this.v = componentName;
        this.d = imhVar;
        this.e = jewVar;
        this.f = qupVar;
        this.g = context;
        this.h = z;
        this.x = optional;
        this.i = optional2;
        this.r = handler;
        this.s = z2;
    }

    private static rrw h(int i) {
        return i != 1 ? i != 2 ? rrw.a : rrw.c : rrw.b;
    }

    public final void a() {
        this.l.getClass();
        if (!spi.a().d(this.g, this.l, this.w, true != spu.c() ? 65 : 4161)) {
            throw new IllegalStateException("Unable to bind to ProjectionLifecycleService");
        }
    }

    public final void b() {
        try {
            ((ype) a.l().ai(429)).u("Invoking service onPreflightStart");
            qzs qzsVar = this.m;
            qzsVar.getClass();
            Bundle bundle = this.o;
            bundle.getClass();
            qzsVar.e(bundle, this.j);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 430)).u("Error when invoking onPreflightStart!");
        }
    }

    public final void c(boolean z, CarInfoInternal carInfoInternal) {
        ilb.d();
        woy.aa(this.n, "Cannot invoke onPreflightStart until onProjectionStart notified");
        woy.aa(this.o == null, "onPreflightStart already invoked!");
        ((ype) a.l().ai((char) 432)).u("onPreflightStart");
        Bundle bundle = new Bundle();
        this.o = bundle;
        bundle.putBoolean("legacy_frx_ran", z);
        this.o.putInt("connection_type", this.e.i());
        this.o.putParcelable("car_info", carInfoInternal);
        this.o.putInt("car_process_pid", Process.myPid());
        this.o.putLong("creation_millis", this.y.toEpochMilli());
        b();
        if (this.h) {
            ols.M(this.g, yxi.PREFLIGHT_STARTED);
        }
    }

    public final void d(CriticalError criticalError) {
        yxi yxiVar;
        ilb.d();
        int iOrdinal = this.k.ordinal();
        if (iOrdinal == 2) {
            ((ype) a.l().ai((char) 433)).u("Unbinding");
            spi.a().c(this.g, this.w);
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            try {
                ((ype) a.l().ai(434)).u("Invoking service onProjectionEnd");
                qzs qzsVar = this.m;
                qzsVar.getClass();
                qzsVar.f();
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 435)).u("Executing onProjectionEnd failed!");
            }
            this.m = null;
            ((ype) a.l().ai((char) 433)).u("Unbinding");
            spi.a().c(this.g, this.w);
        }
        this.k = imi.a;
        if (this.h) {
            rrw rrwVarH = h(this.e.i());
            Context context = this.g;
            ols.L(context, "com.google.android.gms.car.PROJECTION_ENDED", rrwVarH, null);
            int i = criticalError.a;
            boolean z = i == yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER.D || i == yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR.D;
            int iOrdinal2 = rrwVarH.ordinal();
            if (iOrdinal2 == 0) {
                yxiVar = z ? yxi.PROJECTION_END_BY_REQUEST_UNKNOWN : yxi.PROJECTION_END_BY_DISCONNECT_UNKNOWN;
            } else if (iOrdinal2 == 1) {
                yxiVar = z ? yxi.PROJECTION_END_BY_REQUEST_USB : yxi.PROJECTION_END_BY_DISCONNECT_USB;
            } else {
                if (iOrdinal2 != 2) {
                    throw new RuntimeException(null, null);
                }
                yxiVar = z ? yxi.PROJECTION_END_BY_REQUEST_WIFI : yxi.PROJECTION_END_BY_DISCONNECT_WIFI;
            }
            ols.M(context, yxiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, jfg] */
    public final void e() {
        boolean z;
        ilb.d();
        if (this.k != imi.a) {
            throw new IllegalStateException();
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 436)).u("onProjectionStart");
        Context context = this.g;
        String strC = ilb.c(context);
        boolean z2 = skm.a;
        boolean zEquals = "user".equals(Build.TYPE);
        jew jewVar = this.e;
        Optional optional = this.x;
        int i = jewVar.i();
        irm irmVar = new irm(i, 1);
        if (true == optional.isPresent()) {
            ?? r5 = optional.get();
            int i2 = irmVar.a;
            rrb rrbVarH = rrc.h(yxy.FRX, yzz.PREFLIGHT, yzy.uo);
            rrbVarH.k(i2);
            r5.b(rrbVarH.l());
        }
        if (zEquals || i != 0) {
            z = false;
        } else {
            i = 0;
            z = true;
        }
        if (TextUtils.isEmpty(strC)) {
            if (!z) {
                throw new IllegalStateException("No projection lifecycle services installed");
            }
            ((ype) ((ype) yphVar.f()).ai((char) 438)).u("Using emulator configuration");
            strC = "com.google.android.gms.apitest.car";
        }
        this.l = new Intent().addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFECYCLE_SERVICE").setPackage(strC).setComponent(this.v);
        if (context.getPackageManager().resolveService(this.l, 0) == null && z) {
            ((ype) yphVar.l().ai((char) 437)).u("Skipping bind ");
            this.k = imi.b;
            return;
        }
        this.k = imi.c;
        a();
        if (this.h) {
            ols.M(context, yxi.PROJECTION_START);
            int iOrdinal = h(i).ordinal();
            if (iOrdinal == 0) {
                ols.M(context, yxi.PROJECTION_START_UNKNOWN);
            } else if (iOrdinal == 1) {
                ols.M(context, yxi.PROJECTION_START_USB);
            } else if (iOrdinal == 2) {
                ols.M(context, yxi.PROJECTION_START_WIFI);
            }
            ols.K(context, "com.google.android.gms.car.PROJECTION_STARTED", h(i).ordinal(), null);
        }
    }

    public final void f() {
        try {
            if (this.m == null) {
                ((ype) ((ype) a.h()).ai(439)).u("Null projectionLifecycleService, projection process probably already gone.");
            } else {
                ((ype) a.l().ai(441)).u("Invoking service onProjectionTearDown");
                this.m.i(this.j);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 440)).u("Executing onProjectionTearDown failed!");
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean g() {
        if (this.m == null) {
            ((ype) ((ype) a.h()).ai((char) 426)).u("Null projectionLifecycleService, projection process probably already gone.");
            return false;
        }
        try {
            ((ype) a.l().ai(424)).u("Invoking service onProjectionReady");
            this.m.g(this.j);
            return true;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 425)).u("Error when invoking onProjectionReady!");
            rpz.a(this.g).c(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.rI).l());
            return false;
        }
    }
}
