package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarInfo;
import j$.time.Duration;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ipw extends Thread implements ipu {
    private static final Duration m = Duration.ofMillis(500);
    private static final Duration n = Duration.ofMillis(500);
    private long A;
    private boolean B;
    private boolean C;
    private final AtomicInteger D;
    private final boolean E;
    private final boolean F;
    private final irc G;
    private volatile boolean H;
    private boolean I;
    private final iqx J;
    private boolean K;
    private final iqc L;
    private final int M;
    private final izj N;
    public final Context a;
    public final isv b;
    public final int c;
    public final boolean d;
    public final yph e;
    public final ipt f;
    public long g;
    public volatile boolean h;
    public volatile boolean i;
    final int j;
    public volatile iqa k;
    public final izj l;
    private final ipz o;
    private final jev p;
    private final jew q;
    private final iqk r;
    private final CarAudioConfiguration s;
    private final jat t;
    private final itk u;
    private final jfg v;
    private final Handler w;
    private final AtomicInteger x;
    private final AtomicReference y;
    private boolean z;

    public ipw(iqc iqcVar, Context context, ipz ipzVar, jev jevVar, jew jewVar, jes jesVar, iqk iqkVar, isv isvVar, int i, String str, CarAudioConfiguration carAudioConfiguration, boolean z, jdh jdhVar, jat jatVar, itk itkVar, jfg jfgVar, iqx iqxVar, izj izjVar, AtomicInteger atomicInteger, AtomicReference atomicReference, izj izjVar2) {
        super("AudioCapture-".concat(str));
        this.z = false;
        this.g = 0L;
        this.h = false;
        this.i = false;
        this.K = true;
        this.L = iqcVar;
        this.a = jfj.c(context);
        this.o = ipzVar;
        this.p = jevVar;
        this.q = jewVar;
        this.r = iqkVar;
        this.b = isvVar;
        this.c = i;
        this.s = carAudioConfiguration;
        this.d = z;
        this.t = jatVar;
        this.u = itkVar;
        this.v = jfgVar;
        this.J = iqxVar;
        this.e = new yph(yqn.d("CAR.AUDIO.".concat(str)));
        this.l = izjVar;
        this.f = new ipt(epq.i(carAudioConfiguration), jdhVar);
        this.x = atomicInteger;
        this.y = atomicReference;
        acmj acmjVar = acmj.a;
        abru abruVarL = acmjVar.gu().l();
        CarInfo carInfoT = jesVar.t();
        carInfoT.getClass();
        if (abruVarL.b.isEmpty()) {
            this.E = false;
        } else {
            yph yphVar = kjf.a;
            Stream streamD = tgx.d(new ilq(17), abruVarL);
            int i2 = yfq.d;
            this.E = kjf.h(carInfoT, (yfq) streamD.collect(ycm.a));
        }
        boolean z2 = acmjVar.gu().n() && carInfoT.e >= 5;
        this.F = z2;
        this.G = new irc(carInfoT, i, jewVar, z2);
        if (i == 3) {
            this.j = 0;
            this.D = new AtomicInteger(75);
            this.M = 2;
        } else {
            this.j = (int) (carAudioConfiguration.a == 16000 ? acmjVar.gu().h() : acmj.j());
            this.D = new AtomicInteger(3);
            this.M = carAudioConfiguration.a != 16000 ? 4 : 3;
        }
        this.N = izjVar2;
        this.w = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0744  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 2256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipw.f():void");
    }

    private final void g(long j) {
        long jF;
        boolean z;
        long jMin;
        if (this.i) {
            ipt iptVar = this.f;
            int iA = iptVar.a();
            if (this.K) {
                jfg jfgVar = this.v;
                rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, this.c == 3 ? yzz.AUDIO_STREAM_DIAGNOSTICS_MEDIA : yzz.AUDIO_STREAM_DIAGNOSTICS_GUIDANCE, yzy.xx);
                rrbVarH.w(iA);
                jfgVar.b(rrbVarH.l());
                this.K = false;
            }
            if (iA == 0) {
                if (!this.z) {
                    return;
                } else {
                    iA = 0;
                }
            }
            if (iA > 0) {
                ((ype) this.e.l().ai(1057)).w("System sound capture Q has %d entries", iA);
            }
            if (this.z) {
                if (acmj.q()) {
                    irc ircVar = this.G;
                    long j2 = this.g;
                    jew jewVar = ircVar.a;
                    long jD = (jewVar.bs() && jewVar.h() == 2) ? ircVar.f ? ircVar.e : ircVar.c ? ircVar.b ? acmj.d() : acmj.k() : ircVar.b ? acmj.g() : acmj.h() : ircVar.b ? acmj.e() : acmj.f();
                    float f = true != ircVar.b ? 15.625f : 23.4375f;
                    tmb tmbVar = ircVar.d;
                    jMin = Math.min(jD, (int) ((((SystemClock.elapsedRealtime() - j2) / 1000.0d) * f) - 0.5d));
                } else {
                    int i = this.c;
                    jew jewVar2 = this.q;
                    if (jewVar2.bs() && jewVar2.h() == 2) {
                        if (this.E) {
                            if (i == 3) {
                                jF = acmj.b();
                                z = true;
                            } else {
                                jF = acmj.c();
                                z = false;
                            }
                        } else if (this.F) {
                            if (i == 3) {
                                jF = acmj.d();
                                z = true;
                            } else {
                                jF = acmj.k();
                                z = false;
                            }
                        } else if (i == 3) {
                            jF = acmj.g();
                            z = true;
                        } else {
                            jF = acmj.h();
                            z = false;
                        }
                    } else if (i == 3) {
                        jF = acmj.e();
                        z = true;
                    } else {
                        jF = acmj.f();
                        z = false;
                    }
                    jMin = Math.min(jF, (int) ((((SystemClock.elapsedRealtime() - this.g) / 1000.0d) * (true != z ? 15.625f : 23.4375f)) - 0.5d));
                }
                this.A = jMin;
                if (iptVar.a() < this.A) {
                    iqa iqaVar = this.k;
                    iqaVar.getClass();
                    ipr iprVarC = iptVar.c();
                    long jElapsedRealtimeNanos = iprVarC != null ? iprVarC.a : j != -1 ? j : SystemClock.elapsedRealtimeNanos() / 1000;
                    for (long jA = this.A - iptVar.a(); jA > 0; jA--) {
                        ipr iprVarB = iptVar.b();
                        iprVarB.b = jElapsedRealtimeNanos / 1000;
                        iprVarB.a = jElapsedRealtimeNanos;
                        int iA2 = iprVarB.a();
                        Arrays.fill(iprVarB.h.array(), iA2, iprVarB.b() + iA2, (byte) 0);
                        iqaVar.l(iprVarB);
                        this.g = SystemClock.elapsedRealtime();
                    }
                }
                this.z = false;
            }
            iqa iqaVar2 = this.k;
            iqaVar2.getClass();
            for (ipr iprVarD = iptVar.d(); iprVarD != null; iprVarD = iptVar.d()) {
                iqaVar2.l(iprVarD);
                this.g = SystemClock.elapsedRealtime();
            }
        }
    }

    @Override // defpackage.ipu
    public final void a(PrintWriter printWriter) {
        printWriter.println("AudioCaptureThread stream type: " + roc.O(this.c) + " has focus:" + this.i + " inVoiceSession:" + this.H + " allowBufferingFrames:" + this.I + " minAudioBuffers:" + this.A + " lastFrameSentMillis:" + this.g + " systemSoundCaptureQ size:" + this.f.a() + " systemSoundTxQCleanThreshold:" + this.j + " systemSoundTxStopThreshold:" + String.valueOf(this.D));
    }

    @Override // defpackage.ipu
    public final synchronized void b() {
        if (this.c == 3) {
            AtomicInteger atomicInteger = this.D;
            atomicInteger.set(75);
            ((ype) ((ype) this.e.f()).ai((char) 1050)).w("Voice session ended. New silence threshold: %d", atomicInteger.get());
            this.H = false;
        }
    }

    @Override // defpackage.ipu
    public final synchronized void c() {
        if (this.c == 3) {
            AtomicInteger atomicInteger = this.D;
            boolean zCompareAndSet = atomicInteger.compareAndSet(75, 3);
            yph yphVar = this.e;
            if (zCompareAndSet) {
                ((ype) ((ype) yphVar.f()).ai((char) 1051)).w("Voice session starting. New silence threshold: %d", atomicInteger.get());
            } else {
                ((ype) ((ype) yphVar.h()).ai((char) 1052)).w("Unexpected threshold: %d", atomicInteger.get());
            }
            if (!this.d) {
                this.H = true;
                this.x.set(2);
            }
        }
    }

    public final itf d(int i, int i2) throws isu, RemoteException, ist {
        boolean zC = spu.c();
        yph yphVar = this.e;
        if (zC) {
            ((ype) ((ype) yphVar.f()).ai((char) 1049)).u("Mixing media and guidance audio on Q+");
            return this.b.b(i2);
        }
        ((ype) ((ype) yphVar.f()).ai((char) 1058)).u("Set up fixed volume capture in P and below");
        this.b.d();
        itf itfVarB = this.u.b(i, i2);
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        audioManager.getClass();
        boolean zIsStreamMute = audioManager.isStreamMute(3);
        this.B = zIsStreamMute;
        if (zIsStreamMute) {
            audioManager.adjustStreamVolume(3, 100, 0);
        }
        return itfVarB;
    }

    public final void e(itf itfVar) {
        try {
            itfVar.c();
        } catch (RemoteException | IOException e) {
            this.v.e(yzz.AUDIO_SERVICE_MIGRATION, yzy.yu);
            ((ype) ((ype) ((ype) this.e.h()).p(e)).ai((char) 1053)).u("Failure stopping and releasing remote audio record; ignoring due to shutdown.");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        yph yphVar = irb.a;
        try {
            CountDownLatch countDownLatch = irb.c;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            ((ype) ((ype) ((ype) irb.a.g()).p(e)).ai((char) 1211)).u("Interrupted waiting for JNI to load");
        }
        Process.setThreadPriority(-19);
        try {
            f();
            ((ype) ((ype) this.e.f()).ai((char) 1055)).u("Clearing system capture queue since audio capture thread is quitting");
            this.f.f();
            this.t.u(false);
        } catch (Throwable th) {
            ((ype) ((ype) this.e.f()).ai((char) 1056)).u("Clearing system capture queue since audio capture thread is quitting");
            this.f.f();
            this.t.u(false);
            throw th;
        }
    }
}
