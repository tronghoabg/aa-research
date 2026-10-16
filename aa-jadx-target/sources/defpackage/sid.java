package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sid implements defpackage.shv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.STARTUP");
    public final android.content.Context b;
    public final long c;
    public final boolean d;
    public final android.os.Handler e;
    public final java.util.List f;
    public final int g;
    public final android.content.ServiceConnection h;
    public final defpackage.sic i;
    public final defpackage.sbq j;
    private final java.util.concurrent.Executor k;

    public sid(android.content.Context context, long j, defpackage.sbq sbqVar, android.os.Handler handler, java.util.List list, int i) {
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        this.h = new defpackage.shy(this);
        this.i = new defpackage.sic(this);
        this.b = context;
        this.c = j;
        this.d = true;
        this.j = sbqVar;
        this.e = handler;
        this.k = new defpackage.tea(handler, 1);
        this.f = list;
        this.g = i;
    }

    public static void g(android.os.Bundle bundle, android.content.SharedPreferences.Editor editor, java.lang.String str) {
        if (bundle.containsKey(str)) {
            editor.putBoolean(str, bundle.getBoolean(str));
        }
    }

    public static void h(android.os.Bundle bundle, android.content.SharedPreferences.Editor editor, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string != null) {
            editor.putString(str, string);
        }
    }

    private final boolean j() {
        return this.e.getLooper() == android.os.Looper.myLooper();
    }

    private final boolean k(java.lang.String str) {
        return defpackage.slj.a(this.b).b(str);
    }

    @Override // defpackage.shv
    public final defpackage.zhs a(final long j, final android.os.Bundle bundle) {
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: shx
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                defpackage.rxo rxoVar;
                long j2 = j;
                android.os.Bundle bundle2 = bundle;
                defpackage.sic sicVar = this.a.i;
                boolean z = false;
                if (!sicVar.a || (rxoVar = sicVar.f) == null) {
                    defpackage.sid.a.h().ai(8977).u("HandoffState is invalid to do a transferForHandoff.");
                } else {
                    try {
                        rxoVar.n(j2, bundle2);
                        z = true;
                    } catch (android.os.RemoteException e) {
                        defpackage.sid.a.h().p(e).ai(8978).u("Cannot transfer for handoff");
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
        };
        java.util.concurrent.Executor executorD = d();
        defpackage.zim zimVar = new defpackage.zim(callable);
        executorD.execute(zimVar);
        return zimVar;
    }

    @Override // defpackage.shv
    public final void b() {
        this.e.post(new defpackage.rzu(this, 9));
    }

    @Override // defpackage.shv
    public final boolean c(boolean z, boolean z2) {
        try {
            return ((java.lang.Boolean) ((defpackage.zga) defpackage.ysr.ct(new shw(this, z, z2), d())).t(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            a.h().p(e).ai(8999).u("Did not complete authorization. FRX may be run.");
            return false;
        }
    }

    public final java.util.concurrent.Executor d() {
        return j() ? defpackage.zgt.INSTANCE : this.k;
    }

    public final void e() {
        if (!j()) {
            throw new java.lang.IllegalStateException();
        }
    }

    public final void f() {
        e();
        while (true) {
            defpackage.sic sicVar = this.i;
            java.util.ArrayDeque arrayDeque = sicVar.b;
            if (arrayDeque.isEmpty()) {
                sicVar.a();
                this.j.c(null, false);
                return;
            }
            android.content.ComponentName componentName = (android.content.ComponentName) arrayDeque.removeFirst();
            java.lang.String packageName = componentName.getPackageName();
            if (i(packageName)) {
                android.content.Intent intent = new android.content.Intent();
                intent.setComponent(componentName);
                defpackage.yqk yqkVar = a;
                defpackage.ypu ypuVarAi = yqkVar.f().ai(8979);
                java.lang.String strFlattenToString = componentName.flattenToString();
                defpackage.zke zkeVar = defpackage.zke.a;
                ypuVarAi.y("Checking handoff interest for component %s", new defpackage.zkf(zkeVar, strFlattenToString));
                boolean zBindService = this.b.bindService(intent, this.h, true != defpackage.sqs.e() ? 65 : 4161);
                sicVar.a = zBindService;
                if (zBindService) {
                    yqkVar.f().ai(8981).y("Successfully bound to component %s", new defpackage.zkf(zkeVar, componentName.flattenToString()));
                    sicVar.e = componentName;
                    return;
                } else {
                    yqkVar.f().ai(8980).y("Failed to bind to component %s", new defpackage.zkf(zkeVar, componentName.flattenToString()));
                    sicVar.e = null;
                    this.j.c(componentName, false);
                    return;
                }
            }
            if ("com.google.android.projection.gearhead".equals(packageName)) {
                a.h().ai(8983).u("Can't handoff to Gearhead, untrusted signature!");
            } else {
                a.h().ai(8982).y("Skipping %s (not Gearhead): untrusted signature.", packageName);
            }
        }
    }

    public final boolean i(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return k(str);
        }
        java.lang.String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(android.os.Process.myUid());
        if (packagesForUid != null) {
            for (java.lang.String str2 : packagesForUid) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return k(str);
    }
}
