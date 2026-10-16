package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f51916a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f51917b;

    public u(v vVar, Runnable runnable) {
        this.f51916a = vVar;
        this.f51917b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 0;
        while (true) {
            try {
                this.f51917b.run();
            } catch (Throwable th) {
                h.f.s.h(h.c.k.f48060a, th);
            }
            v vVar = this.f51916a;
            Runnable runnableG = vVar.g();
            if (runnableG == null) {
                return;
            }
            try {
                this.f51917b = runnableG;
                i2++;
                if (i2 >= 16) {
                    v vVar2 = vVar;
                    if (k.d(vVar.f51919c, vVar2)) {
                        k.c(vVar.f51919c, vVar2, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                v vVar3 = this.f51916a;
                synchronized (vVar3.f51923g) {
                    vVar3.f51922f.a();
                    throw th2;
                }
            }
        }
    }
}
