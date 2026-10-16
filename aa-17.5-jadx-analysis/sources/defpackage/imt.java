package defpackage;

import android.app.ActivityManager;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public final class imt implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public imt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v58, types: [ivg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        switch (this.b) {
            case 0:
                try {
                    Object obj2 = this.a;
                    if (!rbr.i(((ina) obj2).t, acvt.a.gu().e())) {
                        ((ype) ((ype) ina.a.h()).ai(456)).u("Unable to acquire composition semaphore");
                        try {
                            ((ina) obj2).aq.j();
                        } catch (jiy unused) {
                        }
                        return;
                    }
                    try {
                        try {
                            Process.setThreadPriority(-10);
                            try {
                                Object obj3 = this.a;
                                ((ina) obj3).aq.i(((ina) obj3).p, ((ina) obj3).u, ((ina) obj3).w, ((ina) obj3).k);
                                Looper.prepare();
                                ((ina) obj3).r = Looper.myLooper();
                                if (acvt.a.gu().q()) {
                                    ((ina) obj3).ah = new jko(((ina) obj3).l, ((ina) obj3).ag);
                                    ((ina) obj3).ah.a();
                                }
                                ((ina) obj3).s = new ims((ina) obj3, ((ina) obj3).r);
                                Object obj4 = this.a;
                                ((ina) obj4).z = true;
                                ((ina) obj4).q.release();
                                Looper.loop();
                                ((ype) ina.a.l().ai(458)).u("CompositionThread exiting");
                                obj = this.a;
                            } catch (Exception e) {
                                ((ype) ((ype) ((ype) ina.a.g()).p(e)).ai(460)).u("Error starting composition");
                                try {
                                    ((ina) this.a).s();
                                    ((ype) ina.a.l().ai(461)).u("CompositionThread exiting");
                                } finally {
                                    Object obj5 = this.a;
                                    ((ina) obj5).z = false;
                                    ((ina) obj5).q.release();
                                }
                            }
                            ((ina) obj).s();
                            return;
                        } catch (Throwable th) {
                            ((ype) ina.a.l().ai(459)).u("CompositionThread exiting");
                            ((ina) this.a).s();
                            throw th;
                        }
                    } finally {
                        ((ina) this.a).t.release();
                    }
                } catch (InterruptedException e2) {
                    ((ype) ((ype) ((ype) ina.a.g()).p(e2)).ai((char) 457)).u("Attempt to acquire composition semaphore interrupted");
                    try {
                        ((ina) this.a).aq.j();
                    } catch (jiy unused2) {
                    }
                    ina inaVar = (ina) this.a;
                    inaVar.z = false;
                    inaVar.q.release();
                    return;
                }
            case 1:
                ((ixs) this.a).e(2);
                return;
            case 2:
                ing ingVar = (ing) this.a;
                if (ingVar.k == -1 || (activityManager = (ActivityManager) ingVar.b.d.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    return;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == ingVar.k) {
                        ingVar.l = runningAppProcessInfo.processName;
                        return;
                    }
                }
                return;
            case 3:
                yph yphVar = ing.a;
                ((ype) yphVar.l().ai((char) 618)).u("Timed out waiting client death to be called on crash");
                ing ingVar2 = (ing) this.a;
                Bundle bundle = (Bundle) ingVar2.D.get();
                if (ingVar2.f != null) {
                    if (acoq.q()) {
                        rpz rpzVarA = rpz.a(ingVar2.b.d);
                        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.tQ);
                        rrbVarH.p(ingVar2.d);
                        rrbVarH.o(ingVar2.f);
                        rpzVarA.c(rrbVarH.l());
                    }
                    if (bundle == null) {
                        ((ype) ((ype) yphVar.f()).ai((char) 621)).u("Client ANR detected, but we never heard back from the client.");
                    } else {
                        ((ype) ((ype) yphVar.h()).ai((char) 620)).u("Timed out waiting for client ANR data, yet the ANR data has been set?! Possible race condition between the client disconnect, and cancelling the runnable.");
                    }
                } else if (bundle != null) {
                    ((ype) ((ype) yphVar.h()).ai((char) 619)).u("Client did not ANR, but ANR data has been unexpectedly set in death after crash.");
                }
                ingVar2.i();
                return;
            case 4:
                ipb ipbVar = (ipb) this.a;
                ipbVar.J++;
                yph yphVar2 = ipb.E;
                ((ype) ((ype) yphVar2.h()).ai(875)).w("Bind timed out: %d", ipbVar.J);
                if (ipbVar.J < 3) {
                    ((ype) ((ype) yphVar2.h()).ai((char) 877)).u("Retrying...");
                    ipbVar.R = false;
                    ipbVar.X();
                    return;
                } else {
                    ((ype) ((ype) yphVar2.h()).ai((char) 876)).u("Giving up, crashing client");
                    ipa ipaVar = ipbVar.H;
                    RuntimeException runtimeException = new RuntimeException(String.valueOf(ipbVar.d.flattenToShortString()).concat(" timeout during bind"));
                    int i = ipa.i;
                    ipaVar.q(runtimeException);
                    return;
                }
            case 5:
                ((iqw) this.a).p(2);
                return;
            case 6:
                Object obj6 = this.a;
                iqw iqwVar = (iqw) obj6;
                if (iqwVar.k.get()) {
                    ((ype) ((ype) iqw.a.f()).ai((char) 1192)).u("Send GAIN focus request to HU to recover from transient loss");
                    iqwVar.m(1);
                    iqv iqvVar = iqwVar.m;
                    iqvVar.getClass();
                    iqvVar.postDelayed(new ilp(obj6, 19), 1000L);
                    iqwVar.g.b(yzy.zk);
                    return;
                }
                return;
            case 7:
                yph yphVar3 = iqw.a;
                ((ype) yphVar3.l().ai((char) 1148)).u("Running focusReleaseRunnable");
                iqw iqwVar2 = (iqw) this.a;
                isl islVar = iqwVar2.e;
                islVar.getClass();
                if (islVar.c()) {
                    ((ype) yphVar3.l().ai((char) 1151)).u("App on MD has audio focus, so not waiting for MEDIA stream to stop.");
                    return;
                }
                iqn iqnVar = iqwVar2.b;
                iqnVar.g(3, true);
                if (islVar.c()) {
                    ((ype) yphVar3.l().ai((char) 1150)).u("App on MD has audio focus, so not waiting for TTS stream to stop.");
                    return;
                }
                iqnVar.g(5, true);
                if (islVar.c()) {
                    ((ype) yphVar3.l().ai((char) 1149)).u("App on MD has audio focus, so not requesting to release focus to HU.");
                    return;
                }
                iqv iqvVar2 = iqwVar2.m;
                iqvVar2.getClass();
                iqvVar2.d();
                return;
            case 8:
                irg irgVar = (irg) this.a;
                if (irgVar.g) {
                    ((ype) irg.a.l().ai((char) 1243)).u("stopping ASR.");
                    irgVar.b.p(2);
                    irgVar.g = false;
                    return;
                }
                return;
            case 9:
                ((iru) this.a).y();
                return;
            case 10:
                ((isf) this.a).d();
                return;
            case 11:
                iso isoVar = (iso) this.a;
                Handler handler = isoVar.c;
                if (handler == null) {
                    ((ype) ((ype) iso.a.h()).ai((char) 1305)).u("Skip requesting initial focus because focus manager has stopped");
                    return;
                }
                yph yphVar4 = iso.a;
                ((ype) ((ype) yphVar4.f()).ai((char) 1302)).u("Requesting initial Android audio focus");
                int iD = isoVar.d(1, new AudioAttributes.Builder().setUsage(0).setContentType(0).build());
                if (iD == 0) {
                    ((ype) ((ype) yphVar4.g()).ai((char) 1304)).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
                } else if (iD == 1) {
                    isoVar.b.k();
                } else if (iD != 2) {
                    ((ype) ((ype) yphVar4.g()).ai((char) 1303)).w("Unrecognized focus hint in doRequestInitialAndroidFocus: %d", iD);
                }
                isoVar.d.c = handler;
                return;
            case 12:
                Object obj7 = this.a;
                synchronized (obj7) {
                    if (((iur) obj7).d) {
                        ((iur) obj7).a.n(((iur) obj7).e);
                        ((iur) obj7).b.postDelayed(((iur) obj7).c, 1000L);
                    } else {
                        ((iur) obj7).c();
                    }
                }
                return;
            case 13:
                ((jgi) this.a).l();
                return;
            case 14:
                this.a.C();
                return;
            case 15:
                ixa ixaVar = (ixa) this.a;
                if (ixaVar.g) {
                    ((ype) ixa.a.l().ai(1517)).x("microphone timed out; no data received for %d", 2000L);
                    ixaVar.j.b("MicInputService", ouc.TIMEOUT_ERROR);
                    ixaVar.e();
                    return;
                }
                return;
            case 16:
                jbp jbpVar = (jbp) ((wyd) this.a).a;
                jbm jbmVar = jbpVar.f;
                if (jbmVar != null) {
                    int i2 = jbpVar.e - 1;
                    jbpVar.e = i2;
                    if (i2 != 0) {
                        jbp.a.l().ai(1793).w("%d services remaining", i2);
                        return;
                    } else {
                        jbpVar.f = null;
                        jbmVar.a();
                        return;
                    }
                }
                return;
            case 17:
                jov jovVar = (jov) this.a;
                if (!jovVar.c.compareAndSet(false, true)) {
                    ((ype) jov.a.l().ai((char) 2550)).u("Already started, skip starting again.");
                    return;
                }
                ((ype) ((ype) jov.a.f()).ai((char) 2549)).u("MTMC byte counting started.");
                jovVar.f = SystemClock.elapsedRealtime();
                jovVar.d.set(0L);
                jovVar.e.set(0L);
                return;
            case 18:
                ((jdc) this.a).b();
                return;
            case 19:
                Runnable runnable = ((jfn) this.a).a;
                yph yphVar5 = jfp.a;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    ((ype) ((ype) ((ype) jfp.a.g()).p(th2)).ai((char) 2000)).u("Error occurred in periodic task.");
                    new sss(Looper.getMainLooper(), (byte[]) null).post(new ire(th2, 16));
                    throw new jfo(th2);
                }
            default:
                Process.setThreadPriority(-10);
                this.a.run();
                return;
        }
    }

    public /* synthetic */ imt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
