package J9;

/* loaded from: classes4.dex */
public final /* synthetic */ class U implements Le.b, Le.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f5898b;

    public /* synthetic */ U(V v2, int i5) {
        this.f5897a = i5;
        this.f5898b = v2;
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        switch (this.f5897a) {
            case 0:
                V v2 = this.f5898b;
                v2.getClass();
                v2.f5902c = He.g.a((S) obj);
                break;
            default:
                V v10 = this.f5898b;
                v10.getClass();
                v10.f5902c = Se.e.f11072a;
                break;
        }
    }

    @Override // Le.c
    public Object apply(Object obj) {
        S s10 = (S) obj;
        V v2 = this.f5898b;
        I i5 = v2.f5900a;
        i5.getClass();
        return new Qe.b(new B8.c(5, i5, s10), 2).b(new A5.h(14, v2, s10));
    }
}
