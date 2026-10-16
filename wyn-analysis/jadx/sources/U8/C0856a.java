package U8;

/* renamed from: U8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0856a implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0856a f12505a = new C0856a();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12506b = h9.d.c("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12507c = h9.d.c("libraryName");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12508d = h9.d.c("buildId");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        F f10 = (F) ((q0) obj);
        fVar.add(f12506b, f10.f12396a);
        fVar.add(f12507c, f10.f12397b);
        fVar.add(f12508d, f10.f12398c);
    }
}
