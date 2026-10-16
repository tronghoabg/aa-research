package U8;

/* renamed from: U8.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0880m implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0880m f12629a = new C0880m();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12630b = h9.d.c("threads");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12631c = h9.d.c("exception");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12632d = h9.d.c("appExitInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12633e = h9.d.c("signal");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12634f = h9.d.c("binaries");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        T t10 = (T) ((D0) obj);
        fVar.add(f12630b, t10.f12474a);
        fVar.add(f12631c, t10.f12475b);
        fVar.add(f12632d, t10.f12476c);
        fVar.add(f12633e, t10.f12477d);
        fVar.add(f12634f, t10.f12478e);
    }
}
