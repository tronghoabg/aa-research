package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends b {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.d.c f51185a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51186b;

    /* renamed from: c, reason: collision with root package name */
    private int f51187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.b.d.b bVar, kotlinx.b.d.c cVar) {
        super(bVar);
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(cVar, "value");
        this.f51185a = cVar;
        this.f51186b = cVar.a();
        this.f51187c = -1;
    }

    @Override // kotlinx.b.b.c
    public final int decodeElementIndex(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        int i2 = this.f51186b;
        int i3 = this.f51187c;
        if (i3 >= i2 - 1) {
            return -1;
        }
        int i4 = i3 + 1;
        this.f51187c = i4;
        return i4;
    }

    @Override // kotlinx.b.c.ch
    protected final String o(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return String.valueOf(i2);
    }

    @Override // kotlinx.b.d.a.b
    protected final kotlinx.b.d.k v(String str) {
        h.g.b.x.f(str, "tag");
        return this.f51185a.get(Integer.parseInt(str));
    }

    @Override // kotlinx.b.d.a.b
    public final /* synthetic */ kotlinx.b.d.k x() {
        return this.f51185a;
    }
}
