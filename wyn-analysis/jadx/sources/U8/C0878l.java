package U8;

import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: U8.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0878l implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0878l f12623a = new C0878l();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12624b = h9.d.c("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12625c = h9.d.c("size");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12626d = h9.d.c(MediationMetaData.KEY_NAME);

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12627e = h9.d.c("uuid");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        U u10 = (U) ((y0) obj);
        fVar.add(f12624b, u10.f12479a);
        fVar.add(f12625c, u10.f12480b);
        fVar.add(f12626d, u10.f12481c);
        String str = u10.f12482d;
        fVar.add(f12627e, str != null ? str.getBytes(P0.f12460a) : null);
    }
}
