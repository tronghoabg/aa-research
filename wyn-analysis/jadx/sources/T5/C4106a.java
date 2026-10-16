package t5;

import k9.C3212a;
import w5.C4361a;

/* renamed from: t5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4106a implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4106a f45746a = new C4106a();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f45747b = new h9.d("window", pd.f.n(pd.f.m(k9.e.class, new C3212a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f45748c = new h9.d("logSourceMetrics", pd.f.n(pd.f.m(k9.e.class, new C3212a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f45749d = new h9.d("globalMetrics", pd.f.n(pd.f.m(k9.e.class, new C3212a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f45750e = new h9.d("appNamespace", pd.f.n(pd.f.m(k9.e.class, new C3212a(4))));

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C4361a c4361a = (C4361a) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f45747b, c4361a.f47282a);
        fVar.add(f45748c, c4361a.f47283b);
        fVar.add(f45749d, c4361a.f47284c);
        fVar.add(f45750e, c4361a.f47285d);
    }
}
