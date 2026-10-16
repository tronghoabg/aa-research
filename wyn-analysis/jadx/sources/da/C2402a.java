package da;

import h9.f;

/* renamed from: da.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2402a implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2402a f34183a = new C2402a();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34184b = h9.d.c("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34185c = h9.d.c("variantId");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34186d = h9.d.c("parameterKey");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f34187e = h9.d.c("parameterValue");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f34188f = h9.d.c("templateVersion");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        f fVar = (f) obj2;
        c cVar = (c) ((e) obj);
        fVar.add(f34184b, cVar.f34195b);
        fVar.add(f34185c, cVar.f34196c);
        fVar.add(f34186d, cVar.f34197d);
        fVar.add(f34187e, cVar.f34198e);
        fVar.add(f34188f, cVar.f34199f);
    }
}
