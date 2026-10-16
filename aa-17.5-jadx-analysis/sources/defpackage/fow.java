package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class fow implements Runnable {
    private final fkm a;
    private final boolean b;
    private final int c;
    private final gjv d;

    public fow(fkm fkmVar, gjv gjvVar, boolean z, int i) {
        fkmVar.getClass();
        this.a = fkmVar;
        this.d = gjvVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE;
        flz flzVarA;
        boolean z = this.b;
        fkm fkmVar = this.a;
        if (z) {
            gjv gjvVar = this.d;
            int i = this.c;
            String str = ((fny) gjvVar.a).a;
            synchronized (fkmVar.k) {
                flzVarA = fkmVar.a(str);
            }
            zE = fkm.e(str, flzVarA, i);
        } else {
            gjv gjvVar2 = this.d;
            int i2 = this.c;
            String str2 = ((fny) gjvVar2.a).a;
            synchronized (fkmVar.k) {
                if (fkmVar.f.get(str2) != null) {
                    fjo.a().c(fkm.a, a.bq(str2, "Ignored stopWork. WorkerWrapper ", " is in foreground"));
                } else {
                    Set set = (Set) fkmVar.h.get(str2);
                    if (set != null && set.contains(gjvVar2)) {
                        zE = fkm.e(str2, fkmVar.a(str2), i2);
                    }
                }
                zE = false;
            }
        }
        gjv gjvVar3 = this.d;
        int i3 = this.c;
        fjo.a().c(fjo.b("StopWorkRunnable"), "StopWorkRunnable for " + ((fny) gjvVar3.a).a + "; Processor.stopWork = " + zE + ", reason: " + i3);
    }
}
