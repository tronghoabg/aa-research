package t5;

import k9.C3212a;
import w5.C4364d;

/* renamed from: t5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4108c implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4108c f45753a = new C4108c();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f45754b = new h9.d("eventsDroppedCount", pd.f.n(pd.f.m(k9.e.class, new C3212a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f45755c = new h9.d("reason", pd.f.n(pd.f.m(k9.e.class, new C3212a(3))));

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C4364d c4364d = (C4364d) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f45754b, c4364d.f47296a);
        fVar.add(f45755c, c4364d.f47297b);
    }
}
