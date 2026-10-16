package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.os.RemoteException;
import java.util.Set;

/* loaded from: classes.dex */
public final class rps {
    public final Context a;
    public final boolean b;
    public final boolean c;
    rpm d;
    boolean f;
    public int g;
    public boolean h;
    rpj i;
    private final ServiceConnection j = new rpr(this);
    public final Set e = new yy(0);

    public rps(Context context, boolean z, boolean z2) {
        this.a = context;
        this.b = z;
        this.c = z2;
    }

    public static Intent a(Context context) {
        String strB;
        try {
            strB = qtr.b(context, skn.a(context).b(context.getPackageName()));
        } catch (IllegalStateException | SecurityException unused) {
            strB = "";
        }
        return new Intent().addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFETIME_SERVICE").setPackage(strB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, boolean z) {
        woy.Z(Looper.myLooper() == Looper.getMainLooper());
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.a("CAR.PROJECTION.PLSCM", null, "notifyProjectionLifetimeCallbacks");
        }
        this.g = i;
        this.h = z;
        yfq yfqVarO = yfq.o(this.e);
        int size = yfqVarO.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((rpp) yfqVarO.get(i2)).a(i, z);
        }
    }

    public final void c() {
        wer.c();
        this.e.clear();
        e();
        d();
    }

    public final void d() {
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.a("CAR.PROJECTION.PLSCM", null, "unbindService()");
        }
        this.f = false;
        this.i = null;
        spi.a().c(this.a, this.j);
    }

    public final void e() {
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.a("CAR.PROJECTION.PLSCM", null, "unregisterLifetimeCallback");
        }
        if (!this.f) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.a("CAR.PROJECTION.PLSCM", null, "unregisterLifetimeCallback: Service not bound.");
                return;
            }
            return;
        }
        rpj rpjVar = this.i;
        if (rpjVar == null) {
            throw new IllegalStateException("Lifetime service not bound.");
        }
        rpm rpmVar = this.d;
        if (rpmVar == null) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.a("CAR.PROJECTION.PLSCM", null, "unregisterLifetimeCallback: Callback not registered.");
            }
        } else {
            try {
                rpjVar.f(rpmVar);
            } catch (RemoteException e) {
                if (rrd.e("CAR.PROJECTION.PLSCM", 5)) {
                    rrd.d(5, "CAR.PROJECTION.PLSCM", e, "RemoteException calling unregisterProjectionLifetimeCallback. Unbinding service.", new Object[0]);
                }
                d();
            }
            this.d = null;
        }
    }

    public final boolean f(Intent intent) {
        woy.aa(!this.f, "Lifetime service already bound.");
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "bindService(intent:%s)", intent);
        }
        return spi.a().d(this.a, intent, this.j, true != spu.c() ? 65 : 4161);
    }

    public final boolean g(rpq rpqVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException();
        }
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "doOnProjectionLifetimeStart", new Object[0]);
        }
        return h(new rpp(this, new rpn(0), rpqVar));
    }

    public final boolean h(rpp rppVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException();
        }
        int i = 0;
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "registerProjectionLifetimeCallback", new Object[0]);
        }
        if (this.f) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Already bound to lifetime service. Registering callback.", new Object[0]);
            }
            this.e.add(rppVar);
            if (this.b) {
                new sss(Looper.getMainLooper()).post(new rpo(this, rppVar, i));
            }
            return true;
        }
        Context context = this.a;
        Intent intentA = a(context);
        if (context.getPackageManager().resolveService(intentA, 0) == null) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 4)) {
                rrd.d(4, "CAR.PROJECTION.PLSCM", null, "Lifetime service does not exist.", new Object[0]);
            }
            return false;
        }
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Registering callback.", new Object[0]);
        }
        Set set = this.e;
        set.add(rppVar);
        if (f(intentA)) {
            return true;
        }
        if (rrd.e("CAR.PROJECTION.PLSCM", 4)) {
            rrd.d(4, "CAR.PROJECTION.PLSCM", null, "Lifetime service could not be bound. Unregistering callback.", new Object[0]);
        }
        set.remove(rppVar);
        return false;
    }
}
