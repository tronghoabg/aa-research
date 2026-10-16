package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adza extends defpackage.adkb {
    long a;
    final /* synthetic */ defpackage.adzi b;
    private final defpackage.adzg c;

    public adza(defpackage.adzi adziVar, defpackage.adzg adzgVar) {
        this.b = adziVar;
        this.c = adzgVar;
    }

    @Override // defpackage.adrq
    public final void e(long j) {
        defpackage.adzi adziVar = this.b;
        if (adziVar.r.f != null) {
            return;
        }
        synchronized (adziVar.m) {
            if (adziVar.r.f == null) {
                defpackage.adzg adzgVar = this.c;
                if (!adzgVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    long j3 = adziVar.v;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > adziVar.n) {
                        adzgVar.c = true;
                    } else {
                        long jD = adziVar.G.D(j2 - j3);
                        adziVar.v = this.a;
                        if (jD > adziVar.o) {
                            adzgVar.c = true;
                        }
                    }
                    java.lang.Runnable runnableQ = adzgVar.c ? adziVar.q(adzgVar) : null;
                    if (runnableQ != null) {
                        runnableQ.run();
                    }
                }
            }
        }
    }
}
