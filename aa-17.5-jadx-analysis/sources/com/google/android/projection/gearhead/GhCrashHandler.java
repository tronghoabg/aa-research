package com.google.android.projection.gearhead;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.util.Log;
import defpackage.acvz;
import defpackage.aezk;
import defpackage.jbk;
import defpackage.jre;
import defpackage.jrl;
import defpackage.kjb;
import defpackage.kjd;
import defpackage.kje;
import defpackage.lbj;
import defpackage.ldm;
import defpackage.ldq;
import defpackage.ldw;
import defpackage.oit;
import defpackage.olm;
import defpackage.rpz;
import defpackage.rqb;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.teu;
import defpackage.tey;
import defpackage.tez;
import defpackage.thf;
import defpackage.vks;
import defpackage.vla;
import defpackage.vwj;
import defpackage.wub;
import defpackage.wyf;
import defpackage.xyc;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zjc;
import defpackage.zjd;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.OptionalLong;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class GhCrashHandler implements Thread.UncaughtExceptionHandler {
    public static final yph a = yph.c("GH.CrashHandler");
    public final Context b;
    private final jrl c;
    private final lbj d;
    private final Thread.UncaughtExceptionHandler e;
    private final xyc f;
    private final aezk g;

    public GhCrashHandler(Context context, jrl jrlVar, lbj lbjVar) {
        xyc xycVarL = wub.L(new vks(context, 18));
        xycVarL.getClass();
        vwj vwjVar = new vwj(xycVarL, 7);
        jbk jbkVar = new jbk(context, jrlVar, 15, null);
        this.b = context;
        jrlVar.getClass();
        this.c = jrlVar;
        this.d = lbjVar;
        this.g = vwjVar;
        this.f = wub.L(jbkVar);
        this.e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandlerC = vla.a().a.c(this);
        yph yphVar = kjb.a;
        Thread.setDefaultUncaughtExceptionHandler(new wyf(new kje(new kjd(), uncaughtExceptionHandlerC)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Throwable th) {
        if (!lbj.a.contains(Integer.valueOf((int) acvz.b()))) {
            acvz.b();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (((Boolean) ((rqb) this.g.a()).b().get(1000L, TimeUnit.MILLISECONDS)).booleanValue()) {
                d(th);
            } else {
                ((ype) a.l().ai((char) 9917)).u("Dropping crash. Checkbox is opt-out and crash reports are not business critical.");
            }
        } catch (InterruptedException e) {
            e = e;
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 9918)).u("Dropping crash. Unable to check checkbox opt-out.");
            rpz rpzVarA = rpz.a(this.b);
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.qr);
            rrbVarH.u(SystemClock.elapsedRealtime() - jElapsedRealtime);
            rpzVarA.c(rrbVarH.l());
        } catch (RuntimeException e2) {
            e = e2;
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 9918)).u("Dropping crash. Unable to check checkbox opt-out.");
            rpz rpzVarA2 = rpz.a(this.b);
            rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.qr);
            rrbVarH2.u(SystemClock.elapsedRealtime() - jElapsedRealtime);
            rpzVarA2.c(rrbVarH2.l());
        } catch (ExecutionException e3) {
            e = e3;
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 9918)).u("Dropping crash. Unable to check checkbox opt-out.");
            rpz rpzVarA22 = rpz.a(this.b);
            rrb rrbVarH22 = rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.qr);
            rrbVarH22.u(SystemClock.elapsedRealtime() - jElapsedRealtime);
            rpzVarA22.c(rrbVarH22.l());
        } catch (TimeoutException unused) {
            rpz rpzVarA3 = rpz.a(this.b);
            rrb rrbVarH3 = rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.qq);
            rrbVarH3.u(SystemClock.elapsedRealtime() - jElapsedRealtime);
            rpzVarA3.c(rrbVarH3.l());
            ((ype) a.l().ai((char) 9919)).u("Checkbox timed out but still sending crash report.");
            d(th);
        }
    }

    private final void d(Throwable th) {
        String className;
        int lineNumber;
        String methodName;
        String fileName;
        try {
            lbj lbjVar = this.d;
            UUID uuidRandomUUID = UUID.randomUUID();
            Context context = ((ldm) lbjVar).d;
            ldq ldqVar = ((ldm) lbjVar).e;
            String strConcat = "Gearhead crash ".concat(String.valueOf(String.valueOf(uuidRandomUUID)));
            Intent intent = new Intent();
            intent.setComponent(ldm.c);
            yph yphVar = ldw.a;
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
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
            Bundle bundle = new Bundle();
            bundle.putString("exceptionClass", th.getClass().getSimpleName());
            bundle.putString("stackTrace", Log.getStackTraceString(th));
            bundle.putString("throwingClass", className);
            bundle.putString("throwingFile", fileName);
            bundle.putInt("throwingLine", lineNumber);
            bundle.putString("throwingMethod", methodName);
            bundle.putString("process_name", ldqVar.c());
            bundle.putString("description", strConcat);
            bundle.putBoolean("is_user_unlocked", ldqVar.f());
            bundle.putBoolean("is_background_restricted", ldqVar.e());
            Boolean boolB = ldqVar.b();
            if (boolB != null) {
                bundle.putBoolean("is_user_visible", boolB.booleanValue());
            }
            intent.putExtras(bundle);
            intent.putExtra("mode", ldqVar.d());
            intent.putExtra("request_user_feedback", true);
            if (ldm.a.contains(Integer.valueOf((int) acvz.b()))) {
                File file = new File(context.getFilesDir(), "crash_logs");
                Uri uri = null;
                if (file.exists() || file.mkdirs()) {
                    File file2 = new File(file, Instant.now().getEpochSecond() + "." + String.valueOf(UUID.randomUUID()));
                    try {
                        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file2));
                        try {
                            tez.c(printWriter);
                            Uri uriFromFile = Uri.fromFile(file2);
                            printWriter.close();
                            uri = uriFromFile;
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException e) {
                        ((ype) ((ype) ((ype) ldm.b.g()).p(e)).ai((char) 3747)).u("Could not create output file");
                    }
                } else {
                    ((ype) ((ype) ldm.b.g()).ai((char) 3748)).u("Could not create output directory");
                }
                intent.putExtra("circular_logs_uri", uri.toString());
            }
            ((ype) ((ype) ldm.b.f()).ai((char) 3746)).y("Reporting crash %s", uuidRandomUUID);
            ((ldm) lbjVar).d.sendBroadcast(intent);
            ((ype) a.l().ai(9923)).y("Sent crash report %s", uuidRandomUUID);
        } catch (RuntimeException e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 9924)).u("Creating a crash report failed");
        }
    }

    private static boolean e() {
        return ActivityManager.isUserAMonkey() || ActivityManager.isRunningInTestHarness();
    }

    private static final void f() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public final String a() {
        xyc xycVar = this.f;
        String string = ((SharedPreferences) xycVar.gu()).getString("processing_crash", null);
        ((SharedPreferences) xycVar.gu()).edit().remove("processing_crash").commit();
        return string;
    }

    public final boolean b() {
        return ((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            boolean zB = b();
            if (zB) {
                ((SharedPreferences) this.f.gu()).edit().putString("processing_crash", this.c.c(this.b)).commit();
            }
            yph yphVar = a;
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(9925);
            zjc zjcVar = zjc.a;
            ypeVar.y("Version code: %s", new zjd(zjcVar, 175663214));
            ((ype) ((ype) yphVar.f()).ai(9926)).y("isUserUnlocked: %s", new zjd(zjcVar, Boolean.valueOf(zB)));
            ype ypeVar2 = (ype) ((ype) yphVar.f()).ai(9927);
            Context context = this.b;
            ypeVar2.y("isBackgroundRestricted: %s", new zjd(zjcVar, Boolean.valueOf(((ActivityManager) context.getSystemService(ActivityManager.class)).isBackgroundRestricted())));
            if (Build.VERSION.SDK_INT >= 30) {
                UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
                ((ype) ((ype) yphVar.f()).ai(9933)).y("isManagedProfile: %s", new zjd(zjcVar, Boolean.valueOf(userManager.isManagedProfile())));
                ((ype) ((ype) yphVar.f()).ai(9934)).y("isSystemUser: %s", new zjd(zjcVar, Boolean.valueOf(userManager.isSystemUser())));
            }
            try {
                Log.e("GH.CrashHandler", "GH FATAL EXCEPTION: " + thread.getName() + "\nProcess: " + this.c.c(context) + "\nPID: " + Process.myPid() + "\n", th);
                boolean z = tez.a;
                tey[] teyVarArrValues = tey.values();
                int length = teyVarArrValues.length;
                for (int i = 0; i < length; i++) {
                    tey teyVar = teyVarArrValues[i];
                    Queue queue = (Queue) tez.d.get(teyVar);
                    queue.getClass();
                    synchronized (queue) {
                        Log.w("GH.CrashHandler", String.format("[%s] Dumping the last %d logs.", teyVar.name(), Integer.valueOf(queue.size())));
                        Iterator it = queue.iterator();
                        while (it.hasNext()) {
                            Log.w("GH.CrashHandler", ((teu) it.next()).b());
                        }
                    }
                }
            } catch (Exception e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(9932)).u("Could not dump buffer to logcat");
            }
            if (Objects.equals(this.c, jrl.PROJECTION)) {
                this.b.getPackageManager().setComponentEnabledSetting(thf.a, 2, 1);
                jre.a().d();
            }
            if (!e()) {
                c(th);
            }
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.qo);
            OptionalLong optionalLongA = olm.d().a();
            if (optionalLongA.isPresent()) {
                oit.a();
                rrbVarH.u(SystemClock.elapsedRealtime() - optionalLongA.getAsLong());
            }
            rpz.a(this.b).c(rrbVarH.l());
            if (e()) {
                rpz.a(this.b).c(rrc.h(yxy.GEARHEAD, yzz.TESTING, yzy.qo).l());
                ((ype) ((ype) a.g()).ai(9929)).u("Sending error to system crash handler");
                this.e.uncaughtException(thread, th);
            }
            if (b()) {
                ((ype) ((ype) a.f()).ai(9928)).y("Finished processing crash for %s", a());
            }
        } catch (Throwable th2) {
            if (e()) {
                rpz.a(this.b).c(rrc.h(yxy.GEARHEAD, yzz.TESTING, yzy.qo).l());
                ((ype) ((ype) a.g()).ai(9931)).u("Sending error to system crash handler");
                this.e.uncaughtException(thread, th);
            }
            if (b()) {
                ((ype) ((ype) a.f()).ai(9930)).y("Finished processing crash for %s", a());
            }
            throw th2;
        } finally {
            f();
        }
    }
}
