package defpackage;

import android.content.Context;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.MediaOptions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.time.Instant;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class iqa implements iyw {
    public final imf A;
    public final boolean B;
    public boolean C;
    public final iru D;
    public final int E;
    private final String F;
    private final int G;
    private final ipr H;
    private final isw K;
    private final irx O;
    private final boolean P;
    private iqc R;
    private final irk S;
    public final yph a;
    public final iqk b;
    public final int c;
    public final int d;
    public final int e;
    public final xkj f;
    public final Duration g;
    public jch i;
    public iqp j;
    ipt k;
    public volatile ipx l;
    public volatile ipy n;
    public final Context q;
    public final ikz r;
    public final int[] s;
    public final boolean u;
    public final jci w;
    public final irj x;
    public final CarInfo y;
    public final boolean z;
    private int T = 1;
    public boolean h = true;
    public final Object m = new Object();
    public volatile boolean o = false;
    private volatile boolean I = false;
    public final AtomicBoolean p = new AtomicBoolean(false);
    private volatile boolean J = false;
    public long t = -1;
    private final Semaphore L = new Semaphore(0);
    public final Object v = new Object();
    private int M = Alert.DURATION_SHOW_INDEFINITELY;
    private int N = Alert.DURATION_SHOW_INDEFINITELY;
    private final AtomicReference Q = new AtomicReference();

    public iqa(Context context, iqk iqkVar, ikz ikzVar, int i, int i2, CarAudioConfiguration carAudioConfiguration, xkj xkjVar, jci jciVar, iru iruVar, irx irxVar, irk irkVar, irj irjVar, isw iswVar, CarInfo carInfo, boolean z, boolean z2, imf imfVar) {
        this.q = context;
        this.b = iqkVar;
        this.r = ikzVar;
        this.c = i;
        String strO = roc.O(i);
        this.F = strO;
        this.a = new yph(yqn.d("CAR.AUDIO.".concat(strO)));
        this.d = i2;
        this.w = jciVar;
        this.D = iruVar;
        this.O = irxVar;
        this.S = irkVar;
        this.x = irjVar;
        this.K = iswVar;
        this.A = imfVar;
        int i3 = i == 3 ? 2 : carAudioConfiguration.a == 16000 ? 3 : 4;
        this.E = i3;
        this.f = xkjVar;
        int i4 = i3 == 3 ? 16000 : 48000;
        this.G = i4;
        int i5 = 1024;
        if (!itb.a(xkjVar) && i4 != 16000) {
            i5 = 2048;
        }
        this.g = Duration.ofNanos((long) (i5 * (1.0E9f / i4)));
        int i6 = epq.i(carAudioConfiguration);
        this.e = i6;
        this.H = new ipr(i6, new iqo(1));
        this.B = acmx.a.gu().g();
        boolean z3 = ikzVar.c.getBoolean("car_enable_audio_latency_dump", false);
        this.u = z3;
        this.s = z3 ? new int[256] : null;
        this.y = carInfo;
        this.P = z;
        this.z = z2;
    }

    private final void A() {
        this.K.a();
        ipt iptVar = this.k;
        if (iptVar != null) {
            ((ype) this.a.l().ai(1073)).u("clearing client queue in bottom half");
            iptVar.f();
        }
        iqp iqpVar = this.j;
        if (iqpVar != null) {
            ((ype) ((ype) this.a.f()).ai((char) 1072)).u("clearing transmission queue in bottom half");
            iqpVar.d.f();
        }
    }

    @ResultIgnorabilityUnspecified
    private final boolean B(ipr iprVar) {
        iqp iqpVar = this.j;
        ipt iptVar = iqpVar != null ? iqpVar.d : null;
        if (iptVar == null) {
            ((ype) ((ype) this.a.h()).ai((char) 1064)).u("Drop frame during resampling because transmission queue is null");
            return false;
        }
        int i = this.T;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            int i3 = this.E;
            if (i3 == 3) {
                return this.K.d(iptVar, iprVar);
            }
            if (i3 == 4) {
                isw.g(iptVar, iprVar);
                return true;
            }
        } else {
            if (i2 == 2) {
                this.K.f(iptVar, iprVar);
                return true;
            }
            if (i2 == 3) {
                int i4 = this.E;
                if (i4 == 3) {
                    return this.K.c(iptVar, iprVar);
                }
                if (i4 == 2) {
                    this.K.e(iptVar, iprVar);
                    return true;
                }
            }
        }
        throw new IllegalArgumentException("Client audio format: " + eee.m(i) + ", Protocol audio format: " + eee.m(this.E));
    }

    private final void C(iqc iqcVar) {
        if (iqcVar == null) {
            if (this.B) {
                if (this.l == null) {
                    throw new NullPointerException("audioFrameProcessor is null");
                }
            } else if (this.j == null) {
                throw new NullPointerException("transmissionHandler is null");
            }
            throw new NullPointerException("client is null");
        }
    }

    private static String D(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "48k-mono" : "16k-mono" : "48k-stereo";
    }

    private final ipr y() {
        ipt iptVar = this.k;
        if (iptVar == null) {
            return null;
        }
        ipr iprVarB = iptVar.b();
        int iA = iprVarB.a();
        Arrays.fill(iprVarB.h.array(), iA, iprVarB.b() + iA, (byte) 0);
        return iprVarB;
    }

    private final void z(boolean z) {
        this.L.release();
        if (z) {
            iql iqlVar = ((iqn) this.b).d;
            iqlVar.getClass();
            iqlVar.a(0L);
        }
    }

    public final ipr a() {
        if (this.B) {
            ipx ipxVar = this.l;
            return ipxVar != null ? ipxVar.a() : this.H;
        }
        if (this.J) {
            ipt iptVar = this.k;
            return iptVar != null ? iptVar.b() : this.H;
        }
        iqp iqpVar = this.j;
        ipt iptVar2 = iqpVar != null ? iqpVar.d : null;
        return iptVar2 != null ? iptVar2.b() : this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    @Override // defpackage.iyw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.jbj b(defpackage.jbn r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqa.b(jbn):jbj");
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    public final MediaOptions e() {
        return (MediaOptions) this.Q.get();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|57|13|(2:(1:16)|(1:18)(1:19))(8:20|(2:(2:25|(3:27|(1:33)|34))|35)|45|63|46|50|51|52)|(8:37|38|59|39|(1:44)|50|51|52)|45|63|46|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
    
        ((defpackage.ype) ((defpackage.ype) r6.a.l().p(r9)).ai(1066)).u("stopWaitSemaphore interrupted");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r7, boolean r8, defpackage.ipx r9) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqa.f(boolean, boolean, ipx):void");
    }

    public final void g(ouo ouoVar) {
        x(ouoVar, w());
    }

    public final void h(oui ouiVar) {
        this.D.w("AudioSourceServiceBottomHalf", ouiVar);
    }

    public final synchronized void i() {
        notifyAll();
    }

    public final void j() {
        ipx ipxVar;
        g(ouo.AUDIO_BOTTOM_HALF_CAR_NOT_READY);
        synchronized (this.m) {
            if (this.o) {
                this.o = false;
                iqc iqcVar = this.R;
                iqp iqpVar = this.j;
                this.n = null;
                if (this.B) {
                    ipxVar = this.l;
                    this.l = null;
                } else {
                    ipxVar = null;
                }
                if (iqcVar != null) {
                    g(ouo.AUDIO_BOTTOM_HALF_DISABLED);
                    if (!this.B || ipxVar == null) {
                        f(false, false, null);
                    } else {
                        f(false, false, ipxVar);
                    }
                }
                boolean z = this.B;
                if (z && ipxVar != null) {
                    ipxVar.d();
                }
                if (iqpVar != null) {
                    iqpVar.c();
                    if (!z) {
                        A();
                    }
                }
                synchronized (this.m) {
                    iqk iqkVar = this.b;
                    int i = this.c;
                    ((ype) ((ype) iqn.a.f()).ai((char) 1126)).y("Mark stream not ready: %s", roc.O(i));
                    yph yphVar = irb.a;
                    int iAc = a.ac(i);
                    synchronized (((iqn) iqkVar).b) {
                        int[] iArr = ((iqn) iqkVar).c;
                        iArr[iAc] = iArr[iAc] & (-2);
                    }
                    ((iqn) iqkVar).e.g(xhj.AUDIO_FOCUS_STATE_INVALID);
                }
            }
        }
    }

    public final void k(boolean z) {
        ipx ipxVar;
        if (this.B) {
            synchronized (this.m) {
                ipxVar = this.l;
                this.l = null;
            }
            if (ipxVar != null) {
                ipxVar.d();
            }
        } else {
            A();
        }
        z(z);
    }

    public final void l(ipr iprVar) {
        boolean z;
        ipy ipyVar = this.n;
        if (ipyVar != null) {
            synchronized (ipyVar.c) {
                z = ipyVar.e;
                if (z && ipyVar.d <= ipyVar.b) {
                    z = false;
                    ipyVar.e = false;
                }
                if (ipyVar.d + 1 > ipyVar.a) {
                    ipyVar.e = true;
                    z = true;
                }
            }
            if (z) {
                ((ype) ((ype) ((ype) this.a.h()).l(500, TimeUnit.MILLISECONDS)).ai(1077)).u("Dropping frame due to sender queue overflow");
                h(oui.AUDIO_BOTTOM_HALF_SENDER_QUEUE_OVERFLOW);
                return;
            }
        }
        iprVar.c = SystemClock.elapsedRealtime();
        if (this.B) {
            ipx ipxVar = this.l;
            if (ipxVar != null) {
                ipxVar.c(iprVar);
                return;
            } else {
                ((ype) ((ype) this.a.h()).ai((char) 1076)).u("Drop frame because audioFrameProcessor is null");
                h(oui.AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE);
                return;
            }
        }
        iqp iqpVar = this.j;
        if (iqpVar == null) {
            ((ype) ((ype) this.a.h()).ai((char) 1075)).u("Drop frame because transmissionHandler is null");
            h(oui.AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE);
        } else if (!this.J) {
            iqpVar.b(iprVar);
        } else if (B(iprVar)) {
            iqpVar.e();
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        String strD = D(this.E);
        int i = jdk.k;
        printWriter.println("stream type:" + this.F + " protocolAudioFormat:" + strD + " codec type:" + roc.o(this.f) + " channel used:" + this.I + " needs resampling:" + this.J + " client audio format:" + D(this.T) + " acklessAudio:" + this.z + " maxHuAudioBufferMs:" + this.M + " maxHuAudioBufferFrames:" + this.N);
        if (!this.B) {
            iqp iqpVar = this.j;
            if (iqpVar != null) {
                iqpVar.a(printWriter);
            }
        } else if (this.l != null) {
            this.l.b(printWriter);
        }
        jch jchVar = this.i;
        if (jchVar != null) {
            printWriter.print("session id=");
            printWriter.println(jchVar.f);
            jchVar.i.b(printWriter);
        }
        this.D.t(printWriter);
        if (!this.u) {
            return;
        }
        printWriter.println("Latency histogram: latency frequency");
        int i2 = 0;
        while (true) {
            int[] iArr = this.s;
            iArr.getClass();
            if (i2 >= 256) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 > 0) {
                printWriter.println(i2 + " " + i3);
            }
            i2++;
        }
    }

    public final void n(MediaOptions mediaOptions) {
        this.Q.set(mediaOptions);
    }

    public final void o(long j, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.p.get()) {
            ((ype) ((ype) this.a.f()).ai(1085)).x("wait for stream to stop. timeout: %d", j);
            synchronized (this) {
                try {
                    wait(j);
                } catch (InterruptedException e) {
                    ((ype) ((ype) ((ype) this.a.h()).p(e)).ai(1086)).u("Interrupted while waiting");
                }
            }
        }
        yph yphVar = this.a;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        ((ype) ((ype) yphVar.f()).ai(1083)).x("Stream stopped after %d ms", jElapsedRealtime2);
        long j2 = j - jElapsedRealtime2;
        if (!z || j2 <= 0) {
            return;
        }
        jch jchVar = this.i;
        jchVar.getClass();
        if (jchVar.z()) {
            ((ype) ((ype) yphVar.f()).ai(1084)).x("Stream will wait for full ACK %d ms", j2);
            jch jchVar2 = this.i;
            zeq zeqVar = jchVar2.c;
            Instant instantPlusMillis = Instant.now().plusMillis(j2);
            Duration durationOfMillis = Duration.ofMillis(j2);
            while (jchVar2.z() && a.X(durationOfMillis)) {
                Instant instantPlus = Instant.now().plus(durationOfMillis);
                Object obj = jchVar2.a;
                synchronized (obj) {
                    Duration durationBetween = durationOfMillis;
                    while (jchVar2.d && a.X(durationBetween)) {
                        try {
                            obj.wait(durationBetween.toMillis());
                        } catch (InterruptedException e2) {
                            jchVar2.b.h().p(e2).ai(1877).u("Thread interrupted while waiting for STOP message");
                        }
                        zeq zeqVar2 = jchVar2.c;
                        durationBetween = Duration.between(Instant.now(), instantPlus);
                    }
                    if (jchVar2.d) {
                        jchVar2.b.h().ai(1876).x("Waiting for STOP message timed out after %s ms", durationOfMillis.toMillis());
                    } else {
                        jchVar2.b.f().ai(1875).x("Received STOP message after %s ms", durationOfMillis.minus(durationBetween).toMillis());
                    }
                }
                zeq zeqVar3 = jchVar2.c;
                Duration durationBetween2 = Duration.between(Instant.now(), instantPlusMillis);
                Instant instantNow = Instant.now();
                Instant instantPlus2 = instantNow.plus(durationBetween2);
                Duration durationI = jchVar2.i(instantNow);
                Duration durationBetween3 = durationBetween2;
                while (a.X(durationI) && a.X(durationBetween3)) {
                    try {
                        wub.ar((Duration) ysi.k(durationI, durationBetween3));
                    } catch (InterruptedException e3) {
                        jchVar2.b.h().p(e3).ai(1872).u("Thread interrupted while waiting for audio buffer to drain");
                    }
                    zeq zeqVar4 = jchVar2.c;
                    Instant instantNow2 = Instant.now();
                    durationBetween3 = Duration.between(instantNow2, instantPlus2);
                    durationI = jchVar2.i(instantNow2);
                }
                if (a.X(durationI)) {
                    jchVar2.b.h().ai(1871).G("Audio buffer did not drain after %s ms, remaining audio on headunit: %s ms", durationBetween2.minus(durationBetween3).toMillis(), durationI.toMillis());
                } else {
                    jchVar2.b.f().ai(1870).x("Audio buffer on headunit drained after %s ms", durationBetween2.minus(durationBetween3).toMillis());
                }
                zeq zeqVar5 = jchVar2.c;
                durationOfMillis = Duration.between(Instant.now(), instantPlusMillis);
            }
            if (jchVar2.z()) {
                jchVar2.b.h().ai(1874).L("Channel %s is not idle after %s ms", wub.r(jchVar2.e), j2);
            } else {
                jchVar2.b.f().ai(1873).L("Channel %s becomes idle after %s ms", wub.r(jchVar2.e), j2 - durationOfMillis.toMillis());
            }
        }
    }

    public final boolean p() {
        synchronized (this.m) {
            if (!this.o) {
                return false;
            }
            return !this.I;
        }
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        g(ouo.AUDIO_BOTTOM_HALF_END_POINT_READY);
        this.i = (jch) jbjVar;
    }

    public final boolean s() {
        synchronized (this.m) {
            if (!this.o) {
                return true;
            }
            if (this.I) {
                return false;
            }
            this.i.getClass();
            return !r3.z();
        }
    }

    public final iqc t() {
        synchronized (this.m) {
            if (!this.o || !this.I) {
                return null;
            }
            return this.R;
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean u(iqc iqcVar) {
        C(iqcVar);
        synchronized (this.m) {
            if (!p()) {
                return false;
            }
            this.I = true;
            this.R = iqcVar;
            return true;
        }
    }

    public final void v(int i) {
        int i2;
        synchronized (this.v) {
            AtomicBoolean atomicBoolean = this.p;
            if (atomicBoolean.getAndSet(true)) {
                ((ype) this.a.l().ai(1082)).u("bottom half start requested while already started");
                g(ouo.AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STARTED);
                return;
            }
            this.T = i;
            this.J = i != this.E;
            synchronized (this.m) {
                if (!this.o) {
                    ((ype) ((ype) this.a.h()).ai(1081)).u("startStream requested but car is not ready");
                    atomicBoolean.set(false);
                    return;
                }
                iqp iqpVar = this.j;
                if (iqpVar == null) {
                    ((ype) ((ype) this.a.h()).ai(1080)).u("startStream requested but transmissionHandler is null");
                    atomicBoolean.set(false);
                    return;
                }
                if (this.B) {
                    int i3 = this.T;
                    int i4 = this.E;
                    xkj xkjVar = this.f;
                    boolean z = i3 == i4;
                    if (i3 == 0) {
                        throw null;
                    }
                    ipx irfVar = (acmx.j() && !itb.a(xkjVar) && z && this.z && !this.C) ? new irf(this, this.y, this.A, this.D, this.x, this.n, this.c, this.d, this.e) : new ipq(this, this.K, i3, i4, iqpVar);
                    irfVar.e();
                    synchronized (this.m) {
                        if (!this.o) {
                            ((ype) ((ype) this.a.f()).ai(1079)).u("Car became not ready during processor startup, shutting down");
                            irfVar.d();
                            this.p.set(false);
                            return;
                        }
                        this.l = irfVar;
                    }
                } else {
                    if (this.J) {
                        this.J = true;
                        this.k = new ipt(fyh.e(this.T), new iqo(1));
                    }
                    iqp iqpVar2 = this.j;
                    if (iqpVar2 != null) {
                        iqpVar2.d();
                    }
                }
                synchronized (this.m) {
                    iqc iqcVar = this.R;
                    C(iqcVar);
                    i2 = iqcVar.c;
                }
                yph yphVar = this.a;
                if (yphVar.l().Z()) {
                    ((ype) yphVar.l().ai(1078)).R("audio stream started. resampling:%b, client stream %s, client format %s", Boolean.valueOf(this.J), roc.O(i2), D(this.T));
                }
                ouo ouoVar = ouo.AUDIO_BOTTOM_HALF_STREAMING_STARTED;
                abnp abnpVarW = w();
                yph yphVar2 = irb.a;
                ouh ouhVarM = roc.M(i2);
                abnpVarW.t();
                ouk oukVar = (ouk) abnpVarW.b;
                ouk oukVar2 = ouk.a;
                oukVar.h = ouhVarM.f;
                oukVar.b |= 32;
                int i5 = this.T;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                oug ougVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? oug.AUDIO_FORMAT_UNKNOWN : oug.MONO_48000 : oug.MONO_16000 : oug.STEREO_48000;
                abnpVarW.t();
                ouk oukVar3 = (ouk) abnpVarW.b;
                oukVar3.i = ougVar.f;
                oukVar3.b |= 64;
                iru iruVar = this.D;
                abnp abnpVarN = oup.a.n();
                abnpVarN.t();
                oup oupVar = (oup) abnpVarN.b;
                oupVar.b |= 1;
                oupVar.c = "AudioSourceServiceBottomHalf";
                abnpVarN.t();
                oup oupVar2 = (oup) abnpVarN.b;
                oupVar2.e = ouoVar.al;
                oupVar2.b |= 4;
                abnpVarN.t();
                oup oupVar3 = (oup) abnpVarN.b;
                ouk oukVar4 = (ouk) abnpVarW.q();
                oukVar4.getClass();
                oupVar3.h = oukVar4;
                oupVar3.b |= 32;
                iruVar.C(abnpVarN);
            }
        }
    }

    public final abnp w() {
        iqp iqpVar;
        abnp abnpVarN = ouk.a.n();
        boolean z = this.o;
        abnpVarN.t();
        ouk oukVar = (ouk) abnpVarN.b;
        oukVar.b |= 1;
        oukVar.c = z;
        boolean z2 = this.I;
        abnpVarN.t();
        ouk oukVar2 = (ouk) abnpVarN.b;
        oukVar2.b |= 2;
        oukVar2.d = z2;
        boolean z3 = this.p.get();
        abnpVarN.t();
        ouk oukVar3 = (ouk) abnpVarN.b;
        oukVar3.b |= 4;
        oukVar3.e = z3;
        boolean z4 = this.J;
        abnpVarN.t();
        ouk oukVar4 = (ouk) abnpVarN.b;
        oukVar4.b |= 8;
        oukVar4.f = z4;
        boolean z5 = this.K.b;
        abnpVarN.t();
        ouk oukVar5 = (ouk) abnpVarN.b;
        oukVar5.b |= 16;
        oukVar5.g = z5;
        if (!this.B && (iqpVar = this.j) != null) {
            boolean z6 = iqpVar.e;
            abnpVarN.t();
            ouk oukVar6 = (ouk) abnpVarN.b;
            oukVar6.b |= 128;
            oukVar6.j = z6;
            boolean z7 = iqpVar.f;
            abnpVarN.t();
            ouk oukVar7 = (ouk) abnpVarN.b;
            oukVar7.b |= 256;
            oukVar7.k = z7;
        }
        return abnpVarN;
    }

    public final void x(ouo ouoVar, abnp abnpVar) {
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = "AudioSourceServiceBottomHalf";
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        ouk oukVar = (ouk) abnpVar.q();
        oukVar.getClass();
        oupVar3.h = oukVar;
        oupVar3.b |= 32;
        this.D.A(abnpVarN);
    }
}
