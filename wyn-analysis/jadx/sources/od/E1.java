package od;

import g5.RunnableC2707d;

/* loaded from: classes5.dex */
public final class E1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G1 f41551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f41552c;

    public /* synthetic */ E1(a2 a2Var, G1 g12, int i5) {
        this.f41550a = i5;
        this.f41552c = a2Var;
        this.f41551b = g12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2 a2Var = this.f41552c;
        switch (this.f41550a) {
            case 0:
                ((B0) a2Var.f41915c).f41496b.execute(new RunnableC2707d(this, 14));
                break;
            default:
                B0 b02 = (B0) a2Var.f41915c;
                md.W w2 = B0.f41487E;
                b02.q(this.f41551b);
                break;
        }
    }
}
