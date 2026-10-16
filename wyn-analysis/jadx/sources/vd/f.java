package vd;

import md.C3546n;
import md.N;

/* loaded from: classes5.dex */
public final class f implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47172a;

    /* renamed from: b, reason: collision with root package name */
    public final N f47173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4339b f47174c;

    public /* synthetic */ f(AbstractC4339b abstractC4339b, N n10, int i5) {
        this.f47172a = i5;
        this.f47174c = abstractC4339b;
        this.f47173b = n10;
    }

    @Override // md.N
    public final void a(C3546n c3546n) {
        switch (this.f47172a) {
            case 0:
                this.f47173b.a(c3546n);
                ((g) this.f47174c).f47176e.a(c3546n);
                break;
            default:
                q qVar = (q) this.f47174c;
                qVar.f47212g = c3546n;
                if (!qVar.f47211f) {
                    this.f47173b.a(c3546n);
                    break;
                }
                break;
        }
    }
}
