package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class aius extends aitu {
    private long a;
    public afaz b;
    private boolean c;

    protected abstract Thread e();

    protected void j(long j, aiuv aiuvVar) {
        aiub.a.u(j, aiuvVar);
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
        boolean z2 = aitz.a;
        if (this.c) {
            k();
        }
    }

    public final void n(aiuk aiukVar) {
        afaz afazVar = this.b;
        if (afazVar == null) {
            afazVar = new afaz();
            this.b = afazVar;
        }
        afazVar.addLast(aiukVar);
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
        afaz afazVar = this.b;
        if (afazVar != null) {
            return afazVar.isEmpty();
        }
        return true;
    }

    public final boolean r() {
        aiuk aiukVar;
        afaz afazVar = this.b;
        if (afazVar == null || (aiukVar = (aiuk) afazVar.g()) == null) {
            return false;
        }
        aiukVar.run();
        return true;
    }

    protected final void s() {
        Thread threadE = e();
        if (Thread.currentThread() != threadE) {
            LockSupport.unpark(threadE);
        }
    }
}
