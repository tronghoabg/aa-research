package W9;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import k9.C3212a;

/* renamed from: W9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1230a implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1230a f15311a = new C1230a();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f15312b = new h9.d("projectNumber", pd.f.n(pd.f.m(k9.e.class, new C3212a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f15313c = new h9.d("messageId", pd.f.n(pd.f.m(k9.e.class, new C3212a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f15314d = new h9.d("instanceId", pd.f.n(pd.f.m(k9.e.class, new C3212a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f15315e = new h9.d("messageType", pd.f.n(pd.f.m(k9.e.class, new C3212a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f15316f = new h9.d("sdkPlatform", pd.f.n(pd.f.m(k9.e.class, new C3212a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f15317g = new h9.d(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, pd.f.n(pd.f.m(k9.e.class, new C3212a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f15318h = new h9.d("collapseKey", pd.f.n(pd.f.m(k9.e.class, new C3212a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final h9.d f15319i = new h9.d("priority", pd.f.n(pd.f.m(k9.e.class, new C3212a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final h9.d f15320j = new h9.d("ttl", pd.f.n(pd.f.m(k9.e.class, new C3212a(9))));
    public static final h9.d k = new h9.d("topic", pd.f.n(pd.f.m(k9.e.class, new C3212a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final h9.d f15321l = new h9.d("bulkId", pd.f.n(pd.f.m(k9.e.class, new C3212a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final h9.d f15322m = new h9.d("event", pd.f.n(pd.f.m(k9.e.class, new C3212a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final h9.d f15323n = new h9.d("analyticsLabel", pd.f.n(pd.f.m(k9.e.class, new C3212a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final h9.d f15324o = new h9.d("campaignId", pd.f.n(pd.f.m(k9.e.class, new C3212a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final h9.d f15325p = new h9.d("composerLabel", pd.f.n(pd.f.m(k9.e.class, new C3212a(15))));

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        X9.d dVar = (X9.d) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f15312b, dVar.f16201a);
        fVar.add(f15313c, dVar.f16202b);
        fVar.add(f15314d, dVar.f16203c);
        fVar.add(f15315e, dVar.f16204d);
        fVar.add(f15316f, X9.c.ANDROID);
        fVar.add(f15317g, dVar.f16205e);
        fVar.add(f15318h, dVar.f16206f);
        fVar.add(f15319i, dVar.f16207g);
        fVar.add(f15320j, dVar.f16208h);
        fVar.add(k, dVar.f16209i);
        fVar.add(f15321l, 0L);
        fVar.add(f15322m, X9.a.MESSAGE_DELIVERED);
        fVar.add(f15323n, dVar.f16210j);
        fVar.add(f15324o, 0L);
        fVar.add(f15325p, dVar.k);
    }
}
