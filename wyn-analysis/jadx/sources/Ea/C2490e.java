package ea;

/* renamed from: ea.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2490e implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2490e f34531a = new C2490e();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34532b = h9.d.c("performance");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34533c = h9.d.c("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34534d = h9.d.c("sessionSamplingRate");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C2495j c2495j = (C2495j) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f34532b, c2495j.f34557a);
        fVar.add(f34533c, c2495j.f34558b);
        fVar.add(f34534d, c2495j.f34559c);
    }
}
