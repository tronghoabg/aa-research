package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqh implements defpackage.izd {
    public final defpackage.imn A;
    public final boolean B;
    public boolean C;
    public final defpackage.isc D;
    public final int E;
    private final java.lang.String F;
    private final int G;
    private final defpackage.ipy H;
    private final defpackage.ite K;
    private final defpackage.isf O;
    private final boolean P;
    private defpackage.iqj R;
    private final defpackage.irs S;
    public final defpackage.yqm a;
    public final defpackage.iqr b;
    public final int c;
    public final int d;
    public final int e;
    public final defpackage.xlk f;
    public final j$.time.Duration g;
    public defpackage.jco i;
    public defpackage.iqx j;
    defpackage.iqa k;
    public volatile iqe l;
    public volatile iqf n;
    public final android.content.Context q;
    public final defpackage.ilj r;
    public final int[] s;
    public final boolean u;
    public final defpackage.jcp w;
    public final defpackage.irr x;
    public final com.google.android.gms.car.CarInfo y;
    public final boolean z;
    private int T = 1;
    public boolean h = true;
    public final java.lang.Object m = new java.lang.Object();
    public volatile boolean o = false;
    private volatile boolean I = false;
    public final java.util.concurrent.atomic.AtomicBoolean p = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile boolean J = false;
    public long t = -1;
    private final java.util.concurrent.Semaphore L = new java.util.concurrent.Semaphore(0);
    public final java.lang.Object v = new java.lang.Object();
    private int M = Integer.MAX_VALUE;
    private int N = Integer.MAX_VALUE;
    private final java.util.concurrent.atomic.AtomicReference Q = new java.util.concurrent.atomic.AtomicReference();

    public iqh(android.content.Context context, defpackage.iqr iqrVar, defpackage.ilj iljVar, int i, int i2, com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration, defpackage.xlk xlkVar, defpackage.jcp jcpVar, defpackage.isc iscVar, defpackage.isf isfVar, defpackage.irs irsVar, defpackage.irr irrVar, defpackage.ite iteVar, com.google.android.gms.car.CarInfo carInfo, boolean z, boolean z2, defpackage.imn imnVar) {
        this.q = context;
        this.b = iqrVar;
        this.r = iljVar;
        this.c = i;
        java.lang.String strY = defpackage.tna.Y(i);
        this.F = strY;
        this.a = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.".concat(strY)));
        this.d = i2;
        this.w = jcpVar;
        this.D = iscVar;
        this.O = isfVar;
        this.S = irsVar;
        this.x = irrVar;
        this.K = iteVar;
        this.A = imnVar;
        int i3 = 3;
        if (i == 3) {
            i3 = 2;
        } else if (carAudioConfiguration.a != 16000) {
            i3 = 4;
        }
        this.E = i3;
        this.f = xlkVar;
        this.G = defpackage.dmh.Q(i3);
        int iQ = defpackage.dmh.Q(i3);
        this.g = j$.time.Duration.ofNanos((((long) defpackage.dmh.O(xlkVar, iQ)) * 1000000000) / ((long) iQ));
        int iR = defpackage.dmh.R(carAudioConfiguration);
        this.e = iR;
        this.H = new defpackage.ipy(iR, new defpackage.iqw(1));
        this.B = defpackage.acnz.a.fF().g();
        boolean z3 = iljVar.c.getBoolean("car_enable_audio_latency_dump", false);
        this.u = z3;
        this.s = z3 ? new int[256] : null;
        this.y = carInfo;
        this.P = z;
        this.z = z2;
    }

    private final void A() {
        this.K.a();
        defpackage.iqa iqaVar = this.k;
        if (iqaVar != null) {
            ((defpackage.yqj) this.a.l().ai(1073)).u("clearing client queue in bottom half");
            iqaVar.f();
        }
        defpackage.iqx iqxVar = this.j;
        if (iqxVar != null) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai((char) 1072)).u("clearing transmission queue in bottom half");
            iqxVar.d.f();
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean B(defpackage.ipy ipyVar) {
        defpackage.iqx iqxVar = this.j;
        defpackage.iqa iqaVar = iqxVar != null ? iqxVar.d : null;
        if (iqaVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai((char) 1064)).u("Drop frame during resampling because transmission queue is null");
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
                return this.K.d(iqaVar, ipyVar);
            }
            if (i3 == 4) {
                defpackage.ite.g(iqaVar, ipyVar);
                return true;
            }
        } else {
            if (i2 == 2) {
                this.K.f(iqaVar, ipyVar);
                return true;
            }
            if (i2 == 3) {
                int i4 = this.E;
                if (i4 == 3) {
                    return this.K.c(iqaVar, ipyVar);
                }
                if (i4 == 2) {
                    this.K.e(iqaVar, ipyVar);
                    return true;
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Client audio format: " + defpackage.epv.j(i) + ", Protocol audio format: " + defpackage.epv.j(this.E));
    }

    private final void C(defpackage.iqj iqjVar) {
        if (iqjVar == null) {
            if (this.B) {
                if (this.l == null) {
                    throw new java.lang.NullPointerException("audioFrameProcessor is null");
                }
            } else if (this.j == null) {
                throw new java.lang.NullPointerException("transmissionHandler is null");
            }
            throw new java.lang.NullPointerException("client is null");
        }
    }

    private static java.lang.String D(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            return "48k-stereo";
        }
        if (i2 != 2) {
            return i2 != 3 ? "UNKNOWN" : "48k-mono";
        }
        return "16k-mono";
    }

    private final defpackage.ipy y() {
        defpackage.iqa iqaVar = this.k;
        if (iqaVar == null) {
            return null;
        }
        defpackage.ipy ipyVarB = iqaVar.b();
        int iA = ipyVarB.a();
        java.util.Arrays.fill(ipyVarB.h.array(), iA, ipyVarB.b() + iA, (byte) 0);
        return ipyVarB;
    }

    private final void z(boolean z) {
        this.L.release();
        if (z) {
            defpackage.iqs iqsVar = ((defpackage.iqu) this.b).d;
            iqsVar.getClass();
            iqsVar.a(0L);
        }
    }

    public final defpackage.ipy a() {
        if (this.B) {
            iqe iqeVar = this.l;
            return iqeVar != null ? iqeVar.a() : this.H;
        }
        if (this.J) {
            defpackage.iqa iqaVar = this.k;
            return iqaVar != null ? iqaVar.b() : this.H;
        }
        defpackage.iqx iqxVar = this.j;
        defpackage.iqa iqaVar2 = iqxVar != null ? iqxVar.d : null;
        return iqaVar2 != null ? iqaVar2.b() : this.H;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    @Override // defpackage.izd
    public final /* bridge */ /* synthetic */ defpackage.jbq b(defpackage.jbu jbuVar) {
        long jL;
        int iOrdinal;
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.h) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1063)).w("Will not create audio endpoint for %s because preferred codec is in use.", this.f.h);
            return null;
        }
        int i5 = this.c;
        defpackage.xlk xlkVar = this.f;
        int i6 = this.G;
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iBe = defpackage.tna.be(i5);
        int i7 = Integer.MAX_VALUE;
        if (defpackage.acnz.a.fF().e()) {
            defpackage.absx absxVarL = defpackage.acnl.a.fF().l();
            if (absxVarL.b.isEmpty()) {
                if (i5 == 3) {
                    jL = defpackage.acsd.a.fF().k();
                } else {
                    jL = defpackage.acsd.a.fF().l();
                }
                this.M = (int) jL;
                this.N = Integer.MAX_VALUE;
                iOrdinal = xlkVar.ordinal();
                if (iOrdinal != 0) {
                    i = this.E - 1;
                    i2 = this.M;
                    if (i != 2) {
                        this.N = (int) java.lang.Math.ceil(i2 / 42.666668f);
                    } else {
                        this.N = (int) java.lang.Math.ceil(i2 / 64.0f);
                    }
                } else if (iOrdinal != 1) {
                    i3 = this.E - 1;
                    i4 = this.M;
                    if (i3 != 2) {
                        this.N = (int) java.lang.Math.ceil(i4 / 21.333334f);
                    } else {
                        this.N = (int) java.lang.Math.ceil(i4 / 64.0f);
                    }
                } else {
                    i3 = this.E - 1;
                    i4 = this.M;
                    if (i3 != 2) {
                        this.N = (int) java.lang.Math.ceil(i4 / 21.333334f);
                    } else {
                        this.N = (int) java.lang.Math.ceil(i4 / 64.0f);
                    }
                }
                i7 = this.N;
            } else {
                com.google.android.gms.car.CarInfo carInfo = this.y;
                defpackage.yqm yqmVar2 = defpackage.kjl.a;
                j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVarL);
                int i8 = defpackage.ygw.d;
                if (!defpackage.kjl.h(carInfo, (defpackage.ygw) streamD.collect(defpackage.yds.a))) {
                    if (i5 == 3) {
                        jL = defpackage.acsd.a.fF().k();
                    } else {
                        jL = defpackage.acsd.a.fF().l();
                    }
                    this.M = (int) jL;
                    this.N = Integer.MAX_VALUE;
                    iOrdinal = xlkVar.ordinal();
                    if (iOrdinal != 0) {
                        i = this.E - 1;
                        i2 = this.M;
                        if (i != 2) {
                            this.N = (int) java.lang.Math.ceil(i2 / 42.666668f);
                        } else {
                            this.N = (int) java.lang.Math.ceil(i2 / 64.0f);
                        }
                    } else if (iOrdinal != 1 || iOrdinal == 3) {
                        i3 = this.E - 1;
                        i4 = this.M;
                        if (i3 != 2) {
                            this.N = (int) java.lang.Math.ceil(i4 / 21.333334f);
                        } else {
                            this.N = (int) java.lang.Math.ceil(i4 / 64.0f);
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai((char) 1060)).y("Unexpected media codec: %s", xlkVar.name());
                    }
                    i7 = this.N;
                }
            }
        }
        return new defpackage.jco(iBe, xlkVar, i6, i7, this, jbuVar, this.w, this.D, this.S, this.O, this.P, this.z, defpackage.zfv.INSTANCE);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    public final com.google.android.gms.car.MediaOptions e() {
        return (com.google.android.gms.car.MediaOptions) this.Q.get();
    }

    public final void f(boolean z, boolean z2, iqe iqeVar) {
        synchronized (this.v) {
            this.L.drainPermits();
            boolean zG = false;
            if (!this.p.getAndSet(false)) {
                ((defpackage.yqj) this.a.l().ai(1071)).u("bottom half stop requested while already stopped");
                defpackage.ovl ovlVar = defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STOPPED;
                defpackage.abor aborVarW = w();
                aborVarW.t();
                defpackage.ovh ovhVar = (defpackage.ovh) aborVarW.b;
                defpackage.ovh ovhVar2 = defpackage.ovh.a;
                ovhVar.b |= 512;
                ovhVar.l = z2;
                aborVarW.t();
                defpackage.ovh ovhVar3 = (defpackage.ovh) aborVarW.b;
                ovhVar3.b |= 1024;
                ovhVar3.m = z;
                x(ovlVar, aborVarW);
                this.D.u(true);
                return;
            }
            synchronized (this.m) {
                this.I = false;
                this.R = null;
            }
            try {
                if (!this.B) {
                    defpackage.iqx iqxVar = this.j;
                    if (iqxVar != null) {
                        if (!z2 && this.J) {
                            defpackage.ite iteVar = this.K;
                            if (iteVar.b) {
                                if (this.T == 4 && this.E == 3 && !iteVar.b()) {
                                    defpackage.ipy ipyVarY = y();
                                    ipyVarY.getClass();
                                    B(ipyVarY);
                                }
                                defpackage.ipy ipyVarY2 = y();
                                ipyVarY2.getClass();
                                B(ipyVarY2);
                                zG = true;
                            }
                        }
                        zG = iqxVar.g(z2, z, zG);
                    }
                    ((defpackage.yqj) this.a.l().ai(1065)).u("bottom half audio stream already shutting down");
                    z(z);
                    this.L.acquire();
                    defpackage.ovl ovlVar2 = defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_STOPPED;
                    defpackage.abor aborVarW2 = w();
                    aborVarW2.t();
                    defpackage.ovh ovhVar4 = (defpackage.ovh) aborVarW2.b;
                    defpackage.ovh ovhVar5 = defpackage.ovh.a;
                    ovhVar4.b |= 512;
                    ovhVar4.l = z2;
                    aborVarW2.t();
                    defpackage.ovh ovhVar6 = (defpackage.ovh) aborVarW2.b;
                    ovhVar6.b |= 1024;
                    ovhVar6.m = z;
                    x(ovlVar2, aborVarW2);
                    this.D.u(true);
                }
                if (iqeVar == null) {
                    iqeVar = this.l;
                }
                if (iqeVar != null) {
                    zG = iqeVar.g(z2, z);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1070)).y("Audio stream %s: audioFrameProcessor is null in doStopStreamAndRelease. Likely cleaned up by onNotReady().", this.F);
                }
                if (zG) {
                    ((defpackage.yqj) this.a.l().ai(1067)).u("bottom half audio stream stopping");
                    try {
                        if (!this.L.tryAcquire(2000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                            ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai(1068)).R("Could not stop stream %s after %s ms, stopImmediately: %s", this.F, 2000L, java.lang.Boolean.valueOf(z2));
                        }
                    } catch (java.lang.InterruptedException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.a.h()).p(e)).ai(1069)).u("Waiting for stream to stop but interrupted");
                        g(defpackage.ovl.AUDIO_BOTTOM_HALF_TIMEOUT_WAITING_FOR_STREAM_TO_STOP);
                    }
                    defpackage.ovl ovlVar3 = defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_STOPPED;
                    defpackage.abor aborVarW3 = w();
                    aborVarW3.t();
                    defpackage.ovh ovhVar7 = (defpackage.ovh) aborVarW3.b;
                    defpackage.ovh ovhVar8 = defpackage.ovh.a;
                    ovhVar7.b |= 512;
                    ovhVar7.l = z2;
                    aborVarW3.t();
                    defpackage.ovh ovhVar9 = (defpackage.ovh) aborVarW3.b;
                    ovhVar9.b |= 1024;
                    ovhVar9.m = z;
                    x(ovlVar3, aborVarW3);
                    this.D.u(true);
                }
                this.L.acquire();
            } catch (java.lang.InterruptedException e2) {
                ((defpackage.yqj) ((defpackage.yqj) this.a.l().p(e2)).ai(1066)).u("stopWaitSemaphore interrupted");
            }
            ((defpackage.yqj) this.a.l().ai(1065)).u("bottom half audio stream already shutting down");
            z(z);
            defpackage.ovl ovlVar4 = defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_STOPPED;
            defpackage.abor aborVarW4 = w();
            aborVarW4.t();
            defpackage.ovh ovhVar10 = (defpackage.ovh) aborVarW4.b;
            defpackage.ovh ovhVar11 = defpackage.ovh.a;
            ovhVar10.b |= 512;
            ovhVar10.l = z2;
            aborVarW4.t();
            defpackage.ovh ovhVar12 = (defpackage.ovh) aborVarW4.b;
            ovhVar12.b |= 1024;
            ovhVar12.m = z;
            x(ovlVar4, aborVarW4);
            this.D.u(true);
        }
    }

    public final void g(defpackage.ovl ovlVar) {
        x(ovlVar, w());
    }

    public final void h(defpackage.ovf ovfVar) {
        this.D.w("AudioSourceServiceBottomHalf", ovfVar);
    }

    public final synchronized void i() {
        notifyAll();
    }

    public final void j() {
        iqe iqeVar;
        g(defpackage.ovl.AUDIO_BOTTOM_HALF_CAR_NOT_READY);
        synchronized (this.m) {
            if (this.o) {
                this.o = false;
                defpackage.iqj iqjVar = this.R;
                defpackage.iqx iqxVar = this.j;
                this.n = null;
                if (this.B) {
                    iqeVar = this.l;
                    this.l = null;
                } else {
                    iqeVar = null;
                }
                if (iqjVar != null) {
                    g(defpackage.ovl.AUDIO_BOTTOM_HALF_DISABLED);
                    if (!this.B || iqeVar == null) {
                        f(false, false, null);
                    } else {
                        f(false, false, iqeVar);
                    }
                }
                boolean z = this.B;
                if (z && iqeVar != null) {
                    iqeVar.d();
                }
                if (iqxVar != null) {
                    iqxVar.c();
                    if (!z) {
                        A();
                    }
                }
                synchronized (this.m) {
                    defpackage.iqr iqrVar = this.b;
                    int i = this.c;
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iqu.a.f()).ai((char) 1126)).y("Mark stream not ready: %s", defpackage.tna.Y(i));
                    defpackage.yqm yqmVar = defpackage.irk.a;
                    int iAb = defpackage.a.ab(i);
                    synchronized (((defpackage.iqu) iqrVar).b) {
                        int[] iArr = ((defpackage.iqu) iqrVar).c;
                        iArr[iAb] = iArr[iAb] & (-2);
                    }
                    ((defpackage.iqu) iqrVar).e.g(defpackage.xik.AUDIO_FOCUS_STATE_INVALID);
                }
            }
        }
    }

    public final void k(boolean z) {
        iqe iqeVar;
        if (this.B) {
            synchronized (this.m) {
                iqeVar = this.l;
                this.l = null;
            }
            if (iqeVar != null) {
                iqeVar.d();
            }
        } else {
            A();
        }
        z(z);
    }

    public final void l(defpackage.ipy ipyVar) {
        boolean z;
        iqf iqfVar = this.n;
        if (iqfVar != null) {
            synchronized (iqfVar.c) {
                z = iqfVar.e;
                if (z && iqfVar.d <= iqfVar.b) {
                    z = false;
                    iqfVar.e = false;
                }
                if (iqfVar.d + 1 > iqfVar.a) {
                    iqfVar.e = true;
                    z = true;
                }
            }
            if (z) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.a.h()).l(500, java.util.concurrent.TimeUnit.MILLISECONDS)).ai(1077)).u("Dropping frame due to sender queue overflow");
                h(defpackage.ovf.AUDIO_BOTTOM_HALF_SENDER_QUEUE_OVERFLOW);
                return;
            }
        }
        ipyVar.c = android.os.SystemClock.elapsedRealtime();
        if (this.B) {
            iqe iqeVar = this.l;
            if (iqeVar != null) {
                iqeVar.c(ipyVar);
                return;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai((char) 1076)).u("Drop frame because audioFrameProcessor is null");
                h(defpackage.ovf.AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE);
                return;
            }
        }
        defpackage.iqx iqxVar = this.j;
        if (iqxVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai((char) 1075)).u("Drop frame because transmissionHandler is null");
            h(defpackage.ovf.AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE);
        } else if (!this.J) {
            iqxVar.b(ipyVar);
        } else if (B(ipyVar)) {
            iqxVar.e();
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        java.lang.String strD = D(this.E);
        int i = defpackage.jdr.k;
        printWriter.println("stream type:" + this.F + " protocolAudioFormat:" + strD + " codec type:" + defpackage.tna.y(this.f) + " channel used:" + this.I + " needs resampling:" + this.J + " client audio format:" + D(this.T) + " acklessAudio:" + this.z + " maxHuAudioBufferMs:" + this.M + " maxHuAudioBufferFrames:" + this.N);
        if (!this.B) {
            defpackage.iqx iqxVar = this.j;
            if (iqxVar != null) {
                iqxVar.a(printWriter);
            }
        } else if (this.l != null) {
            this.l.b(printWriter);
        }
        defpackage.jco jcoVar = this.i;
        if (jcoVar != null) {
            printWriter.print("session id=");
            printWriter.println(jcoVar.f);
            jcoVar.i.b(printWriter);
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

    public final void n(com.google.android.gms.car.MediaOptions mediaOptions) {
        this.Q.set(mediaOptions);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public final void o(long j, boolean z) throws xzp {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.p.get()) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1085)).x("wait for stream to stop. timeout: %d", j);
            synchronized (this) {
                try {
                    wait(j);
                } catch (java.lang.InterruptedException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.a.h()).p(e)).ai(1086)).u("Interrupted while waiting");
                }
            }
        }
        defpackage.yqm yqmVar = this.a;
        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1083)).x("Stream stopped after %d ms", jElapsedRealtime2);
        long j2 = j - jElapsedRealtime2;
        if (!z || j2 <= 0) {
            return;
        }
        defpackage.jco jcoVar = this.i;
        jcoVar.getClass();
        if (jcoVar.y()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1084)).x("Stream will wait for full ACK %d ms", j2);
            defpackage.jco jcoVar2 = this.i;
            defpackage.zfw zfwVar = jcoVar2.c;
            j$.time.Instant instantPlusMillis = j$.time.Instant.now().plusMillis(j2);
            j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(j2);
            while (jcoVar2.y() && defpackage.a.W(durationOfMillis)) {
                j$.time.Instant instantPlus = j$.time.Instant.now().plus(durationOfMillis);
                java.lang.Object obj = jcoVar2.a;
                synchronized (obj) {
                    j$.time.Duration durationBetween = durationOfMillis;
                    while (jcoVar2.d && defpackage.a.W(durationBetween)) {
                        try {
                            obj.wait(durationBetween.toMillis());
                        } catch (java.lang.InterruptedException e2) {
                            jcoVar2.b.h().p(e2).ai(1877).u("Thread interrupted while waiting for STOP message");
                        }
                        defpackage.zfw zfwVar2 = jcoVar2.c;
                        durationBetween = j$.time.Duration.between(j$.time.Instant.now(), instantPlus);
                    }
                    if (jcoVar2.d) {
                        jcoVar2.b.h().ai(1876).x("Waiting for STOP message timed out after %s ms", durationOfMillis.toMillis());
                    } else {
                        jcoVar2.b.f().ai(1875).x("Received STOP message after %s ms", durationOfMillis.minus(durationBetween).toMillis());
                    }
                }
                defpackage.zfw zfwVar3 = jcoVar2.c;
                j$.time.Duration durationBetween2 = j$.time.Duration.between(j$.time.Instant.now(), instantPlusMillis);
                j$.time.Instant instantNow = j$.time.Instant.now();
                j$.time.Instant instantPlus2 = instantNow.plus(durationBetween2);
                j$.time.Duration durationI = jcoVar2.i(instantNow);
                j$.time.Duration durationBetween3 = durationBetween2;
                while (defpackage.a.W(durationI) && defpackage.a.W(durationBetween3)) {
                    try {
                        defpackage.ysr.cI(defpackage.wpu.w(durationI, durationBetween3));
                    } catch (java.lang.InterruptedException e3) {
                        jcoVar2.b.h().p(e3).ai(1872).u("Thread interrupted while waiting for audio buffer to drain");
                    }
                    defpackage.zfw zfwVar4 = jcoVar2.c;
                    j$.time.Instant instantNow2 = j$.time.Instant.now();
                    durationBetween3 = j$.time.Duration.between(instantNow2, instantPlus2);
                    durationI = jcoVar2.i(instantNow2);
                }
                if (defpackage.a.W(durationI)) {
                    jcoVar2.b.h().ai(1871).G("Audio buffer did not drain after %s ms, remaining audio on headunit: %s ms", durationBetween2.minus(durationBetween3).toMillis(), durationI.toMillis());
                } else {
                    jcoVar2.b.f().ai(1870).x("Audio buffer on headunit drained after %s ms", durationBetween2.minus(durationBetween3).toMillis());
                }
                defpackage.zfw zfwVar5 = jcoVar2.c;
                durationOfMillis = j$.time.Duration.between(j$.time.Instant.now(), instantPlusMillis);
            }
            if (jcoVar2.y()) {
                jcoVar2.b.h().ai(1874).L("Channel %s is not idle after %s ms", defpackage.sqs.be(jcoVar2.e), j2);
            } else {
                jcoVar2.b.f().ai(1873).L("Channel %s becomes idle after %s ms", defpackage.sqs.be(jcoVar2.e), j2 - durationOfMillis.toMillis());
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

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        g(defpackage.ovl.AUDIO_BOTTOM_HALF_END_POINT_READY);
        this.i = (defpackage.jco) jbqVar;
    }

    public final boolean s() {
        synchronized (this.m) {
            if (!this.o) {
                return true;
            }
            if (this.I) {
                return false;
            }
            defpackage.jco jcoVar = this.i;
            jcoVar.getClass();
            return !jcoVar.y();
        }
    }

    public final defpackage.iqj t() {
        synchronized (this.m) {
            if (!this.o || !this.I) {
                return null;
            }
            return this.R;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean u(defpackage.iqj iqjVar) {
        C(iqjVar);
        synchronized (this.m) {
            if (!p()) {
                return false;
            }
            this.I = true;
            this.R = iqjVar;
            return true;
        }
    }

    public final void v(int i) {
        int i2;
        defpackage.ovd ovdVar;
        synchronized (this.v) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.p;
            if (atomicBoolean.getAndSet(true)) {
                ((defpackage.yqj) this.a.l().ai(1082)).u("bottom half start requested while already started");
                g(defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STARTED);
                return;
            }
            this.T = i;
            this.J = i != this.E;
            synchronized (this.m) {
                if (!this.o) {
                    ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai(1081)).u("startStream requested but car is not ready");
                    atomicBoolean.set(false);
                    return;
                }
                defpackage.iqx iqxVar = this.j;
                if (iqxVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai(1080)).u("startStream requested but transmissionHandler is null");
                    atomicBoolean.set(false);
                    return;
                }
                if (this.B) {
                    int i3 = this.T;
                    int i4 = this.E;
                    defpackage.xlk xlkVar = this.f;
                    boolean z = i3 == i4;
                    if (i3 == 0) {
                        throw null;
                    }
                    irn irnVar = (defpackage.acnz.j() && !defpackage.itj.a(xlkVar) && z && this.z && !this.C) ? new irn(this, this.y, this.A, this.D, this.x, this.n, this.c, this.d, this.e) : new ipx(this, this.K, i3, i4, iqxVar);
                    irnVar.e();
                    synchronized (this.m) {
                        if (!this.o) {
                            ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1079)).u("Car became not ready during processor startup, shutting down");
                            irnVar.d();
                            this.p.set(false);
                            return;
                        }
                        this.l = irnVar;
                    }
                } else {
                    if (this.J) {
                        this.J = true;
                        this.k = new defpackage.iqa(defpackage.dmh.P(this.T), new defpackage.iqw(1));
                    }
                    defpackage.iqx iqxVar2 = this.j;
                    if (iqxVar2 != null) {
                        iqxVar2.d();
                    }
                }
                synchronized (this.m) {
                    defpackage.iqj iqjVar = this.R;
                    C(iqjVar);
                    i2 = iqjVar.c;
                }
                defpackage.yqm yqmVar = this.a;
                if (yqmVar.l().Z()) {
                    ((defpackage.yqj) yqmVar.l().ai(1078)).R("audio stream started. resampling:%b, client stream %s, client format %s", java.lang.Boolean.valueOf(this.J), defpackage.tna.Y(i2), D(this.T));
                }
                defpackage.ovl ovlVar = defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_STARTED;
                defpackage.abor aborVarW = w();
                defpackage.yqm yqmVar2 = defpackage.irk.a;
                defpackage.ove oveVarW = defpackage.tna.W(i2);
                aborVarW.t();
                defpackage.ovh ovhVar = (defpackage.ovh) aborVarW.b;
                defpackage.ovh ovhVar2 = defpackage.ovh.a;
                ovhVar.h = oveVarW.f;
                ovhVar.b |= 32;
                int i5 = this.T;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                if (i6 == 1) {
                    ovdVar = defpackage.ovd.STEREO_48000;
                } else if (i6 != 2) {
                    ovdVar = i6 != 3 ? defpackage.ovd.AUDIO_FORMAT_UNKNOWN : defpackage.ovd.MONO_48000;
                } else {
                    ovdVar = defpackage.ovd.MONO_16000;
                }
                aborVarW.t();
                defpackage.ovh ovhVar3 = (defpackage.ovh) aborVarW.b;
                ovhVar3.i = ovdVar.f;
                ovhVar3.b |= 64;
                defpackage.isc iscVar = this.D;
                defpackage.abor aborVarN = defpackage.ovm.a.n();
                aborVarN.t();
                defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
                ovmVar.b |= 1;
                ovmVar.c = "AudioSourceServiceBottomHalf";
                aborVarN.t();
                defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
                ovmVar2.e = ovlVar.al;
                ovmVar2.b |= 4;
                aborVarN.t();
                defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
                defpackage.ovh ovhVar4 = (defpackage.ovh) aborVarW.q();
                ovhVar4.getClass();
                ovmVar3.h = ovhVar4;
                ovmVar3.b |= 32;
                iscVar.C(aborVarN);
            }
        }
    }

    public final defpackage.abor w() {
        defpackage.iqx iqxVar;
        defpackage.abor aborVarN = defpackage.ovh.a.n();
        boolean z = this.o;
        aborVarN.t();
        defpackage.ovh ovhVar = (defpackage.ovh) aborVarN.b;
        ovhVar.b |= 1;
        ovhVar.c = z;
        boolean z2 = this.I;
        aborVarN.t();
        defpackage.ovh ovhVar2 = (defpackage.ovh) aborVarN.b;
        ovhVar2.b |= 2;
        ovhVar2.d = z2;
        boolean z3 = this.p.get();
        aborVarN.t();
        defpackage.ovh ovhVar3 = (defpackage.ovh) aborVarN.b;
        ovhVar3.b |= 4;
        ovhVar3.e = z3;
        boolean z4 = this.J;
        aborVarN.t();
        defpackage.ovh ovhVar4 = (defpackage.ovh) aborVarN.b;
        ovhVar4.b |= 8;
        ovhVar4.f = z4;
        boolean z5 = this.K.b;
        aborVarN.t();
        defpackage.ovh ovhVar5 = (defpackage.ovh) aborVarN.b;
        ovhVar5.b |= 16;
        ovhVar5.g = z5;
        if (!this.B && (iqxVar = this.j) != null) {
            boolean z6 = iqxVar.e;
            aborVarN.t();
            defpackage.ovh ovhVar6 = (defpackage.ovh) aborVarN.b;
            ovhVar6.b |= 128;
            ovhVar6.j = z6;
            boolean z7 = iqxVar.f;
            aborVarN.t();
            defpackage.ovh ovhVar7 = (defpackage.ovh) aborVarN.b;
            ovhVar7.b |= 256;
            ovhVar7.k = z7;
        }
        return aborVarN;
    }

    public final void x(defpackage.ovl ovlVar, defpackage.abor aborVar) {
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = "AudioSourceServiceBottomHalf";
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovh ovhVar = (defpackage.ovh) aborVar.q();
        ovhVar.getClass();
        ovmVar3.h = ovhVar;
        ovmVar3.b |= 32;
        this.D.A(aborVarN);
    }
}
