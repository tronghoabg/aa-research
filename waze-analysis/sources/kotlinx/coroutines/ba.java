package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ba extends ab {

    /* renamed from: b, reason: collision with root package name */
    private long f51743b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f51744c;

    /* renamed from: d, reason: collision with root package name */
    private h.a.u f51745d;

    protected abstract Thread a();

    protected void d(long j2, bd bdVar) {
        ak.f51351b.t(j2, bdVar);
    }

    public void e() {
        throw null;
    }

    protected final long g() {
        h.a.u uVar = this.f51745d;
        return (uVar == null || uVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public long h() {
        throw null;
    }

    public final void i(boolean z) {
        long j2 = this.f51743b - (true != z ? 1L : 4294967296L);
        this.f51743b = j2;
        if (j2 > 0) {
            return;
        }
        int i2 = ai.f51347a;
        if (this.f51744c) {
            e();
        }
    }

    public final void j(at atVar) {
        h.a.u uVar = this.f51745d;
        if (uVar == null) {
            uVar = new h.a.u();
            this.f51745d = uVar;
        }
        uVar.addLast(atVar);
    }

    public final void k(boolean z) {
        this.f51743b += true != z ? 1L : 4294967296L;
        if (z) {
            return;
        }
        this.f51744c = true;
    }

    public final boolean l() {
        return this.f51743b >= 4294967296L;
    }

    @Override // kotlinx.coroutines.ab
    public final ab limitedParallelism(int i2, String str) {
        h.g.b.au.m(i2);
        return h.g.b.au.l(this, str);
    }

    public final boolean m() {
        h.a.u uVar = this.f51745d;
        if (uVar != null) {
            return uVar.isEmpty();
        }
        return true;
    }

    public final boolean n() {
        at atVar;
        h.a.u uVar = this.f51745d;
        if (uVar == null || (atVar = (at) uVar.e()) == null) {
            return false;
        }
        atVar.run();
        return true;
    }

    protected final void o() {
        Thread threadA = a();
        if (Thread.currentThread() != threadA) {
            LockSupport.unpark(threadA);
        }
    }
}
