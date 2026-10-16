package U8;

import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: U8.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0886p implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0886p f12660a = new C0886p();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12661b = h9.d.c(MediationMetaData.KEY_NAME);

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12662c = h9.d.c("importance");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12663d = h9.d.c("frames");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        X x5 = (X) ((C0) obj);
        fVar.add(f12661b, x5.f12491a);
        fVar.add(f12662c, x5.f12492b);
        fVar.add(f12663d, x5.f12493c);
    }
}
