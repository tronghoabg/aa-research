package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.audio.resampling.NativeResampler;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class qpn implements rek {
    public static final ypf a = ols.R("CAR.AUDIO");
    private final rse B;
    private final ruf C;
    private qpo D;
    private ajki F;
    private ajki G;
    private final acjs H;
    public final qpu b;
    public final int c;
    public final int d;
    public final int e;
    public final xkj f;
    public rsd g;
    public final HandlerThread h;
    public qpm i;
    public rei j;
    public final Context m;
    public final rfs n;
    public final int[] o;
    public final boolean q;
    public final int r;
    public final qrv s;
    private rei t;
    private int E = 1;
    public final Object k = new Object();
    public volatile boolean l = false;
    private volatile boolean u = false;
    private final AtomicBoolean v = new AtomicBoolean(false);
    private volatile boolean w = false;
    private boolean x = false;
    public long p = -1;
    private final Semaphore y = new Semaphore(0);
    private boolean z = false;
    private final Object A = new Object();

    public qpn(Context context, qpu qpuVar, rfs rfsVar, int i, int i2, CarAudioConfiguration carAudioConfiguration, xkj xkjVar, rse rseVar, ruf rufVar, acjs acjsVar, qrv qrvVar) {
        this.m = context;
        this.b = qpuVar;
        this.n = rfsVar;
        this.c = i;
        this.d = i2;
        this.B = rseVar;
        this.C = rufVar;
        this.H = acjsVar;
        if (i == 3) {
            this.r = 2;
        } else {
            this.r = carAudioConfiguration.a != 16000 ? 4 : 3;
        }
        this.f = xkjVar;
        this.e = roc.d(carAudioConfiguration);
        ypf ypfVar = qqv.a;
        this.h = new HandlerThread("AUDIO_BH-".concat(roc.O(i)), -19);
        boolean z = ((qst) rfsVar).b.getBoolean("car_enable_audio_latency_dump", false);
        this.q = z;
        if (z) {
            this.o = new int[256];
        } else {
            this.o = null;
        }
        this.s = qrvVar;
    }

    private final void B(boolean z, boolean z2) {
        synchronized (this.A) {
            if (!this.v.getAndSet(false)) {
                yop yopVarAi = a.l().ai(7555);
                int i = this.c;
                ypf ypfVar = qqv.a;
                yopVarAi.y("bh stop requested while already stopped %s", roc.O(i));
                ouo ouoVar = ouo.AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STOPPED;
                abnp abnpVarW = w();
                abnpVarW.t();
                ouk oukVar = (ouk) abnpVarW.b;
                ouk oukVar2 = ouk.a;
                oukVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                oukVar.l = z2;
                abnpVarW.t();
                ouk oukVar3 = (ouk) abnpVarW.b;
                oukVar3.b |= 1024;
                oukVar3.m = z;
                x(ouoVar, abnpVarW);
                this.C.k();
                return;
            }
            if (this.w && !z2 && this.F != null) {
                if (this.E == 4 && this.r == 3 && this.G == null) {
                    F(E());
                }
                F(E());
            } else if (t(this.f)) {
                a.l().ai(7554).u("Injecting extra silent buffer into AAC encoder.");
                rei reiVar = this.j;
                reiVar.getClass();
                ajki ajkiVarC = reiVar.c();
                int iD = ajkiVarC.d();
                Arrays.fill(((ByteBuffer) ajkiVarC.b).array(), iD, ajkiVarC.e() + iD, (byte) 0);
                this.j.e(ajkiVarC);
            }
            synchronized (this.k) {
                this.u = false;
                this.D = null;
            }
            qpm qpmVar = this.i;
            qpmVar.getClass();
            if (!qpmVar.d(z2, z)) {
                a.l().ai(7550).w("bh audio stream already shutting down %d", this.c);
                e(z);
                try {
                    this.y.acquire();
                } catch (InterruptedException e) {
                    a.l().p(e).ai(7551).u("stopWaitSemaphore interrupted");
                }
                ouo ouoVar2 = ouo.AUDIO_BOTTOM_HALF_STREAMING_STOPPED;
                abnp abnpVarW2 = w();
                abnpVarW2.t();
                ouk oukVar4 = (ouk) abnpVarW2.b;
                ouk oukVar5 = ouk.a;
                oukVar4.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                oukVar4.l = z2;
                abnpVarW2.t();
                ouk oukVar6 = (ouk) abnpVarW2.b;
                oukVar6.b |= 1024;
                oukVar6.m = z;
                x(ouoVar2, abnpVarW2);
                this.C.k();
            }
            yop yopVarAi2 = a.l().ai(7552);
            int i2 = this.c;
            ypf ypfVar2 = qqv.a;
            yopVarAi2.y("bh audio stream stopping %s", roc.O(i2));
            try {
                this.z |= this.y.tryAcquire(2000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                a.h().p(e2).ai(7553).u("Waiting for stream to stop but interrupted");
                h(ouo.AUDIO_BOTTOM_HALF_TIMEOUT_WAITING_FOR_STREAM_TO_STOP);
            }
            ouo ouoVar22 = ouo.AUDIO_BOTTOM_HALF_STREAMING_STOPPED;
            abnp abnpVarW22 = w();
            abnpVarW22.t();
            ouk oukVar42 = (ouk) abnpVarW22.b;
            ouk oukVar52 = ouk.a;
            oukVar42.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            oukVar42.l = z2;
            abnpVarW22.t();
            ouk oukVar62 = (ouk) abnpVarW22.b;
            oukVar62.b |= 1024;
            oukVar62.m = z;
            x(ouoVar22, abnpVarW22);
            this.C.k();
        }
    }

    private final void C(qpo qpoVar) {
        if (qpoVar == null) {
            qpm qpmVar = this.i;
            if (qpmVar == null) {
                throw new NullPointerException("transmissionHandler is null");
            }
            throw new NullPointerException("Null client " + this.z + " " + qpmVar.c + " " + uqw.ad(this.E) + " " + uqw.ad(this.r));
        }
    }

    private static String D(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "48k-mono" : "16k-mono" : "48k-stereo";
    }

    private final ajki E() {
        rei reiVar = this.t;
        reiVar.getClass();
        ajki ajkiVarC = reiVar.c();
        int iD = ajkiVarC.d();
        Arrays.fill(((ByteBuffer) ajkiVarC.b).array(), iD, ajkiVarC.e() + iD, (byte) 0);
        return ajkiVarC;
    }

    @ResultIgnorabilityUnspecified
    private final boolean F(ajki ajkiVar) {
        ajki ajkiVar2;
        try {
            vqk vqkVar = rlc.c;
            rlc.a(vqkVar);
            int i = this.E;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            boolean z = false;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int i3 = this.r;
                        if (i3 == 3) {
                            ajki ajkiVar3 = this.F;
                            if (ajkiVar3 != null && (ajkiVar2 = this.G) != null) {
                                rei reiVar = this.j;
                                reiVar.getClass();
                                ajki ajkiVarC = reiVar.c();
                                NativeResampler.native48000MonoTo16000Mono(((ByteBuffer) ajkiVar3.b).array(), ajkiVar3.d(), ((ByteBuffer) ajkiVar2.b).array(), ajkiVar2.d(), ((ByteBuffer) ajkiVar.b).array(), ajkiVar.d(), ((ByteBuffer) ajkiVarC.b).array(), ajkiVarC.d());
                                this.j.e(ajkiVarC);
                                rei reiVar2 = this.t;
                                reiVar2.getClass();
                                reiVar2.f(ajkiVar);
                                this.t.f(ajkiVar3);
                                this.t.f(ajkiVar2);
                                this.F = null;
                                this.G = null;
                            }
                            if (ajkiVar3 == null) {
                                this.F = ajkiVar;
                            } else {
                                this.G = ajkiVar;
                            }
                        } else if (i3 == 2) {
                            byte[] bArrArray = ((ByteBuffer) ajkiVar.b).array();
                            int iD = ajkiVar.d();
                            rei reiVar3 = this.j;
                            reiVar3.getClass();
                            ajki ajkiVarC2 = reiVar3.c();
                            NativeResampler.nativeMonoToStereo(bArrArray, iD, ((ByteBuffer) ajkiVarC2.b).array(), ajkiVarC2.d());
                            this.j.e(ajkiVarC2);
                            rei reiVar4 = this.t;
                            reiVar4.getClass();
                            reiVar4.f(ajkiVar);
                            this.F = null;
                        }
                    }
                    throw new IllegalArgumentException("Client audio format: " + uqw.ad(i) + ", Protocol audio format: " + uqw.ad(this.r));
                }
                if (this.x) {
                    ajki ajkiVar4 = this.F;
                    ajkiVar4.getClass();
                    rei reiVar5 = this.j;
                    reiVar5.getClass();
                    ajki ajkiVarC3 = reiVar5.c();
                    NativeResampler.native16000MonoTo48000StereoSecond(((ByteBuffer) ajkiVar.b).array(), ajkiVar.d(), ((ByteBuffer) ajkiVar4.b).array(), ajkiVar4.d(), ((ByteBuffer) ajkiVarC3.b).array(), ajkiVarC3.d());
                    this.j.e(ajkiVar4);
                    this.j.e(ajkiVarC3);
                    this.F = null;
                    this.x = false;
                } else {
                    rei reiVar6 = this.j;
                    reiVar6.getClass();
                    ajki ajkiVarC4 = reiVar6.c();
                    ajki ajkiVarC5 = this.j.c();
                    NativeResampler.native16000MonoTo48000StereoFirst(((ByteBuffer) ajkiVar.b).array(), ajkiVar.d(), ((ByteBuffer) ajkiVarC4.b).array(), ajkiVarC4.d(), ((ByteBuffer) ajkiVarC5.b).array(), ajkiVarC5.d());
                    this.j.e(ajkiVarC4);
                    this.F = ajkiVarC5;
                    this.x = true;
                }
                rei reiVar7 = this.t;
                reiVar7.getClass();
                reiVar7.f(ajkiVar);
                z = true;
            } else {
                int i4 = this.r;
                if (i4 != 3) {
                    if (i4 == 4) {
                        rei reiVar8 = this.j;
                        reiVar8.getClass();
                        ajki ajkiVarC6 = reiVar8.c();
                        NativeResampler.native48000StereoTo48000Mono(((ByteBuffer) ajkiVar.b).array(), ajkiVar.d(), ((ByteBuffer) ajkiVarC6.b).array(), ajkiVarC6.d());
                        this.j.e(ajkiVarC6);
                        rei reiVar9 = this.t;
                        reiVar9.getClass();
                        reiVar9.f(ajkiVar);
                    }
                    throw new IllegalArgumentException("Client audio format: " + uqw.ad(i) + ", Protocol audio format: " + uqw.ad(this.r));
                }
                ajki ajkiVar5 = this.F;
                if (ajkiVar5 == null) {
                    this.F = ajkiVar;
                } else {
                    byte[] bArrArray2 = ((ByteBuffer) ajkiVar5.b).array();
                    int iD2 = ajkiVar5.d();
                    byte[] bArrArray3 = ((ByteBuffer) ajkiVar.b).array();
                    int iD3 = ajkiVar.d();
                    rei reiVar10 = this.j;
                    reiVar10.getClass();
                    ajki ajkiVarC7 = reiVar10.c();
                    byte[] bArrArray4 = ((ByteBuffer) ajkiVarC7.b).array();
                    int iD4 = ajkiVarC7.d();
                    if (this.x) {
                        NativeResampler.native48000StereoTo16000MonoSecond(bArrArray2, iD2, bArrArray3, iD3, bArrArray4, iD4);
                        rei reiVar11 = this.t;
                        reiVar11.getClass();
                        reiVar11.f(ajkiVar5);
                        this.t.f(ajkiVar);
                        this.F = null;
                        this.x = false;
                    } else {
                        NativeResampler.native48000StereoTo16000MonoFirst(bArrArray2, iD2, bArrArray3, iD3, bArrArray4, iD4);
                        rei reiVar12 = this.t;
                        reiVar12.getClass();
                        reiVar12.f(ajkiVar5);
                        this.F = ajkiVar;
                        this.x = true;
                    }
                    this.j.e(ajkiVarC7);
                }
                z = true;
            }
            rlc.a(vqkVar);
            return z;
        } catch (Throwable th) {
            rlc.a(rlc.c);
            throw th;
        }
    }

    public static final boolean t(xkj xkjVar) {
        return xkjVar == xkj.MEDIA_CODEC_AUDIO_AAC_LC || xkjVar == xkj.MEDIA_CODEC_AUDIO_AAC_LC_ADTS;
    }

    @Override // defpackage.rek
    public final void A(ajki ajkiVar) {
        if (!this.w) {
            rei reiVar = this.j;
            reiVar.getClass();
            reiVar.e(ajkiVar);
        } else if (!F(ajkiVar)) {
            return;
        }
        qpm qpmVar = this.i;
        qpmVar.getClass();
        qpmVar.a();
    }

    @Override // defpackage.rek
    public final int a() {
        return this.c;
    }

    @Override // defpackage.rso
    public final /* bridge */ /* synthetic */ ruq b(rut rutVar) {
        ypf ypfVar = qqv.a;
        rse rseVar = this.B;
        return new rsd(roc.aU(this.c), this.f, this, rutVar, rseVar, this.C, this.H);
    }

    @Override // defpackage.rek
    public final xkj c() {
        return this.f;
    }

    @Override // defpackage.rek
    public final void d() {
        h(ouo.AUDIO_BOTTOM_HALF_DISABLED);
        qpo qpoVarR = r();
        if (qpoVarR != null) {
            qpoVarR.b(this);
            B(false, false);
        }
    }

    public final void e(boolean z) {
        this.y.release();
        if (z) {
            qpv qpvVar = ((qpx) this.b).e;
            qpvVar.getClass();
            qpvVar.a(0L);
        }
    }

    public final void g() {
        this.x = false;
        this.F = null;
        this.G = null;
        rei reiVar = this.t;
        if (reiVar != null) {
            reiVar.b();
        }
        rei reiVar2 = this.j;
        if (reiVar2 != null) {
            reiVar2.b();
        }
    }

    @Override // defpackage.rso
    public final void gl(PrintWriter printWriter) {
        ypf ypfVar = qqv.a;
        String strD = D(this.r);
        ypf ypfVar2 = rug.a;
        printWriter.println("stream type:" + roc.O(this.c) + " protocolAudioFormat:" + strD + " codec type:" + roc.o(this.f) + " channel used:" + this.u + " needs resampling:" + this.w + " client audio format:" + D(this.E));
        qpm qpmVar = this.i;
        if (qpmVar != null) {
            AtomicInteger atomicInteger = qpmVar.e;
            printWriter.println("packets sent since start:" + String.valueOf(qpmVar.d) + " total packets sent:" + String.valueOf(atomicInteger));
            qpn qpnVar = qpmVar.f;
            if (qpnVar.q) {
                printWriter.println("Latency histogram: latency frequency");
                int i = 0;
                while (true) {
                    int[] iArr = qpnVar.o;
                    iArr.getClass();
                    if (i >= 256) {
                        break;
                    }
                    int i2 = iArr[i];
                    if (i2 > 0) {
                        printWriter.println(i + " " + i2);
                    }
                    i++;
                }
            }
        }
        rsd rsdVar = this.g;
        if (rsdVar != null) {
            printWriter.print("session id=");
            printWriter.println(((rug) rsdVar).b);
            rsdVar.e.b(printWriter);
        }
    }

    public final void h(ouo ouoVar) {
        x(ouoVar, w());
    }

    public final void i(oui ouiVar) {
        this.C.l("AudioSourceServiceBottomHalf", ouiVar);
    }

    public final synchronized void j() {
        notify();
    }

    @Override // defpackage.rso
    public final void k() {
        this.B.j();
        m();
    }

    @Override // defpackage.rso
    public final void l(ruq ruqVar) {
        h(ouo.AUDIO_BOTTOM_HALF_END_POINT_READY);
        this.g = (rsd) ruqVar;
    }

    @Override // defpackage.rsc
    public final void m() {
        h(ouo.AUDIO_BOTTOM_HALF_CAR_NOT_READY);
        synchronized (this.k) {
            if (this.l) {
                this.l = false;
                d();
                qpm qpmVar = this.i;
                qpmVar.getClass();
                qpmVar.b();
                this.h.quitSafely();
                qpu qpuVar = this.b;
                int i = this.c;
                qpx.a.f().ai(7600).w("Mark stream not ready: %d", i);
                ypf ypfVar = qqv.a;
                int iAc = a.ac(i);
                synchronized (((qpx) qpuVar).c) {
                    int[] iArr = ((qpx) qpuVar).d;
                    iArr[iAc] = iArr[iAc] & (-2);
                }
                ((qpx) qpuVar).f.a(xhj.AUDIO_FOCUS_STATE_INVALID);
            }
        }
    }

    @Override // defpackage.rek
    public final void n(boolean z) {
        B(true, z);
    }

    @Override // defpackage.rek
    public final void o() {
        B(false, false);
    }

    @Override // defpackage.rek
    public final boolean p() {
        synchronized (this.k) {
            if (!this.l) {
                return false;
            }
            return !this.u;
        }
    }

    @Override // defpackage.rek
    public final boolean q() {
        synchronized (this.k) {
            if (!this.l) {
                return true;
            }
            if (this.u) {
                return false;
            }
            this.g.getClass();
            return !r3.k();
        }
    }

    @Override // defpackage.rek
    public final qpo r() {
        synchronized (this.k) {
            if (!this.l || !this.u) {
                return null;
            }
            return this.D;
        }
    }

    @Override // defpackage.rek
    @ResultIgnorabilityUnspecified
    public final boolean s(qpo qpoVar) {
        C(qpoVar);
        synchronized (this.k) {
            if (!p()) {
                return false;
            }
            this.u = true;
            this.D = qpoVar;
            return true;
        }
    }

    @Override // defpackage.rek
    public final void u(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.v.get()) {
            yop yopVarAi = a.l().ai(7559);
            int i = this.c;
            ypf ypfVar = qqv.a;
            yopVarAi.y("wait for stream to stop, stream type:%s", roc.O(i));
            synchronized (this) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            }
        }
        long jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (jElapsedRealtime2 > 0) {
            rsd rsdVar = this.g;
            rsdVar.getClass();
            if (rsdVar.k()) {
                a.l().ai(7558).x("will wait for full ACK %d", jElapsedRealtime2);
                rsd rsdVar2 = this.g;
                Object obj = rsdVar2.d;
                synchronized (obj) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    long j2 = jElapsedRealtime2 + jElapsedRealtime3;
                    while (rsdVar2.k() && jElapsedRealtime3 < j2) {
                        yop yopVarAi2 = rug.a.l().ai(8330);
                        rtc rtcVar = rsdVar2.o;
                        rtcVar.getClass();
                        yopVarAi2.w("waiting for ACK, ch:%d", rtcVar.a());
                        try {
                            obj.wait(j2 - jElapsedRealtime3);
                        } catch (InterruptedException unused2) {
                        }
                        jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    }
                }
                if (rsdVar2.k()) {
                    rug.a.h().ai(8329).u("Car did not give all ACKs. Just reset counter");
                    rsdVar2.i(ouo.CAR_DID_NOT_SEND_ALL_ACKS);
                    rsdVar2.e.e();
                }
            }
        }
    }

    @Override // defpackage.rek
    public final void v(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.A) {
            if (this.v.getAndSet(true)) {
                yop yopVarAi = a.l().ai(7557);
                int i6 = this.c;
                ypf ypfVar = qqv.a;
                yopVarAi.y("bh start requested while already started%s", roc.O(i6));
                h(ouo.AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STARTED);
                return;
            }
            this.E = i;
            if (i != this.r) {
                this.w = true;
                int i7 = this.E;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 1) {
                    i3 = 2;
                } else if (i8 != 3) {
                    i5 = 1024;
                    i4 = 1;
                    this.t = new rei((i5 + i5) * i4);
                } else {
                    i3 = 1;
                }
                i4 = i3;
                i5 = 2048;
                this.t = new rei((i5 + i5) * i4);
            } else {
                this.w = false;
            }
            qpm qpmVar = this.i;
            qpmVar.getClass();
            qpmVar.c();
            synchronized (this.k) {
                qpo qpoVar = this.D;
                C(qpoVar);
                i2 = qpoVar.c;
            }
            ypf ypfVar2 = a;
            if (ypfVar2.l().Z()) {
                yop yopVarAi2 = ypfVar2.l().ai(7556);
                int i9 = this.c;
                ypf ypfVar3 = qqv.a;
                yopVarAi2.S("audio stream started %s resampling:%b client stream %s client format %s", roc.O(i9), Boolean.valueOf(this.w), roc.O(i2), D(this.E));
            }
            ouo ouoVar = ouo.AUDIO_BOTTOM_HALF_STREAMING_STARTED;
            abnp abnpVarW = w();
            ypf ypfVar4 = qqv.a;
            ouh ouhVarM = roc.M(i2);
            abnpVarW.t();
            ouk oukVar = (ouk) abnpVarW.b;
            ouk oukVar2 = ouk.a;
            oukVar.h = ouhVarM.f;
            oukVar.b |= 32;
            int i10 = this.E;
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            oug ougVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? oug.AUDIO_FORMAT_UNKNOWN : oug.MONO_48000 : oug.MONO_16000 : oug.STEREO_48000;
            abnpVarW.t();
            ouk oukVar3 = (ouk) abnpVarW.b;
            oukVar3.i = ougVar.f;
            oukVar3.b |= 64;
            ruf rufVar = this.C;
            abnp abnpVarN = oup.a.n();
            abnpVarN.t();
            oup oupVar = (oup) abnpVarN.b;
            oupVar.b = 1 | oupVar.b;
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
            rufVar.p(abnpVarN);
        }
    }

    public final abnp w() {
        abnp abnpVarN = ouk.a.n();
        boolean z = this.l;
        abnpVarN.t();
        ouk oukVar = (ouk) abnpVarN.b;
        oukVar.b |= 1;
        oukVar.c = z;
        boolean z2 = this.u;
        abnpVarN.t();
        ouk oukVar2 = (ouk) abnpVarN.b;
        oukVar2.b |= 2;
        oukVar2.d = z2;
        boolean z3 = this.v.get();
        abnpVarN.t();
        ouk oukVar3 = (ouk) abnpVarN.b;
        oukVar3.b |= 4;
        oukVar3.e = z3;
        boolean z4 = this.w;
        abnpVarN.t();
        ouk oukVar4 = (ouk) abnpVarN.b;
        oukVar4.b |= 8;
        oukVar4.f = z4;
        boolean z5 = this.x;
        abnpVarN.t();
        ouk oukVar5 = (ouk) abnpVarN.b;
        oukVar5.b |= 16;
        oukVar5.g = z5;
        qpm qpmVar = this.i;
        if (qpmVar != null) {
            boolean z6 = qpmVar.a;
            abnpVarN.t();
            ouk oukVar6 = (ouk) abnpVarN.b;
            oukVar6.b |= 128;
            oukVar6.j = z6;
            boolean z7 = qpmVar.c;
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
        this.C.n(abnpVarN);
    }

    @Override // defpackage.rek
    public final ajki y() {
        if (this.w) {
            rei reiVar = this.t;
            reiVar.getClass();
            return reiVar.c();
        }
        rei reiVar2 = this.j;
        reiVar2.getClass();
        return reiVar2.c();
    }

    @Override // defpackage.rek
    public final void z(ajki ajkiVar) {
        if (this.w) {
            rei reiVar = this.t;
            reiVar.getClass();
            reiVar.f(ajkiVar);
        } else {
            rei reiVar2 = this.j;
            reiVar2.getClass();
            reiVar2.f(ajkiVar);
        }
    }
}
