package He;

/* loaded from: classes5.dex */
public final class k implements Je.b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5008a;

    /* renamed from: b, reason: collision with root package name */
    public final l f5009b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f5010c;

    public k(Runnable runnable, l lVar) {
        this.f5008a = runnable;
        this.f5009b = lVar;
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f5010c == Thread.currentThread()) {
            l lVar = this.f5009b;
            if (lVar instanceof We.j) {
                We.j jVar = (We.j) lVar;
                if (jVar.f15498b) {
                    return;
                }
                jVar.f15498b = true;
                jVar.f15497a.shutdown();
                return;
            }
        }
        this.f5009b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5010c = Thread.currentThread();
        try {
            this.f5008a.run();
        } finally {
            dispose();
            this.f5010c = null;
        }
    }
}
