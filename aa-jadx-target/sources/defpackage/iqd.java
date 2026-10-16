package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqd extends java.lang.Thread implements defpackage.iqb {
    private static final j$.time.Duration m = j$.time.Duration.ofMillis(500);
    private static final j$.time.Duration n = j$.time.Duration.ofMillis(500);
    private long A;
    private boolean B;
    private boolean C;
    private final java.util.concurrent.atomic.AtomicInteger D;
    private final boolean E;
    private final boolean F;
    private final defpackage.irl G;
    private volatile boolean H;
    private boolean I;
    private final defpackage.irg J;
    private boolean K;
    private final defpackage.iqj L;
    private final int M;
    private final defpackage.izq N;
    public final android.content.Context a;
    public final defpackage.itd b;
    public final int c;
    public final boolean d;
    public final defpackage.yqm e;
    public final defpackage.iqa f;
    public long g;
    public volatile boolean h;
    public volatile boolean i;
    final int j;
    public volatile defpackage.iqh k;
    public final defpackage.izq l;
    private final defpackage.iqg o;
    private final defpackage.jfd p;
    private final defpackage.jfe q;
    private final defpackage.iqr r;
    private final com.google.android.gms.car.CarAudioConfiguration s;
    private final defpackage.jba t;
    private final defpackage.its u;
    private final defpackage.jfo v;
    private final android.os.Handler w;
    private final java.util.concurrent.atomic.AtomicInteger x;
    private final java.util.concurrent.atomic.AtomicReference y;
    private boolean z;

    public iqd(defpackage.iqj iqjVar, android.content.Context context, defpackage.iqg iqgVar, defpackage.jfd jfdVar, defpackage.jfe jfeVar, defpackage.jfa jfaVar, defpackage.iqr iqrVar, defpackage.itd itdVar, int i, java.lang.String str, com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration, boolean z, defpackage.jdo jdoVar, defpackage.jba jbaVar, defpackage.its itsVar, defpackage.jfo jfoVar, defpackage.irg irgVar, defpackage.izq izqVar, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicReference atomicReference, defpackage.izq izqVar2) {
        super("AudioCapture-".concat(str));
        this.z = false;
        this.g = 0L;
        this.h = false;
        this.i = false;
        this.K = true;
        this.L = iqjVar;
        this.a = defpackage.jfr.c(context);
        this.o = iqgVar;
        this.p = jfdVar;
        this.q = jfeVar;
        this.r = iqrVar;
        this.b = itdVar;
        this.c = i;
        this.s = carAudioConfiguration;
        this.d = z;
        this.t = jbaVar;
        this.u = itsVar;
        this.v = jfoVar;
        this.J = irgVar;
        this.e = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.".concat(str)));
        this.l = izqVar;
        this.f = new defpackage.iqa(defpackage.dmh.R(carAudioConfiguration), jdoVar);
        this.x = atomicInteger;
        this.y = atomicReference;
        defpackage.acnl acnlVar = defpackage.acnl.a;
        defpackage.absx absxVarL = acnlVar.fF().l();
        com.google.android.gms.car.CarInfo carInfoT = jfaVar.t();
        carInfoT.getClass();
        if (absxVarL.b.isEmpty()) {
            this.E = false;
        } else {
            defpackage.yqm yqmVar = defpackage.kjl.a;
            j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVarL);
            int i2 = defpackage.ygw.d;
            this.E = defpackage.kjl.h(carInfoT, (defpackage.ygw) streamD.collect(defpackage.yds.a));
        }
        boolean z2 = acnlVar.fF().n() && carInfoT.e >= 5;
        this.F = z2;
        this.G = new defpackage.irl(carInfoT, i, jfeVar, z2);
        if (i == 3) {
            this.j = 0;
            this.D = new java.util.concurrent.atomic.AtomicInteger(75);
            this.M = 2;
        } else {
            this.j = (int) (carAudioConfiguration.a == 16000 ? acnlVar.fF().h() : defpackage.acnl.j());
            this.D = new java.util.concurrent.atomic.AtomicInteger(3);
            this.M = carAudioConfiguration.a != 16000 ? 4 : 3;
        }
        this.N = izqVar2;
        this.w = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    /* JADX WARN: Code duplicated, block: B:160:0x04da  */
    /* JADX WARN: Code duplicated, block: B:162:0x04df  */
    /* JADX WARN: Code duplicated, block: B:169:0x050d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0511  */
    /* JADX WARN: Code duplicated, block: B:173:0x0535  */
    /* JADX WARN: Code duplicated, block: B:175:0x054c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0556  */
    /* JADX WARN: Code duplicated, block: B:179:0x0566  */
    /* JADX WARN: Code duplicated, block: B:190:0x05c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:193:0x05df  */
    /* JADX WARN: Code duplicated, block: B:194:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:197:0x0612  */
    /* JADX WARN: Code duplicated, block: B:198:0x062b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0647  */
    /* JADX WARN: Code duplicated, block: B:203:0x065b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0685  */
    /* JADX WARN: Code duplicated, block: B:211:0x069f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:217:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:219:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:221:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:223:0x06de  */
    /* JADX WARN: Code duplicated, block: B:231:0x0720  */
    /* JADX WARN: Code duplicated, block: B:234:0x0729  */
    /* JADX WARN: Code duplicated, block: B:235:0x0744  */
    /* JADX WARN: Code duplicated, block: B:239:0x074f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0764  */
    /* JADX WARN: Code duplicated, block: B:242:0x0768  */
    /* JADX WARN: Code duplicated, block: B:244:0x0794  */
    /* JADX WARN: Code duplicated, block: B:245:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:298:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x068b A[SYNTHETIC] */
    private final void f() throws xzp {
        defpackage.itn itnVar;
        defpackage.ipy ipyVarB;
        defpackage.ipy ipyVarB2;
        java.nio.ByteBuffer byteBuffer;
        int iPosition;
        int iLimit;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        defpackage.yqm yqmVar;
        int i;
        defpackage.iqh iqhVar;
        defpackage.yqm yqmVar2;
        defpackage.izq izqVar;
        java.lang.String str;
        defpackage.iqh iqhVarH;
        boolean z;
        defpackage.yqm yqmVar3;
        java.lang.String strY;
        boolean z2;
        defpackage.iqh iqhVar2;
        defpackage.qwn qwnVarA;
        defpackage.itn itnVarD;
        int i2 = this.s.a;
        double d = i2 == 48000 ? 4.2666666666666664E7d : 1.024E12d / ((double) i2);
        int i3 = this.c;
        int i4 = i3 == 3 ? 8192 : 2048;
        defpackage.yqm yqmVar4 = this.e;
        int i5 = i4 * 8;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai(1013)).R("Start capturing system audio with sampling rate: %d, buffer size: %d, expected frame duration: %f ms", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i5), java.lang.Double.valueOf(d / 1000000.0d));
        defpackage.izq izqVar2 = this.l;
        izqVar2.d(defpackage.ovl.AUDIO_SYSTEM_SOUND_CAPTURING_STARTED);
        boolean z3 = i3 == 3;
        long j = -1;
        try {
            try {
                j$.time.Duration duration = n;
                long j2 = 11;
                while (true) {
                    if (j2 <= 0) {
                        throw new java.lang.IllegalStateException("Unreachable");
                    }
                    long j3 = j2 - 1;
                    try {
                        if (this.d) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai((char) 1008)).u("Single channel capturing enabled");
                            izqVar2.d(defpackage.ovl.AUDIO_RECORD_FORCE_SINGLE_CHANNEL_CAPTURING);
                            itnVarD = d(i5, i2);
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai((char) 1009)).u("Creating audio record");
                            itnVarD = this.b.a(i3);
                            if (itnVarD == null) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar4.h()).ai((char) 1012)).u("Audio policy was not successfully registered");
                                izqVar2.d(defpackage.ovl.AUDIO_POLICY_REGISTER_FAILURE);
                            }
                            if (itnVarD != null && itnVarD.a() == 0) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar4.h()).ai((char) 1011)).u("Audio record uninitialized");
                                izqVar2.d(defpackage.ovl.AUDIO_RECORD_UNINITIALIZED);
                                itnVarD = null;
                            }
                            if (itnVarD == null && z3) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai((char) 1010)).u("Second try with mixed audio usage only on media stream.");
                                itnVarD = d(i5, i2);
                            }
                        }
                        if (itnVarD != null && itnVarD.a() != 0) {
                            itnVarD.d();
                            itnVar = itnVarD;
                            break;
                        }
                        defpackage.yqm yqmVar5 = this.e;
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar5.h()).ai(1040)).u("Failed to setup audio capture with new APIs.");
                        this.l.d(defpackage.ovl.AUDIO_CAPTURE_SETUP_WITH_NEW_APIS_FAILED);
                        if (z3) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar5.h()).ai(1043)).u("Trying remote submix for media stream");
                            itnVarD = this.u.c(i2, i5);
                            try {
                                itnVarD.d();
                                itnVar = itnVarD;
                                break;
                            } catch (java.lang.IllegalStateException e) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e)).ai(1044)).u("Failure setting up audio capture.");
                                this.v.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yw);
                                this.p.ax(defpackage.zaj.CAR_SERVICE_INIT_ERROR, defpackage.zak.NO_AUDIO_CAPTURE, "cannot capture audio");
                                itnVar = null;
                                break;
                            }
                        }
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar5.h()).ai(1041)).u("Give up capturing for non-media stream");
                        itnVar = null;
                        break;
                    } catch (defpackage.itc e2) {
                        if (j3 <= 0) {
                            this.v.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wA);
                            throw new java.lang.IllegalStateException("Unable to register audio policy after retries.", e2);
                        }
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.f()).p(e2)).ai(1039)).L("Error while registering audio policy. Sleep %s before retrying. attemptsRemaining: %d.", duration, j3);
                        defpackage.ysr.cI(duration);
                        j2 = j3;
                    }
                }
            } catch (android.os.RemoteException e3) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e3)).ai((char) 1042)).u("Failure setting up remote audio capture.");
                this.v.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yx);
                this.p.ax(defpackage.zaj.CAR_SERVICE_INIT_ERROR, defpackage.zak.NO_AUDIO_CAPTURE, "failure to set up remote audio capture");
            }
            if (itnVar == null) {
                ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 1036)).u("Null AudioRecord; abandoning capture.");
                this.l.d(defpackage.ovl.NULL_AUDIO_RECORD);
                return;
            }
            try {
                try {
                    try {
                        try {
                            qwnVarA = ((defpackage.imi) this.o).A();
                        } catch (android.os.RemoteException e4) {
                            throw new java.lang.IllegalStateException("Error executing disableA2dp.", e4);
                        }
                    } catch (java.lang.IllegalStateException e5) {
                        defpackage.oml.H(e5);
                        qwnVarA = null;
                    }
                    if (qwnVarA == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).ai(309)).u("No Bluetooth service returned; skipping disableA2dp.");
                    } else {
                        qwnVarA.n();
                    }
                } catch (defpackage.qsu unused) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai(310)).u("Car does not support Bluetooth service; skipping disableA2dp.");
                }
                defpackage.iqa iqaVar = this.f;
                defpackage.ipy ipyVarB3 = iqaVar.b();
                int i6 = 0;
                boolean z4 = false;
                int i7 = 0;
                boolean z5 = false;
                while (!this.h) {
                    java.util.concurrent.atomic.AtomicInteger atomicInteger2 = this.x;
                    int i8 = atomicInteger2.get();
                    if (i8 == 1) {
                        defpackage.iqh iqhVar3 = (defpackage.iqh) this.y.getAndSet(null);
                        iqhVar3.getClass();
                        ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1046)).y("focus gain, bottom half: %s", defpackage.tna.Y(iqhVar3.c));
                        this.i = true;
                        this.k = iqhVar3;
                        iqhVar3.v(this.M);
                    } else if (i8 == 2) {
                        this.i = false;
                        defpackage.iqh iqhVar4 = this.k;
                        ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai(1047)).N("focus loss, old bottom half: %s, stop immediately: %b", iqhVar4 == null ? "UNKNOWN" : defpackage.tna.Y(iqhVar4.c), this.H);
                        if (iqhVar4 == null) {
                            z2 = false;
                            iqhVar2 = null;
                        } else if (this.H) {
                            z2 = false;
                            iqhVar2 = null;
                            iqhVar4.f(false, true, null);
                        } else {
                            z2 = false;
                            iqhVar2 = null;
                            iqhVar4.f(true, false, null);
                        }
                        if (z5) {
                            this.r.f(this.c);
                        }
                        this.k = iqhVar2;
                        this.I = z2;
                    } else if (i8 == 3) {
                        defpackage.iqh iqhVar5 = this.k;
                        defpackage.iqh iqhVar6 = (defpackage.iqh) this.y.getAndSet(null);
                        iqhVar6.getClass();
                        ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai(1048)).M("switching bottom half for stream, from bottom half: %s to bottom half %s", iqhVar5 == null ? "UNKNOWN" : defpackage.tna.Y(iqhVar5.c), defpackage.tna.Y(iqhVar6.c));
                        if (iqhVar5 != null) {
                            iqhVar5.f(true, false, null);
                        }
                        this.i = true;
                        iqhVar6.v(this.M);
                        this.k = iqhVar6;
                    }
                    if (i8 != 0) {
                        defpackage.izq izqVar3 = this.l;
                        defpackage.ovl ovlVar = defpackage.ovl.AUDIO_HANDLE_FOCUS_CHANGE_COMMAND;
                        defpackage.abor aborVarE = izqVar3.e();
                        defpackage.ovi oviVarAe = defpackage.tna.ae(i8);
                        aborVarE.t();
                        defpackage.ovj ovjVar = (defpackage.ovj) aborVarE.b;
                        defpackage.ovj ovjVar2 = defpackage.ovj.a;
                        ovjVar.g = oviVarAe.f;
                        ovjVar.b |= 16;
                        izqVar3.f(ovlVar, aborVarE);
                        int andSet = atomicInteger2.getAndSet(0);
                        if (andSet != i8) {
                            ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai(1045)).M("Focus change command changed from %s to %s while being handled.", defpackage.tna.ae(i8).name(), defpackage.tna.ae(andSet).name());
                            defpackage.ovl ovlVar2 = defpackage.ovl.AUDIO_CONCURRENT_FOCUS_CHANGE_COMMAND;
                            defpackage.abor aborVarE2 = izqVar3.e();
                            defpackage.ovi oviVarAe2 = defpackage.tna.ae(i8);
                            aborVarE2.t();
                            defpackage.ovj ovjVar3 = (defpackage.ovj) aborVarE2.b;
                            ovjVar3.g = oviVarAe2.f;
                            ovjVar3.b |= 16;
                            defpackage.ovi oviVarAe3 = defpackage.tna.ae(andSet);
                            aborVarE2.t();
                            defpackage.ovj ovjVar4 = (defpackage.ovj) aborVarE2.b;
                            ovjVar4.n = oviVarAe3.f;
                            ovjVar4.b |= 2048;
                            izqVar3.f(ovlVar2, aborVarE2);
                        }
                        defpackage.iqj iqjVar = this.L;
                        synchronized (iqjVar) {
                            iqjVar.notifyAll();
                        }
                    }
                    if (this.i && !z5) {
                        g(j);
                        defpackage.iqh iqhVar7 = this.k;
                        iqhVar7.getClass();
                        ((defpackage.yqj) this.e.l().ai(1034)).y("releasing bottom half %s, from stream right after focus gain", defpackage.tna.Y(iqhVar7.c));
                        iqhVar7.f(true, false, null);
                        this.i = false;
                    }
                    if (!z5) {
                        ipyVarB = ipyVarB3;
                    } else if (this.i) {
                        defpackage.iqh iqhVar8 = this.k;
                        iqhVar8.getClass();
                        ipyVarB = iqhVar8.a();
                    } else {
                        ipyVarB = iqaVar.b();
                    }
                    int iB = ipyVarB.b();
                    ipyVarB.b = android.os.SystemClock.elapsedRealtime();
                    int iA = ipyVarB.a();
                    while (!this.h && iB > 0) {
                        try {
                            int iB2 = itnVar.b(ipyVarB.h.array(), iA, iB);
                            if (iB2 < 0) {
                                ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 1032)).w("AudioRecord read returned %d; quitting audio capture.", iB2);
                                defpackage.izq izqVar4 = this.l;
                                defpackage.ovl ovlVar3 = defpackage.ovl.AUDIO_RECORD_READ_ERROR;
                                defpackage.abor aborVarE3 = izqVar4.e();
                                aborVarE3.t();
                                defpackage.ovj ovjVar5 = (defpackage.ovj) aborVarE3.b;
                                defpackage.ovj ovjVar6 = defpackage.ovj.a;
                                ovjVar5.b |= 256;
                                ovjVar5.k = iB2;
                                izqVar4.f(ovlVar3, aborVarE3);
                                new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.iqv(this.N.a, 7));
                                return;
                            }
                            iA += iB2;
                            iB -= iB2;
                            if (!z4) {
                                new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.irj(this.N, this.c, 0));
                            }
                            z4 = true;
                        } catch (java.lang.Throwable th) {
                            try {
                                throw th;
                            } catch (java.io.IOException e6) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.g()).p(e6)).ai((char) 1033)).u("Error reading remote audio record; quitting audio capture.");
                                this.l.c(defpackage.ovl.AUDIO_RECORD_READ_REMOTE_ERROR);
                                this.p.ax(defpackage.zaj.AUDIO_ERROR, defpackage.zak.NO_AUDIO_CAPTURE, "cannot capture audio");
                                return;
                            }
                        }
                    }
                    ipyVarB.a = java.lang.Math.round((android.os.SystemClock.elapsedRealtimeNanos() - d) / 1000.0d);
                    java.nio.ByteBuffer byteBuffer2 = ipyVarB.h;
                    byte[] bArrArray = byteBuffer2.array();
                    int iArrayOffset = byteBuffer2.arrayOffset() + byteBuffer2.position();
                    int iArrayOffset2 = byteBuffer2.arrayOffset() + byteBuffer2.limit();
                    int i9 = iArrayOffset2 - iArrayOffset;
                    if (i9 <= 72) {
                        if (defpackage.ere.g(bArrArray, iArrayOffset, i9)) {
                            if (!this.C) {
                                ((defpackage.yqj) this.e.l().ai(1031)).u("Posting AUDIO_QUALITY csat survey");
                                this.w.post(new defpackage.iks(this, 19));
                                this.C = true;
                            }
                            if (!z5) {
                                ((defpackage.yqj) this.e.l().ai(1030)).u("Switching from silence buffer to normal buffers");
                                if (this.i) {
                                    defpackage.iqh iqhVar9 = this.k;
                                    iqhVar9.getClass();
                                    ipyVarB2 = iqhVar9.a();
                                } else {
                                    ipyVarB2 = iqaVar.b();
                                }
                                byteBuffer = ipyVarB2.h;
                                if (byteBuffer.capacity() == byteBuffer2.capacity()) {
                                    throw new java.lang.IllegalArgumentException("Source and destination buffers must be of the same size.");
                                }
                                iPosition = byteBuffer2.position();
                                iLimit = byteBuffer2.limit();
                                try {
                                    byteBuffer2.position(0);
                                    byteBuffer2.limit(byteBuffer2.capacity());
                                    byteBuffer.position(0);
                                    byteBuffer.put(byteBuffer2);
                                    byteBuffer.order(byteBuffer2.order());
                                    byteBuffer.position(iPosition);
                                    byteBuffer.limit(iLimit);
                                    byteBuffer2.position(iPosition);
                                    byteBuffer2.limit(iLimit);
                                    ipyVarB2.b = ipyVarB.b;
                                    ipyVarB2.a = ipyVarB.a;
                                    ipyVarB2.c = ipyVarB.c;
                                    ipyVarB2.d = ipyVarB.d;
                                    ipyVarB2.e = ipyVarB.e;
                                    ipyVarB2.f = ipyVarB.f;
                                    ipyVarB2.g = ipyVarB.g;
                                    ipyVarB = ipyVarB2;
                                } catch (java.lang.Throwable th2) {
                                    byteBuffer2.position(iPosition);
                                    byteBuffer2.limit(iLimit);
                                    throw th2;
                                }
                            }
                            i6 = 0;
                        } else {
                            if (i6 < Integer.MAX_VALUE) {
                                i6++;
                            }
                            if (i6 > this.D.get() && !z5) {
                                ((defpackage.yqj) ((defpackage.yqj) this.e.l().l(1, java.util.concurrent.TimeUnit.SECONDS)).ai(1029)).u("put empty audio packet away");
                            }
                        }
                        atomicInteger = this.D;
                        if (i6 > atomicInteger.get()) {
                            i7++;
                            if (this.h) {
                                this.f.f();
                                ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 1023)).u("Quit audio capture");
                                break;
                            }
                            if (!z5) {
                                this.I = true;
                                this.t.z();
                                i = this.c;
                                if (i == 3) {
                                    atomicInteger.set(75);
                                    i = 3;
                                }
                                if (this.i) {
                                    ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1022)).u("bottom half starts streaming");
                                    defpackage.iqh iqhVar10 = this.k;
                                    iqhVar10.getClass();
                                    iqhVar10.v(this.M);
                                } else {
                                    iqhVar = this.k;
                                    if (iqhVar != null) {
                                        if (iqhVar.t() == this.L) {
                                            ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 1021)).u("previous session not released");
                                            this.l.c(defpackage.ovl.AUDIO_PREVIOUS_BOTTOM_HALF_NOT_RELEASED);
                                            iqhVar.f(true, false, null);
                                        }
                                    }
                                    yqmVar2 = this.e;
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1019)).u("Requesting bottom half for stream");
                                    izqVar = this.l;
                                    izqVar.c(defpackage.ovl.AUDIO_REQUESTING_BOTTOM_HALF);
                                    if (android.os.Build.VERSION.SDK_INT >= 30 || i != 5) {
                                        str = null;
                                    } else {
                                        defpackage.irg irgVar = this.J;
                                        if (irgVar instanceof defpackage.irf) {
                                            str = ((defpackage.irf) irgVar).i;
                                        } else {
                                            str = null;
                                        }
                                    }
                                    iqhVarH = this.r.h(i, str);
                                    if (iqhVarH != null) {
                                        this.k = iqhVarH;
                                        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1020)).u("bottom half starts streaming");
                                        iqhVarH.v(this.M);
                                        z = true;
                                        this.i = true;
                                        izqVar.c(defpackage.ovl.AUDIO_BOTTOM_HALF_AVAILABLE);
                                    } else {
                                        z = true;
                                    }
                                    iqaVar.f();
                                    this.z = z;
                                }
                                z5 = true;
                            }
                            if (this.i) {
                                g(ipyVarB.a);
                                defpackage.iqh iqhVar11 = this.k;
                                iqhVar11.getClass();
                                iqhVar11.l(ipyVarB);
                                this.g = android.os.SystemClock.elapsedRealtime();
                            } else if (this.I) {
                                iqaVar.e(ipyVarB);
                                yqmVar = this.e;
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.l().l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(1006)).w("Saved audio data to system capture queue until focus received for stream. Q size: %d", iqaVar.a());
                                if (iqaVar.a() > this.j) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.l().l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(1007)).u("discarding frame due to not having focus");
                                    iqaVar.d();
                                    this.t.w("AudioSourceService", defpackage.ovf.AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE);
                                }
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).l(1, java.util.concurrent.TimeUnit.SECONDS)).ai(1018)).u("Abandon frame on loss");
                            }
                        } else if (z5) {
                            yqmVar3 = this.e;
                            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(1025);
                            if (this.i) {
                                defpackage.iqh iqhVar12 = this.k;
                                iqhVar12.getClass();
                                strY = defpackage.tna.Y(iqhVar12.c);
                            } else {
                                strY = "UNKNOWN";
                            }
                            yqjVar.D("stopping streaming due to zero data, frames captured: %d, bottom half: %s", i7, strY);
                            defpackage.izq izqVar5 = this.l;
                            defpackage.ovl ovlVar4 = defpackage.ovl.AUDIO_STREAMING_STOPPED_DUE_TO_LONG_SILENCE;
                            defpackage.abor aborVarE4 = izqVar5.e();
                            aborVarE4.t();
                            defpackage.ovj ovjVar7 = (defpackage.ovj) aborVarE4.b;
                            defpackage.ovj ovjVar8 = defpackage.ovj.a;
                            ovjVar7.b |= 512;
                            ovjVar7.l = i7;
                            izqVar5.f(ovlVar4, aborVarE4);
                            if (this.i) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 1028)).u("Stop stream and release bottom half for stream");
                                defpackage.iqh iqhVar13 = this.k;
                                iqhVar13.getClass();
                                iqhVar13.f(true, false, null);
                                this.i = false;
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 1026)).u("Cancel bottom half request for stream");
                                this.r.a(this.c);
                                this.t.u(false);
                            }
                            if (this.H) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 1027)).u("Clear buffered audio inside voice session");
                                iqaVar.f();
                            }
                            i7 = 0;
                            z5 = false;
                        } else if (i6 >= this.j && iqaVar.a() > 0) {
                            ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1024)).u("Cancel bottom half request and clear the system capture queue for stream");
                            this.l.c(defpackage.ovl.AUDIO_STREAMING_REQUEST_CANCELLED_DUE_TO_LONG_SILENCE);
                            this.r.a(this.c);
                            iqaVar.f();
                        }
                    } else {
                        int i10 = (iArrayOffset + iArrayOffset2) - 24;
                        if (defpackage.ere.g(bArrArray, iArrayOffset, 24) || defpackage.ere.g(bArrArray, i10 / 2, 24) || defpackage.ere.g(bArrArray, iArrayOffset2 - 24, 24)) {
                            if (!this.C) {
                                ((defpackage.yqj) this.e.l().ai(1031)).u("Posting AUDIO_QUALITY csat survey");
                                this.w.post(new defpackage.iks(this, 19));
                                this.C = true;
                            }
                            if (!z5) {
                                ((defpackage.yqj) this.e.l().ai(1030)).u("Switching from silence buffer to normal buffers");
                                if (this.i) {
                                    defpackage.iqh iqhVar14 = this.k;
                                    iqhVar14.getClass();
                                    ipyVarB2 = iqhVar14.a();
                                } else {
                                    ipyVarB2 = iqaVar.b();
                                }
                                byteBuffer = ipyVarB2.h;
                                if (byteBuffer.capacity() == byteBuffer2.capacity()) {
                                    throw new java.lang.IllegalArgumentException("Source and destination buffers must be of the same size.");
                                }
                                iPosition = byteBuffer2.position();
                                iLimit = byteBuffer2.limit();
                                byteBuffer2.position(0);
                                byteBuffer2.limit(byteBuffer2.capacity());
                                byteBuffer.position(0);
                                byteBuffer.put(byteBuffer2);
                                byteBuffer.order(byteBuffer2.order());
                                byteBuffer.position(iPosition);
                                byteBuffer.limit(iLimit);
                                byteBuffer2.position(iPosition);
                                byteBuffer2.limit(iLimit);
                                ipyVarB2.b = ipyVarB.b;
                                ipyVarB2.a = ipyVarB.a;
                                ipyVarB2.c = ipyVarB.c;
                                ipyVarB2.d = ipyVarB.d;
                                ipyVarB2.e = ipyVarB.e;
                                ipyVarB2.f = ipyVarB.f;
                                ipyVarB2.g = ipyVarB.g;
                                ipyVarB = ipyVarB2;
                            }
                            i6 = 0;
                        } else {
                            if (i6 < Integer.MAX_VALUE) {
                                i6++;
                            }
                            if (i6 > this.D.get()) {
                            }
                        }
                        atomicInteger = this.D;
                        if (i6 > atomicInteger.get()) {
                            i7++;
                            if (this.h) {
                                this.f.f();
                                ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 1023)).u("Quit audio capture");
                                break;
                            }
                            if (!z5) {
                                this.I = true;
                                this.t.z();
                                i = this.c;
                                if (i == 3) {
                                    atomicInteger.set(75);
                                    i = 3;
                                }
                                if (this.i) {
                                    ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1022)).u("bottom half starts streaming");
                                    defpackage.iqh iqhVar15 = this.k;
                                    iqhVar15.getClass();
                                    iqhVar15.v(this.M);
                                } else {
                                    iqhVar = this.k;
                                    if (iqhVar != null) {
                                        if (iqhVar.t() == this.L) {
                                            ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 1021)).u("previous session not released");
                                            this.l.c(defpackage.ovl.AUDIO_PREVIOUS_BOTTOM_HALF_NOT_RELEASED);
                                            iqhVar.f(true, false, null);
                                        }
                                    }
                                    yqmVar2 = this.e;
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1019)).u("Requesting bottom half for stream");
                                    izqVar = this.l;
                                    izqVar.c(defpackage.ovl.AUDIO_REQUESTING_BOTTOM_HALF);
                                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                                        str = null;
                                    } else {
                                        str = null;
                                    }
                                    iqhVarH = this.r.h(i, str);
                                    if (iqhVarH != null) {
                                        this.k = iqhVarH;
                                        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1020)).u("bottom half starts streaming");
                                        iqhVarH.v(this.M);
                                        z = true;
                                        this.i = true;
                                        izqVar.c(defpackage.ovl.AUDIO_BOTTOM_HALF_AVAILABLE);
                                    } else {
                                        z = true;
                                    }
                                    iqaVar.f();
                                    this.z = z;
                                }
                                z5 = true;
                            }
                            if (this.i) {
                                g(ipyVarB.a);
                                defpackage.iqh iqhVar16 = this.k;
                                iqhVar16.getClass();
                                iqhVar16.l(ipyVarB);
                                this.g = android.os.SystemClock.elapsedRealtime();
                            } else if (this.I) {
                                iqaVar.e(ipyVarB);
                                yqmVar = this.e;
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.l().l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(1006)).w("Saved audio data to system capture queue until focus received for stream. Q size: %d", iqaVar.a());
                                if (iqaVar.a() > this.j) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.l().l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(1007)).u("discarding frame due to not having focus");
                                    iqaVar.d();
                                    this.t.w("AudioSourceService", defpackage.ovf.AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE);
                                }
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).l(1, java.util.concurrent.TimeUnit.SECONDS)).ai(1018)).u("Abandon frame on loss");
                            }
                        } else if (z5) {
                            yqmVar3 = this.e;
                            defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(1025);
                            if (this.i) {
                                defpackage.iqh iqhVar17 = this.k;
                                iqhVar17.getClass();
                                strY = defpackage.tna.Y(iqhVar17.c);
                            } else {
                                strY = "UNKNOWN";
                            }
                            yqjVar2.D("stopping streaming due to zero data, frames captured: %d, bottom half: %s", i7, strY);
                            defpackage.izq izqVar6 = this.l;
                            defpackage.ovl ovlVar5 = defpackage.ovl.AUDIO_STREAMING_STOPPED_DUE_TO_LONG_SILENCE;
                            defpackage.abor aborVarE5 = izqVar6.e();
                            aborVarE5.t();
                            defpackage.ovj ovjVar9 = (defpackage.ovj) aborVarE5.b;
                            defpackage.ovj ovjVar10 = defpackage.ovj.a;
                            ovjVar9.b |= 512;
                            ovjVar9.l = i7;
                            izqVar6.f(ovlVar5, aborVarE5);
                            if (this.i) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 1028)).u("Stop stream and release bottom half for stream");
                                defpackage.iqh iqhVar18 = this.k;
                                iqhVar18.getClass();
                                iqhVar18.f(true, false, null);
                                this.i = false;
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 1026)).u("Cancel bottom half request for stream");
                                this.r.a(this.c);
                                this.t.u(false);
                            }
                            if (this.H) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 1027)).u("Clear buffered audio inside voice session");
                                iqaVar.f();
                            }
                            i7 = 0;
                            z5 = false;
                        } else if (i6 >= this.j) {
                            ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1024)).u("Cancel bottom half request and clear the system capture queue for stream");
                            this.l.c(defpackage.ovl.AUDIO_STREAMING_REQUEST_CANCELLED_DUE_TO_LONG_SILENCE);
                            this.r.a(this.c);
                            iqaVar.f();
                        }
                    }
                    j = -1;
                }
                try {
                    java.util.concurrent.Executors.newSingleThreadExecutor().submit(new defpackage.inq(this, itnVar, 6)).get(m.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.InterruptedException e7) {
                    java.lang.Thread.currentThread().interrupt();
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e7)).ai((char) 1016)).u("Audio capture thread interrupted");
                    this.l.c(defpackage.ovl.AUDIO_RECORD_RELEASE_CAPTURE_THREAD_INTERRUPTED);
                } catch (java.util.concurrent.CancellationException e8) {
                    e = e8;
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e)).ai((char) 1017)).u("Failed to release audio record.");
                    this.l.c(defpackage.ovl.AUDIO_RECORD_RELEASE_FAILED);
                } catch (java.util.concurrent.ExecutionException e9) {
                    e = e9;
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e)).ai((char) 1017)).u("Failed to release audio record.");
                    this.l.c(defpackage.ovl.AUDIO_RECORD_RELEASE_FAILED);
                } catch (java.util.concurrent.TimeoutException e10) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e10)).ai((char) 1015)).u("Audio record release timeout");
                    this.l.c(defpackage.ovl.AUDIO_RECORD_RELEASE_TIMEOUT);
                }
                if (this.B) {
                    android.media.AudioManager audioManager = (android.media.AudioManager) this.a.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.adjustStreamVolume(3, -100, 0);
                }
                if (this.i) {
                    ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1014)).u("Properly stop audio stream before shutdown");
                    defpackage.iqh iqhVar19 = this.k;
                    iqhVar19.getClass();
                    iqhVar19.f(true, true, null);
                    this.i = false;
                }
            } catch (defpackage.ivx | defpackage.qst e11) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.f()).p(e11)).ai((char) 1035)).u("Error while disabling A2DP; abandoning capture.");
                this.v.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.wJ);
                e(itnVar);
            }
        } catch (defpackage.itb e12) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.f()).p(e12)).ai((char) 1037)).u("CarAudioPolicy has already been torn down; abandon capture thread.");
            this.v.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.wK);
        } catch (java.lang.InterruptedException e13) {
            java.lang.Thread.currentThread().interrupt();
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.f()).p(e13)).ai((char) 1038)).u("Interrupted during getAudioRecordWrapper.");
            this.v.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wC);
        }
    }

    private final void g(long j) {
        long jF;
        boolean z;
        long jMin;
        long jE;
        if (this.i) {
            defpackage.iqa iqaVar = this.f;
            int iA = iqaVar.a();
            if (this.K) {
                defpackage.jfo jfoVar = this.v;
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, this.c == 3 ? defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_MEDIA : defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_GUIDANCE, defpackage.zbd.xB);
                rrvVarH.w(iA);
                jfoVar.b(rrvVarH.l());
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
                ((defpackage.yqj) this.e.l().ai(1057)).w("System sound capture Q has %d entries", iA);
            }
            if (this.z) {
                if (defpackage.acnl.q()) {
                    defpackage.irl irlVar = this.G;
                    long j2 = this.g;
                    defpackage.jfe jfeVar = irlVar.a;
                    if (!jfeVar.bs() || jfeVar.h() != 2) {
                        jE = irlVar.b ? defpackage.acnl.e() : defpackage.acnl.f();
                    } else if (irlVar.f) {
                        jE = irlVar.e;
                    } else if (irlVar.c) {
                        jE = irlVar.b ? defpackage.acnl.d() : defpackage.acnl.k();
                    } else {
                        jE = irlVar.b ? defpackage.acnl.g() : defpackage.acnl.h();
                    }
                    float f = true != irlVar.b ? 15.625f : 23.4375f;
                    defpackage.tmy tmyVar = irlVar.d;
                    jMin = java.lang.Math.min(jE, (int) ((((android.os.SystemClock.elapsedRealtime() - j2) / 1000.0d) * ((double) f)) - 0.5d));
                } else {
                    int i = this.c;
                    defpackage.jfe jfeVar2 = this.q;
                    if (jfeVar2.bs() && jfeVar2.h() == 2) {
                        if (this.E) {
                            if (i == 3) {
                                jF = defpackage.acnl.b();
                                z = true;
                            } else {
                                jF = defpackage.acnl.c();
                                z = false;
                            }
                        } else if (this.F) {
                            if (i == 3) {
                                jF = defpackage.acnl.d();
                                z = true;
                            } else {
                                jF = defpackage.acnl.k();
                                z = false;
                            }
                        } else if (i == 3) {
                            jF = defpackage.acnl.g();
                            z = true;
                        } else {
                            jF = defpackage.acnl.h();
                            z = false;
                        }
                    } else if (i == 3) {
                        jF = defpackage.acnl.e();
                        z = true;
                    } else {
                        jF = defpackage.acnl.f();
                        z = false;
                    }
                    jMin = java.lang.Math.min(jF, (int) ((((android.os.SystemClock.elapsedRealtime() - this.g) / 1000.0d) * ((double) (true != z ? 15.625f : 23.4375f))) - 0.5d));
                }
                this.A = jMin;
                if (iqaVar.a() < this.A) {
                    defpackage.iqh iqhVar = this.k;
                    iqhVar.getClass();
                    defpackage.ipy ipyVarC = iqaVar.c();
                    long jElapsedRealtimeNanos = ipyVarC != null ? ipyVarC.a : j != -1 ? j : android.os.SystemClock.elapsedRealtimeNanos() / 1000;
                    for (long jA = this.A - ((long) iqaVar.a()); jA > 0; jA--) {
                        defpackage.ipy ipyVarB = iqaVar.b();
                        ipyVarB.b = jElapsedRealtimeNanos / 1000;
                        ipyVarB.a = jElapsedRealtimeNanos;
                        int iA2 = ipyVarB.a();
                        java.util.Arrays.fill(ipyVarB.h.array(), iA2, ipyVarB.b() + iA2, (byte) 0);
                        iqhVar.l(ipyVarB);
                        this.g = android.os.SystemClock.elapsedRealtime();
                    }
                }
                this.z = false;
            }
            defpackage.iqh iqhVar2 = this.k;
            iqhVar2.getClass();
            for (defpackage.ipy ipyVarD = iqaVar.d(); ipyVarD != null; ipyVarD = iqaVar.d()) {
                iqhVar2.l(ipyVarD);
                this.g = android.os.SystemClock.elapsedRealtime();
            }
        }
    }

    @Override // defpackage.iqb
    public final void a(java.io.PrintWriter printWriter) {
        printWriter.println("AudioCaptureThread stream type: " + defpackage.tna.Y(this.c) + " has focus:" + this.i + " inVoiceSession:" + this.H + " allowBufferingFrames:" + this.I + " minAudioBuffers:" + this.A + " lastFrameSentMillis:" + this.g + " systemSoundCaptureQ size:" + this.f.a() + " systemSoundTxQCleanThreshold:" + this.j + " systemSoundTxStopThreshold:" + java.lang.String.valueOf(this.D));
    }

    @Override // defpackage.iqb
    public final synchronized void b() {
        if (this.c == 3) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.D;
            atomicInteger.set(75);
            ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1050)).w("Voice session ended. New silence threshold: %d", atomicInteger.get());
            this.H = false;
        }
    }

    @Override // defpackage.iqb
    public final synchronized void c() {
        if (this.c == 3) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.D;
            boolean zCompareAndSet = atomicInteger.compareAndSet(75, 3);
            defpackage.yqm yqmVar = this.e;
            if (zCompareAndSet) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1051)).w("Voice session starting. New silence threshold: %d", atomicInteger.get());
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1052)).w("Unexpected threshold: %d", atomicInteger.get());
            }
            if (!this.d) {
                this.H = true;
                this.x.set(2);
            }
        }
    }

    public final defpackage.itn d(int i, int i2) throws defpackage.itb, defpackage.itc, android.os.RemoteException {
        boolean zE = defpackage.sqs.e();
        defpackage.yqm yqmVar = this.e;
        if (zE) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1049)).u("Mixing media and guidance audio on Q+");
            return this.b.b(i2);
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1058)).u("Set up fixed volume capture in P and below");
        this.b.d();
        defpackage.itn itnVarB = this.u.b(i, i2);
        android.media.AudioManager audioManager = (android.media.AudioManager) this.a.getSystemService("audio");
        audioManager.getClass();
        boolean zIsStreamMute = audioManager.isStreamMute(3);
        this.B = zIsStreamMute;
        if (zIsStreamMute) {
            audioManager.adjustStreamVolume(3, 100, 0);
        }
        return itnVarB;
    }

    public final void e(defpackage.itn itnVar) {
        try {
            itnVar.c();
        } catch (android.os.RemoteException | java.io.IOException e) {
            this.v.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yy);
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.h()).p(e)).ai((char) 1053)).u("Failure stopping and releasing remote audio record; ignoring due to shutdown.");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        defpackage.yqm yqmVar = defpackage.irk.a;
        try {
            java.util.concurrent.CountDownLatch countDownLatch = defpackage.irk.c;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (java.lang.InterruptedException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.irk.a.g()).p(e)).ai((char) 1211)).u("Interrupted waiting for JNI to load");
        }
        android.os.Process.setThreadPriority(-19);
        try {
            f();
        } finally {
            ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 1056)).u("Clearing system capture queue since audio capture thread is quitting");
            this.f.f();
            this.t.u(false);
        }
    }
}
