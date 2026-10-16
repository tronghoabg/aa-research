package ea;

/* renamed from: ea.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2492g implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2492g f34540a = new C2492g();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34541b = h9.d.c("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34542c = h9.d.c("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34543d = h9.d.c("applicationInfo");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C2482F c2482f = (C2482F) obj;
        h9.f fVar = (h9.f) obj2;
        c2482f.getClass();
        fVar.add(f34541b, EnumC2496k.SESSION_START);
        fVar.add(f34542c, c2482f.f34458a);
        fVar.add(f34543d, c2482f.f34459b);
    }
}
