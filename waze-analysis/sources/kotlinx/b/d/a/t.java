package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends b {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.d.k f51175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlinx.b.d.b bVar, kotlinx.b.d.k kVar, String str) {
        super(bVar, str, null);
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(kVar, "value");
        this.f51175a = kVar;
        m("primitive");
    }

    @Override // kotlinx.b.b.c
    public final int decodeElementIndex(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        return 0;
    }

    @Override // kotlinx.b.d.a.b
    protected final kotlinx.b.d.k v(String str) {
        h.g.b.x.f(str, "tag");
        if (str == "primitive") {
            return this.f51175a;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.b.d.a.b
    public final kotlinx.b.d.k x() {
        return this.f51175a;
    }
}
