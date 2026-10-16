package T3;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final x f11450a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.j f11451b;

    public w(x xVar, S3.j jVar) {
        this.f11450a = xVar;
        this.f11451b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11450a.f11456d) {
            try {
                if (((w) this.f11450a.f11454b.remove(this.f11451b)) != null) {
                    v vVar = (v) this.f11450a.f11455c.remove(this.f11451b);
                    if (vVar != null) {
                        S3.j jVar = this.f11451b;
                        M3.g gVar = (M3.g) vVar;
                        J3.r.d().a(M3.g.f7473m, "Exceeded time limits on execution for " + jVar);
                        gVar.f7481h.execute(new M3.f(gVar, 0));
                    }
                } else {
                    J3.r.d().a("WrkTimerRunnable", "Timer with " + this.f11451b + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
