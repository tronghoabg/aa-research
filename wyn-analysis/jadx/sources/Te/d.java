package Te;

/* loaded from: classes5.dex */
public final class d extends He.n implements Oe.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f11841a;

    /* renamed from: b, reason: collision with root package name */
    public final Ne.a f11842b;

    public d(c cVar, Ne.a aVar) {
        this.f11841a = cVar;
        this.f11842b = aVar;
    }

    @Override // Oe.b
    public final He.i a() {
        return new c(this.f11841a, this.f11842b, 0);
    }

    @Override // He.n
    public final void c(He.o oVar) {
        this.f11841a.c(new b(oVar, this.f11842b, 1));
    }
}
