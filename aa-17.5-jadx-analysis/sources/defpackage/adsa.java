package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class adsa implements Runnable, adjk {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ adsg f;

    public adsa(adsg adsgVar, adjr adjrVar, boolean z) {
        long jB;
        this.f = adsgVar;
        this.a = z;
        if (adjrVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = adjrVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    @Override // defpackage.adjk
    public final void a(adjq adjqVar) {
        if (this.b && this.a && (adjqVar.c() instanceof TimeoutException)) {
            this.f.h.c(b());
        } else {
            this.f.h.c(adqq.D(adjqVar));
        }
    }

    final adnq b() {
        long j = this.c;
        long jAbs = Math.abs(j);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j2 = jAbs / 1000000000;
        long jAbs2 = Math.abs(j);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long j3 = jAbs2 % 1000000000;
        StringBuilder sb = new StringBuilder(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(j2);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j3)));
        sb.append("s. ");
        adsg adsgVar = this.f;
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) adsgVar.g.g(adjb.f)) == null ? 0.0d : r0.longValue() / adsg.a)));
        if (adsgVar.h != null) {
            aduk adukVar = new aduk();
            adsgVar.h.b(adukVar);
            sb.append(" ");
            sb.append(adukVar);
        }
        return adnq.f.e(sb.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.c(b());
    }
}
