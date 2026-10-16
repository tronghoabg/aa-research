package aa;

/* loaded from: classes4.dex */
public final class m implements Z9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f17460a;

    public m(n nVar) {
        this.f17460a = nVar;
    }

    @Override // Z9.b
    public final void b(Z9.f fVar) {
        n nVar = this.f17460a;
        synchronized (nVar) {
            nVar.f17466d = true;
        }
        this.f17460a.g(fVar);
    }

    @Override // Z9.b
    public final void a(Z9.a aVar) {
    }
}
