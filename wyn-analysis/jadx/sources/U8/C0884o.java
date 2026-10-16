package U8;

import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: U8.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0884o implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0884o f12650a = new C0884o();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12651b = h9.d.c(MediationMetaData.KEY_NAME);

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12652c = h9.d.c("code");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12653d = h9.d.c("address");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        W w2 = (W) ((A0) obj);
        fVar.add(f12651b, w2.f12488a);
        fVar.add(f12652c, w2.f12489b);
        fVar.add(f12653d, w2.f12490c);
    }
}
