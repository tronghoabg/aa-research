package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jch extends jdk {
    public final Object a;
    public final ypf b;
    public final zeq c;
    public boolean d;
    public final int e;
    private final xkj l;
    private final int m;
    private final jci n;
    private final iyk o;
    private final boolean p;
    private final Duration q;
    private Duration r;
    private Instant s;
    private final iqa y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jch(int i, xkj xkjVar, int i2, int i3, iqa iqaVar, jbn jbnVar, jci jciVar, jat jatVar, irk irkVar, iyk iykVar, boolean z, boolean z2, zeq zeqVar) {
        super(i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3, iqaVar, jbnVar, jciVar, jatVar, 2, xkjVar, new jdn(new jdo(jciVar, irkVar, i, i3, z)), "AudioEndPoint", z2, null);
        int i4 = jdp.a;
        this.a = new Object();
        this.r = Duration.ZERO;
        this.s = Instant.EPOCH;
        boolean z3 = i != 3;
        if (i == 3) {
            this.b = new yph(yqn.d("CAR.AUDIO.MEDIA.LITE"));
        } else {
            this.b = new yph(yqn.d("CAR.AUDIO.TTS.LITE"));
        }
        this.e = i;
        this.l = xkjVar;
        this.m = i2;
        this.y = iqaVar;
        this.n = jciVar;
        this.o = iykVar;
        this.p = !z3;
        Duration durationR = r();
        this.q = durationR;
        if (!z3) {
            iykVar.e(durationR);
        }
        this.c = zeqVar;
    }

    private final synchronized void H() {
        Instant instantNow = Instant.now();
        this.r = i(instantNow).plus(this.q);
        this.s = instantNow;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [iyk, java.lang.Object] */
    @Override // defpackage.jdk, defpackage.iyx
    public final void b(int i) {
        if (this.p) {
            Optional optionalB = B(i);
            iyk iykVar = this.o;
            iykVar.getClass();
            iln ilnVar = new iln(iykVar, 14);
            if (true == optionalB.isPresent()) {
                ilnVar.a.b((Duration) optionalB.get());
            }
        }
        super.b(i);
    }

    @Override // defpackage.jdk
    public final ypf h() {
        return this.b;
    }

    public final synchronized Duration i(Instant instant) {
        Duration durationMinus = this.r.minus(Duration.between(this.s, instant));
        if (!durationMinus.isNegative()) {
            return durationMinus;
        }
        return Duration.ZERO;
    }

    final Duration r() {
        int i = 1024;
        if (this.l == xkj.MEDIA_CODEC_AUDIO_PCM && this.m != 16000) {
            i = 2048;
        }
        return Duration.ofNanos((long) (i * (1.0E9f / this.m)));
    }

    @Override // defpackage.jdk
    protected final void s(xiu xiuVar) {
        super.s(xiuVar);
        int iZ = wpq.z(xiuVar.b);
        if (iZ == 0 || iZ != 2) {
            this.y.j();
            return;
        }
        iqa iqaVar = this.y;
        iqaVar.g(ouo.AUDIO_BOTTOM_HALF_CAR_READY);
        synchronized (iqaVar.m) {
            if (iqaVar.o) {
                return;
            }
            iqaVar.o = true;
            ype ypeVar = (ype) ((ype) iqaVar.a.f()).ai(1074);
            acmn acmnVar = acmn.a;
            ypeVar.y("Flag that enables save audio developer setting: %s", Boolean.valueOf(acmnVar.gu().a()));
            if (acmnVar.gu().a()) {
                iqaVar.C = iqaVar.r.l();
            }
            if (acmx.f()) {
                iqaVar.n = new ipy(iqaVar.g, Duration.ofMillis(acmx.b()), Duration.ofMillis(acmx.c()));
            }
            iqaVar.j = new iqp(iqaVar, iqaVar.y, iqaVar.A, iqaVar.D, iqaVar.x, iqaVar.n, iqaVar.E, iqaVar.f, iqaVar.c, iqaVar.d, iqaVar.e, iqaVar.z, iqaVar.u, iqaVar.q, iqaVar.C);
            iqp iqpVar = iqaVar.j;
            iqpVar.getClass();
            synchronized (iqpVar) {
                iqpVar.sendMessage(iqpVar.obtainMessage(1));
            }
            try {
                if (!iqpVar.a.tryAcquire(5000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Config change took too long");
                }
                iqk iqkVar = iqaVar.b;
                int i = iqaVar.c;
                ((ype) ((ype) iqn.a.f()).ai((char) 1127)).y("Mark stream ready: %s", roc.O(i));
                yph yphVar = irb.a;
                int iAc = a.ac(i);
                synchronized (((iqn) iqkVar).b) {
                    int[] iArr = ((iqn) iqkVar).c;
                    iArr[iAc] = iArr[iAc] | 1;
                }
                iqc iqcVar = ((iqn) iqkVar).f[iAc];
                if (iqcVar != null) {
                    iqcVar.b();
                }
                ((iqn) iqkVar).e.g(xhj.AUDIO_FOCUS_STATE_INVALID);
                return;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted waiting for init", e);
            }
        }
    }

    @Override // defpackage.jdk
    public final void t() {
        H();
    }

    @Override // defpackage.jdk
    public final void u() {
        this.b.l().ai(1868).u("onStartMessageSent");
        synchronized (this.a) {
            this.d = true;
        }
    }

    @Override // defpackage.jdk
    public final void v() {
        this.b.l().ai(1869).u("onStopMessageSent");
        Object obj = this.a;
        synchronized (obj) {
            this.d = false;
            obj.notify();
        }
    }

    @Override // defpackage.jdk
    protected final void w(xoh xohVar) {
        int iA = A(32769);
        super.o(32769, xohVar, true, Optional.of(r().multipliedBy(this.h)), OptionalInt.of(iA));
    }

    @Override // defpackage.jdk
    protected final void x(xoi xoiVar) {
        l(32770, xoi.a, OptionalInt.of(A(32770)));
    }

    @Override // defpackage.jdk
    public final void y() {
        this.n.a();
        super.y();
    }

    @Override // defpackage.jdk
    public final boolean z() {
        synchronized (this.a) {
            if (this.d) {
                return true;
            }
            Duration durationI = i(Instant.now());
            if (!a.X(durationI)) {
                return false;
            }
            yop yopVarAi = this.b.f().ai(1867);
            int i = this.e;
            yopVarAi.L("Channel %s has pending audio of %d ms", wub.r(i), durationI.toMillis());
            return true;
        }
    }
}
