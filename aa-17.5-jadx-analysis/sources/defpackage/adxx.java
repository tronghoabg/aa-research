package defpackage;

/* loaded from: classes.dex */
final class adxx extends adjb {
    long a;
    final /* synthetic */ adyg b;
    private final adye c;

    public adxx(adyg adygVar, adye adyeVar) {
        this.b = adygVar;
        this.c = adyeVar;
    }

    @Override // defpackage.adqq
    public final void e(long j) {
        adyg adygVar = this.b;
        if (adygVar.r.f != null) {
            return;
        }
        synchronized (adygVar.m) {
            if (adygVar.r.f == null) {
                adye adyeVar = this.c;
                if (!adyeVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    long j3 = adygVar.v;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > adygVar.n) {
                        adyeVar.c = true;
                    } else {
                        long jB = adygVar.G.B(j2 - j3);
                        adygVar.v = this.a;
                        if (jB > adygVar.o) {
                            adyeVar.c = true;
                        }
                    }
                    Runnable runnableQ = adyeVar.c ? adygVar.q(adyeVar) : null;
                    if (runnableQ != null) {
                        runnableQ.run();
                    }
                }
            }
        }
    }
}
