package com.google.android.apps.auto.carservice.service.impl;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GearheadCarStartupService extends android.app.Service {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.CAR");
    android.os.HandlerThread a;
    private defpackage.jql c;
    private defpackage.shg d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    protected final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        defpackage.jql jqlVar = this.c;
        if (jqlVar != null) {
            defpackage.jqk jqkVarA = jqlVar.a();
            boolean zC = defpackage.acrc.c();
            if (strArr != null && strArr.length > 0 && j$.util.Objects.equals(strArr[0], "screenshot")) {
                if (!zC) {
                    printWriter.println("Screenshot dump not allowed on this build.");
                    return;
                }
                printWriter.println("Triggering screenshot dump...");
                defpackage.imi imiVar = jqkVarA.f;
                if (imiVar == null) {
                    printWriter.println("carServiceBinder is null cannot trigger screenshot dump.");
                    return;
                }
                defpackage.yhe yheVarW = imiVar.W();
                if (yheVarW.isEmpty()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai((char) 394)).u("No displays available to take screenshot");
                    return;
                }
                defpackage.you youVarListIterator = ((defpackage.ygw) yheVarW.values()).listIterator(0);
                while (youVarListIterator.hasNext()) {
                    defpackage.ivc ivcVar = (defpackage.ivc) youVarListIterator.next();
                    defpackage.jkr jkrVar = ivcVar.p;
                    if (jkrVar != null) {
                        ((defpackage.inh) jkrVar).x(false, true);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).ai((char) 393)).y("WindowManager is null for display %s", ivcVar);
                    }
                }
                return;
            }
            if (defpackage.acrc.c()) {
                printWriter.println("Dumping BuildConfig flags for the CAR process");
                defpackage.ebo.t(printWriter);
            }
            defpackage.jpc jpcVar = (defpackage.jpc) jqkVarA.e;
            defpackage.joz jozVar = jpcVar.h;
            defpackage.jnp jnpVar = jozVar == null ? null : jozVar.a;
            if (jnpVar != null) {
                printWriter.printf("CarConnectionSessionManager - active session", new java.lang.Object[0]);
                printWriter.printf("CarGalMonitor status - %s", jpcVar.i == null ? "unset" : "set");
                defpackage.joq joqVar = (defpackage.joq) jnpVar;
                defpackage.xpc xpcVar = joqVar.r;
                if (xpcVar != null) {
                    java.lang.Long lValueOf = java.lang.Long.valueOf(joqVar.c);
                    j$.time.Duration duration = joqVar.v;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(joqVar.t.size());
                    if ((xpcVar.b & 16384) != 0) {
                        defpackage.xhs xhsVar = xpcVar.q;
                        if (xhsVar == null) {
                            xhsVar = defpackage.xhs.a;
                        }
                        str = xhsVar.c;
                    } else {
                        str = xpcVar.d;
                    }
                    if ((xpcVar.b & 16384) != 0) {
                        defpackage.xhs xhsVar2 = xpcVar.q;
                        if (xhsVar2 == null) {
                            xhsVar2 = defpackage.xhs.a;
                        }
                        str2 = xhsVar2.d;
                    } else {
                        str2 = xpcVar.e;
                    }
                    if ((xpcVar.b & 16384) != 0) {
                        defpackage.xhs xhsVar3 = xpcVar.q;
                        if (xhsVar3 == null) {
                            xhsVar3 = defpackage.xhs.a;
                        }
                        str3 = xhsVar3.e;
                    } else {
                        str3 = xpcVar.f;
                    }
                    printWriter.printf("ProtocolManager available, session(%d), connectionStartTime(%s), services(%d), make(%s), model(%s), year(%s)", lValueOf, duration, numValueOf, str, str2, str3);
                } else {
                    printWriter.printf("ProtocolManager available, session(%d), connectionStartTime(%s), services(%d), make(%s), model(%s), year(%s)", java.lang.Long.valueOf(joqVar.c), joqVar.v, java.lang.Integer.valueOf(joqVar.t.size()), "<null>", "<null>", "<null>");
                }
                defpackage.jbw jbwVar = joqVar.l;
                jbwVar.getClass();
                jbwVar.c(printWriter);
            } else {
                printWriter.printf("CarConnectionSessionManager - no active session", new java.lang.Object[0]);
            }
            jqkVarA.f.au(printWriter);
            printWriter.println("Dumping logs for the CAR process");
            defpackage.tfv.c(printWriter);
        }
    }

    @Override // android.app.Service
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.os.IBinder onBind(android.content.Intent intent) {
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 2598)).u("GearheadCarStartupService.onBind");
        return this.c;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        defpackage.jql jqlVar = this.c;
        if (jqlVar != null) {
            defpackage.jqk jqkVarA = jqlVar.a();
            defpackage.ysr.bk(jqkVarA.l, "not initialized");
            defpackage.imi imiVar = jqkVarA.f;
            if (imiVar.bs() && defpackage.jqk.q(jqkVarA.g) && !defpackage.jqk.q(configuration)) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jqk.a.f()).ai((char) 2627)).u("Car mode exited [GearheadCarStartupService]");
                return;
            }
            android.content.res.Configuration configuration2 = jqkVarA.g;
            int iUpdateFrom = configuration2.updateFrom(configuration) & (((configuration2.uiMode ^ configuration.uiMode) & (-16)) != 0 ? -1 : -513);
            if (iUpdateFrom != 0 && ((-536874369) & iUpdateFrom) == 0) {
                ((defpackage.yqj) defpackage.jqk.a.l().ai(2626)).K("Ignored config change %s, %d", configuration, iUpdateFrom);
                return;
            }
            android.content.res.Configuration configuration3 = new android.content.res.Configuration(configuration);
            configuration3.uiMode &= -16;
            configuration3.uiMode |= 3;
            imiVar.aE(configuration3, iUpdateFrom);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 2599)).u("onCreate");
        com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.c(this);
        this.d = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.d(this);
        defpackage.joe joeVar = new defpackage.joe(this);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CarService");
        this.a = handlerThread;
        handlerThread.start();
        this.c = new defpackage.jql(this, defpackage.ysr.aQ(new defpackage.qfe(this, joeVar, new android.os.Handler(this.a.getLooper()), 1)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 2601)).u("onDestroy");
        defpackage.jql jqlVar = this.c;
        if (jqlVar != null) {
            synchronized (jqlVar) {
                if (jqlVar.a) {
                    defpackage.jqk jqkVarA = jqlVar.a();
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jqk.a.f()).ai((char) 2635)).u("tearDown()");
                    defpackage.ysr.bk(android.os.Looper.myLooper() == android.os.Looper.getMainLooper(), "not on main thread");
                    defpackage.iyh.v();
                    jqkVarA.c.post(new defpackage.jpa(jqkVarA, 6));
                    jqkVarA.k.a();
                    jqkVarA.j.d();
                    jqkVarA.i.d();
                } else {
                    jqlVar.b = true;
                }
            }
        }
        android.os.HandlerThread handlerThread = this.a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        defpackage.shg shgVar = this.d;
        if (shgVar != null) {
            shgVar.a();
        }
    }
}
