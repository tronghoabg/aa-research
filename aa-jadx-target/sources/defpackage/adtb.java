package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adtb implements java.lang.Runnable, adkl {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile java.util.concurrent.ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ defpackage.adth f;

    public adtb(defpackage.adth adthVar, defpackage.adks adksVar, boolean z) {
        long jB;
        this.f = adthVar;
        this.a = z;
        if (adksVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = adksVar.b(java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    public final void a(defpackage.adkr adkrVar) {
        if (this.b && this.a && (adkrVar.c() instanceof java.util.concurrent.TimeoutException)) {
            this.f.h.c(b());
        } else {
            this.f.h.c(defpackage.adrs.D(adkrVar));
        }
    }

    final defpackage.ador b() {
        long j = this.c;
        long jAbs = java.lang.Math.abs(j);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        long j2 = jAbs / 1000000000;
        long jAbs2 = java.lang.Math.abs(j);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        long j3 = jAbs2 % 1000000000;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(j2);
        sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(j3)));
        sb.append("s. ");
        defpackage.adth adthVar = this.f;
        java.lang.Long l = (java.lang.Long) adthVar.g.g(defpackage.adkb.f);
        sb.append(java.lang.String.format(java.util.Locale.US, "Name resolution delay %.9f seconds.", java.lang.Double.valueOf(l == null ? 0.0d : l.longValue() / defpackage.adth.a)));
        if (adthVar.h != null) {
            defpackage.advl advlVar = new defpackage.advl();
            adthVar.h.b(advlVar);
            sb.append(" ");
            sb.append(advlVar);
        }
        return defpackage.ador.f.e(sb.toString());
    }

    final void c() {
        this.e = true;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.d;
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
