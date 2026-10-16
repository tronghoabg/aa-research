package U8;

/* renamed from: U8.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0874j implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0874j f12594a = new C0874j();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12595b = h9.d.c("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12596c = h9.d.c("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12597d = h9.d.c("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12598e = h9.d.c("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12599f = h9.d.c("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f12600g = h9.d.c("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f12601h = h9.d.c("app");

    /* renamed from: i, reason: collision with root package name */
    public static final h9.d f12602i = h9.d.c("user");

    /* renamed from: j, reason: collision with root package name */
    public static final h9.d f12603j = h9.d.c("os");
    public static final h9.d k = h9.d.c("device");

    /* renamed from: l, reason: collision with root package name */
    public static final h9.d f12604l = h9.d.c("events");

    /* renamed from: m, reason: collision with root package name */
    public static final h9.d f12605m = h9.d.c("generatorType");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        K k5 = (K) ((O0) obj);
        fVar.add(f12595b, k5.f12417a);
        fVar.add(f12596c, k5.f12418b.getBytes(P0.f12460a));
        fVar.add(f12597d, k5.f12419c);
        fVar.add(f12598e, k5.f12420d);
        fVar.add(f12599f, k5.f12421e);
        fVar.add(f12600g, k5.f12422f);
        fVar.add(f12601h, k5.f12423g);
        fVar.add(f12602i, k5.f12424h);
        fVar.add(f12603j, k5.f12425i);
        fVar.add(k, k5.f12426j);
        fVar.add(f12604l, k5.k);
        fVar.add(f12605m, k5.f12427l);
    }
}
