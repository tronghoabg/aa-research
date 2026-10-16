package ea;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* renamed from: ea.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2493h implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2493h f34544a = new C2493h();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34545b = h9.d.c(JsonStorageKeyNames.SESSION_ID_KEY);

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34546c = h9.d.c("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34547d = h9.d.c("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f34548e = h9.d.c("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f34549f = h9.d.c("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f34550g = h9.d.c("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f34551h = h9.d.c("firebaseAuthenticationToken");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        N n10 = (N) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f34545b, n10.f34488a);
        fVar.add(f34546c, n10.f34489b);
        fVar.add(f34547d, n10.f34490c);
        fVar.add(f34548e, n10.f34491d);
        fVar.add(f34549f, n10.f34492e);
        fVar.add(f34550g, n10.f34493f);
        fVar.add(f34551h, n10.f34494g);
    }
}
