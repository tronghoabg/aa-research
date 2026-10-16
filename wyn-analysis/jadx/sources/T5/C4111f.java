package t5;

import k9.C3212a;
import w5.C4366f;

/* renamed from: t5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4111f implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4111f f45760a = new C4111f();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f45761b = new h9.d("currentCacheSizeBytes", pd.f.n(pd.f.m(k9.e.class, new C3212a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f45762c = new h9.d("maxCacheSizeBytes", pd.f.n(pd.f.m(k9.e.class, new C3212a(2))));

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C4366f c4366f = (C4366f) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f45761b, c4366f.f47301a);
        fVar.add(f45762c, c4366f.f47302b);
    }
}
