package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wyl implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wyl(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, mph] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        int i = this.b;
        if (i == 0) {
            ?? r7 = this.a;
            defpackage.lin linVar = (defpackage.lin) r7;
            if (!linVar.e || defpackage.wyv.A().k()) {
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, linVar.e ? defpackage.zbd.pl : defpackage.zbd.pk).l());
                return;
            }
            defpackage.mpj.b().j(r7);
            linVar.n();
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.pm).l());
            return;
        }
        if (i == 1) {
            ?? r8 = this.a;
            try {
                defpackage.ysr.bn(r8.isDone(), "Future was expected to be done: %s", r8);
                defpackage.a.K(r8);
                return;
            } catch (java.util.concurrent.ExecutionException e) {
                defpackage.wfp.e(new defpackage.wdg(e, 4));
                return;
            }
        }
        if (i == 2) {
            int i2 = com.google.android.projection.gearhead.GhApplication.b;
            defpackage.tgg.a.a(defpackage.tgf.GEARHEAD_FIRST_PROCESS_STABLE_FLAG_READ, j$.time.Duration.ZERO, (j$.time.Duration) this.a);
            return;
        }
        if (i == 3) {
            int i3 = com.google.android.projection.gearhead.GhApplication.b;
            if (defpackage.kou.n()) {
                java.lang.Object obj = this.a;
                defpackage.yqm yqmVar = kpb.a;
                defpackage.ysr.bk(defpackage.kou.n(), "Failure injection is disabled");
                defpackage.rlw rlwVarM = defpackage.kou.m();
                pcb pcbVar = pcb.d;
                rlwVarM.e(pcbVar, new kov(obj, 2));
                android.content.Context context = (android.content.Context) obj;
                defpackage.kou.m().f(pcbVar, new kow(context));
                java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
                defpackage.rlw rlwVarM2 = defpackage.kou.m();
                pcb pcbVar2 = pcb.e;
                rlwVarM2.e(pcbVar2, new kox(executorServiceNewSingleThreadExecutor, context, atomicReference));
                defpackage.kou.m().f(pcbVar2, new koy(executorServiceNewSingleThreadExecutor, context, atomicReference));
                defpackage.kou.m().e(pcb.b, new kov(pac.a(context, java.util.concurrent.Executors.newSingleThreadExecutor()), 0));
                defpackage.kou.m().e(pcb.c, new kov(new defpackage.sdu(context, new defpackage.knf(context, "common_user_settings")), 1));
                return;
            }
            return;
        }
        if (i == 4) {
            int i4 = com.google.android.projection.gearhead.GhApplication.b;
            defpackage.tgg.a.a(defpackage.tgf.GEARHEAD_APPLICATION_CREATED, j$.time.Duration.ZERO, (j$.time.Duration) this.a);
            return;
        }
        defpackage.xgl xglVar = (defpackage.xgl) this.a;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) xglVar.c.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (!android.text.TextUtils.isEmpty(runningAppProcessInfo.processName) && xglVar.d.containsKey(runningAppProcessInfo.processName)) {
                    defpackage.xgk xgkVar = (defpackage.xgk) xglVar.g.get(runningAppProcessInfo.processName);
                    if (runningAppProcessInfo != null && (runningAppProcessInfo.importance != xgkVar.a || runningAppProcessInfo.lru != xgkVar.d || runningAppProcessInfo.uid != xgkVar.e)) {
                        java.lang.String string = xgkVar.toString();
                        xgkVar.a = runningAppProcessInfo.importance;
                        xgkVar.b = runningAppProcessInfo.importanceReasonCode;
                        xgkVar.c = runningAppProcessInfo.importanceReasonPid;
                        xgkVar.d = runningAppProcessInfo.lru;
                        xgkVar.e = runningAppProcessInfo.uid;
                        ((defpackage.yqj) defpackage.xgl.a.l().ai(10267)).R("Process info changed %s:%s->%s", runningAppProcessInfo.processName, string, xgkVar);
                    }
                    if (runningAppProcessInfo.importance >= 400) {
                        xglVar.a(runningAppProcessInfo.processName, defpackage.zaa.PROCESS_RUNNING_AT_LOW_PRIORITY);
                    } else {
                        xglVar.a(runningAppProcessInfo.processName, defpackage.zaa.PROCESS_RUNNING_AT_HIGH_PRIORITY);
                    }
                }
            }
        }
        if (xglVar.h) {
            xglVar.e.postDelayed(xglVar.f, defpackage.acws.b());
        }
    }
}
