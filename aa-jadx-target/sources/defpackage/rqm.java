package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqm {
    public final android.content.Context a;
    public final boolean b;
    public final boolean c;
    defpackage.rqh d;
    boolean f;
    public int g;
    public boolean h;
    defpackage.rqe i;
    private final android.content.ServiceConnection j = new defpackage.rql(this);
    public final java.util.Set e = new defpackage.zf(0);

    public rqm(android.content.Context context, boolean z, boolean z2) {
        this.a = context;
        this.b = z;
        this.c = z2;
    }

    public static android.content.Intent a(android.content.Context context) {
        java.lang.String strB;
        try {
            strB = defpackage.qun.b(context, defpackage.slj.a(context).b(context.getPackageName()));
        } catch (java.lang.IllegalStateException | java.lang.SecurityException unused) {
            strB = "";
        }
        return new android.content.Intent().addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFETIME_SERVICE").setPackage(strB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, boolean z) {
        defpackage.ysr.bj(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "notifyProjectionLifetimeCallbacks");
        }
        this.g = i;
        this.h = z;
        defpackage.ygw ygwVarO = defpackage.ygw.o(this.e);
        int size = ygwVarO.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.rqj) ygwVarO.get(i2)).a(i, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void c() throws wfo {
        defpackage.wfp.c();
        this.e.clear();
        e();
        d();
    }

    public final void d() {
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "unbindService()");
        }
        this.f = false;
        this.i = null;
        defpackage.sqf.a().c(this.a, this.j);
    }

    public final void e() {
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "unregisterLifetimeCallback");
        }
        if (!this.f) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "unregisterLifetimeCallback: Service not bound.");
                return;
            }
            return;
        }
        defpackage.rqe rqeVar = this.i;
        if (rqeVar == null) {
            throw new java.lang.IllegalStateException("Lifetime service not bound.");
        }
        defpackage.rqh rqhVar = this.d;
        if (rqhVar == null) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "unregisterLifetimeCallback: Callback not registered.");
            }
        } else {
            try {
                rqeVar.f(rqhVar);
            } catch (android.os.RemoteException e) {
                if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 5)) {
                    defpackage.rrx.d(5, "CAR.PROJECTION.PLSCM", e, "RemoteException calling unregisterProjectionLifetimeCallback. Unbinding service.", new java.lang.Object[0]);
                }
                d();
            }
            this.d = null;
        }
    }

    public final boolean f(android.content.Intent intent) {
        defpackage.ysr.bk(!this.f, "Lifetime service already bound.");
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "bindService(intent:%s)", intent);
        }
        return defpackage.sqf.a().d(this.a, intent, this.j, true != defpackage.sqs.e() ? 65 : 4161);
    }

    public final boolean g(defpackage.rqk rqkVar) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException();
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "doOnProjectionLifetimeStart", new java.lang.Object[0]);
        }
        return h(new defpackage.rqj(this, new defpackage.rqi(), rqkVar));
    }

    public final boolean h(defpackage.rqj rqjVar) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException();
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "registerProjectionLifetimeCallback", new java.lang.Object[0]);
        }
        int i = 4;
        if (this.f) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Already bound to lifetime service. Registering callback.", new java.lang.Object[0]);
            }
            this.e.add(rqjVar);
            if (this.b) {
                new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.ron(this, rqjVar, i));
            }
            return true;
        }
        android.content.Context context = this.a;
        android.content.Intent intentA = a(context);
        if (context.getPackageManager().resolveService(intentA, 0) == null) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 4)) {
                defpackage.rrx.d(4, "CAR.PROJECTION.PLSCM", null, "Lifetime service does not exist.", new java.lang.Object[0]);
            }
            return false;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Registering callback.", new java.lang.Object[0]);
        }
        java.util.Set set = this.e;
        set.add(rqjVar);
        if (f(intentA)) {
            return true;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 4)) {
            defpackage.rrx.d(4, "CAR.PROJECTION.PLSCM", null, "Lifetime service could not be bound. Unregistering callback.", new java.lang.Object[0]);
        }
        set.remove(rqjVar);
        return false;
    }
}
