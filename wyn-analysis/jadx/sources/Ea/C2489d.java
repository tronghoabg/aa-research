package ea;

import android.os.Build;

/* renamed from: ea.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2489d implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2489d f34524a = new C2489d();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34525b = h9.d.c("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34526c = h9.d.c("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34527d = h9.d.c("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f34528e = h9.d.c("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f34529f = h9.d.c("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f34530g = h9.d.c("androidAppInfo");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C2487b c2487b = (C2487b) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f34525b, c2487b.f34515a);
        fVar.add(f34526c, Build.MODEL);
        fVar.add(f34527d, "2.0.7");
        fVar.add(f34528e, Build.VERSION.RELEASE);
        fVar.add(f34529f, EnumC2503s.LOG_ENVIRONMENT_PROD);
        fVar.add(f34530g, c2487b.f34516b);
    }
}
