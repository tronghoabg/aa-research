package k2;

import N1.C0773w;
import wa.C4398a;

/* loaded from: classes.dex */
public final class Y implements G {

    /* renamed from: a, reason: collision with root package name */
    public final S3.c f39000a;

    /* renamed from: b, reason: collision with root package name */
    public final com.unity3d.services.core.webview.b f39001b;

    /* renamed from: c, reason: collision with root package name */
    public final Mf.d f39002c;

    /* renamed from: d, reason: collision with root package name */
    public final ae.d f39003d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39004e;

    public Y(S3.c cVar, s2.k kVar) {
        com.unity3d.services.core.webview.b bVar = new com.unity3d.services.core.webview.b(kVar, 11);
        Mf.d dVar = new Mf.d();
        ae.d dVar2 = new ae.d(10);
        this.f39000a = cVar;
        this.f39001b = bVar;
        this.f39002c = dVar;
        this.f39003d = dVar2;
        this.f39004e = 1048576;
    }

    @Override // k2.G
    public final G a(C4398a c4398a) {
        return this;
    }

    @Override // k2.G
    public final G b(boolean z2) {
        return this;
    }

    @Override // k2.G
    public final AbstractC3144a c(C0773w c0773w) {
        c0773w.f8272b.getClass();
        Z1.g gVarB = this.f39002c.b(c0773w);
        ae.d dVar = this.f39003d;
        return new Z(c0773w, this.f39000a, this.f39001b, gVarB, dVar, this.f39004e, false);
    }
}
