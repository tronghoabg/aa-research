package J9;

/* loaded from: classes4.dex */
public final /* synthetic */ class T implements Le.c, Le.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f5895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N9.b f5896c;

    public /* synthetic */ T(V v2, N9.b bVar, int i5) {
        this.f5894a = i5;
        this.f5895b = v2;
        this.f5896c = bVar;
    }

    @Override // Le.c
    public Object apply(Object obj) {
        S s10 = (S) obj;
        switch (this.f5894a) {
            case 0:
                V v2 = this.f5895b;
                v2.getClass();
                N9.b bVar = this.f5896c;
                bVar.getClass();
                O oD = s10.d(v2.b());
                Ne.b.a(oD, "The item is null");
                Te.c cVar = new Te.c(new Te.n(oD), new T(v2, bVar, 1), 1);
                O oB = v2.b();
                Ne.b.a(oB, "The item is null");
                return new Te.l(new Te.c(new Te.c(cVar, new Te.n(oB), 4), new A5.h(13, s10, bVar), 3), new U(v2, 2));
            default:
                V v10 = this.f5895b;
                v10.getClass();
                this.f5896c.getClass();
                return s10.d(v10.b());
        }
    }

    @Override // Le.d
    public boolean test(Object obj) {
        O o7 = (O) obj;
        switch (this.f5894a) {
            case 1:
                this.f5895b.f5901b.getClass();
                return !(System.currentTimeMillis() - o7.f() > this.f5896c.f8604b);
            default:
                this.f5895b.f5901b.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - o7.f();
                N9.b bVar = this.f5896c;
                return jCurrentTimeMillis > bVar.f8604b || o7.getValue() < bVar.f8603a;
        }
    }
}
