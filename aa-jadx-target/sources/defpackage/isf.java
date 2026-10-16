package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isf implements defpackage.iyr {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.SYNC");
    private j$.util.Optional b = j$.util.Optional.empty();
    private final defpackage.ygw c;
    private final defpackage.ygw d;
    private defpackage.iup e;
    private defpackage.iup f;
    private j$.time.Duration g;
    private j$.time.Duration h;
    private j$.time.Duration i;
    private j$.time.Instant j;

    public isf() {
        defpackage.acnw acnwVar = defpackage.acnw.a;
        defpackage.ygw ygwVarO = defpackage.ygw.o(acnwVar.fF().h().b);
        this.c = ygwVarO;
        defpackage.ygw ygwVarO2 = defpackage.ygw.o(acnwVar.fF().i().b);
        this.d = ygwVarO2;
        this.e = new defpackage.iup(ygwVarO);
        this.f = new defpackage.iup(ygwVarO2);
        this.g = j$.time.Duration.ofMillis(-1L);
        this.h = j$.time.Duration.ofMillis(-1L);
        this.i = j$.time.Duration.ZERO;
        this.j = j$.time.Instant.EPOCH;
    }

    private final synchronized j$.time.Duration g(j$.time.Instant instant) {
        j$.time.Duration durationMinus = this.i.minus(j$.time.Duration.between(this.j, instant));
        if (!durationMinus.isNegative()) {
            return durationMinus;
        }
        return j$.time.Duration.ZERO;
    }

    public final synchronized j$.util.Optional a() {
        j$.util.Optional optionalA = this.e.a();
        j$.util.Optional optionalA2 = this.f.a();
        d();
        if (!optionalA.isEmpty() && !optionalA2.isEmpty()) {
            return j$.util.Optional.of(new ise((yzv) optionalA.get(), (yzv) optionalA2.get()));
        }
        return j$.util.Optional.empty();
    }

    @Override // defpackage.iyr
    public final synchronized void b(j$.time.Duration duration) {
        defpackage.ysr.bk(this.b.isPresent(), "Audio frame duration not set.");
        j$.time.Instant instantNow = j$.time.Instant.now();
        this.g = duration;
        j$.time.Duration durationG = g(instantNow);
        this.h = duration.plus(durationG);
        this.i = durationG.plus((j$.time.Duration) this.b.get());
        this.j = instantNow;
    }

    @Override // defpackage.iyr
    public final synchronized void c(j$.time.Duration duration) {
        if (this.g.isNegative()) {
            return;
        }
        long millis = this.g.minus(duration).toMillis();
        long millis2 = this.h.minus(duration).toMillis();
        this.e.c(millis, 1);
        this.f.c(millis2, 1);
        a.e().l(10, java.util.concurrent.TimeUnit.SECONDS).ai(1271).T("A/V lag: %s ms, perceived lag: %s ms, audio latency: %s ms, audio latency adjusted by buffer: %s ms, video latency: %s ms", java.lang.Long.valueOf(millis), java.lang.Long.valueOf(millis2), java.lang.Long.valueOf(this.g.toMillis()), java.lang.Long.valueOf(this.h.toMillis()), java.lang.Long.valueOf(duration.toMillis()));
    }

    public final synchronized void d() {
        this.e = new defpackage.iup(this.c);
        this.f = new defpackage.iup(this.d);
        this.g = j$.time.Duration.ofMillis(-1L);
        this.h = j$.time.Duration.ofMillis(-1L);
    }

    @Override // defpackage.iyr
    public final synchronized void e(j$.time.Duration duration) {
        defpackage.ysr.bk(defpackage.a.W(duration), "Audio frame duration must be positive.");
        this.b = j$.util.Optional.of(duration);
    }

    public final synchronized void f() {
        a();
        this.b = j$.util.Optional.empty();
        this.i = j$.time.Duration.ZERO;
        this.j = j$.time.Instant.EPOCH;
    }
}
