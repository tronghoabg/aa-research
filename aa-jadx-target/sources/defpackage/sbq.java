package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbq {
    public final android.os.Handler c;
    public final com.google.android.gms.carsetup.CarSetupServiceImpl d;
    public final android.content.Context e;
    public final defpackage.sbg f;
    public final defpackage.shj g;
    public java.io.Closeable h;
    public android.os.Bundle i;
    public java.lang.Runnable j;
    public long k;
    public int l;
    public int m;
    public defpackage.shv n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public final defpackage.ris v;
    public android.content.ComponentName w;
    public long x;
    public final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.lang.Runnable b = new defpackage.rzu(this, 3);
    public final java.util.concurrent.atomic.AtomicReference u = new java.util.concurrent.atomic.AtomicReference(null);

    public sbq(android.os.Handler handler, com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl, android.content.Context context, defpackage.sbg sbgVar, defpackage.shj shjVar, defpackage.ris risVar) {
        com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8627).u("Creating ConnectionHandoffStateManager");
        this.c = handler;
        this.n = null;
        this.d = carSetupServiceImpl;
        this.e = context;
        this.f = sbgVar;
        this.g = shjVar;
        this.v = risVar;
    }

    public final android.os.Bundle a(boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("car_handoff_start_activities", true);
        bundle.putBoolean("car_handoff_user_authorized_projection", z);
        bundle.putInt("connection_tag", this.m);
        com.google.android.gms.carsetup.CarSetupServiceImpl.a.l().ai(8629).y("At Handoff, legacyFrxRan: %b", java.lang.Boolean.valueOf(this.r));
        bundle.putBoolean("car_handoff_legacy_frx_ran", this.r);
        return bundle;
    }

    public final void b() {
        boolean zBooleanValue;
        if (this.o) {
            try {
                zBooleanValue = ((java.lang.Boolean) ((defpackage.zga) this.n.a(this.k, a(true))).t(500L, java.util.concurrent.TimeUnit.MILLISECONDS)).booleanValue();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                com.google.android.gms.carsetup.CarSetupServiceImpl.a.h().p(e).ai(8636).u("Could not complete call to startup service");
                zBooleanValue = false;
            }
            defpackage.ysr.bk(zBooleanValue, "Failed to signal user authorization state");
            android.content.Context context = this.e;
            android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION").setComponent((android.content.ComponentName) defpackage.riv.a.fF()).putExtra("car_handoff_user_authorized_projection", true).putExtra("car_handoff_session_id", this.k);
            defpackage.shj shjVar = this.g;
            defpackage.yqk yqkVar = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
            shjVar.a(intentPutExtra);
            if (f()) {
                intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
            }
            context.startService(intentPutExtra);
        }
    }

    public final void c(android.content.ComponentName componentName, boolean z) {
        defpackage.yqk yqkVar = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
        defpackage.ypu ypuVarAi = yqkVar.f().ai(8641);
        java.lang.String strFlattenToString = componentName == null ? "null" : componentName.flattenToString();
        defpackage.zke zkeVar = defpackage.zke.a;
        ypuVarAi.M("Interested in handoff %s %b", new defpackage.zkf(zkeVar, strFlattenToString), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z)));
        if (defpackage.adax.a.fF().ah() && componentName == null) {
            if (z) {
                throw new java.lang.IllegalStateException("onInterestedInHandoff: Canadiate is null but interested is true");
            }
        } else if (z) {
            componentName.getClass();
            this.w = componentName;
            yqkVar.f().ai(8633).u("Interested in handoff - start handoff");
            defpackage.sbg sbgVar = this.f;
            defpackage.abor aborVarN = defpackage.yyg.a.n();
            defpackage.abor aborVarN2 = defpackage.zae.a.n();
            aborVarN2.t();
            defpackage.zae zaeVar = (defpackage.zae) aborVarN2.b;
            zaeVar.b |= 1;
            zaeVar.c = 27;
            aborVarN2.t();
            defpackage.zae zaeVar2 = (defpackage.zae) aborVarN2.b;
            zaeVar2.b |= 2;
            zaeVar2.d = 3009;
            defpackage.zae zaeVar3 = (defpackage.zae) aborVarN2.q();
            aborVarN.t();
            defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
            zaeVar3.getClass();
            yygVar.p = zaeVar3;
            yygVar.b |= 8192;
            sbgVar.d((defpackage.yyg) aborVarN.q(), defpackage.yyh.NON_UI);
            this.c.post(new defpackage.rzu(this, 4));
            return;
        }
        if (componentName != null) {
            defpackage.shv shvVar = this.n;
            ((defpackage.sid) shvVar).e.post(new defpackage.sho(shvVar, 8));
        } else {
            yqkVar.g().ai(8642).u("All handoff candidates have declined the handoff, running default behavior");
            this.n.b();
            this.c.post(this.j);
        }
    }

    public final void d(xiw xiwVar) {
        defpackage.ypu ypuVarAi = com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8644);
        int i = xiwVar.i;
        ypuVarAi.w("Tearing down car connection for reason %d", i);
        if (!this.p) {
            defpackage.shv shvVar = this.n;
            defpackage.sid.a.f().ai(8998).w("Tearing down car connection with reason %s", i);
            ((defpackage.sid) shvVar).d().execute(new sbj(shvVar, xiwVar, 6, (byte[]) null));
        } else if (this.o) {
            this.n.a(this.k, a(false));
            android.content.Context context = this.e;
            android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION").setComponent((android.content.ComponentName) defpackage.riv.a.fF()).putExtra("car_handoff_user_authorized_projection", false).putExtra("car_handoff_session_id", this.k).putExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", i);
            this.g.a(intentPutExtra);
            if (f()) {
                intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
            }
            context.startService(intentPutExtra);
        }
    }

    public final void e(boolean z, boolean z2) {
        if (!this.n.c(z, z2)) {
            throw new java.lang.IllegalStateException("Authorization state failed to persist");
        }
    }

    public final boolean f() {
        defpackage.ypu ypuVarAi = com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8632);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.u;
        ypuVarAi.y("isCarAudioServiceMigrationEnabled: %s", new defpackage.zkf(defpackage.zke.a, atomicReference.get()));
        defpackage.ysr.bk(atomicReference.get() != null, "isCarAudioServiceMigrationEnabled must be set");
        return ((java.lang.Boolean) atomicReference.get()).booleanValue();
    }
}
