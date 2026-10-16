package od;

import java.util.logging.Level;
import md.C3546n;
import md.EnumC3545m;

/* renamed from: od.d1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3679d1 implements md.N {

    /* renamed from: a, reason: collision with root package name */
    public C3546n f41940a = C3546n.a(EnumC3545m.f40695d);

    /* renamed from: b, reason: collision with root package name */
    public C3688g1 f41941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3691h1 f41942c;

    public C3679d1(C3691h1 c3691h1) {
        this.f41942c = c3691h1;
    }

    @Override // md.N
    public final void a(C3546n c3546n) {
        C3691h1.f41972o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c3546n, this.f41941b.f41961a});
        this.f41940a = c3546n;
        C3691h1 c3691h1 = this.f41942c;
        if (c3691h1.f41975h.c() && ((C3688g1) c3691h1.f41974g.get(c3691h1.f41975h.a())).f41963c == this) {
            c3691h1.j(this.f41941b);
        }
    }
}
