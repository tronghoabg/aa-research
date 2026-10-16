package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class af extends h.c.b.a.g implements h.g.a.p {
    af(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new af(eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = h.g.b.ar.f48106a;
        InstallNativeManager installNativeManager = (InstallNativeManager) bVarC.a(new h.g.b.m(InstallNativeManager.class), null, null);
        m.setLangFromLocale$default(installNativeManager, installNativeManager.getLocale(), null, 2, null);
        return h.ab.f48028a;
    }
}
