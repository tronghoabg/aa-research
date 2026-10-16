package od;

/* renamed from: od.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3681e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41944a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3725t0 f41945b;

    public RunnableC3681e0(C3725t0 c3725t0, long j8) {
        this.f41945b = c3725t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41944a) {
            case 0:
                this.f41945b.getClass();
                break;
            default:
                ((pd.m) this.f41945b.f42095a.f17515b).a(md.k0.f40682n.h("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public RunnableC3681e0(C3725t0 c3725t0, md.l0 l0Var) {
        this.f41945b = c3725t0;
    }
}
