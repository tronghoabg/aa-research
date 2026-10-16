package U8;

/* renamed from: U8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0858b implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0858b f12514a = new C0858b();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12515b = h9.d.c("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12516c = h9.d.c("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12517d = h9.d.c("reasonCode");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12518e = h9.d.c("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12519f = h9.d.c("pss");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f12520g = h9.d.c("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f12521h = h9.d.c("timestamp");

    /* renamed from: i, reason: collision with root package name */
    public static final h9.d f12522i = h9.d.c("traceFile");

    /* renamed from: j, reason: collision with root package name */
    public static final h9.d f12523j = h9.d.c("buildIdMappingForArch");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        E e7 = (E) ((r0) obj);
        fVar.add(f12515b, e7.f12387a);
        fVar.add(f12516c, e7.f12388b);
        fVar.add(f12517d, e7.f12389c);
        fVar.add(f12518e, e7.f12390d);
        fVar.add(f12519f, e7.f12391e);
        fVar.add(f12520g, e7.f12392f);
        fVar.add(f12521h, e7.f12393g);
        fVar.add(f12522i, e7.f12394h);
        fVar.add(f12523j, e7.f12395i);
    }
}
