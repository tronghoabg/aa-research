package od;

import md.EnumC3545m;

/* renamed from: od.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3690h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3711o0 f41971b;

    public /* synthetic */ RunnableC3690h0(C3711o0 c3711o0, int i5) {
        this.f41970a = i5;
        this.f41971b = c3711o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41970a) {
            case 0:
                C3711o0 c3711o0 = this.f41971b;
                c3711o0.f42040p = null;
                c3711o0.f42034i.g(2, "CONNECTING after backoff");
                C3711o0.g(c3711o0, EnumC3545m.f40692a);
                C3711o0.h(c3711o0);
                break;
            case 1:
                if (this.f41971b.f42047w.f40701a == EnumC3545m.f40695d) {
                    this.f41971b.f42034i.g(2, "CONNECTING as requested");
                    C3711o0.g(this.f41971b, EnumC3545m.f40692a);
                    C3711o0.h(this.f41971b);
                    break;
                }
                break;
            default:
                C3711o0 c3711o02 = this.f41971b;
                c3711o02.f42034i.g(2, "Terminated");
                L0 l02 = (L0) c3711o02.f42029d.f41915c;
                l02.f41638m.f41653A.remove(c3711o02);
                M0 m02 = l02.f41638m;
                M0.q(m02);
                break;
        }
    }
}
