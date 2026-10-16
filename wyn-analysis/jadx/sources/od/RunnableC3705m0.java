package od;

import E5.C0441b;
import md.EnumC3545m;

/* renamed from: od.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3705m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0441b f42014b;

    public /* synthetic */ RunnableC3705m0(C0441b c0441b, int i5) {
        this.f42013a = i5;
        this.f42014b = c0441b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42013a) {
            case 0:
                C0441b c0441b = this.f42014b;
                C3711o0 c3711o0 = (C3711o0) c0441b.f3292d;
                c3711o0.f42038n = null;
                if (c3711o0.f42048x == null) {
                    C3699k0 c3699k0 = c3711o0.f42045u;
                    C3699k0 c3699k02 = (C3699k0) c0441b.f3291c;
                    if (c3699k0 == c3699k02) {
                        c3711o0.f42046v = c3699k02;
                        C3711o0 c3711o02 = (C3711o0) this.f42014b.f3292d;
                        c3711o02.f42045u = null;
                        C3711o0.g(c3711o02, EnumC3545m.f40693b);
                        break;
                    }
                } else {
                    Fe.e.w("Unexpected non-null activeTransport", c3711o0.f42046v == null);
                    C0441b c0441b2 = this.f42014b;
                    ((C3699k0) c0441b2.f3291c).d(((C3711o0) c0441b2.f3292d).f42048x);
                    break;
                }
                break;
            default:
                C0441b c0441b3 = this.f42014b;
                ((C3711o0) c0441b3.f3292d).f42043s.remove((C3699k0) c0441b3.f3291c);
                if (((C3711o0) this.f42014b.f3292d).f42047w.f40701a == EnumC3545m.f40696e && ((C3711o0) this.f42014b.f3292d).f42043s.isEmpty()) {
                    C3711o0 c3711o03 = (C3711o0) this.f42014b.f3292d;
                    c3711o03.getClass();
                    c3711o03.k.execute(new RunnableC3690h0(c3711o03, 2));
                    break;
                }
                break;
        }
    }
}
