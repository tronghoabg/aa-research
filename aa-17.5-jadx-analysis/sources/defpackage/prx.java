package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class prx implements prw, uyl, prz {
    public static final int a;
    public static final int b;
    private static final yob f = yob.c("com/google/android/apps/gmm/systems/concurrent/ThreadPoolServiceImpl");
    public final tmb c;
    final ConcurrentHashMap d = new ConcurrentHashMap(psb.values().length);
    public final boolean e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        a = iAvailableProcessors;
        b = Math.max(4, Math.min(8, iAvailableProcessors + iAvailableProcessors + (iAvailableProcessors / 2)));
    }

    public prx(Context context, tmb tmbVar) {
        this.c = tmbVar;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        activityManager.getClass();
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        this.e = zIsLowRamDevice;
        ((ynz) ((ynz) f.d()).ai(6855)).R("backgroundPoolSize: %d,  numProcessors: %d,  isLowRamDevice: %s", Integer.valueOf(b), Integer.valueOf(a), Boolean.valueOf(zIsLowRamDevice));
        psb.J = this;
        a(psb.UI_THREAD);
    }

    @Override // defpackage.prw
    public final Executor a(psb psbVar) {
        return c(psbVar, new ykd(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Executor c(psb psbVar, ykd ykdVar) {
        prb prtVar;
        Looper looper;
        woy.N(psbVar != psb.CURRENT);
        ConcurrentHashMap concurrentHashMap = this.d;
        Executor executor = (Executor) concurrentHashMap.get(psbVar);
        if ((executor instanceof ExecutorService) && ((ExecutorService) executor).isShutdown()) {
            if (concurrentHashMap.remove(psbVar, executor)) {
                ((ynz) ((ynz) f.h()).ai((char) 6858)).y("getExecutor  REMOVED SHUTDOWN  %s", executor);
            }
            executor = (Executor) concurrentHashMap.get(psbVar);
        }
        if (executor != null) {
            return executor;
        }
        Object obj = ykdVar.a;
        int iA = psbVar.a();
        woy.Z(iA > 0);
        psb psbVarD = psbVar.d();
        if ((psbVar.L & 2) != 0) {
            woy.Z(iA == 1);
            if (psbVar == psb.UI_THREAD) {
                looper = Looper.getMainLooper();
            } else {
                prp prpVar = new prp(psbVar);
                prpVar.start();
                looper = prpVar.getLooper();
            }
            prtVar = new prq(looper, psbVar, ((prx) obj).c);
        } else {
            psb psbVar2 = psb.SCHEDULER;
            if (psbVar == psbVar2) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(iA, new prn(psbVar2));
                scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
                prtVar = scheduledThreadPoolExecutor;
            } else if (psbVarD != null) {
                prtVar = ((prb) ((prx) obj).a(psbVarD)).b(psbVar.M, iA, psbVar);
            } else {
                ykd ykdVar2 = new ykd(obj);
                prx prxVar = (prx) obj;
                prtVar = new prt(psbVar, prxVar.c, (ScheduledExecutorService) prxVar.c(psbVar2, ykdVar2));
            }
        }
        Executor executor2 = (Executor) concurrentHashMap.putIfAbsent(psbVar, prtVar);
        if (executor2 == null) {
            ((ynz) ((ynz) f.f()).ai(6857)).R("getExecutor  CREATED  %s@%x[%s]", prtVar.getClass().getSimpleName(), Integer.valueOf(prtVar.hashCode()), psbVar.M);
            return prtVar;
        }
        ((ynz) ((ynz) f.h()).ai(6856)).R("getExecutor  DISCARDING  %s@%x[%s]", prtVar.getClass().getSimpleName(), Integer.valueOf(prtVar.hashCode()), psbVar.M);
        prtVar.shutdown();
        return executor2;
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
