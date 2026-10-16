package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class sas implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ sas(defpackage.ijw ijwVar, android.content.res.Configuration configuration, int i, int i2) {
        this.d = i2;
        this.c = ijwVar;
        this.b = configuration;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.content.res.Configuration configuration;
        int i = this.d;
        if (i == 0) {
            defpackage.sau sauVar = (defpackage.sau) ((defpackage.qzx) this.c).a.get();
            if (sauVar != null) {
                int i2 = this.a;
                java.lang.Object obj = this.b;
                if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                    defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onVideoConfigurationChanged(%s, %d)", sauVar.a, obj, java.lang.Integer.valueOf(i2));
                }
                if (sauVar.j == null || sauVar.g == null || sauVar.f == null) {
                    return;
                }
                android.content.res.Configuration configuration2 = (android.content.res.Configuration) obj;
                if ((configuration2.uiMode & 48) != (sauVar.f.getResources().getConfiguration().uiMode & 48)) {
                    android.content.res.Configuration configuration3 = sauVar.h;
                    defpackage.sau.q(configuration3, sauVar.f.getResources().getConfiguration(), configuration2);
                    sauVar.f.unregisterComponentCallbacks(sauVar);
                    sauVar.f = sauVar.a(sauVar.d, configuration3, sauVar.g.e());
                    sauVar.f.registerComponentCallbacks(sauVar);
                }
                if (sauVar.n && android.os.Build.VERSION.SDK_INT >= 31 && a$.ExternalSyntheticApiModelOutline0.m(configuration2) != a$.ExternalSyntheticApiModelOutline0.m(sauVar.f.getResources().getConfiguration())) {
                    a$.ExternalSyntheticApiModelOutline0.m(sauVar.f.getResources().getConfiguration(), a$.ExternalSyntheticApiModelOutline0.m(configuration2));
                }
                if (((~sauVar.e) & i2) != 0) {
                    sauVar.j = sauVar.b.a(sauVar.f);
                    sauVar.g.q(sauVar.j);
                    return;
                }
                sauVar.j.getContext().getResources().updateConfiguration(sauVar.f.getResources().getConfiguration(), sauVar.f.getResources().getDisplayMetrics());
                android.view.View view = sauVar.j;
                if (sauVar.m) {
                    configuration = sauVar.f.getResources().getConfiguration();
                    configuration.uiMode &= -16;
                    configuration.uiMode |= 3;
                } else {
                    configuration = sauVar.f.getResources().getConfiguration();
                }
                view.dispatchConfigurationChanged(configuration);
                return;
            }
            return;
        }
        java.lang.Object obj2 = this.c;
        if (i != 1) {
            defpackage.sid sidVar = (defpackage.sid) obj2;
            sidVar.e();
            defpackage.sic sicVar = sidVar.i;
            defpackage.ysr.bk(!sicVar.d, "Handoff already initiated");
            defpackage.ysr.bk(sicVar.a, "StartupService is not bound");
            android.content.ComponentName componentName = sicVar.e;
            componentName.getClass();
            defpackage.rxo rxoVar = sicVar.f;
            rxoVar.getClass();
            java.lang.Object obj3 = this.b;
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("com.google.android.gms.car.extra.EXTRA_CONNECTION_HANDOFF_COMPONENT", componentName);
                defpackage.omv.g(((defpackage.sid) obj2).b, "com.google.android.gms.car.CONNECTION_HANDOFF", defpackage.rsr.a.ordinal(), bundle);
                sicVar.d = true;
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) ((android.os.Bundle) obj3).getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR");
                int i3 = this.a;
                defpackage.ysr.aY(i3 == 2 || parcelFileDescriptor != null, "File descriptor must not be null except for wifi connections");
                defpackage.ypu ypuVarAi = defpackage.sid.a.f().ai(8992);
                long j = ((defpackage.sid) obj2).c;
                ypuVarAi.F("Handing off session %d (%d)", j, i3);
                rxoVar.d(j, i3, (android.os.Bundle) obj3, sicVar.c);
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                        return;
                    } catch (java.io.IOException unused) {
                        return;
                    }
                }
                return;
            } catch (android.os.RemoteException e) {
                defpackage.omv.g(sidVar.b, "com.google.android.gms.car.CONNECTION_HANDOFF", defpackage.rsr.c.ordinal(), null);
                defpackage.sid.a.g().p(e).ai(8994).u("Connection handoff failed due to RemoteException, exiting");
                throw new java.lang.RuntimeException(e);
            }
        }
        defpackage.imi imiVar = (defpackage.imi) obj2;
        if (!imiVar.s) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai((char) 311)).u("Delaying day/night mode update because projection has not started.");
            if (defpackage.edd.g()) {
                imiVar.t.set(true);
                return;
            }
            return;
        }
        defpackage.ioh iohVarN = imiVar.n();
        defpackage.jfn jfnVar = imiVar.u.v;
        jfnVar.getClass();
        defpackage.you youVarListIterator = ((defpackage.ygw) imiVar.W().values()).listIterator(0);
        while (youVarListIterator.hasNext()) {
            int i4 = this.a;
            java.lang.Object obj4 = this.b;
            defpackage.ivc ivcVar = (defpackage.ivc) youVarListIterator.next();
            com.google.android.gms.car.display.CarDisplayId carDisplayId = ivcVar.j;
            android.content.res.Configuration configurationA = jfnVar.a(carDisplayId, (android.content.res.Configuration) obj4);
            if (iohVarN != null) {
                iohVarN.B(carDisplayId, configurationA, i4);
            }
            defpackage.jkr jkrVar = ivcVar.p;
            if (jkrVar != null) {
                defpackage.inh inhVar = (defpackage.inh) jkrVar;
                inhVar.E = (configurationA.uiMode & 48) == 32;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai((char) 552)).y("Updating video configuration. isNightMode: %s", java.lang.Boolean.valueOf(inhVar.E));
                synchronized (inhVar.ab) {
                    java.util.Iterator it = ((defpackage.inh) jkrVar).ac.iterator();
                    while (it.hasNext()) {
                        ((defpackage.jhb) it.next()).p(configurationA, i4);
                    }
                    if (((defpackage.inh) jkrVar).ao) {
                        java.util.Iterator it2 = ((defpackage.inh) jkrVar).ad.iterator();
                        while (it2.hasNext()) {
                            ((defpackage.jhb) it2.next()).p(configurationA, i4);
                        }
                    }
                }
                defpackage.rbz.g(android.os.Looper.getMainLooper(), new defpackage.bgf(jkrVar, 14));
            }
        }
    }

    public /* synthetic */ sas(defpackage.sid sidVar, int i, android.os.Bundle bundle, int i2) {
        this.d = i2;
        this.c = sidVar;
        this.a = i;
        this.b = bundle;
    }
}
