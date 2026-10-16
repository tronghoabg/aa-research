package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqx extends defpackage.rce {
    private final int A;
    public final java.util.concurrent.Semaphore a;
    public final defpackage.irr b;
    public final iqf c;
    public final defpackage.iqa d;
    volatile boolean e;
    volatile boolean f;
    private final android.os.HandlerThread g;
    private final defpackage.yqm h;
    private final com.google.android.gms.car.CarInfo i;
    private final defpackage.imn j;
    private final defpackage.xlk k;
    private final int l;
    private final java.lang.String m;
    private final int n;
    private final int o;
    private final boolean p;
    private final boolean q;
    private final android.content.Context r;
    private final boolean s;
    private ivy t;
    private defpackage.iqa u;
    private iss v;
    private final java.util.concurrent.atomic.AtomicInteger w;
    private final java.util.concurrent.atomic.AtomicInteger x;
    private final defpackage.iqh y;
    private final defpackage.isc z;

    public iqx(defpackage.iqh iqhVar, com.google.android.gms.car.CarInfo carInfo, defpackage.imn imnVar, defpackage.isc iscVar, defpackage.irr irrVar, iqf iqfVar, int i, defpackage.xlk xlkVar, int i2, int i3, int i4, boolean z, boolean z2, android.content.Context context, boolean z3) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("AUDIO_BH-".concat(defpackage.tna.Y(i2)), -19);
        handlerThread.start();
        super(iqhVar, handlerThread.getLooper());
        this.a = new java.util.concurrent.Semaphore(0);
        this.e = false;
        this.f = false;
        this.w = new java.util.concurrent.atomic.AtomicInteger();
        this.x = new java.util.concurrent.atomic.AtomicInteger();
        this.y = iqhVar;
        this.i = carInfo;
        this.j = imnVar;
        this.z = iscVar;
        this.b = irrVar;
        this.c = iqfVar;
        this.A = i;
        this.k = xlkVar;
        this.l = i2;
        java.lang.String strY = defpackage.tna.Y(i2);
        this.m = strY;
        this.n = i3;
        this.o = i4;
        this.p = z;
        this.q = z2;
        this.r = context;
        this.s = z3;
        this.g = handlerThread;
        this.h = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.".concat(java.lang.String.valueOf(strY))));
        this.d = new defpackage.iqa(i4, new defpackage.iqw(0));
    }

    private final void h() {
        long j;
        int i;
        defpackage.iqa iqaVar = this.d;
        iqaVar.getClass();
        defpackage.ipy ipyVarD = iqaVar.d();
        while (ipyVarD != null) {
            ipyVarD.d = android.os.SystemClock.elapsedRealtime();
            int i2 = 0;
            if (defpackage.itj.a(this.k)) {
                iss issVar = this.v;
                if (!issVar.h) {
                    throw new java.lang.IllegalStateException("start() has not been called");
                }
                isp ispVar = issVar.g;
                ispVar.getClass();
                iso isoVarJ = ispVar.j();
                if (isoVarJ.a == null) {
                    android.media.MediaCodec mediaCodec = isoVarJ.b.j;
                    mediaCodec.getClass();
                    isoVarJ.a = mediaCodec.getInputBuffers();
                }
                int iB = ipyVarD.b();
                int iA = ipyVarD.a();
                long j2 = ipyVarD.a;
                try {
                    java.nio.ByteBuffer byteBuffer = ipyVarD.h;
                    long j3 = j2;
                    int i3 = 0;
                    i = 0;
                    while (true) {
                        if (i3 >= iB) {
                            j = 0;
                            break;
                        }
                        try {
                            isp ispVar2 = isoVarJ.b;
                            android.media.MediaCodec mediaCodec2 = ispVar2.j;
                            mediaCodec2.getClass();
                            j = 0;
                            try {
                                int iDequeueInputBuffer = mediaCodec2.dequeueInputBuffer(500000L);
                                if (iDequeueInputBuffer < 0) {
                                    ((defpackage.yqj) ((defpackage.yqj) ispVar2.a.g()).ai(1285)).u("Encoder input buffer unavailable. Dropping audio data");
                                    break;
                                }
                                java.nio.ByteBuffer[] byteBufferArr = isoVarJ.a;
                                byteBufferArr.getClass();
                                java.nio.ByteBuffer byteBuffer2 = byteBufferArr[iDequeueInputBuffer];
                                byteBuffer2.clear();
                                int iMin = java.lang.Math.min(iB - i3, byteBuffer2.limit());
                                byteBuffer2.put(byteBuffer.array(), iA + i3, iMin);
                                android.media.MediaCodec mediaCodec3 = ispVar2.j;
                                mediaCodec3.getClass();
                                mediaCodec3.queueInputBuffer(iDequeueInputBuffer, 0, iMin, j3, 0);
                                i3 += iMin;
                                if (j3 != 0) {
                                    long j4 = iMin;
                                    long j5 = ispVar2.b;
                                    java.lang.Long.signum(j4);
                                    j3 += j4 * j5;
                                }
                                i++;
                            } catch (java.lang.IllegalStateException e) {
                                e = e;
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) isoVarJ.b.a.h()).p(e)).ai((char) 1284)).u("mediacodec failed, already stopped?");
                            }
                        } catch (java.lang.IllegalStateException e2) {
                            e = e2;
                            j = 0;
                        }
                    }
                } catch (java.lang.IllegalStateException e3) {
                    e = e3;
                    j = 0;
                    i = 0;
                }
                try {
                    issVar.d.acquire(i);
                } catch (java.lang.InterruptedException unused) {
                }
                ipyVarD.e = android.os.SystemClock.elapsedRealtime();
                java.nio.ByteBuffer byteBufferA = this.v.a();
                if (byteBufferA != null) {
                    byte[] bArr = new byte[byteBufferA.limit()];
                    java.lang.System.arraycopy(byteBufferA.array(), byteBufferA.arrayOffset(), bArr, 0, byteBufferA.limit());
                    defpackage.jco jcoVar = this.y.i;
                    jcoVar.getClass();
                    if (jcoVar.g) {
                        jcoVar.B(defpackage.ovl.SENDING_CODEC_CONFIG);
                        jcoVar.q(bArr);
                    } else {
                        defpackage.ypu ypuVarAi = jcoVar.b.g().ai(1907);
                        defpackage.izv izvVar = jcoVar.w;
                        izvVar.getClass();
                        ypuVarAi.w("Trying to send codec config without starting media, ch:%d", ((defpackage.izk) izvVar).b);
                        jcoVar.B(defpackage.ovl.TRIED_TO_SEND_CODEC_CONFIG_WHILE_NOT_STARTED);
                    }
                }
                ipyVarD.f = android.os.SystemClock.elapsedRealtime();
                long j6 = ipyVarD.a;
                defpackage.ipy ipyVarD2 = this.u.d();
                while (ipyVarD2 != null) {
                    java.nio.ByteBuffer byteBuffer3 = ipyVarD2.h;
                    byteBuffer3.position(byteBuffer3.limit());
                    iss issVar2 = this.v;
                    int iA2 = ipyVarD2.a();
                    int iB2 = ipyVarD2.b();
                    ivy ivyVar = this.t;
                    if (ivyVar != null) {
                        if (this.k == defpackage.xlk.MEDIA_CODEC_AUDIO_AAC_LC) {
                            ivyVar.b(issVar2.d(iB2), 0, 7);
                        }
                        i(byteBuffer3, iA2, iB2);
                    }
                    defpackage.iqh iqhVar = this.y;
                    defpackage.jco jcoVar2 = iqhVar.i;
                    jcoVar2.getClass();
                    if (jcoVar2.E()) {
                        iqf iqfVar = this.c;
                        if (iqfVar != null) {
                            iqfVar.b();
                        }
                        defpackage.jco jcoVar3 = iqhVar.i;
                        jcoVar3.getClass();
                        jcoVar3.D(j6, new defpackage.jcu(byteBuffer3, null, false), new defpackage.iqv(this, 2));
                        this.w.getAndIncrement();
                        this.x.getAndIncrement();
                    }
                    ipyVarD2 = this.u.d();
                }
                ipyVarD.g = android.os.SystemClock.elapsedRealtime();
                this.z.v(ipyVarD);
            } else {
                j = 0;
                java.nio.ByteBuffer byteBuffer4 = ipyVarD.h;
                byteBuffer4.position(byteBuffer4.limit());
                i(byteBuffer4, ipyVarD.a(), ipyVarD.b());
                defpackage.iqh iqhVar2 = this.y;
                defpackage.jco jcoVar4 = iqhVar2.i;
                jcoVar4.getClass();
                if (jcoVar4.E()) {
                    iqf iqfVar2 = this.c;
                    if (iqfVar2 != null) {
                        iqfVar2.b();
                    }
                    defpackage.jco jcoVar5 = iqhVar2.i;
                    jcoVar5.getClass();
                    jcoVar5.D(ipyVarD.a, new defpackage.jcu(byteBuffer4, null, false), new defpackage.iqv(this, i2));
                    ipyVarD.g = android.os.SystemClock.elapsedRealtime();
                    this.z.x(ipyVarD);
                    this.w.getAndIncrement();
                    this.x.getAndIncrement();
                }
            }
            if (this.q) {
                defpackage.iqh iqhVar3 = this.y;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                if (iqhVar3.u) {
                    long j7 = iqhVar3.t;
                    if (j7 > j) {
                        int i4 = (int) (jElapsedRealtime - j7);
                        if (i4 >= 0) {
                            i2 = 255;
                            if (i4 <= 255) {
                                i2 = i4;
                            }
                        }
                        int[] iArr = iqhVar3.s;
                        iArr.getClass();
                        iArr[i2] = iArr[i2] + 1;
                    }
                    iqhVar3.t = jElapsedRealtime;
                }
            }
            defpackage.iqa iqaVar2 = this.d;
            iqaVar2.getClass();
            ipyVarD = iqaVar2.d();
        }
    }

    private final void i(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        ivy ivyVar = this.t;
        if (ivyVar != null) {
            ivyVar.b(byteBuffer.array(), i, i2);
        }
    }

    public final void a(java.io.PrintWriter printWriter) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.x;
        printWriter.println("frames sent since start:" + java.lang.String.valueOf(this.w) + " total frames sent:" + java.lang.String.valueOf(atomicInteger));
        printWriter.println("mediaOptionsOverride:".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.y.e()))));
    }

    public final void b(defpackage.ipy ipyVar) {
        if (this.f) {
            this.y.h(defpackage.ovf.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN);
        } else {
            this.d.e(ipyVar);
            sendMessage(obtainMessage(4));
        }
    }

    public final synchronized void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        sendMessage(obtainMessage(5));
        this.g.quitSafely();
    }

    public final synchronized void d() {
        if (this.f) {
            return;
        }
        defpackage.iqa iqaVar = this.d;
        if (iqaVar != null && iqaVar.a() > 0) {
            ((defpackage.yqj) ((defpackage.yqj) this.h.h()).ai((char) 1146)).w("Transmission queue has %d buffers from last stream", iqaVar.a());
            iqaVar.f();
        }
        sendMessage(obtainMessage(2));
    }

    public final void e() {
        if (this.f) {
            this.y.h(defpackage.ovf.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN);
        } else {
            sendMessage(obtainMessage(4));
        }
    }

    public final synchronized void f(defpackage.xll xllVar) {
        if (this.f) {
            return;
        }
        sendMessage(obtainMessage(6, xllVar));
    }

    public final synchronized boolean g(boolean z, boolean z2, boolean z3) {
        if (this.f) {
            return false;
        }
        if (z) {
            removeMessages(4);
            this.y.h(defpackage.ovf.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPING_IMMEDIATELY);
        }
        sendMessage(obtainMessage(3, z ? 1 : 0, z2 ? 1 : 0, java.lang.Boolean.valueOf(z3)));
        return true;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.ovc ovcVar;
        defpackage.iqh iqhVar = this.y;
        if (!iqhVar.o && message.what != 1 && message.what != 3 && message.what != 5) {
            if (message.what == 4) {
                iqhVar.h(defpackage.ovf.AUDIO_BOTTOM_HALF_CAR_NOT_READY);
                return;
            }
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) this.h.h()).ai(1145);
            int i = message.what;
            if (i == 1) {
                ovcVar = defpackage.ovc.INIT;
            } else if (i == 2) {
                ovcVar = defpackage.ovc.START;
            } else if (i == 3) {
                ovcVar = defpackage.ovc.STOP;
            } else if (i != 4) {
                ovcVar = i != 5 ? defpackage.ovc.AUDIO_BOTTOM_HALF_UNSPECIFIED : defpackage.ovc.SHUTDOWN;
            } else {
                ovcVar = defpackage.ovc.SEND_STREAM;
            }
            yqjVar.y("Car is not ready yet. Ignore: %s", ovcVar.name());
            return;
        }
        switch (message.what) {
            case 1:
                int i2 = this.A;
                int i3 = i2 == 2 ? 2 : 1;
                int i4 = i2 == 4 ? 48000 : i2 == 2 ? 48000 : 16000;
                defpackage.xlk xlkVar = this.k;
                if (defpackage.itj.a(xlkVar)) {
                    defpackage.iqa iqaVar = this.u;
                    if (iqaVar != null) {
                        iqaVar.f();
                    }
                    this.u = new defpackage.iqa(4096, new defpackage.iqw(0));
                    iss issVar = this.v;
                    if (issVar != null) {
                        issVar.c();
                    }
                    this.v = new iss(this.m, i4, i3, this.u, xlkVar == defpackage.xlk.MEDIA_CODEC_AUDIO_AAC_LC_ADTS);
                    ((defpackage.yqj) ((defpackage.yqj) this.h.e()).ai((char) 1137)).u("Starting AAC encoder early");
                    this.v.b();
                }
                defpackage.yqj yqjVar2 = (defpackage.yqj) this.h.l().ai(1136);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i4);
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i3);
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(this.o);
                int i5 = defpackage.jdr.k;
                yqjVar2.T("init, samplingRate: %d, numberOfBits: %d, numberOfChannels: %d, bufferSize: %d, encoding: %s", numValueOf, 16, numValueOf2, numValueOf3, defpackage.tna.y(xlkVar));
                iqhVar.g(defpackage.ovl.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_INITIALIZED);
                this.a.release();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.e) {
                    this.y.g(defpackage.ovl.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_ALREADY_STARTED);
                    return;
                }
                this.e = true;
                defpackage.iqh iqhVar2 = this.y;
                if (iqhVar2.u) {
                    iqhVar2.t = -1L;
                }
                iqhVar2.g(defpackage.ovl.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STARTED);
                defpackage.abor aborVarN = defpackage.xpi.a.n();
                int i6 = this.n;
                aborVarN.t();
                defpackage.xpi xpiVar = (defpackage.xpi) aborVarN.b;
                xpiVar.b |= 2;
                xpiVar.d = i6;
                if (this.i.e >= 5) {
                    if (this.p) {
                        aborVarN.t();
                        defpackage.xpi xpiVar2 = (defpackage.xpi) aborVarN.b;
                        xpiVar2.e = 2;
                        xpiVar2.b = 4 | xpiVar2.b;
                    }
                    defpackage.imn imnVar = this.j;
                    int i7 = this.l;
                    com.google.android.gms.car.MediaOptions mediaOptionsE = iqhVar2.e();
                    defpackage.xll xllVarB = imnVar.b(i7, mediaOptionsE != null ? java.lang.Boolean.valueOf(mediaOptionsE.a) : null);
                    aborVarN.t();
                    defpackage.xpi xpiVar3 = (defpackage.xpi) aborVarN.b;
                    xllVarB.getClass();
                    xpiVar3.f = xllVarB;
                    xpiVar3.b |= 8;
                }
                defpackage.iqa iqaVar2 = this.u;
                if (iqaVar2 != null) {
                    iqaVar2.f();
                }
                defpackage.jco jcoVar = iqhVar2.i;
                jcoVar.getClass();
                jcoVar.F(aborVarN);
                this.w.set(0);
                defpackage.xlk xlkVar2 = this.k;
                if (defpackage.itj.a(xlkVar2)) {
                    ((defpackage.yqj) ((defpackage.yqj) this.h.e()).ai(1138)).u("Starting AAC encoder");
                    this.v.b();
                }
                ivy ivyVar = this.t;
                if (ivyVar != null) {
                    ivyVar.a();
                    this.t = null;
                }
                if (this.s) {
                    this.t = new ivy(this.r, this.l, this.A, xlkVar2);
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean z = message.arg1 == 1;
                boolean z2 = message.arg2 == 1;
                boolean z3 = (message.obj instanceof java.lang.Boolean) && ((java.lang.Boolean) message.obj).booleanValue();
                defpackage.iqh iqhVar3 = this.y;
                defpackage.ovl ovlVar = defpackage.ovl.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED;
                defpackage.abor aborVarW = iqhVar3.w();
                aborVarW.t();
                defpackage.ovh ovhVar = (defpackage.ovh) aborVarW.b;
                defpackage.ovh ovhVar2 = defpackage.ovh.a;
                ovhVar.b |= 512;
                ovhVar.l = z;
                aborVarW.t();
                defpackage.ovh ovhVar3 = (defpackage.ovh) aborVarW.b;
                ovhVar3.b |= 1024;
                ovhVar3.m = z2;
                int i8 = this.w.get();
                aborVarW.t();
                defpackage.ovh ovhVar4 = (defpackage.ovh) aborVarW.b;
                ovhVar4.b |= 2048;
                ovhVar4.n = i8;
                int i9 = this.x.get();
                aborVarW.t();
                defpackage.ovh ovhVar5 = (defpackage.ovh) aborVarW.b;
                ovhVar5.b = 4096 | ovhVar5.b;
                ovhVar5.o = i9;
                iqhVar3.x(ovlVar, aborVarW);
                if (this.e) {
                    if (!z) {
                        if (defpackage.itj.a(this.k) && !z3) {
                            ((defpackage.yqj) this.h.l().ai(1142)).u("Injecting extra silent buffer into AAC encoder.");
                            defpackage.iqa iqaVar3 = this.d;
                            iqaVar3.getClass();
                            defpackage.ipy ipyVarB = iqaVar3.b();
                            int iA = ipyVarB.a();
                            java.util.Arrays.fill(ipyVarB.h.array(), iA, ipyVarB.b() + iA, (byte) 0);
                            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            ipyVarB.b = jElapsedRealtime;
                            ipyVarB.a = 1000 * jElapsedRealtime;
                            ipyVarB.c = jElapsedRealtime;
                            iqaVar3.getClass();
                            iqaVar3.e(ipyVarB);
                        }
                        h();
                    }
                    defpackage.jco jcoVar2 = iqhVar3.i;
                    jcoVar2.getClass();
                    jcoVar2.x();
                    defpackage.yqm yqmVar = this.h;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1139)).w("stopping, captured and queued %d frames since start for stream", this.w.get());
                    this.e = false;
                    defpackage.iqa iqaVar4 = this.d;
                    if (iqaVar4 != null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1141)).u("clearing transmission queue in bottom half");
                        iqaVar4.f();
                    }
                    defpackage.iqa iqaVar5 = this.u;
                    if (iqaVar5 != null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1140)).u("clearing encoded buffer queue in bottom half");
                        iqaVar5.f();
                    }
                    this.y.i();
                    ivy ivyVar2 = this.t;
                    if (ivyVar2 != null) {
                        ivyVar2.a();
                        this.t = null;
                    }
                }
                this.y.k(z2);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (this.e) {
                    h();
                    return;
                }
                ((defpackage.yqj) this.h.l().ai(1143)).u("stream send requested while stopped");
                this.y.h(defpackage.ovf.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED);
                defpackage.iqa iqaVar6 = this.d;
                if (iqaVar6 != null) {
                    iqaVar6.f();
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (defpackage.itj.a(this.k)) {
                    iss issVar2 = this.v;
                    if (issVar2 != null) {
                        issVar2.c();
                    }
                    defpackage.iqa iqaVar7 = this.u;
                    if (iqaVar7 != null) {
                        iqaVar7.f();
                    }
                }
                this.d.f();
                ivy ivyVar3 = this.t;
                if (ivyVar3 != null) {
                    ivyVar3.a();
                    this.t = null;
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.CarInfo carInfo = this.i;
                int i10 = carInfo.e;
                if (i10 <= 5 && (i10 != 5 || carInfo.f <= 0)) {
                    ((defpackage.yqj) this.h.l().ai(1144)).u("PDK version less than 5.1. Not sending MediaOptions.");
                    return;
                }
                defpackage.xll xllVar = (defpackage.xll) message.obj;
                defpackage.jco jcoVar3 = this.y.i;
                jcoVar3.getClass();
                jcoVar3.k(32788, xllVar);
                return;
            default:
                throw new java.lang.IllegalStateException(defpackage.a.cb(message, "Unsupported message "));
        }
    }
}
