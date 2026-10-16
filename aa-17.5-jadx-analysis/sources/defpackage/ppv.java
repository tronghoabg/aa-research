package defpackage;

import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ppv {
    private final pnj d;
    private Duration e = a;
    private boolean f = false;
    private static final yob c = yob.c("com/google/android/apps/gmm/systems/clientparam/fetcher/ClientParametersRetryManager");
    static final Duration a = Duration.ofSeconds(10);
    static final Duration b = Duration.ofMinutes(30);

    public ppv(xxh xxhVar) {
        this.d = (pnj) xxhVar.e();
    }

    private final Duration d() {
        pnj pnjVar = this.d;
        if (pnjVar == null || !((aaws) pnjVar.a()).b) {
            return a;
        }
        Duration duration = a;
        aawr aawrVar = ((aaws) pnjVar.a()).c;
        if (aawrVar == null) {
            aawrVar = aawr.a;
        }
        return (Duration) ysi.j(duration, Duration.ofSeconds(aawrVar.b));
    }

    private static boolean e(pwu pwuVar) {
        return Objects.equals(pwuVar, pwu.b) || Objects.equals(pwuVar, pwu.k);
    }

    final synchronized Duration a(pwu pwuVar) {
        if (!this.f) {
            b();
        }
        pnj pnjVar = this.d;
        boolean z = false;
        if (pnjVar != null && ((aaws) pnjVar.a()).b && ((aaws) pnjVar.a()).d) {
            z = true;
        }
        if (e(pwuVar) && !z) {
            return d();
        }
        Duration durationOfMillis = this.e;
        if (pnjVar == null || !((aaws) pnjVar.a()).b) {
            this.e = (Duration) ysi.k(this.e.multipliedBy(11L).dividedBy(10L), b);
        } else {
            aawr aawrVar = ((aaws) pnjVar.a()).c;
            if (aawrVar == null) {
                aawrVar = aawr.a;
            }
            if (aawrVar.f) {
                durationOfMillis = Duration.ofMillis((long) (durationOfMillis.toMillis() * ((Math.random() * 0.5d) + 0.5d)));
            }
            this.e = (Duration) ysi.k(this.e.multipliedBy(Math.max(100, aawrVar.d)).dividedBy(100L), Duration.ofSeconds(Math.max(1, aawrVar.c)));
        }
        return durationOfMillis;
    }

    final synchronized void b() {
        ((ynz) ((ynz) c.f()).ai((char) 6805)).u("Resetting retry delay.");
        this.e = d();
        this.f = true;
    }

    final synchronized boolean c(int i, pwu pwuVar) {
        if (e(pwuVar)) {
            return true;
        }
        pnj pnjVar = this.d;
        if (pnjVar != null && ((aaws) pnjVar.a()).b) {
            aawr aawrVar = ((aaws) pnjVar.a()).c;
            if (aawrVar == null) {
                aawrVar = aawr.a;
            }
            int i2 = aawrVar.e;
            return i2 <= 0 || i <= i2;
        }
        return true;
    }
}
