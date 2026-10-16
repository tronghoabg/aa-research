package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aivr extends defpackage.aiut {
    private long a;
    public defpackage.afbz b;
    private boolean c;

    protected abstract java.lang.Thread e();

    protected void j(long j, defpackage.aivu aivuVar) {
        defpackage.aiva.a.u(j, aivuVar);
    }

    public void k() {
        throw null;
    }

    public long l() {
        throw null;
    }

    public final void m(boolean z) {
        long j = this.a - (true != z ? 1L : 4294967296L);
        this.a = j;
        if (j > 0) {
            return;
        }
        boolean z2 = defpackage.aiuy.a;
        if (this.c) {
            k();
        }
    }

    public final void n(defpackage.aivj aivjVar) {
        defpackage.afbz afbzVar = this.b;
        if (afbzVar == null) {
            afbzVar = new defpackage.afbz();
            this.b = afbzVar;
        }
        afbzVar.addLast(aivjVar);
    }

    public final void o(boolean z) {
        this.a += true != z ? 1L : 4294967296L;
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean p() {
        return this.a >= 4294967296L;
    }

    public final boolean q() {
        defpackage.afbz afbzVar = this.b;
        if (afbzVar != null) {
            return afbzVar.isEmpty();
        }
        return true;
    }

    public final boolean r() {
        defpackage.aivj aivjVar;
        defpackage.afbz afbzVar = this.b;
        if (afbzVar == null || (aivjVar = (defpackage.aivj) afbzVar.g()) == null) {
            return false;
        }
        aivjVar.run();
        return true;
    }

    protected final void s() {
        java.lang.Thread threadE = e();
        if (java.lang.Thread.currentThread() != threadE) {
            java.util.concurrent.locks.LockSupport.unpark(threadE);
        }
    }
}
