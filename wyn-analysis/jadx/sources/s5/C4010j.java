package s5;

/* renamed from: s5.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4010j implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4010j f45003a = new C4010j();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f45004b = h9.d.c("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f45005c = h9.d.c("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f45006d = h9.d.c("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f45007e = h9.d.c("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f45008f = h9.d.c("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f45009g = h9.d.c("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f45010h = h9.d.c("qosTier");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        u uVar = (u) ((G) obj);
        fVar.add(f45004b, uVar.f45042a);
        fVar.add(f45005c, uVar.f45043b);
        fVar.add(f45006d, uVar.f45044c);
        fVar.add(f45007e, uVar.f45045d);
        fVar.add(f45008f, uVar.f45046e);
        fVar.add(f45009g, uVar.f45047f);
        fVar.add(f45010h, K.f44964a);
    }
}
