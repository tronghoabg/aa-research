package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class ppw {
    public final int a;
    public pqu b;
    public final pqj c;
    final /* synthetic */ nzj d;
    private Instant e;
    private final Instant f;
    private Instant g = null;
    private final pqu h;
    private final pxy i;

    public ppw(nzj nzjVar, Instant instant, Instant instant2, int i, pqu pquVar, pqu pquVar2, pxy pxyVar, pqj pqjVar) {
        this.d = nzjVar;
        this.e = instant;
        this.f = instant2;
        this.a = i;
        this.h = pquVar;
        this.b = pquVar2;
        this.i = pxyVar;
        this.c = pqjVar;
    }

    private final Instant f() {
        Instant instantA;
        zeq zeqVar = (zeq) ((Optional) this.d.b).orElse(null);
        if (zeqVar != null && (instantA = zeqVar.a()) != null) {
            return instantA;
        }
        Instant instant = Instant.EPOCH;
        instant.getClass();
        return instant;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ackk, java.lang.Object] */
    private final void g(int i, int i2, pvq pvqVar, int i3, Duration duration) {
        nzj nzjVar = this.d;
        ((sm) nzjVar.a.a()).A(this.h, this.b, this.i, this.c, i2 - 1, pvqVar, i3, a(), Duration.ZERO, duration);
        ?? r0 = nzjVar.c;
        int i4 = i - 1;
        if (i4 == 1) {
            a().toMillis();
        } else {
            if (i4 != 3) {
                return;
            }
            a().toMillis();
        }
    }

    public final Duration a() {
        Instant instantF = this.e;
        if (instantF == null) {
            instantF = f();
        }
        Duration durationBetween = Duration.between(instantF, f());
        durationBetween.getClass();
        return durationBetween;
    }

    public final Duration b() {
        Instant instantF = this.f;
        if (instantF == null) {
            instantF = f();
        }
        Duration durationBetween = Duration.between(instantF, f());
        durationBetween.getClass();
        return durationBetween;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ackk, java.lang.Object] */
    public final void c() {
        if (this.e == null) {
            Instant instantF = f();
            this.e = instantF;
            this.g = instantF;
        } else {
            this.g = f();
        }
        nzj nzjVar = this.d;
        ((sm) nzjVar.a.a()).A(this.h, this.b, this.i, this.c, this.a - 1, null, 0, a(), Duration.ZERO, b());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ackk, java.lang.Object] */
    public final ppw d(Context context, pqu pquVar, pvq pvqVar, int i) {
        context.getClass();
        pquVar.getClass();
        if (this.b == pqu.c && pquVar == pqu.b) {
        }
        int i2 = this.a;
        g(4, i2, pvqVar, i, b());
        nzj nzjVar = this.d;
        lws.N(context);
        return new ppw(nzjVar, this.e, this.g, i2 + 1, this.h, pquVar, this.i, this.c);
    }

    public final void e(int i, pvq pvqVar, int i2) {
        g(i, this.a, pvqVar, i2, b());
    }
}
