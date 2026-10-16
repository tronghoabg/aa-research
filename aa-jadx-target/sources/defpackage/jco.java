package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jco extends defpackage.jdr {
    public final java.lang.Object a;
    public final defpackage.yqk b;
    public final defpackage.zfw c;
    public boolean d;
    public final int e;
    private final defpackage.jcp l;
    private final defpackage.iyr m;
    private final boolean n;
    private final j$.time.Duration o;
    private j$.time.Duration p;
    private j$.time.Instant q;
    private final defpackage.iqh r;

    public jco(int i, defpackage.xlk xlkVar, int i2, int i3, defpackage.iqh iqhVar, defpackage.jbu jbuVar, defpackage.jcp jcpVar, defpackage.jba jbaVar, defpackage.irs irsVar, defpackage.iyr iyrVar, boolean z, boolean z2, defpackage.zfw zfwVar) {
        int i4;
        int i5 = defpackage.jdw.a;
        defpackage.jdu jduVar = new defpackage.jdu(new defpackage.jdv(jcpVar, irsVar, i, i3, z));
        if (i == 1) {
            i4 = 3;
        } else if (i != 2) {
            i4 = i != 3 ? 0 : 5;
        } else {
            i4 = 4;
        }
        super(i4, iqhVar, jbuVar, jcpVar, jbaVar, 2, xlkVar, jduVar, "AudioEndPoint", z2, null);
        this.a = new java.lang.Object();
        this.p = j$.time.Duration.ZERO;
        this.q = j$.time.Instant.EPOCH;
        boolean z3 = i != 3;
        if (i == 3) {
            this.b = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.MEDIA.LITE"));
        } else {
            this.b = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.TTS.LITE"));
        }
        this.e = i;
        this.r = iqhVar;
        this.l = jcpVar;
        this.m = iyrVar;
        this.n = !z3;
        j$.time.Duration durationOfNanos = j$.time.Duration.ofNanos((((long) defpackage.dmh.O(xlkVar, i2)) * 1000000000) / ((long) i2));
        this.o = durationOfNanos;
        if (!z3) {
            iyrVar.e(durationOfNanos);
        }
        this.c = zfwVar;
    }

    private final synchronized void G() {
        j$.time.Instant instantNow = j$.time.Instant.now();
        this.p = i(instantNow).plus(this.o);
        this.q = instantNow;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [iyr, java.lang.Object] */
    @Override // defpackage.jdr, defpackage.ize
    public final void b(int i) {
        if (this.n) {
            j$.util.Optional optionalA = A(i);
            defpackage.iyr iyrVar = this.m;
            iyrVar.getClass();
            defpackage.ilx ilxVar = new defpackage.ilx(iyrVar, 15);
            if (true == optionalA.isPresent()) {
                ilxVar.a.b((j$.time.Duration) optionalA.get());
            }
        }
        super.b(i);
    }

    @Override // defpackage.jdr
    public final defpackage.yqk h() {
        return this.b;
    }

    public final synchronized j$.time.Duration i(j$.time.Instant instant) {
        j$.time.Duration durationMinus = this.p.minus(j$.time.Duration.between(this.q, instant));
        if (!durationMinus.isNegative()) {
            return durationMinus;
        }
        return j$.time.Duration.ZERO;
    }

    @Override // defpackage.jdr
    protected final void r(defpackage.xjv xjvVar) {
        super.r(xjvVar);
        int iS = defpackage.wva.s(xjvVar.b);
        if (iS == 0 || iS != 2) {
            this.r.j();
            return;
        }
        defpackage.iqh iqhVar = this.r;
        iqhVar.g(defpackage.ovl.AUDIO_BOTTOM_HALF_CAR_READY);
        synchronized (iqhVar.m) {
            if (iqhVar.o) {
                return;
            }
            iqhVar.o = true;
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) iqhVar.a.f()).ai(1074);
            defpackage.acnp acnpVar = defpackage.acnp.a;
            yqjVar.y("Flag that enables save audio developer setting: %s", java.lang.Boolean.valueOf(acnpVar.fF().a()));
            if (acnpVar.fF().a()) {
                iqhVar.C = iqhVar.r.l();
            }
            if (defpackage.acnz.a.fF().d()) {
                iqhVar.n = new iqf(iqhVar.g, j$.time.Duration.ofMillis(defpackage.acnz.b()), j$.time.Duration.ofMillis(defpackage.acnz.c()));
            }
            iqhVar.j = new defpackage.iqx(iqhVar, iqhVar.y, iqhVar.A, iqhVar.D, iqhVar.x, iqhVar.n, iqhVar.E, iqhVar.f, iqhVar.c, iqhVar.d, iqhVar.e, iqhVar.z, iqhVar.u, iqhVar.q, iqhVar.C);
            defpackage.iqx iqxVar = iqhVar.j;
            iqxVar.getClass();
            synchronized (iqxVar) {
                iqxVar.sendMessage(iqxVar.obtainMessage(1));
            }
            try {
                if (!iqxVar.a.tryAcquire(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    throw new java.lang.IllegalStateException("Config change took too long");
                }
                defpackage.iqr iqrVar = iqhVar.b;
                int i = iqhVar.c;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.iqu.a.f()).ai((char) 1127)).y("Mark stream ready: %s", defpackage.tna.Y(i));
                defpackage.yqm yqmVar = defpackage.irk.a;
                int iAb = defpackage.a.ab(i);
                synchronized (((defpackage.iqu) iqrVar).b) {
                    int[] iArr = ((defpackage.iqu) iqrVar).c;
                    iArr[iAb] = iArr[iAb] | 1;
                }
                defpackage.iqj iqjVar = ((defpackage.iqu) iqrVar).f[iAb];
                if (iqjVar != null) {
                    iqjVar.b();
                }
                ((defpackage.iqu) iqrVar).e.g(defpackage.xik.AUDIO_FOCUS_STATE_INVALID);
                return;
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException("Interrupted waiting for init", e);
            }
            throw th;
        }
    }

    @Override // defpackage.jdr
    public final void s() {
        G();
    }

    @Override // defpackage.jdr
    public final void t() {
        this.b.l().ai(1868).u("onStartMessageSent");
        synchronized (this.a) {
            this.d = true;
        }
    }

    @Override // defpackage.jdr
    public final void u() {
        this.b.l().ai(1869).u("onStopMessageSent");
        java.lang.Object obj = this.a;
        synchronized (obj) {
            this.d = false;
            obj.notify();
        }
    }

    @Override // defpackage.jdr
    protected final void v(defpackage.xpi xpiVar) {
        int iZ = z(32769);
        super.o(32769, xpiVar, true, j$.util.Optional.of(this.o.multipliedBy(this.h)), j$.util.OptionalInt.of(iZ));
    }

    @Override // defpackage.jdr
    protected final void w(defpackage.xpj xpjVar) {
        l(32770, defpackage.xpj.a, j$.util.OptionalInt.of(z(32770)));
    }

    @Override // defpackage.jdr
    public final void x() {
        this.l.a();
        super.x();
    }

    @Override // defpackage.jdr
    public final boolean y() {
        synchronized (this.a) {
            if (this.d) {
                return true;
            }
            j$.time.Duration durationI = i(j$.time.Instant.now());
            if (!defpackage.a.W(durationI)) {
                return false;
            }
            defpackage.ypu ypuVarAi = this.b.f().ai(1867);
            int i = this.e;
            ypuVarAi.L("Channel %s has pending audio of %d ms", defpackage.sqs.be(i), durationI.toMillis());
            return true;
        }
    }
}
