package defpackage;

/* loaded from: classes2.dex */
public final class ajcm extends aitu implements aiuf {
    public final aitu a;
    public final aisv b;
    public final Object c;
    private final /* synthetic */ aiuf d;
    private final int e;
    private final lds f;

    /* JADX WARN: Multi-variable type inference failed */
    public ajcm(aitu aituVar, int i) {
        aiuf aiufVar = aituVar instanceof aiuf ? (aiuf) aituVar : null;
        this.d = aiufVar == null ? aiuc.a : aiufVar;
        this.a = aituVar;
        this.e = i;
        this.b = new aisv(0, aisy.a);
        this.f = new lds((char[]) null);
        this.c = new Object();
    }

    private final boolean i() {
        synchronized (this.c) {
            aisv aisvVar = this.b;
            if (aisvVar.b >= this.e) {
                return false;
            }
            aisvVar.a();
            return true;
        }
    }

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        Runnable runnableE;
        this.f.l(runnable);
        if (this.b.b >= this.e || !i() || (runnableE = e()) == null) {
            return;
        }
        try {
            ajcb.b(this.a, this, new ajcl(this, runnableE));
        } catch (Throwable th) {
            this.b.c();
            throw th;
        }
    }

    @Override // defpackage.aiuf
    public final void c(long j, aitf aitfVar) {
        this.d.c(j, aitfVar);
    }

    public final Runnable e() {
        while (true) {
            lds ldsVar = this.f;
            Runnable runnable = (Runnable) ldsVar.j();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                aisv aisvVar = this.b;
                aisvVar.c();
                if (ldsVar.i() == 0) {
                    return null;
                }
                aisvVar.a();
            }
        }
    }

    @Override // defpackage.aitu
    public final void f(afco afcoVar, Runnable runnable) {
        Runnable runnableE;
        this.f.l(runnable);
        if (this.b.b >= this.e || !i() || (runnableE = e()) == null) {
            return;
        }
        try {
            this.a.f(this, new ajcl(this, runnableE));
        } catch (Throwable th) {
            this.b.c();
            throw th;
        }
    }

    @Override // defpackage.aiuf
    public final aiuo h(long j, Runnable runnable, afco afcoVar) {
        return this.d.h(j, runnable, afcoVar);
    }

    @Override // defpackage.aitu
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.e + ")";
    }
}
