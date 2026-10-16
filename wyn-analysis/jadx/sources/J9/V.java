package J9;

/* loaded from: classes4.dex */
public final class V {

    /* renamed from: d, reason: collision with root package name */
    public static final S f5899d = S.c();

    /* renamed from: a, reason: collision with root package name */
    public final I f5900a;

    /* renamed from: b, reason: collision with root package name */
    public final M9.a f5901b;

    /* renamed from: c, reason: collision with root package name */
    public He.g f5902c = Se.e.f11072a;

    public V(I i5, M9.a aVar) {
        this.f5900a = i5;
        this.f5901b = aVar;
    }

    public final He.g a() {
        He.g gVar = this.f5902c;
        Se.k kVarA = this.f5900a.a(S.parser());
        U u10 = new U(this, 0);
        ya.b bVar = Ne.b.f8674d;
        return new Se.r(gVar.d(new Se.r(kVarA, u10, bVar)), bVar, new U(this, 1));
    }

    public final O b() {
        N nG = O.g();
        nG.c(0L);
        this.f5901b.getClass();
        nG.b(System.currentTimeMillis());
        return (O) nG.build();
    }
}
