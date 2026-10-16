package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oiv {
    private static final defpackage.yqm d = defpackage.yqm.c("GH.Telemetry");
    public final defpackage.mkn b;
    public final java.util.concurrent.Executor c;
    private defpackage.mkh e;
    private final android.content.Context h;
    private final defpackage.jrj i;
    private final boolean k;
    public final java.lang.Object a = new java.lang.Object();
    private final java.util.List f = new java.util.ArrayList();
    private final android.os.Handler j = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.lang.Runnable g = new defpackage.jpa(this, 19, null);

    public oiv(android.content.Context context, java.util.concurrent.Executor executor, defpackage.jrj jrjVar, defpackage.mkm mkmVar, boolean z) {
        this.h = context;
        this.c = executor;
        this.i = jrjVar;
        this.b = mkmVar.a(context, new defpackage.oiu(this));
        this.k = z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[Catch: RemoteException -> 0x004b, all -> 0x0070, TryCatch #1 {RemoteException -> 0x004b, blocks: (B:13:0x0029, B:16:0x0033, B:17:0x0037, B:19:0x003d), top: B:33:0x0029, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: RemoteException -> 0x004b, all -> 0x0070, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x004b, blocks: (B:13:0x0029, B:16:0x0033, B:17:0x0037, B:19:0x003d), top: B:33:0x0029, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[Catch: all -> 0x0070, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0013, B:10:0x0024, B:13:0x0029, B:24:0x0067, B:25:0x006c, B:16:0x0033, B:17:0x0037, B:19:0x003d, B:27:0x006e, B:23:0x004c, B:9:0x0017), top: B:32:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0013 A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0013, B:10:0x0024, B:13:0x0029, B:24:0x0067, B:25:0x006c, B:16:0x0033, B:17:0x0037, B:19:0x003d, B:27:0x006e, B:23:0x004c, B:9:0x0017), top: B:32:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0013, B:10:0x0024, B:13:0x0029, B:24:0x0067, B:25:0x006c, B:16:0x0033, B:17:0x0037, B:19:0x003d, B:27:0x006e, B:23:0x004c, B:9:0x0017), top: B:32:0x0005, inners: #1 }] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean c(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        defpackage.mkn mknVar;
        boolean z;
        java.util.List list;
        java.util.Iterator it;
        synchronized (this.a) {
            if (telemetryEvent == null) {
                mknVar = this.b;
                if (((defpackage.qkp) mknVar).b) {
                    android.os.Handler handler = this.j;
                    java.lang.Runnable runnable = this.g;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 120000L);
                } else {
                    mknVar.a();
                }
                z = false;
                if (this.e != null) {
                    return false;
                }
                list = this.f;
                list.size();
                if (this.k) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        this.e.e((com.google.android.apps.auto.components.telemetry.TelemetryEvent) it.next());
                    }
                    z = true;
                }
                this.f.clear();
                return z;
            }
            this.f.add(telemetryEvent);
            mknVar = this.b;
            if (((defpackage.qkp) mknVar).b) {
                mknVar.a();
            } else {
                android.os.Handler handler2 = this.j;
                java.lang.Runnable runnable2 = this.g;
                handler2.removeCallbacks(runnable2);
                handler2.postDelayed(runnable2, 120000L);
            }
            z = false;
            if (this.e != null) {
                return false;
            }
            try {
                list = this.f;
                list.size();
                if (this.k) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        this.e.e((com.google.android.apps.auto.components.telemetry.TelemetryEvent) it.next());
                    }
                    z = true;
                }
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) d.g()).p(e)).ai(5976)).u("Failed to log. Will drop events on the floor.");
            }
            this.f.clear();
            return z;
            throw th;
        }
    }

    public final void a(defpackage.mkh mkhVar) {
        synchronized (this.a) {
            this.e = mkhVar;
            if (mkhVar == null) {
                return;
            }
            c(null);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean b(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        android.content.ComponentName componentNameUnflattenFromString;
        defpackage.yyh yyhVar;
        defpackage.yyh yyhVar2;
        defpackage.lkf lkfVar;
        defpackage.abor aborVarK = telemetryEvent.b.K();
        defpackage.jrj jrjVar = this.i;
        defpackage.jrj jrjVar2 = defpackage.jrj.b;
        if (jrjVar == jrjVar2 && (lkfVar = (defpackage.lkf) defpackage.mkp.a.j(defpackage.lkf.class)) != null) {
            boolean zK = lkfVar.k();
            aborVarK.t();
            defpackage.yyg yygVar = (defpackage.yyg) aborVarK.b;
            yygVar.b |= 33554432;
            yygVar.z = zK;
        }
        if (jrjVar == jrjVar2) {
            aborVarK.t();
            defpackage.yyg yygVar2 = (defpackage.yyg) aborVarK.b;
            yygVar2.b |= 67108864;
            yygVar2.A = 1;
        } else {
            aborVarK.t();
            defpackage.yyg yygVar3 = (defpackage.yyg) aborVarK.b;
            yygVar3.b |= 67108864;
            yygVar3.A = 0;
        }
        defpackage.mkp mkpVar = defpackage.mkp.a;
        defpackage.lzq lzqVar = mkpVar == null ? null : (defpackage.lzq) mkpVar.j(defpackage.lzq.class);
        if (lzqVar != null) {
            boolean z = lzqVar.e().c().a == 1;
            aborVarK.t();
            defpackage.yyg yygVar4 = (defpackage.yyg) aborVarK.b;
            yygVar4.c |= 16384;
            yygVar4.N = z;
        }
        if (defpackage.jrj.a() && ((yyhVar = telemetryEvent.a) == (yyhVar2 = defpackage.yyh.UI) || yyhVar == defpackage.yyh.NON_UI)) {
            defpackage.yqm yqmVar = defpackage.mpj.a;
            defpackage.mqj mqjVarF = ((defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class)).f();
            if (mqjVarF != null) {
                if (telemetryEvent.a == yyhVar2) {
                    defpackage.zbg zbgVar = ((defpackage.yyg) aborVarK.b).o;
                    if (zbgVar == null) {
                        zbgVar = defpackage.zbg.a;
                    }
                    defpackage.abor aborVarK2 = zbgVar.K();
                    java.lang.String string = mqjVarF.a().toString();
                    aborVarK2.t();
                    defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarK2.b;
                    string.getClass();
                    zbgVar2.b |= 4194304;
                    zbgVar2.B = string;
                    defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarK2.q();
                    aborVarK.t();
                    defpackage.yyg yygVar5 = (defpackage.yyg) aborVarK.b;
                    zbgVar3.getClass();
                    yygVar5.o = zbgVar3;
                    yygVar5.b |= 4096;
                } else {
                    defpackage.zae zaeVar = ((defpackage.yyg) aborVarK.b).p;
                    if (zaeVar == null) {
                        zaeVar = defpackage.zae.a;
                    }
                    defpackage.abor aborVarK3 = zaeVar.K();
                    java.lang.String string2 = mqjVarF.a().toString();
                    aborVarK3.t();
                    defpackage.zae zaeVar2 = (defpackage.zae) aborVarK3.b;
                    string2.getClass();
                    zaeVar2.b |= 524288;
                    zaeVar2.r = string2;
                    defpackage.zae zaeVar3 = (defpackage.zae) aborVarK3.q();
                    aborVarK.t();
                    defpackage.yyg yygVar6 = (defpackage.yyg) aborVarK.b;
                    zaeVar3.getClass();
                    yygVar6.p = zaeVar3;
                    yygVar6.b |= 8192;
                }
            }
        }
        if (telemetryEvent.a == defpackage.yyh.UI) {
            defpackage.zbg zbgVar4 = telemetryEvent.b.o;
            if (zbgVar4 == null) {
                zbgVar4 = defpackage.zbg.a;
            }
            if ((zbgVar4.b & 16384) != 0 && (zbgVar4.c & 2) == 0 && (componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(zbgVar4.r)) != null) {
                try {
                    android.content.pm.PackageInfo packageInfo = this.h.getPackageManager().getPackageInfo(componentNameUnflattenFromString.getPackageName(), 0);
                    defpackage.zbg zbgVar5 = ((defpackage.yyg) aborVarK.b).o;
                    if (zbgVar5 == null) {
                        zbgVar5 = defpackage.zbg.a;
                    }
                    defpackage.abor aborVarK4 = zbgVar5.K();
                    long j = packageInfo.versionCode;
                    aborVarK4.t();
                    defpackage.zbg zbgVar6 = (defpackage.zbg) aborVarK4.b;
                    zbgVar6.c |= 2;
                    zbgVar6.I = j;
                    defpackage.zbg zbgVar7 = (defpackage.zbg) aborVarK4.q();
                    aborVarK.t();
                    defpackage.yyg yygVar7 = (defpackage.yyg) aborVarK.b;
                    zbgVar7.getClass();
                    yygVar7.o = zbgVar7;
                    yygVar7.b |= 4096;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    ((defpackage.yqj) d.l().ai((char) 5975)).y("Package info not found for %s", componentNameUnflattenFromString);
                }
            }
        }
        telemetryEvent.b = (defpackage.yyg) aborVarK.q();
        return c(telemetryEvent);
    }
}
