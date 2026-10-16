package U8;

/* renamed from: U8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0868g implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0868g f12568a = new C0868g();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12569b = h9.d.c("identifier");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12570c = h9.d.c("version");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12571d = h9.d.c("displayVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12572e = h9.d.c("organization");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12573f = h9.d.c("installationUuid");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f12574g = h9.d.c("developmentPlatform");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f12575h = h9.d.c("developmentPlatformVersion");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        L l10 = (L) ((w0) obj);
        fVar.add(f12569b, l10.f12428a);
        fVar.add(f12570c, l10.f12429b);
        fVar.add(f12571d, l10.f12430c);
        fVar.add(f12572e, (Object) null);
        fVar.add(f12573f, l10.f12431d);
        fVar.add(f12574g, l10.f12432e);
        fVar.add(f12575h, l10.f12433f);
    }
}
