package od;

import a2.C1323c;

/* loaded from: classes5.dex */
public final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1323c f41554b;

    public /* synthetic */ F(C1323c c1323c, int i5) {
        this.f41553a = i5;
        this.f41554b = c1323c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41553a) {
            case 0:
                this.f41554b.O(true);
                break;
            case 1:
                this.f41554b.O(false);
                break;
            default:
                M0 m02 = (M0) this.f41554b.f17156b;
                Fe.e.w("Channel must have been shut down", m02.f41659G.get());
                m02.f41661I = true;
                m02.w(false);
                M0.p(m02);
                M0.q(m02);
                break;
        }
    }
}
