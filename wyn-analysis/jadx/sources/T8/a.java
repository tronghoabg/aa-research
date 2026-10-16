package T8;

/* loaded from: classes4.dex */
public final class a implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11776a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f11777b = h9.d.c("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f11778c = h9.d.c("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f11779d = h9.d.c("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f11780e = h9.d.c("variantId");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f11781f = h9.d.c("templateVersion");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        b bVar = (b) ((m) obj);
        fVar.add(f11777b, bVar.f11782b);
        fVar.add(f11778c, bVar.f11783c);
        fVar.add(f11779d, bVar.f11784d);
        fVar.add(f11780e, bVar.f11785e);
        fVar.add(f11781f, bVar.f11786f);
    }
}
