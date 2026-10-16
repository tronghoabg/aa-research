package s5;

/* renamed from: s5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4009i implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4009i f44993a = new C4009i();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f44994b = h9.d.c("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f44995c = h9.d.c("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f44996d = h9.d.c("complianceData");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f44997e = h9.d.c("eventUptimeMs");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f44998f = h9.d.c("sourceExtension");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f44999g = h9.d.c("sourceExtensionJsonProto3");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f45000h = h9.d.c("timezoneOffsetSeconds");

    /* renamed from: i, reason: collision with root package name */
    public static final h9.d f45001i = h9.d.c("networkConnectionInfo");

    /* renamed from: j, reason: collision with root package name */
    public static final h9.d f45002j = h9.d.c("experimentIds");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        t tVar = (t) ((AbstractC4000F) obj);
        fVar.add(f44994b, tVar.f45033a);
        fVar.add(f44995c, tVar.f45034b);
        fVar.add(f44996d, tVar.f45035c);
        fVar.add(f44997e, tVar.f45036d);
        fVar.add(f44998f, tVar.f45037e);
        fVar.add(f44999g, tVar.f45038f);
        fVar.add(f45000h, tVar.f45039g);
        fVar.add(f45001i, tVar.f45040h);
        fVar.add(f45002j, tVar.f45041i);
    }
}
