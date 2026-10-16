package T3;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f11426d = J3.r.f("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final K3.q f11427a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.j f11428b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11429c;

    public n(K3.q qVar, K3.j jVar, boolean z2) {
        this.f11427a = qVar;
        this.f11428b = jVar;
        this.f11429c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM;
        K3.s sVar;
        if (this.f11429c) {
            K3.f fVar = this.f11427a.f6506f;
            K3.j jVar = this.f11428b;
            fVar.getClass();
            String str = jVar.f6485a.f10965a;
            synchronized (fVar.f6481l) {
                try {
                    J3.r.d().a(K3.f.f6470m, "Processor stopping foreground work " + str);
                    sVar = (K3.s) fVar.f6476f.remove(str);
                    if (sVar != null) {
                        fVar.f6478h.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zM = K3.f.c(str, sVar);
        } else {
            zM = this.f11427a.f6506f.m(this.f11428b);
        }
        J3.r.d().a(f11426d, "StopWorkRunnable for " + this.f11428b.f6485a.f10965a + "; Processor.stopWork = " + zM);
    }
}
