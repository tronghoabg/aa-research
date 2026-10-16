package s5;

/* renamed from: s5.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4011k implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4011k f45011a = new C4011k();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f45012b = h9.d.c("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f45013c = h9.d.c("mobileSubtype");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        w wVar = (w) ((J) obj);
        fVar.add(f45012b, wVar.f45049a);
        fVar.add(f45013c, wVar.f45050b);
    }
}
