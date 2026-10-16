package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at implements a {

    /* renamed from: a, reason: collision with root package name */
    private final InstallNativeManager f24767a;

    public at(InstallNativeManager installNativeManager) {
        h.g.b.x.f(installNativeManager, "installNativeManager");
        this.f24767a = installNativeManager;
    }

    @Override // com.waze.install.a
    public final Object a(h.c.e eVar) {
        Object objA = ah.a(eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }

    @Override // com.waze.install.a
    public final void b() {
        m.retryLogin$default(this.f24767a, null, 1, null);
    }

    @Override // com.waze.install.a
    public final void c(String str) {
        h.g.b.x.f(str, "countryCode");
        m.setCountry$default(this.f24767a, str, null, 2, null);
    }
}
