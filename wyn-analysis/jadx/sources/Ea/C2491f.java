package ea;

/* renamed from: ea.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2491f implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2491f f34535a = new C2491f();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34536b = h9.d.c("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34537c = h9.d.c("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34538d = h9.d.c("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f34539e = h9.d.c("defaultProcess");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C2504t c2504t = (C2504t) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f34536b, c2504t.f34580a);
        fVar.add(f34537c, c2504t.f34581b);
        fVar.add(f34538d, c2504t.f34582c);
        fVar.add(f34539e, c2504t.f34583d);
    }
}
