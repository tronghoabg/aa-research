package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class irx implements iyk {
    private static final ypf a = ols.R("CAR.GAL.SYNC");
    private Optional b = Optional.empty();
    private final yfq c;
    private final yfq d;
    private iuh e;
    private iuh f;
    private Duration g;
    private Duration h;
    private Duration i;
    private Instant j;

    public irx() {
        acmu acmuVar = acmu.a;
        yfq yfqVarO = yfq.o(acmuVar.gu().h().b);
        this.c = yfqVarO;
        yfq yfqVarO2 = yfq.o(acmuVar.gu().i().b);
        this.d = yfqVarO2;
        this.e = new iuh(yfqVarO);
        this.f = new iuh(yfqVarO2);
        this.g = Duration.ofMillis(-1L);
        this.h = Duration.ofMillis(-1L);
        this.i = Duration.ZERO;
        this.j = Instant.EPOCH;
    }

    private final synchronized Duration g(Instant instant) {
        Duration durationMinus = this.i.minus(Duration.between(this.j, instant));
        if (!durationMinus.isNegative()) {
            return durationMinus;
        }
        return Duration.ZERO;
    }

    public final synchronized Optional a() {
        Optional optionalA = this.e.a();
        Optional optionalA2 = this.f.a();
        d();
        if (!optionalA.isEmpty() && !optionalA2.isEmpty()) {
            return Optional.of(new irw((yyq) optionalA.get(), (yyq) optionalA2.get()));
        }
        return Optional.empty();
    }

    @Override // defpackage.iyk
    public final synchronized void b(Duration duration) {
        woy.aa(this.b.isPresent(), "Audio frame duration not set.");
        Instant instantNow = Instant.now();
        this.g = duration;
        Duration durationG = g(instantNow);
        this.h = duration.plus(durationG);
        this.i = durationG.plus((Duration) this.b.get());
        this.j = instantNow;
    }

    @Override // defpackage.iyk
    public final synchronized void c(Duration duration) {
        if (this.g.isNegative()) {
            return;
        }
        long millis = this.g.minus(duration).toMillis();
        long millis2 = this.h.minus(duration).toMillis();
        this.e.c(millis, 1);
        this.f.c(millis2, 1);
        a.e().l(10, TimeUnit.SECONDS).ai(1271).T("A/V lag: %s ms, perceived lag: %s ms, audio latency: %s ms, audio latency adjusted by buffer: %s ms, video latency: %s ms", Long.valueOf(millis), Long.valueOf(millis2), Long.valueOf(this.g.toMillis()), Long.valueOf(this.h.toMillis()), Long.valueOf(duration.toMillis()));
    }

    public final synchronized void d() {
        this.e = new iuh(this.c);
        this.f = new iuh(this.d);
        this.g = Duration.ofMillis(-1L);
        this.h = Duration.ofMillis(-1L);
    }

    @Override // defpackage.iyk
    public final synchronized void e(Duration duration) {
        woy.aa(a.X(duration), "Audio frame duration must be positive.");
        this.b = Optional.of(duration);
    }

    public final synchronized void f() {
        a();
        this.b = Optional.empty();
        this.i = Duration.ZERO;
        this.j = Instant.EPOCH;
    }
}
