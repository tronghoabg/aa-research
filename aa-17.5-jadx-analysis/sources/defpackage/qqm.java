package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class qqm extends Service implements qqn {
    public qqo a;

    public abstract Class a();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return 0;
    }

    public final qqh c() {
        return ((rnw) this.a).I;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        rnw rnwVar = (rnw) this.a;
        if (rnwVar.I != null) {
            printWriter.println("activity state:".concat(String.valueOf(rnw.i(rnwVar.F))));
        }
        ror rorVar = rnwVar.k;
        if (rorVar != null) {
            rorVar.l(printWriter);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        qqo qqoVar = this.a;
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.onBind()", ((rnw) qqoVar).t);
        }
        rnw rnwVar = (rnw) qqoVar;
        rnwVar.J = new qxu(rnwVar);
        return rnwVar.J;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rnw rnwVar = (rnw) this.a;
        if (rnwVar.w.P()) {
            rnwVar.w();
        }
        ols olsVar = rnwVar.K;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.a == null) {
            try {
                boolean z = rrd.a;
                rrd.d(4, "CAR.ApiFactory", null, "Initialized ApiFactory to load from local APK", new Object[0]);
                this.a = new rnw(null);
            } catch (qpg e) {
                Log.e("CAR.PROJECTION", "Error loading car activity host", e);
                throw new RuntimeException(e);
            }
        }
        rnw rnwVar = (rnw) this.a;
        rnwVar.f = this;
        rnwVar.h = a();
        rnwVar.q = b();
        rnwVar.g = new rnu(rnwVar.f.getApplicationContext());
        rnwVar.t = rnwVar.h.getSimpleName();
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.onCreate()", rnwVar.t);
        }
        reh rehVar = rnwVar.w;
        rehVar.F(rnwVar.y);
        rnwVar.l = new rno(rehVar);
        rnwVar.M = new lds(rnwVar.l);
        rnwVar.K = (ols) qqj.a.get(rnwVar.f.getClass());
        ols olsVar = rnwVar.K;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        qqo qqoVar = this.a;
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.onDestroy()", ((rnw) qqoVar).t);
        }
        rnw rnwVar = (rnw) qqoVar;
        vag vagVar = rnwVar.L;
        if (vagVar != null) {
            if (omc.c("CAR.INPUT", 3)) {
                rrd.a("CAR.INPUT", null, "destroy");
            }
            vagVar.a = true;
        }
        if (rnwVar.I != null) {
            rnwVar.n(0, false);
        }
        rnwVar.l();
        rnwVar.w.O(null);
        rnwVar.I = null;
        IBinder.DeathRecipient deathRecipient = rnwVar.e;
        synchronized (deathRecipient) {
            qxy qxyVar = ((rnw) qqoVar).i;
            if (qxyVar != null) {
                qxyVar.asBinder().unlinkToDeath(deathRecipient, 0);
                ((rnw) qqoVar).i = null;
            }
        }
        rnwVar.k = null;
        rnwVar.M = null;
        rnwVar.m = null;
        rnwVar.n = null;
        rnwVar.s = null;
        rnwVar.t = null;
        rnwVar.L = null;
        rnwVar.r = false;
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        qqh qqhVar = ((rnw) this.a).I;
        if (qqhVar != null) {
            qqhVar.H();
        }
    }

    @Override // android.app.Service
    @ResultIgnorabilityUnspecified
    public final boolean onUnbind(Intent intent) {
        qqo qqoVar = this.a;
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.onUnbind()", ((rnw) qqoVar).t);
        }
        rnw rnwVar = (rnw) qqoVar;
        rnwVar.n(0, false);
        rnwVar.l();
        rnwVar.J = null;
        return false;
    }
}
