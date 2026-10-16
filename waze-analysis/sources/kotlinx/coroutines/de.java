package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class de extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.a.b f51835a = h.e.b.f(0);

    /* renamed from: b, reason: collision with root package name */
    private final Thread f51836b = Thread.currentThread();

    /* renamed from: d, reason: collision with root package name */
    private ax f51837d;

    private static final void n(int i2) {
        throw new IllegalStateException("Illegal state " + i2);
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        kotlinx.a.b bVar;
        int iD;
        do {
            bVar = this.f51835a;
            iD = bVar.d();
            if (iD != 0) {
                if (iD == 1 || iD == 2 || iD == 3) {
                    return;
                }
                n(iD);
                throw new h.e();
            }
        } while (!bVar.g(iD, 2));
        this.f51836b.interrupt();
        bVar.f(3);
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return true;
    }

    public final void d() {
        while (true) {
            kotlinx.a.b bVar = this.f51835a;
            int iD = bVar.d();
            if (iD != 0) {
                if (iD != 2) {
                    if (iD == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(iD);
                        throw new h.e();
                    }
                }
            } else if (bVar.g(iD, 1)) {
                ax axVar = this.f51837d;
                if (axVar != null) {
                    axVar.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final void f(br brVar) {
        kotlinx.a.b bVar;
        int iD;
        this.f51837d = aj.U(brVar, true, this);
        do {
            bVar = this.f51835a;
            iD = bVar.d();
            if (iD != 0) {
                if (iD == 2 || iD == 3) {
                    return;
                }
                n(iD);
                throw new h.e();
            }
        } while (!bVar.g(iD, 0));
    }
}
