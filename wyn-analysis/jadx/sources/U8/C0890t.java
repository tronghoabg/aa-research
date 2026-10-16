package U8;

/* renamed from: U8.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0890t implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0890t f12683a = new C0890t();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12684b = h9.d.c("timestamp");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12685c = h9.d.c("type");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12686d = h9.d.c("app");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12687e = h9.d.c("device");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12688f = h9.d.c("log");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f12689g = h9.d.c("rollouts");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        Q q4 = (Q) ((L0) obj);
        fVar.add(f12684b, q4.f12461a);
        fVar.add(f12685c, q4.f12462b);
        fVar.add(f12686d, q4.f12463c);
        fVar.add(f12687e, q4.f12464d);
        fVar.add(f12688f, q4.f12465e);
        fVar.add(f12689g, q4.f12466f);
    }
}
