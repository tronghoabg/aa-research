package com.google.android.projection.gearhead;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GhCrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CrashHandler");
    public final android.content.Context b;
    private final defpackage.jrm c;
    private final defpackage.lbo d;
    private final java.lang.Thread.UncaughtExceptionHandler e;
    private final defpackage.xzi f;
    private final defpackage.afak g;

    public GhCrashHandler(android.content.Context context, defpackage.jrm jrmVar, defpackage.lbo lboVar) {
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.ryo(context, 19));
        xziVarAQ.getClass();
        defpackage.vxe vxeVar = new defpackage.vxe(xziVarAQ, 7);
        defpackage.jbr jbrVar = new defpackage.jbr(context, jrmVar, 15, null);
        this.b = context;
        jrmVar.getClass();
        this.c = jrmVar;
        this.d = lboVar;
        this.g = vxeVar;
        this.f = defpackage.ysr.aQ(jbrVar);
        this.e = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandlerC = defpackage.vlw.a().a.c(this);
        defpackage.yqm yqmVar = defpackage.kjh.a;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.wzb(new defpackage.kjk(new defpackage.kjj(), uncaughtExceptionHandlerC)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(java.lang.Throwable th) {
        if (!defpackage.lbo.a.contains(java.lang.Integer.valueOf((int) defpackage.acxb.b()))) {
            defpackage.acxb.b();
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (((java.lang.Boolean) ((defpackage.rqv) this.g.a()).b().get(1000L, java.util.concurrent.TimeUnit.MILLISECONDS)).booleanValue()) {
                d(th);
            } else {
                ((defpackage.yqj) a.l().ai((char) 9945)).u("Dropping crash. Checkbox is opt-out and crash reports are not business critical.");
            }
        } catch (java.lang.InterruptedException e) {
            e = e;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 9946)).u("Dropping crash. Unable to check checkbox opt-out.");
            defpackage.rqt rqtVarA = defpackage.rqt.a(this.b);
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.qt);
            rrvVarH.u(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            rqtVarA.c(rrvVarH.l());
        } catch (java.lang.RuntimeException e2) {
            e = e2;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 9946)).u("Dropping crash. Unable to check checkbox opt-out.");
            defpackage.rqt rqtVarA2 = defpackage.rqt.a(this.b);
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.qt);
            rrvVarH2.u(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            rqtVarA2.c(rrvVarH2.l());
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 9946)).u("Dropping crash. Unable to check checkbox opt-out.");
            defpackage.rqt rqtVarA3 = defpackage.rqt.a(this.b);
            defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.qt);
            rrvVarH3.u(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            rqtVarA3.c(rrvVarH3.l());
        } catch (java.util.concurrent.TimeoutException unused) {
            defpackage.rqt rqtVarA4 = defpackage.rqt.a(this.b);
            defpackage.rrv rrvVarH4 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.qs);
            rrvVarH4.u(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            rqtVarA4.c(rrvVarH4.l());
            ((defpackage.yqj) a.l().ai((char) 9947)).u("Checkbox timed out but still sending crash report.");
            d(th);
        }
    }

    private final void d(java.lang.Throwable th) {
        java.lang.String className;
        int lineNumber;
        java.lang.String methodName;
        java.lang.String fileName;
        try {
            defpackage.lbo lboVar = this.d;
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            android.content.Context context = ((defpackage.ldr) lboVar).d;
            defpackage.ldv ldvVar = ((defpackage.ldr) lboVar).e;
            java.lang.String strConcat = "Gearhead crash ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uuidRandomUUID)));
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(defpackage.ldr.c);
            defpackage.yqm yqmVar = defpackage.leb.a;
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                java.lang.StackTraceElement stackTraceElement = stackTrace[0];
                className = stackTraceElement.getClassName();
                fileName = stackTraceElement.getFileName();
                lineNumber = stackTraceElement.getLineNumber();
                methodName = stackTraceElement.getMethodName();
            } else {
                className = "N/A";
                lineNumber = -1;
                methodName = "N/A";
                fileName = methodName;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("exceptionClass", th.getClass().getSimpleName());
            bundle.putString("stackTrace", android.util.Log.getStackTraceString(th));
            bundle.putString("throwingClass", className);
            bundle.putString("throwingFile", fileName);
            bundle.putInt("throwingLine", lineNumber);
            bundle.putString("throwingMethod", methodName);
            bundle.putString("process_name", ldvVar.c());
            bundle.putString("description", strConcat);
            bundle.putBoolean("is_user_unlocked", ldvVar.f());
            bundle.putBoolean("is_background_restricted", ldvVar.e());
            java.lang.Boolean boolB = ldvVar.b();
            if (boolB != null) {
                bundle.putBoolean("is_user_visible", boolB.booleanValue());
            }
            intent.putExtras(bundle);
            intent.putExtra("mode", ldvVar.d());
            intent.putExtra("request_user_feedback", true);
            if (defpackage.ldr.a.contains(java.lang.Integer.valueOf((int) defpackage.acxb.b()))) {
                java.io.File file = new java.io.File(context.getFilesDir(), "crash_logs");
                android.net.Uri uri = null;
                if (file.exists() || file.mkdirs()) {
                    java.io.File file2 = new java.io.File(file, j$.time.Instant.now().getEpochSecond() + "." + java.lang.String.valueOf(java.util.UUID.randomUUID()));
                    try {
                        java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileOutputStream(file2));
                        try {
                            defpackage.tfv.c(printWriter);
                            android.net.Uri uriFromFile = android.net.Uri.fromFile(file2);
                            printWriter.close();
                            uri = uriFromFile;
                        } catch (java.lang.Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (java.lang.Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (java.io.FileNotFoundException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ldr.b.g()).p(e)).ai((char) 3750)).u("Could not create output file");
                    }
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ldr.b.g()).ai((char) 3751)).u("Could not create output directory");
                }
                intent.putExtra("circular_logs_uri", uri.toString());
            }
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ldr.b.f()).ai((char) 3749)).y("Reporting crash %s", uuidRandomUUID);
            ((defpackage.ldr) lboVar).d.sendBroadcast(intent);
            ((defpackage.yqj) a.l().ai(9951)).y("Sent crash report %s", uuidRandomUUID);
        } catch (java.lang.RuntimeException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 9952)).u("Creating a crash report failed");
        }
    }

    private static boolean e() {
        return android.app.ActivityManager.isUserAMonkey() || android.app.ActivityManager.isRunningInTestHarness();
    }

    private static final void f() {
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(10);
    }

    public final java.lang.String a() {
        defpackage.xzi xziVar = this.f;
        java.lang.String string = ((android.content.SharedPreferences) xziVar.fF()).getString("processing_crash", null);
        ((android.content.SharedPreferences) xziVar.fF()).edit().remove("processing_crash").commit();
        return string;
    }

    public final boolean b() {
        return a$.ExternalSyntheticApiModelOutline2.m((android.os.UserManager) this.b.getSystemService(android.os.UserManager.class));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            try {
                boolean zB = b();
                if (zB) {
                    ((android.content.SharedPreferences) this.f.fF()).edit().putString("processing_crash", this.c.c(this.b)).commit();
                }
                defpackage.yqm yqmVar = a;
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(9953);
                defpackage.zke zkeVar = defpackage.zke.a;
                yqjVar.y("Version code: %s", new defpackage.zkf(zkeVar, 176663424));
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(9954)).y("isUserUnlocked: %s", new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(zB)));
                defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(9955);
                android.content.Context context = this.b;
                yqjVar2.y("isBackgroundRestricted: %s", new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(hh$.ExternalSyntheticApiModelOutline0.m((android.app.ActivityManager) context.getSystemService(android.app.ActivityManager.class)))));
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    android.os.UserManager userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(9961)).y("isManagedProfile: %s", new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(bgp$.ExternalSyntheticApiModelOutline0.m(userManager))));
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(9962)).y("isSystemUser: %s", new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(userManager.isSystemUser())));
                }
                try {
                    android.util.Log.e("GH.CrashHandler", "GH FATAL EXCEPTION: " + thread.getName() + "\nProcess: " + this.c.c(context) + "\nPID: " + android.os.Process.myPid() + "\n", th);
                    boolean z = defpackage.tfv.a;
                    defpackage.tfu[] tfuVarArrValues = defpackage.tfu.values();
                    int length = tfuVarArrValues.length;
                    for (int i = 0; i < length; i++) {
                        defpackage.tfu tfuVar = tfuVarArrValues[i];
                        java.util.Queue queue = (java.util.Queue) defpackage.tfv.d.get(tfuVar);
                        queue.getClass();
                        synchronized (queue) {
                            android.util.Log.w("GH.CrashHandler", java.lang.String.format("[%s] Dumping the last %d logs.", tfuVar.name(), java.lang.Integer.valueOf(queue.size())));
                            java.util.Iterator it = queue.iterator();
                            while (it.hasNext()) {
                                android.util.Log.w("GH.CrashHandler", ((defpackage.tfq) it.next()).b());
                            }
                        }
                    }
                } catch (java.lang.Exception e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(9960)).u("Could not dump buffer to logcat");
                }
                if (j$.util.Objects.equals(this.c, defpackage.jrm.PROJECTION)) {
                    this.b.getPackageManager().setComponentEnabledSetting(defpackage.tib.a, 2, 1);
                    defpackage.jrf.a().d();
                }
                if (!e()) {
                    c(th);
                }
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.qq);
                j$.util.OptionalLong optionalLongA = defpackage.omf.t().a();
                if (optionalLongA.isPresent()) {
                    defpackage.ojm.a();
                    rrvVarH.u(android.os.SystemClock.elapsedRealtime() - optionalLongA.getAsLong());
                }
                defpackage.rqt.a(this.b).c(rrvVarH.l());
                if (e()) {
                    defpackage.rqt.a(this.b).c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.TESTING, defpackage.zbd.qq).l());
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(9957)).u("Sending error to system crash handler");
                    this.e.uncaughtException(thread, th);
                }
                if (b()) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(9956)).y("Finished processing crash for %s", a());
                }
                f();
            } catch (java.lang.Throwable th2) {
                if (e()) {
                    defpackage.rqt.a(this.b).c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.TESTING, defpackage.zbd.qq).l());
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(9959)).u("Sending error to system crash handler");
                    this.e.uncaughtException(thread, th);
                }
                if (b()) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(9958)).y("Finished processing crash for %s", a());
                }
                f();
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            f();
            throw th3;
        }
    }
}
