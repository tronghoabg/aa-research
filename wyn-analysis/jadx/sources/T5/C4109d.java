package t5;

import k9.C3212a;
import w5.C4365e;

/* renamed from: t5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4109d implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4109d f45756a = new C4109d();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f45757b = new h9.d("logSource", pd.f.n(pd.f.m(k9.e.class, new C3212a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f45758c = new h9.d("logEventDropped", pd.f.n(pd.f.m(k9.e.class, new C3212a(2))));

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C4365e c4365e = (C4365e) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f45757b, c4365e.f47299a);
        fVar.add(f45758c, c4365e.f47300b);
    }
}
