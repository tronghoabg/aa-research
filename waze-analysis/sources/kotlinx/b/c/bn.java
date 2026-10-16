package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bn extends au {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f51004a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(kotlinx.b.b bVar, kotlinx.b.b bVar2) {
        super(bVar, bVar2);
        h.g.b.x.f(bVar, "keySerializer");
        h.g.b.x.f(bVar2, "valueSerializer");
        this.f51004a = h.k.n.y("kotlin.Pair", new kotlinx.b.a.q[0], new com.waze.ui.u(bVar, bVar2, 10, null));
    }

    @Override // kotlinx.b.c.au
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        h.k kVar = (h.k) obj;
        h.g.b.x.f(kVar, "<this>");
        return kVar.c();
    }

    @Override // kotlinx.b.c.au
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        h.k kVar = (h.k) obj;
        h.g.b.x.f(kVar, "<this>");
        return kVar.d();
    }

    @Override // kotlinx.b.c.au
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        return new h.k(obj, obj2);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51004a;
    }
}
