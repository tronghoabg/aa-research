package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbk extends defpackage.jbl {
    long a;
    long b;
    public long c;
    final /* synthetic */ defpackage.jbm d;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;
    private boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbk(defpackage.jbm jbmVar, defpackage.jei jeiVar, long j, long j2, long j3, long j4) {
        super(jbmVar, jeiVar);
        this.d = jbmVar;
        this.l = 0L;
        this.m = 0L;
        this.c = 0L;
        this.n = false;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
        this.r = false;
        this.s = false;
        this.j = j;
        this.a = j2;
        this.k = j3;
        this.b = j4;
    }

    private final synchronized void l() {
        if (!this.q) {
            if (this.c > this.j) {
                defpackage.jbm jbmVar = this.d;
                if (!jbmVar.o) {
                    defpackage.jbm.b.l().ai(1764).G("%dms buffered in MD over %dms threshold", this.c / 1000000, this.j / 1000000);
                    m(this.a);
                    jbmVar.f(defpackage.yyn.FRAMER_WRITER_AUDIO_BUFFER_OVERFLOW);
                }
            }
            long j = 0;
            if (this.k > 0 && !n()) {
                long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                long jA = a(jElapsedRealtimeNanos) + super.c().l;
                if (jA > this.k) {
                    defpackage.jbm.b.l().ai(1763).G("%dms buffered in HU over %dms threshold", jA / 1000000, this.k / 1000000);
                    m(0L);
                    this.d.f(defpackage.yyn.FRAMER_WRITER_HU_AUDIO_BUFFER_OVERFLOW);
                    this.r = true;
                } else if (this.r) {
                    long jA2 = a(jElapsedRealtimeNanos);
                    if (jA2 > this.b) {
                        defpackage.jbm.b.l().ai(1762).G("%dms buffered in HU still over %dms lower threshold", jA2 / 1000000, this.b / 1000000);
                        m(0L);
                    } else {
                        this.r = false;
                    }
                }
            }
            if (this.h) {
                long jElapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
                long jA3 = a(jElapsedRealtimeNanos2) + this.c;
                long j2 = this.d.c;
                if (jA3 <= j2) {
                    this.h = false;
                    return;
                }
                long jA4 = j2 - a(jElapsedRealtimeNanos2);
                if (jA4 < 0) {
                    defpackage.jbm.b.f().l(3, java.util.concurrent.TimeUnit.SECONDS).ai(1761).x("Negative targetBuffer while trying to prune in a stall. huBuffered: %d", a(jElapsedRealtimeNanos2));
                } else {
                    j = jA4;
                }
                m(j);
            }
        }
    }

    private final synchronized void m(long j) {
        try {
            if (j < 0) {
                throw new java.lang.IllegalStateException("Target buffer cannot be less than 0.");
            }
            long j2 = this.c;
            int i = 0;
            defpackage.izt iztVarJ = null;
            while (this.c > j && super.c().c.o() == 0) {
                this.c -= super.c().l;
                iztVarJ = super.j();
                iztVarJ.c.close();
                i++;
            }
            if (i > 0 && iztVarJ != null) {
                defpackage.izr izrVar = ((defpackage.izs) this.d.p.a).n;
                izrVar.sendMessage(izrVar.obtainMessage(3, iztVarJ.b, i, null));
            }
            defpackage.jbm.b.h().ai(1766).S("Pruned %d messages from MD buffer to go from %dms to %dms (target buffer is %dms)", java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j2 / 1000000), java.lang.Long.valueOf(this.c / 1000000), java.lang.Long.valueOf(j / 1000000));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean n() {
        return this.e.isEmpty();
    }

    public final long a(long j) {
        long j2 = this.l - (j - this.m);
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    @Override // defpackage.jbl
    public final long b() {
        long j = this.p;
        if (j == 0) {
            return 0L;
        }
        long jElapsedRealtimeNanos = (j - android.os.SystemClock.elapsedRealtimeNanos()) / 1000;
        if (jElapsedRealtimeNanos > 0) {
            return jElapsedRealtimeNanos;
        }
        this.p = 0L;
        return 0L;
    }

    @Override // defpackage.jbl
    public final synchronized defpackage.izt c() {
        this.q = true;
        return super.c();
    }

    @Override // defpackage.jbl
    public final defpackage.jei d() {
        long jA = a(android.os.SystemClock.elapsedRealtimeNanos());
        defpackage.jbm jbmVar = this.d;
        long j = jbmVar.d;
        boolean z = this.s;
        if (jA > j) {
            if (!z) {
                this.s = true;
                jbmVar.f(defpackage.yyn.FRAMER_WRITER_AV_PRIORITY_INVERTED);
            }
            return defpackage.jei.AUDIO_HIGH_BUFFER;
        }
        if (z) {
            this.s = false;
            jbmVar.f(defpackage.yyn.FRAMER_WRITER_AV_PRIORITY_RESTORED);
        }
        return this.f;
    }

    @Override // defpackage.jbl
    public final synchronized void e(defpackage.izt iztVar) {
        if (iztVar.a != 0) {
            throw new java.lang.IllegalArgumentException("PerChannelWriterThread does not accept pre-fragmented messages.");
        }
        defpackage.jcu jcuVar = iztVar.c;
        short sO = jcuVar.o();
        int i = 3;
        if (sO != -32767) {
            long j = 64000000;
            if (sO == 0) {
                if (this.n) {
                    j = this.o;
                    iztVar.l = j;
                } else {
                    int i2 = iztVar.d;
                    if (i2 == 8202 || i2 == 4106) {
                        j = 42666666;
                        iztVar.l = 42666666L;
                    } else {
                        if (i2 != 2058) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i2, "Audio data message is too big! size = "));
                        }
                        iztVar.l = 64000000L;
                    }
                }
                this.c += j;
                defpackage.jbm.b.f().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(1759).z("MD BUF = %f ms HU BUF = %f ms", this.c / 1000000.0f, a(android.os.SystemClock.elapsedRealtimeNanos()) / 1000000.0f);
            } else if (sO == 1) {
                defpackage.ypu ypuVarAi = defpackage.jbm.b.f().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(1760);
                int i3 = iztVar.d;
                ypuVarAi.w("Processing media config of length %d", i3);
                if (i3 >= 4) {
                    this.n = true;
                    int iA = jcuVar.a(2) & 7;
                    int iA2 = ((jcuVar.a(3) >> 7) & 1) | (iA + iA);
                    if (iA2 == 3) {
                        this.o = 21333333L;
                    } else if (iA2 != 8) {
                        this.o = 21333333L;
                        defpackage.jbm.a.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(1765).w("Failed to decode AAC sampling rate: %d", iA2);
                        this.d.f(defpackage.yyn.FRAMER_WRITER_AAC_CODECINFO_DECODE_FAIL);
                    } else {
                        this.o = 64000000L;
                    }
                }
            }
        } else {
            j$.util.Optional optional = iztVar.j;
            if (optional.isPresent() && this.k > 0) {
                long nanos = ((j$.time.Duration) optional.get()).toNanos();
                defpackage.ypu ypuVarAi2 = defpackage.jbm.a.f().ai(1755);
                java.lang.Long lValueOf = java.lang.Long.valueOf(nanos);
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(this.k);
                defpackage.jbm jbmVar = this.d;
                boolean z = jbmVar.n;
                ypuVarAi2.R("maxUnacked: %d, threshold: %d, force flag: %b", lValueOf, lValueOf2, java.lang.Boolean.valueOf(z));
                if (nanos >= this.k) {
                    defpackage.jbm.b.f().ai(1756).G("Max unacked of %dms is NOT less than dropHuAudioThreshold of %dms", nanos / 1000000, this.k / 1000000);
                } else if (z) {
                    defpackage.jbm.b.f().ai(1758).G("Max unacked of %dms is less than dropHuAudioThreshold of %dms, using legacy configuration values", nanos / 1000000, this.k / 1000000);
                    java.util.function.BiFunction biFunction = jbmVar.g;
                    if (this.f != defpackage.jei.AUDIO_MEDIA) {
                        i = 5;
                    }
                    defpackage.ipz ipzVar = (defpackage.ipz) a$.ExternalSyntheticApiModelOutline2.m(biFunction, java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE);
                    long j2 = ipzVar.a * 1000000;
                    long j3 = Long.MAX_VALUE;
                    if (j2 == 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.j = j2;
                    long j4 = ipzVar.b * 1000000;
                    if (j4 != 0) {
                        j3 = j4;
                    }
                    this.a = j3;
                    this.k = ipzVar.c * 1000000;
                    this.b = ipzVar.d * 1000000;
                } else {
                    defpackage.jbm.b.f().ai(1757).G("Max unacked of %dms is less than dropHuAudioThreshold of %dms", nanos / 1000000, this.k / 1000000);
                }
            }
        }
        super.e(iztVar);
    }

    @Override // defpackage.jbl
    public final void f() {
        if (this.d.o) {
            return;
        }
        this.h = true;
    }

    @Override // defpackage.jbl
    public final synchronized void g(int i, java.io.PrintWriter printWriter) {
        printWriter.format(" %d messages on channel %d, priority = %d HU buffer = %f MD buffer = %f%n", java.lang.Integer.valueOf(this.e.size()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(d().j), java.lang.Float.valueOf(a(android.os.SystemClock.elapsedRealtimeNanos()) / 1000000.0f), java.lang.Float.valueOf(this.c / 1000000.0f));
    }

    @Override // defpackage.jbl
    protected final synchronized void h() throws java.io.IOException {
        long j = super.c().l;
        this.c -= j;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        if (d() == defpackage.jei.AUDIO_HIGH_BUFFER) {
            this.p = (j >> 1) + jElapsedRealtimeNanos;
        }
        this.l = a(jElapsedRealtimeNanos) + j;
        this.m = jElapsedRealtimeNanos;
        j();
        this.q = false;
    }

    @Override // defpackage.jbl
    public final void i() throws java.lang.InterruptedException, java.io.IOException {
        l();
        if (n()) {
            return;
        }
        super.i();
    }
}
