package U8;

/* renamed from: U8.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0882n implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0882n f12638a = new C0882n();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12639b = h9.d.c("type");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12640c = h9.d.c("reason");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12641d = h9.d.c("frames");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12642e = h9.d.c("causedBy");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12643f = h9.d.c("overflowCount");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        V v2 = (V) ((z0) obj);
        fVar.add(f12639b, v2.f12483a);
        fVar.add(f12640c, v2.f12484b);
        fVar.add(f12641d, v2.f12485c);
        fVar.add(f12642e, v2.f12486d);
        fVar.add(f12643f, v2.f12487e);
    }
}
