package Va;

/* loaded from: classes4.dex */
public final class Wa extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13837c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ C1105q f13838d;

    public /* synthetic */ Wa(int i5) {
        this.f13837c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13837c) {
            case 0:
                Xa.k(((Va) this.f13838d.f14517b).f13798d);
                break;
            default:
                Xa xa2 = ((Va) this.f13838d.f14517b).f13798d;
                Va va = new Va(2);
                va.f13798d = xa2;
                Cb.j(va);
                break;
        }
    }
}
