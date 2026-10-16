package Va;

/* loaded from: classes4.dex */
public final class M extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13521c = 0;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ N f13522d;

    public /* synthetic */ M() {
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13521c) {
            case 0:
                N n10 = this.f13522d;
                V.O(n10.f13546i, n10.f13541d, n10.f13544g, n10.f13545h);
                break;
            default:
                if (V.g(this.f13522d.f13546i)) {
                    C1169v c1169v = new C1169v(11);
                    c1169v.f14690d = this;
                    Cb.a(c1169v, G.S().E());
                    break;
                }
                break;
        }
    }

    public M(N n10) {
        this.f13522d = n10;
    }
}
